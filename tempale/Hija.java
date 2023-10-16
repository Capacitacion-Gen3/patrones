package com.nibado.example.websocket.clase6.tempale;

public class Hija extends Padre {

    public String enciende() {
        return "Enciende primera Hija";
    }

    public String apaga() {
        return "Apaga primera Hija";
    }

    public String acelera() {
        return "Acelera primera Hija";
    }

    public String frena() {
        return "Frena primera Hija";
    }

    public void pruebaPrimeraHija() {
        this.llamaAlMetodoAcelera(); // este método (que se encuentra en el padre) mide 678 lineas de código
    }
}
