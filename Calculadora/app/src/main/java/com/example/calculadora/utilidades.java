package com.example.calculadora;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.1.7:5984/amigos/_design/amigos/_view/amigos";
    static String urlMto = "http://192.168.1.7:5984/amigos";
    static String user = "admin";
    static String passwd = "admin";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}