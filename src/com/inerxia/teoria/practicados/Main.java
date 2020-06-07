package com.inerxia.teoria.practicados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Lector lector = new Lector();
    public static NoTerminales noTerminales;

    public static void main(String[] args) {
	// write your code here
        inicio();
    }

    public static void inicio(){
do {
    List<String> romano = lector.leerRomano();
    noTerminales = new NoTerminales(romano);
    noTerminales.ntR(romano.remove(0));

}while(true);


    }


}
