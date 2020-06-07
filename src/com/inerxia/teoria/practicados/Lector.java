package com.inerxia.teoria.practicados;

import java.util.*;

public class Lector {
    public Scanner scan = new Scanner(System.in);
    public List<String> simbolosEntrada = Arrays.asList("I", "V", "X", "L");
    public String simbolo;



    public Lector(){}

    /*public boolean leerDigitoRomano(){
        boolean respuesta = false;
        boolean salir = false;

        do {
            String entrada = scan.nextLine();

            if (entrada.length() > 1) {
                this.simbolo = 'E';
                System.out.println("Error. Digita un sólo caracter.");
            } else if (entrada.length() == 0) {
                System.out.println("ERR1: No se digitó ningún símbolo. ");
            } else {
                this.simbolo = entrada.toUpperCase().charAt(0);
                if (simbolosEntrada.contains(String.valueOf(this.simbolo))) {
                    System.out.println("BIEN: " + this.simbolo);
                    respuesta = true;
                } else if (this.simbolo != SALIR) {
                    System.out.println("Error. " + this.simbolo + " no está dentro de los siguientes: " + simbolosEntrada.toString() +
                            ". Inténtalo nuevamente. ");
                }else{
                    respuesta=true;
                    salir = true;

                }
            }
        }while (!respuesta);

        return salir;

    }*/

    public List<String> leerRomano(){
        System.out.println("Escriba el número romano. Puede usar los siguientes símbolos: "+
                this.getSimbolosEntrada());
        boolean hileraCorrecta;
        List<String> simbolos = null;
        do{
            hileraCorrecta = true;
            this.simbolo = scan.nextLine().toUpperCase();
            if(!this.simbolo.isEmpty()){
                simbolos = new LinkedList<>(Arrays.asList(this.simbolo.split("")));
                for (String item : simbolos) {
                    if (!this.simbolosEntrada.contains(item)) {
                        System.out.println("Error. Hilera incorrecta");
                        hileraCorrecta = false;
                        break;
                    }
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

}
