package com.nibado.example.websocket.clase6.builder;

public class InvocaBuilder {

    public static void main(String[] args) {
        Persona persona = Persona
                .create()
                .setEdad(26)
                .setNombre("Goose");
        
        Persona persona2 = Persona
                .create()
                .setEdad(33)
                .setNombre("Tavo");
        
        System.out.println(persona.getNombre()); // va a pintar "Goose"
        System.out.println(persona2.getNombre()); // va a pintar "Tavo"
        
    }
}
