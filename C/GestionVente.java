/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.C;

import java.io.Serializable;
import java.util.Date;
import tps.gestionparcautomobile.A.Client;
import tps.gestionparcautomobile.B.Vehicule;
import tps.gestionparcautomobile.D.GestionAutomobileVehiculesVenteException;

/**
 *
 * @author melissa
 */
public class GestionVente  extends Gestion implements Serializable {

     
public GestionVente(double maxKm, double venteKm)
{
    super(maxKm,venteKm);
}
    
    
//    @Override
//    public String finDeLocation(Client c, Vehicule a, Date d, double kelometrageFin) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public double getTarif(Client c, Vehicule a) {
        //prixDachat x kilometrageMaximumPourUneVente / ( kilometrageMaximumPourUneVente + kilometrageDuVehicule )
        return (a.getPrixAchat() * this.getMaxKm() )/ (a.getKilometrage()+ a.getPrixAchat());
    }

    
    
   public double demandeDeVente(Vehicule vehicle, Client client) throws GestionAutomobileVehiculesVenteException {
    // Check if the vehicle does not exist in the HashMap and if its km exceeds or equals the maximum km
    if (vehiculeALouer.contains(vehicle)) {
        if (vehicle.getKilometrage() >= this.getMaxKm()) {
            throw new GestionAutomobileVehiculesVenteException();
        }
        // Check if the vehicle's mileage falls within the specified range for sale
        if (vehicle.getKilometrage() >= this.getVenteKm() && vehicle.getKilometrage() < this.getMaxKm()) {
            // Vehicle intended for sale
            addVehicleForSale(vehicle);
            // Remove the vehicle from the list of vehicles in location
            vehiculeALouer.remove(vehicle);
            return getTarif(client, vehicle);
        }
    }
    return 0;
}
}
