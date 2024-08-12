/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.D;

/**
 *
 * @author melissa
 */
import java.io.*;
import tps.gestionparcautomobile.C.Gestion;

public class Sauvegarde {
    
    
    

    public static void sauvegardeDonnees(Gestion gestion, String directory) {
        gestion.sauvegardeDonnees(directory);
    }

    public static Gestion chargementDonnees(String directory) {
        return Gestion.chargementDonnees(directory);
    }
}