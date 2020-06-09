package com.inerxia.teoria.practicados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Lector lector = new Lector();
    public static NoTerminales noTerminales;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Realizar una aplicación de software que reconozca números romanos " +
                "con los símbolos I, V, X, L, en caso contrario que muestre los errores que contiene y " +
                "realizar un manejo de ellos. ");
        inicio();
    }

    public static void inicio(){
        boolean salirPrograma;
        do {
            salirPrograma =true;
            List<String> romano = lector.leerRomano();
            if(romano.size()>=1&&!(lector.getSALIR().equalsIgnoreCase(romano.get(0)))){
                noTerminales = new NoTerminales(romano);
                noTerminales.ntR(romano.remove(0));
                salirPrograma= false;
            }

        }while(!salirPrograma);
    }


}
