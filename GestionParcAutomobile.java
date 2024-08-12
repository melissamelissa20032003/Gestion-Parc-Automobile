/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tps.gestionparcautomobile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import tps.gestionparcautomobile.B.TypeVehicule;
import tps.gestionparcautomobile.B.NombreDePortes;
import tps.gestionparcautomobile.B.Immatriculation;
import tps.gestionparcautomobile.B.Constructeur;
import tps.gestionparcautomobile.B.Break;
import tps.gestionparcautomobile.A.GestionDates;
import tps.gestionparcautomobile.A.TypeClient;
import tps.gestionparcautomobile.A.Clients;
import tps.gestionparcautomobile.A.ClientProfessionnel;
import tps.gestionparcautomobile.A.ClientParticulier;
import tps.gestionparcautomobile.A.Client;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import tps.gestionparcautomobile.A.CanRentOrBuy;
import tps.gestionparcautomobile.A.Essay;
import tps.gestionparcautomobile.B.Utilitaire;
import tps.gestionparcautomobile.B.Vehicule;
import tps.gestionparcautomobile.B.Vehicules;
import tps.gestionparcautomobile.C.Gestion;
import tps.gestionparcautomobile.C.GestionLocation;
import tps.gestionparcautomobile.C.GestionVente;
import tps.gestionparcautomobile.D.GestionAutomobileClientsException;
import tps.gestionparcautomobile.D.GestionAutomobileVehiculesLocationException;
import tps.gestionparcautomobile.D.GestionAutomobileVehiculesVenteException;
import tps.gestionparcautomobile.D.Sauvegarde;



/**
 *
 * @author melissa
 */
public class GestionParcAutomobile {

