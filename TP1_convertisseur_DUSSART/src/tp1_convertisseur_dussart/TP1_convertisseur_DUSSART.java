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
    System.out.println("2) De Kelvin vers Celcius");
    System.out.println("3) De Farenheit vers Celcius");
    System.out.println("4) De Celcius vers Farenheit");
    System.out.println("5) De Kelvin vers Farenheit");
    System.out.println("6) De Farenheit vers Kelvin");
    nb=sc.nextInt();
    switch(nb){
        case 1:
            conv=CelciusVersKelvin(val);
            System.out.println(val+" degré Celcius est égal à "+conv+" degré Kelvin");
            break;
        case 2:
            conv=KelvinVersCelcius(val);
            System.out.println(val+" degré Kelvin est égal à "+conv+" degré Celcius");
            break;
        case 3:
            conv=FarenheitVersCelcius(val);
            System.out.println(val+" degré Farenheit est égal à "+conv+" degré Celcius");
            break;
        case 4:
            conv=CelciusVersFarenheit(val);
            System.out.println(val+" degré Celcius est égal à "+conv+" degré Farenheit");
            break;
        case 5:
            conv=KelvinVersFarenheit(val);
                System.out.println(val+" degré Kelvin est égal à "+conv+" degré Farenheit");
                break;
        case 6:
            conv=FarenheitVersKelvin(val);
            System.out.println(val+" degré Farenheit est égal à "+conv+" degré Kelvin");
            break;
    }

    }
public static double CelciusVersKelvin (double tCelcius){
        return tCelcius+273.15;
    }
public static double KelvinVersCelcius (double tKelvin){
        return tKelvin-273.15;
    }
public static double FarenheitVersCelcius (double tFarenheit){
        return (tFarenheit-32)/1.8;
    }
public static double CelciusVersFarenheit (double tCelcius){
        return tCelcius*1.8+32;
    }
public static double KelvinVersFarenheit (double tKelvin){
        return (tKelvin-273.15)+32;
    }
public static double FarenheitVersKelvin (double tFarenheit){
        return (tFarenheit+459.67)*5/9;
    }
}
