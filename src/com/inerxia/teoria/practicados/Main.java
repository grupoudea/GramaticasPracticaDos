package com.inerxia.teoria.practicados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static char simbolo;
    public static List<String> simbolosEntrada = Arrays.asList("I", "V", "X", "L");
    public static Scanner scan = new Scanner(System.in);
    public static final char SALIR = 'Q';

    public static void main(String[] args) {
	// write your code here
        menu();
    }

    public static void menu(){
        System.out.println("Escriba el primer dígito del número romano \nPuede usar los siguientes símbolos: "+
                simbolosEntrada.toString());
        System.out.println("Para salir escriba Q.");
        do{
            if(entradaValida()){
                //todo poner logica aquí
            }

        }while(simbolo!=SALIR);
    }

    public static boolean entradaValida(){
        String entrada = scan.nextLine();
        boolean respuesta = false;
        if(entrada.length()>1){
            simbolo='E';
            System.out.println("Error. Digita un sólo caracter.");
        }else if(entrada.length()==0){
            System.out.println("ERR1: No se digitó ningún símbolo. ");
        }else{
            simbolo = entrada.toUpperCase().charAt(0);
            if(simbolosEntrada.contains(String.valueOf(simbolo))){
                System.out.println("BIEN: "+simbolo);
                respuesta = true;
            }else if(simbolo!=SALIR){
                System.out.println("Error. "+simbolo+" no esta dentro de los siguientes: "+simbolosEntrada.toString()+". Inténtalo nuevamente. ");
            }
        }

        return respuesta;
    }
}
