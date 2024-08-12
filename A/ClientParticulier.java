/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.A;

import tps.gestionparcautomobile.A.Client;

/**
 *
 * @author melissa
 */
public class ClientParticulier extends Client implements CanRentOrBuy {
    //nom, prénom, age, adresse, un type (TypeClient), une date et un nombre de locations
    private int nombreDeLocation;
   

   
    public ClientParticulier(String nom, String prenom, int age, String add, TypeClient type, GestionDates d, int nombreLocation) {
        super(nom, prenom, age , add , type,d);
        this.nombreDeLocation= nombreLocation ;
    }
    
      public void setNombreLocation(int nombreLocation) {
        this.nombreDeLocation = nombreLocation;
    }

    public int getNombreLocation() {
        return nombreDeLocation;
    }
  
    // fonction pour incrimente le nombre de location 
    public void increment()
    {
        this.nombreDeLocation++;
    }
    
    @Override
    public String toString(){
      return super.toString()   + "Nombre de locations : " + this.nombreDeLocation + "\n" ;  
           
          }
  
     public double incrementNumberOfRentals() 
     {
        return this.nombreDeLocation++; 
     }

     //la methode anstruct de l'interface CanRentOrBuy 
     //all the methodes inside an interface are by default abstract 
    @Override
    public double getReduction() {
        //1.0 – 0.005 x nbLocations
        return (1-this.getNombreLocation()*0.005);
    }
}
