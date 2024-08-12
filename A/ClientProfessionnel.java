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
public class ClientProfessionnel extends Client implements CanRentOrBuy  {
    // peut etre je vais utiliser l'herittage  profissionnel herite de 
   
    private float tauxDeRemise;
 
    public ClientProfessionnel(String nom, String prenom, int age, String add, TypeClient type, GestionDates d,float tauxDeRemise) {
        super(nom, prenom, age , add , type ,d);
        this.tauxDeRemise=tauxDeRemise;
    }
    
    
    public double getTauxDeRemise()
    {
       return this.tauxDeRemise; 
    }
    
    
    @Override
 public String toString() {
  return super.toString() +
           "Taux de remise : " + this.tauxDeRemise + "\n";
}

    @Override
    public double getReduction() {
        return this.getTauxDeRemise();
    }
   
    
}
