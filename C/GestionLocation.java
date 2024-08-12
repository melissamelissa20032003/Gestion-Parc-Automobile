/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.C;

import java.io.Serializable;
import java.util.Date;
import tps.gestionparcautomobile.A.CanRentOrBuy;
import tps.gestionparcautomobile.A.Client;
import tps.gestionparcautomobile.A.ClientParticulier;
import tps.gestionparcautomobile.A.GestionDates;
import tps.gestionparcautomobile.A.TypeClient;
import tps.gestionparcautomobile.B.Vehicule;
import tps.gestionparcautomobile.D.GestionAutomobileVehiculesLocationException;

/**
 *
 * @author melissa
 */
public class GestionLocation extends Gestion implements Serializable{
    
public GestionLocation(double maxKm, double venteKm)
{
    super(maxKm,venteKm);
}
    
    
    
    @Override
    public double getTarif(Client c ,Vehicule a ) {
   if (c instanceof CanRentOrBuy) {// amke sure the client implement the interface so as not to get run time error 
    CanRentOrBuy client = (CanRentOrBuy) c;
    return prixLocation(client, a);
} else {
    // Handle the case where the client cannot rent or buy
    return 0; // Or some default value
}
    }
    
  

public boolean demandeDeLocation(Vehicule vehicle, Client client) throws GestionAutomobileVehiculesLocationException {
    // Check if the vehicle is available for rent
    if (vehiculeALouer.contains(vehicle)) {
        // Associate the client with the vehicle rental
        vehiculesEnLocation.put(client, vehicle);
        // Check if the client is of type PARTICULIER
        if (client.getType() == TypeClient.PARTICULIER) {
            // Increment the number of rentals for the client
            ((ClientParticulier) client).incrementNumberOfRentals();
            System.out.println("une nouvelle location est ajoutée");
            // Remove the vehicle from the list of vehicles available for rent
            vehiculeALouer.remove(vehicle);
            return true;
        }
    } else {
        throw new GestionAutomobileVehiculesLocationException();
    }
    return false;
}


//remaitre les vehicules de la bonne collenction et retourn le traif 
public double finDeLocation(Vehicule vehicle, Client client , GestionDates dateFin ,double km ){
      // Vérifier si le couple vehicle-client existe dans le HashMap
    if (vehiculesEnLocation.containsKey(vehicle) && vehiculesEnLocation.get(vehicle).equals(client)) {
        // Récupérer la date de fin et le kilométrage de fin du véhicule
      GestionDates dateDebut = client. getDebutLocation();
       double kilometrageFin = vehicle. getkilometrageFin();
      
       // Comparer la date passée en argument avec la date de fin du véhicule
        if (dateFin.compareTo(dateDebut) <= 0) {
            // Vérifier si le véhicule a parcouru plus de kilomètres que le kilométrage passé en argument
            if (kilometrageFin > km) {
                // Le véhicule est destiné à la vente
                addVehicleForSale(vehicle);
            // Retirer le couple vehicle-client de la liste des véhicules en location
            vehiculesEnLocation.remove(vehicle);
           //appeler la fonction tarif de vente 
           
           
            } else {
                // Le véhicule est disponible à la location
                addVehicleForRent(vehicle);
                // Retirer le couple vehicle-client de la liste des véhicules en location
                vehiculesEnLocation.remove(vehicle);
                System.out.println("le vehicule vient d'etre louer le prix est :  ");
                return getTarif(client ,vehicle);
            }
}
    }
    return 0;
}
}
    

