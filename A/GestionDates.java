/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps.gestionparcautomobile.A;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author melissa
 */

public class GestionDates implements Serializable{
    private final String format = "dd/MM/yyyy";
    private SimpleDateFormat sdf;
    private Date date;

    public GestionDates(String dateString) throws ParseException {
        this.sdf = new SimpleDateFormat(format);
        this.date = sdf.parse(dateString);
    }

    public String toString() {
        return sdf.format(date);
    }

    // Method to calculate the difference in days between two dates
    //avec un test pour etre sur que la date de debut est inferieur a la date de fin 
   public int differenceInDays(GestionDates dateDebut) {
    if (this.date.compareTo(dateDebut.date) >= 0) {
        throw new IllegalArgumentException("Start date cannot be after end date.");
    }

    long differenceInMillis = Math.abs(this.date.getTime() - dateDebut.date.getTime());
    return (int) (differenceInMillis / (1000 * 60 * 60 * 24)); // Convert milliseconds to days
}
      
      
    public int compareTo(GestionDates other) {
        // Compare the dates
        return this.date.compareTo(other.date);
    }
      
    //une fonction qui calcule le nomre de jour 
   
// public void display()throws ParseException
//      {
//       Date convertedCurrentDate = this.sdf.parse(this.date);
//       String returnDate=sdf.format(convertedCurrentDate );
//       System.out.println(returnDate);   
//      }
//      
//      
      
    
}
