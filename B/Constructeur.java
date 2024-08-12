/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.B;

/**
 *
 * @author melissa
 */
public class Constructeur {
    private  String mark;
    public Constructeur (String a)
    {
        mark=a;
    }
    
    public String toString()
    {
      return mark;  
        
    }
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    
    
}
