package com.nibado.example.websocket.clase6.builder;

public class Persona {
    private String nombre="";
    private int edad=0;
    private String direccion="";
    
    private Persona() {} // Para que nadie le haga "new" y tengan que usar el "create"
    
    public static Persona create() {
        return new Persona();
    }
    
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    
    public Persona setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public int getEdad() {
        return this.edad;
    }
}
