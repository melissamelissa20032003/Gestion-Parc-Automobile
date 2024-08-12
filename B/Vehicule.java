/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.B;

import tps.gestionparcautomobile.A.GestionDates;
import tps.gestionparcautomobile.B.NombreDePortes;
import tps.gestionparcautomobile.B.Immatriculation;
import tps.gestionparcautomobile.B.Constructeur;

/**
 *
 * @author melissa
 */
public class Vehicule {
    private NombreDePortes nombreDePortes;
    private Immatriculation immatriculation;
    private Constructeur constructeur;
    private String model;
    private double kilometrage;
    private double prixAchat;
    private double kilometrageFin;
    private GestionDates dateDebut;
    private GestionDates dateFin ;
    
    public Vehicule(){};

    public Vehicule(NombreDePortes nombreDePortes, Immatriculation immatriculation, Constructeur constructeur, String model, double kilometrage, double prixAchat,double kilometrageFin, GestionDates debut,GestionDates fin) {
        this.nombreDePortes = nombreDePortes;
        this.immatriculation = immatriculation;
        this.constructeur = constructeur;
        this.model = model;
        this.kilometrage = kilometrage;
        this.prixAchat = prixAchat;
        this.dateDebut= debut;
        this.dateFin=fin;
        this.kilometrageFin=kilometrageFin;
    }

    public int getNombreDePortes() {
       
       return this.nombreDePortes.getNombreDePortes();
   
    }

    public void setNombreDePortes(NombreDePortes nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }

    public Immatriculation getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(Immatriculation immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Constructeur getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(Constructeur constructeur) {
        this.constructeur = constructeur;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }
    
    public double getkilometrageFin()
    {
        return this.kilometrageFin;
        
    }
    
    public GestionDates getDateDebutLocation()
    {
       return this.dateDebut; 
        
    }
    
    
    
    
    public GestionDates getDateFinLocation()
    {
       return this.dateFin; 
        
    }
    
    //methode toString pour l'affichage 
    public String toString()
    {
      return "Model : " + this.model + "\n" +
           "Constructeur : " + this.getConstructeur() + "\n" +
           "Immatriculation : " + this.getImmatriculation() + "\n" +
           "Nombre de portes : " + this.nombreDePortes + "\n" +
           "Kilometrage : " + this.kilometrage + "\n" +
           "Prix d'achat : " + this.prixAchat + "\n" +
           "Kilometrage a la fin de location  : " + this.kilometrageFin +"\n"+
           "Date de debut de locaion : " + this.dateFin + "\n" +
           "Date de fin de locaion : " + this.dateFin + "\n" ;  
      
        
    }
    
    
}
