package com.nibado.example.websocket.clase6.singeton;

public class Invocadora {

    public static void main(String[] args) {
        EjemploSingleton es1 = EjemploSingleton.getInstance();
        System.out.println("El resultado es:"+es1.factorial(5));
        
        EjemploSingleton es2 = EjemploSingleton.getInstance();
        System.out.println("El resultado es:"+es2.factorial(6));
        
        EjemploSingleton es3 = EjemploSingleton.getInstance();
        System.out.println("El resultado es:"+es3.factorial(7));
        
        EjemploSingleton es4 = EjemploSingleton.getInstance();
        System.out.println("El resultado es:"+es4.factorial(8));
        
        EjemploSingleton es5 = EjemploSingleton.getInstance();
        System.out.println("El resultado es:"+es5.factorial(9));
    }

}