    public static void main(String[] args) throws ParseException, GestionAutomobileClientsException, GestionAutomobileVehiculesVenteException, GestionAutomobileVehiculesLocationException, FileNotFoundException, IOException {
       
//        
     GestionDates today = new GestionDates ("29/02/2024");
       System.out.println(today.toString()); 
//       
       GestionDates tomorrow = new GestionDates ("26/05/2024");
        System.out.println("the number of days is : "+ today.differenceInDays(tomorrow));
       
//        System.out.println("here we are testing how to add client to our Client ArrayList");     // one class containes the two client type 
       Clients mesClients = Clients.getInstance();
        ClientParticulier client1 = new ClientParticulier("BOUTLENDJ", "Melissa", 21, "7 Impasse B29", TypeClient.PARTICULIER, today,15);
          ClientParticulier clientAvecAgeNega = new ClientParticulier("BOUTLENDJ", "Melissa", 21, "7 Impasse B29", TypeClient.PARTICULIER, today,15);
        mesClients .addClient(client1);
        // l'exception de l'age megatif marche 
       mesClients .addClient(clientAvecAgeNega);
       ClientProfessionnel client2 = new ClientProfessionnel("BOUTLENDJ", "Melissa", 21, "7 Impasse B29", TypeClient.PROFISSIONNEL ,today,0.54f);
       System.out.println("ici on essay d'ajouter une le meme client a la list des clients ");
       mesClients .addClient(client2);
       // mesClients .addClient(client2);
       System.out.println("God is great");
        mesClients .affiche();
//
       System.out.println("here we test the class Vehicule");
       Immatriculation i1= new Immatriculation("5437H8");
       Constructeur cons1= new Constructeur("Renault");
       GestionDates date = new GestionDates("4/05/2024");
////   
//        Break b1 = new Break(NombreDePortes.TROIS,i1, cons1, "Pegeot" , 767f, 88f,TypeVehicule.BREAK,3454f,date,today );
////      Utilitaire u1 = new Utilitaire(NombreDePortes.DEUX, i1, cons1, "Ford", 500f, 80f, TypeVehicule.UTILITAIRE ,3454f,date );
////      Berline b2 = new Berline(NombreDePortes.QUATRE, i1, cons1, "BMW", 1000f, 120f, TypeVehicule.BERLINE, 3454f,date );      
////      
//        GestionLocation gestionLocation = new GestionLocation(1233,332);
//        gestionLocation.addVehicleForRent(b1);
//        gestionLocation.addVehicleForSale(b1);
//         System.out.println("here we try demandeDeLocatio");
//        boolean resultat =  gestionLocation.demandeDeLocation(b1,client1);
//        System.out.println(resultat);
//        boolean resultat2 =  gestionLocation.demandeDeLocation(b1,client1);
//        System.out.println(resultat2);
//        System.out.println("here we are trying the prixLocation methode using an interface instance of Client ");
//         // Create a client object that implements the CanRentOrBuy interface
//        CanRentOrBuy client = new ClientParticulier("BOUTLENDJ", "Melissa", 21, "7 Impasse B29", TypeClient.PARTICULIER, today,14);
//        
//        // Call the prixLocation method with the client and vehicule objects
//        double prix = gestionLocation.prixLocation(client, b1 );
//           // Display the result
//        System.out.println("Price: " + prix);
//        
//        System.out.println("here we test la vente ");
//     
//        GestionVente gestionVente = new GestionVente(1099,233);
//        double tarif = gestionVente.demandeDeVente(b1,client1);
//         System.out.println("Price of sale : " + tarif );
//    }
//        
//      String directory = "folder";

        //creer un instance de suavgarde 
//      Sauvegarde S = new Sauvegarde();
//      // Sauvegarde des données
//       S.sauvegardeDonnees(gestionVente, directory);
//  
//        // Chargement des données depuis le répertoire spécifié
//        Gestion nouvelleGestion = Sauvegarde.chargementDonnees(directory);

    //  au lieu de la class Test je l'ai nomme GestionParcAutomobile
    
    
   /*
    dans le pacage B :
com.B.clients
    ├── CanRentOrBuy.java (interface)
    ├── ClientParticulier.java
    └── ClientProfessionnel.java
    
    
    dans le pacage c :
com.C.Vehicule
    ├── Rentable.java (interface)
    ├── Berline.java
    └── Break.java
    ├── Vehicule.java
    ├── Utilitaire.java
    └── Vehicules.java
    
    le sauvgarde ne marche pas les exceptions marche tres bien 
    le but des interafce c'est de ne pas tester si le client est profitionnel ou particulier lors de calcule de reduction 
    pariel pour la prix de location en km pour chaque vehicule 
    
    toutes les autre methodes de la partie A B C marche 
    
    */ 
    
    
    
    
    GestionLocation gestionLocation = new GestionLocation(10000, 200000);
//
//        // Créer des clients
       Client clientParticulier = new ClientParticulier("Nom", "Prenom", 30, "Adresse", TypeClient.PARTICULIER, new GestionDates("01/01/2024"), 0);
       Client clientProfessionnel = new ClientProfessionnel("Nom", "Prenom", 30, "Adresse", TypeClient.PROFISSIONNEL, new GestionDates("01/01/2024"), 0.1f);
//
//        // Créer des véhicules
       Berline berline = new Berline(NombreDePortes.QUATRE, new Immatriculation("1234AB"), new Constructeur("Audi"), "A3", 30000, 5000, TypeVehicule.BERLINE, 10000, new GestionDates("01/01/2024"), new GestionDates("01/02/2024"));
       Break breakVehicle = new Break(NombreDePortes.CINQ, new Immatriculation("5678CD"), new Constructeur("Peugeot"), "308 SW", 25000, 6000, TypeVehicule.BREAK, 12000, new GestionDates("01/01/2024"), new GestionDates("01/02/2024"));
//
        try {
           // Tester la location pour un client particulier
           System.out.println("Location pour un client particulier :");
           gestionLocation.demandeDeLocation(berline, clientParticulier);
            gestionLocation.demandeDeLocation(breakVehicle, clientParticulier);
//
//            // Tester la location pour un client professionnel
           System.out.println("\nLocation pour un client professionnel :");
            gestionLocation.demandeDeLocation(berline, clientProfessionnel);
            gestionLocation.demandeDeLocation(breakVehicle, clientProfessionnel);
//
//            // Sauvegarder les données
            Sauvegarde.sauvegardeDonnees(gestionLocation, "location.txt");
           System.out.println("\nDonnées sauvegardées avec succès.");
        } catch (GestionAutomobileVehiculesLocationException e) {
            System.out.println("Erreur lors de la location : " + e.getMessage());
       }
        
        
     File file = new File("client.txt");
     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
       Client clientASerializer = new Client("BOUTLENDJ", "Melissa", 21, "7 Impasse B29", TypeClient.PARTICULIER, today);
     oos.writeObject(mesClients);
        System.out.println(oos.toString());
        
        System.out.println("here I am trying to read ");
        
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        for (Client s: mesClients)
        {
            System.out.println(s); 
        }
}
   
}


    
    
  
        
    

