package com.inerxia.teoria.practicados;

import java.util.*;

public class Lector {
    public Scanner scan = new Scanner(System.in);
    public List<String> simbolosEntrada = Arrays.asList("I", "V", "X", "L");
    public String simbolo;
    public static final String SALIR = "Q";

    public Lector(){}

    public List<String> leerRomano(){
        System.out.println("Escriba el número romano. Puede usar los siguientes símbolos: "+
                this.getSimbolosEntrada()+"\nPara salir escriba la letra q.");
        boolean hileraCorrecta;
        List<String> simbolos = null;
        do{
            hileraCorrecta = true;
            this.simbolo = scan.nextLine().toUpperCase();
            if(!this.simbolo.isEmpty()){
                if(!SALIR.equalsIgnoreCase(this.simbolo)){
                    simbolos = new LinkedList<>(Arrays.asList(this.simbolo.split("")));
                    for (String item : simbolos) {
                        if (!this.simbolosEntrada.contains(item)) {
                            System.out.println("Error. Simbolos de entrada incorrectos");
                            hileraCorrecta = false;
                            break;
                        }
                    }
                }else{
                    simbolos = new LinkedList<>();
                    System.out.println("Saliendo...");
                    simbolos.add(SALIR);
                }
            }else{
                System.out.println("ERR1: No se digitó ningún símbolo.");
                hileraCorrecta = false;
            }

        }while(!hileraCorrecta);

        return simbolos;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public List<String> getSimbolosEntrada() {
        return simbolosEntrada;
    }

    public static String getSALIR() {
        return SALIR;
    }
}
