package com.nibado.example.websocket.clase6.strategy;

public class VehiculoMoto implements FuncionalidadVehiculo {
    private String bombaOn() {
        return "bomba ON";
    }
    private String bombaOff() {
        return "bateria OFF";
    }
    // siguen mucho mas método privados que serán invocados por "start" y "stop"
    
    
    public void start() {
        // se invocan muchos mas métodos para logra encender la moto
        System.out.println("Arrancando Moto: " + bombaOn());
    }
    
    public void stop() {
        // se invocan muchos mas métodos para logra encender la moto
        System.out.println("Deteniendo Moto: " + bombaOff());
    }
}
