/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.A;
import java.io.Serializable;
import tps.gestionparcautomobile.A.Client;
import java.util.ArrayList;
import tps.gestionparcautomobile.B.Vehicules;
import tps.gestionparcautomobile.D.GestionAutomobileClientsException;
import tps.gestionparcautomobile.D.GestionAutomobileClientsParticuliersException;


/**
 *
 * @author melissa
 *
 */
 public class Clients extends ArrayList<Client> implements Serializable{
      private static Clients instance = null;

    private Clients() {
        // Private constructor to prevent instantiation from outside
        super();
    }

    
    
     public static void setInstance(Clients newClients) {
        instance.addAll(newClients);
    }
    
    
    
    
    public static Clients getInstance() {
        if (instance == null) {
            instance = new Clients();
        }
        return instance;
    }

  

    // Method to display the list of clients
    public void affiche() {
        for (Client client : this) {
            System.out.println(client.toString());
        }
    }
    
    
    
    
    public void addClient(Client client) throws GestionAutomobileClientsException {
    if (clientExists(client)) {
        throw new GestionAutomobileClientsException("Ce client existe déjà dans la liste.");
    }
    if (client instanceof ClientParticulier && ((ClientParticulier) client).getAge() < 0) {
        throw new GestionAutomobileClientsParticuliersException("L'âge du client particulier est négatif.");
    }
    // Ajoutez le client à la liste si aucune exception n'est lancée
    instance.add(client);
}

    // Méthode pour vérifier si un client existe déjà dans la liste
    private boolean clientExists(Client client) {
        for (Client c : this) {
            if (c.equals(client)) {
                return true;
            }
        }
        return false;
    }

    
}
