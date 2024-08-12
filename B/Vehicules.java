/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.B;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author melissa
 *  @param //
 * 
 * //
*/
//<T>
 public class Vehicules extends Vector <Vehicule> implements Serializable{
     private static Vehicules instance = null;

    private Vehicules() {
        // Private constructor to prevent instantiation from outside
        super();// contruct an empty vector 
    }
     
    
     public static void setInstance(Vehicules newVehicles) {
        instance.addAll(newVehicles);
    }
    
    
    
    
     public static Vehicules getInstance() {
        if (instance == null) {
            instance = new Vehicules();
        }
        return instance;
    }

    // Method to add a client, either ClientParticulier or ClientProfessionnel
    public void addVehicule(Vehicule V) {
        instance.add(V);
    }

    // Method to display the list of clients
    public void affiche() {
        for (Vehicule vehicule : this) {
            System.out.println(vehicule.toString());
        }
    }
}
