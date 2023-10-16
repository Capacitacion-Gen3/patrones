package com.nibado.example.websocket.clase6.tempale;

public abstract class Padre {
    /* 
     * Estos son métodos abstractos
     * Sólo se pueden declarar dentro de clases que son abstractas
     *  
     */
    public abstract String enciende();
    public abstract String apaga();
    public abstract String acelera();
    public abstract String frena();
    
    public void llamaAlMetodoEnciende() {
        String resultado = this.enciende();
        System.out.println("El resultado de la invocación de Enciende es: " + resultado);
    }
    public void llamaAlMetodoApaga() {
        String resultado = this.apaga();
        System.out.println("El resultado de la invocación de Apaga es: " + resultado);
    }
    public void llamaAlMetodoFrena() {
        String resultado = this.frena();
        System.out.println("El resultado de la invocación de Frena es: " + resultado);
    }
    public void llamaAlMetodoAcelera() {
        String resultado = this.acelera();
        System.out.println("El resultado de la invocación de Acelera es: " + resultado);
    }
    /* Este es un método concreto */
    public void llamaATodos() {
        System.out.println("El resultado de la invocación de Enciende es: " + this.enciende());
        System.out.println("El resultado de la invocación de Apaga es: " + this.apaga());
        System.out.println("El resultado de la invocación de Acelera es: " + this.acelera());
        System.out.println("El resultado de la invocación de Frena es: " + this.frena());
    }
}
