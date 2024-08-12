/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile;

import tps.gestionparcautomobile.A.GestionDates;
import tps.gestionparcautomobile.B.Vehicule;
import tps.gestionparcautomobile.B.TypeVehicule;
import tps.gestionparcautomobile.B.NombreDePortes;
import tps.gestionparcautomobile.B.Immatriculation;
import tps.gestionparcautomobile.B.Constructeur;
import tps.gestionparcautomobile.B.Rentable;

/**
 *
 * @author melissa
 */
public class Berline extends Vehicule implements Rentable  {
    private TypeVehicule  typeVehicule;
    
    public Berline(NombreDePortes nombreDePortes, Immatriculation immatriculation, Constructeur constructeur, String model, double kilometrage, double prixAchat,TypeVehicule tVehicule,double kilometrageFin,   GestionDates debut,GestionDates fin)
    {
        super(nombreDePortes, immatriculation, constructeur,  model,  kilometrage,  prixAchat, kilometrageFin, debut , fin );
        this.typeVehicule= tVehicule;
    }

    @Override
    public double getPrixLocationK()
    {
        
       return this.typeVehicule. getPrixLocationK();   
    }

    public TypeVehicule getTypeVehicuele() {
        return typeVehicule;
    }

    public void setTypeVehicuele(TypeVehicule typeVehicuele) {
        this.typeVehicule = typeVehicuele;
    }
    
    @Override
     public String toString()
     {
         return super.toString() +
           "Type de vehicule : " + this.typeVehicule + "\n";
         
     }
  
}
