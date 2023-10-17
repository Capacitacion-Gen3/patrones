package com.nibado.example.websocket.clase6.strategy;

public class VehiculoAuto implements FuncionalidadVehiculo {
    private String bateriaOn() {
        return "bateria ON";
    }
    private String bateriaOff() {
        return "bateria OFF";
    }
    // siguen mucho mas método privados que serán invocados por "start" y "stop"
    
    
    public void start() {
        
        // se invocan muchos mas métodos para logra encender el auto
        System.out.println("Arrancando Auto: " + bateriaOn());
    }
    
    public void stop() {
        // se invocan muchos mas métodos para logra encender el auto
        System.out.println("Deteniendo Auto: " + bateriaOff());
    }
}
