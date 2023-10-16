package com.nibado.example.websocket.clase6.singeton;

public class EjemploSingleton {
    private static EjemploSingleton instance;
    
    private EjemploSingleton() {
        System.out.println("hola");
    }
    
    public static EjemploSingleton getInstance() {
        if(instance==null) instance = new EjemploSingleton();
        return instance;
    }
    
    public int factorial(int n) {
        return (n<1)?1:n*factorial(n-1);
    }
}




