/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.A;

import java.io.Serializable;

/**
 *
 * @author melissa
 */
public class Client  implements Serializable{
    private String nom;
    private String prenom ;
    private int age ;
    private String add;
    private TypeClient type;
    private GestionDates debut;
  

    public Client(String nom, String prenom, int age, String add, TypeClient type, GestionDates d) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.add = add;
        this.type = type;
        this.debut= d;
     
    }
    
    public void setDebutLocation(GestionDates d)
    {
       this.debut= d;
    }
    
     public GestionDates getDebutLocation()
    {
       return this.debut;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setType(TypeClient type) {
        this.type = type;
    }

  
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAdd() {
        return add;
    }

    public TypeClient getType() {
        return type;
    }

      public String toString()
    {
        return "Nom : " + this.nom + "\n" +
           "Prenom : " + this.prenom + "\n" +
           "Age : " + this.age + "\n" +
           "Adresse : " + this.add + "\n" +
           "Type de Client : " + this.type + "\n"+
           "Date de debut de location : "+ this.debut+"\n";
         
    }

    
 
    
}
