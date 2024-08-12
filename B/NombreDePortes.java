/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tps.gestionparcautomobile.B;

/**
 *
 * @author melissa
 */
public enum NombreDePortes {
    UN(1, "une porte"),
    DEUX(2, "deux portes"),
    TROIS(3, "polyvalente et compact"),
    QUATRE(4, "quatre portes"),
    CINQ(5, "sinq portes");

    private final int nombreDePortes;
    private final String description;
    
  
    NombreDePortes(int nombreDePortes, String description) {
        this.nombreDePortes = nombreDePortes;
        this.description = description;
    }

    public int  getNombreDePortes() {
        return nombreDePortes;
    }

    public String getDescription() {
        return description;
    }
}