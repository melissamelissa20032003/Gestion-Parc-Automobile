/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.B;

/**
 *
 * @author melissa
 */
    public class Immatriculation {
    private String identification;
    
    public Immatriculation(String a) 
    {
        this.identification=a;
    }
    
    public String toString()
    {
       return identification; 
    }
    
    public String getIdentification(){
        return identification;
    }
    
    
    
    public boolean identique(Immatriculation m)
    {
        return (this.identification == null ? m.identification == null : this.identification.equals(m.identification));
    }
}
