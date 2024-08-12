/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tps.gestionparcautomobile.B;

/**
 *
 * @author melissa
 */
public enum TypeVehicule {
    BERLINE(5f,"puissante"),
    BREAK(4f,"Famille"),
    UTILITAIRE(7f,"rapide");
    
      private final float prixLocationK;
      private final String description;
    
  
    TypeVehicule(float prix, String description) {
        this.prixLocationK = prix;
        this.description = description;
    }

    public float getPrixLocationK(){
        return prixLocationK;
    }

    public String getDescription() {
        return description;
    }
    
}
