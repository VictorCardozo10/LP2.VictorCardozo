/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp2.clase1;
public class LP2Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad1 =12;
        int edad2 =15;
        int edad3 =17;
        int edad4 =19;
        int edad5 =23;
        
        double cantidadmayor=0;
        double cantidadmenor=0;
        double sumamayor=0;
        double sumamenor=0;
        
                
        switch(edad1>=18 ?1 :0){
            case 1: 
                cantidadmayor++;
                sumamayor += edad1;
                break;
            default: 
                cantidadmenor++;
                sumamenor += edad1;
                break;
        }
        switch(edad2>=18 ?1 :0){
            case 1: 
                cantidadmayor++;
                sumamayor += edad2;
                break;
            default: 
                cantidadmenor++;
                sumamenor += edad2;
                break;}
        
        switch(edad3>=18 ?1 :0){
            case 1: 
                cantidadmayor++;
                sumamayor += edad3;
                break;
            default: 
                cantidadmenor++;
                sumamenor += edad3;
                break;}
        
        switch(edad4>=18 ?1 :0){
            case 1: 
                cantidadmayor++;
                sumamayor += edad4;
                break;
            default: 
                cantidadmenor++;
                sumamenor += edad4;
                break;}
        
        switch(edad5>=18 ?1 :0){
            case 1: 
                cantidadmayor++;
                sumamayor += edad5;
                break;
            default: 
                cantidadmenor++;
                sumamenor += edad5;
                break;}
        double promediomenores = sumamenor/cantidadmenor;
        double promediomayores = sumamayor/cantidadmayor;   
        System.out.println("El promedio de los mayores de edad es: " + promediomayores);
        System.out.println("El promedio de los menores de edad es: " + promediomenores);
    }
}
