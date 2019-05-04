/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberes2mayo;
import java.util.Scanner;
/**
 *
 * @author irepe
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio=(int) (Math.random()*100)+1;
        System.out.println(aleatorio);
        adivinaNumero(aleatorio);
    }
   
    public static void exercice1(){
        int numero=1; 
        
        int suma=0;
        for(int i =1 ; i <= 10 ; i++)
        {
        suma=suma+numero;
   
        System.out.println (suma);
        numero++;
       }
    }
    
    public static void adivinaNumero (int numero){
        int contador = 0;
        Scanner s = new Scanner(System.in);
        for(int i=0 ; i <= 10; i++){
        System.out.println("Escribe un numero");
        int numeroUsuario= s.nextInt();
        if(numero == numeroUsuario){
        System.out.println ("has acertado, el numero de intentos es " + (i +1));
        break;
        }
        else{
            if(numero < numeroUsuario){
            System.out.println ("el numero que tienes que adivinar es menor");
            }
            else{
            System.out.println ("el numero que tienes que adivinar es mayor");
        }
        }
        }
     }
   }
    

