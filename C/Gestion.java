/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import tps.gestionparcautomobile.A.CanRentOrBuy;
import tps.gestionparcautomobile.A.Client;
import tps.gestionparcautomobile.A.GestionDates;
import tps.gestionparcautomobile.B.Break;
import tps.gestionparcautomobile.B.Rentable;
import tps.gestionparcautomobile.B.Vehicule;
import tps.gestionparcautomobile.Berline;

/**
 *
 * @author melissa
 */
public abstract class Gestion {
    
    private double maxKm;
    private double venteKm;
    // HashSet to store vehicles available for rental
    protected HashSet<Vehicule> vehiculeALouer;

    // LinkedList to store vehicles available for sale
    protected LinkedList<Vehicule> vehiculeAVendre;

    // HashMap to store vehicles currently rented by clients
    protected HashMap<Client, Vehicule> vehiculesEnLocation;

    // Constructor
    public Gestion(double maxKm, double venteKm) {
        // Initialize the data structures
        vehiculeALouer = new HashSet<>();
        vehiculeAVendre = new LinkedList<>();
        vehiculesEnLocation = new HashMap<>();
        this.maxKm = maxKm;
        this.venteKm = venteKm;
    }

 

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getVenteKm() {
        return venteKm;
    }

    public void setVenteKm(double venteKm) {
        this.venteKm = venteKm;
    }

    
    
    
  // ajouter un vehicule pour la location 
    public void addVehicleForRent(Vehicule vehicle) {
       if (!(vehiculeALouer.contains(vehicle)))
       { vehiculeALouer.add(vehicle);}
       else{
           System.out.println("Le vehicule est deja disponible pour la location ");
       }
    }


   
   //ajouter un vehicule pour la vente 
    public void addVehicleForSale(Vehicule vehicle) {
      if (!( vehiculeAVendre.contains(vehicle)))
       {  vehiculeAVendre.add(vehicle);}
       else{
           System.out.println("Le vehicule est deja disponible pour la vente ");
       }
    }

    //abstract class has no body 
    //  a clss is abstruct if it empliments a least one abstract methode 
    
    public abstract double getTarif(Client c ,Vehicule a);
 
public double prixLocation(CanRentOrBuy client , Vehicule v) {
    double reduction = client.getReduction();
    double prix =0;
    GestionDates dateDebut = v.getDateDebutLocation();
    double tauxPortes;
        tauxPortes = 1 + ((double)v.getNombreDePortes()/ 10.0);
    double prixLocationK =0 ;
    double nombreDeJour = v.getDateFinLocation().differenceInDays(dateDebut);
    // the interface Rentable to get the price or rent par km 
    if (v instanceof Rentable) {
    Rentable rentableVehicle = (Rentable) v;
    prixLocationK = rentableVehicle.getPrixLocationK();
    // Use prixLocationK as needed
}
    
     // Calculate price using reduction
    if(reduction >=0 ){
    // reduction x (prixParKilometrePourCeTypeDeVehicule x kilometrageEffectue + nombreDeJour x (1 + nombreDePortes/10) ).
    prix=reduction * tauxPortes * v.getkilometrageFin()* prixLocationK * nombreDeJour;
    }
    return prix; 
} 



//staickage et serialization
 // Méthode pour sérialiser les données
    public void sauvegardeDonnees( String a ) {
         File file = new File(a);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(this);
            System.out.println("Données sauvegardées avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   

public static Gestion chargementDonnees(String directory) {
    String filePath = directory + File.separator + "gestion.ser"; // Construct file path
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
        return (Gestion) in.readObject();
    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + filePath);
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}

}

