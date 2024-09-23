/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_dussart;

import java.util.Scanner;
import static tp1_convertisseur_dussart.TP1_convertisseur_DUSSART.CelciusVersKelvin;

/**
 *
 * @author alice
 */
public class TP1_convertisseur_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double val;
    double conv;
    int nb;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer la valeur :");
    val=sc.nextDouble();
    System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
    System.out.println("1) De Celcius vers Kelvin");
    System.out.println("1) De Kelvin vers Celcius");
    nb=sc.nextInt();
    switch(nb){
        case 1:
            conv=CelciusVersKelvin(val);
            System.out.println(val+" degré Celcius est égal à "+conv+" degré Kelvin");
    }

    }
public static double CelciusVersKelvin (double tCelcius){
        return tCelcius+273.15;
    }
public static double KelvinVersCelcius (double tKelvin){
        return tKelvin-273.15;
    }
public static double FarenheitVersCelcius (double tFarenheit){
        return tFarenheit;
    }
public static double CelciusVersFarenheit (double tCelcius){
        return tCelcius;
    }
public static double KelvinVersFarenheit (double tKelvin){
        return tKelvin;
    }
public static double FarenheitVersKelvin (double tFarenheit){
        return tFarenheit;
    }
}
