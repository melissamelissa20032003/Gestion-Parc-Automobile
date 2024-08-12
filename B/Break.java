/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.B;

import tps.gestionparcautomobile.A.GestionDates;

/**
 *
 * @author melissa
 */
public class Break extends Vehicule implements Rentable{
     private TypeVehicule  typeVehicule;
        
    public Break(NombreDePortes nombreDePortes, Immatriculation immatriculation, Constructeur constructeur, String model, double kilometrage, double prixAchat,TypeVehicule tVehicule,double kilometrageFin,  GestionDates debut,GestionDates fin)
    {
        super(nombreDePortes, immatriculation, constructeur,  model,  kilometrage,  prixAchat,kilometrageFin,debut , fin);
        this.typeVehicule= tVehicule;
    }
    
    
     @Override
    public double getPrixLocationK()
    {
        
       return this.typeVehicule. getPrixLocationK();   
    }

    
    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicuele(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
    }
  
     @Override
     public String toString()
     {
         return super.toString() +
           "Type de vehicule : " + this.typeVehicule + "\n";
         
     }
  
    
}
