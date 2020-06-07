package com.inerxia.teoria.practicados;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NoTerminales {
    public List<String> simbolos;
    public Lector lector = new Lector();
    public StringBuilder numeroRomano = new StringBuilder();
    public static final String MENSAJE_TERMINO_ROMANO = " Su número romano es: ";
    public static final String MENSAJE_IGNORAR_SIMBOLO = " Se ignora símbolo ";

    public NoTerminales(List<String> simbolo){
        this.simbolos = simbolo;
    }

    public void ntR(String simbolo){
        numeroRomano.append(simbolo);
        switch (simbolo){
            case "I":
                if(!this.simbolos.isEmpty()){
                    this.ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                if(!this.simbolos.isEmpty()) {
                    this.ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                if(!this.simbolos.isEmpty()) {
                    this.ntRX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "L":
                if(!this.simbolos.isEmpty()) {
                    ntRL(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }

    }

    public void ntRI(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRIII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
            case "X":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    imprimirError("ERR25, ERR26, ERR27, ERR28",'3');
                    System.out.println("Error. No se permiten más símbolos. Tal vez quiso escribir "+numeroRomano);
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR2",'0');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }

    }
    public void ntRIII(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    imprimirError("ERR25, ERR26, ERR27, ERR28",'3');
                    System.out.println("Error. No se permiten más símbolos. Tal vez quiso escribir "+numeroRomano);
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR3, ERR4, ERR5",'1');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRIII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }

    }
    public void ntRV(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRVII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR6, ERR7, ERR8",'1');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRVII(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRVIII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR9, ERR10, ERR11",'1');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRVII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRVIII(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    imprimirError("ERR25, ERR26, ERR27, ERR28",'3');
                    System.out.println("Error. No se permiten más símbolos. Tal vez quiso escribir "+numeroRomano);
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR12, ERR13, ERR14",'1');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRVIII(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRX(String simbolo){
        numeroRomano.append(simbolo);
        switch (simbolo){
            case "I":
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                if(!this.simbolos.isEmpty()) {
                    ntRXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "L":
                if(!this.simbolos.isEmpty()) {
                    ntRXL(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRXX(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRXXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR15",'0');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRXXX(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR16, ERR17",'2');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRXXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRXL(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR18, ERR19",'2');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRXL(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRL(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRLX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR20",'0');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRL(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;


        }

    }

    public void ntRLX(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRLXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR21",'0');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRLX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }
    }

    public void ntRLXX(String simbolo){

        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "X":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRLXXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR22",'0');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRLXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }

    }
    public void ntRLXXX(String simbolo){
        switch (simbolo){
            case "I":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRI(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            case "V":
                numeroRomano.append(simbolo);
                if(!this.simbolos.isEmpty()) {
                    ntRV(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
            default:
                imprimirError("ERR23, ERR24",'2');
                if (!this.simbolos.isEmpty()){
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo);
                    ntRLXXX(this.simbolos.remove(0));
                }else{
                    System.out.println(MENSAJE_IGNORAR_SIMBOLO+simbolo+MENSAJE_TERMINO_ROMANO+numeroRomano);
                }
                break;
        }

    }

    public void imprimirError(String codigoError, char caso){
        switch (caso){
            case '0':
                System.out.println(codigoError.concat(" Se esperaba I o V o X"));
                break;
            case '1':
                System.out.println(codigoError.concat(" Se esperaba I"));
                break;
            case '2':
                System.out.println(codigoError.concat(" Se esperaba I o V"));
                break;
            case '3':
                System.out.println(codigoError.concat(" No se esperaba ningún símbolo"));
                break;

        }
    }

}
