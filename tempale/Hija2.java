package com.nibado.example.websocket.clase6.tempale;

public class Hija2 extends Padre {

    @Override
    public String enciende() {
        return "Enciende Hija segunda";
    }

    @Override
    public String apaga() {
        return "Apaga Hija segunda";
    }

    @Override
    public String acelera() {
        return "Acelera Hija segunda";
    }

    @Override
    public String frena() {
        return "Frena Hija segunda";
    }

    public void pruebaPrimeraHija() {
        this.llamaAlMetodoAcelera(); // este método (que se encuentra en el padre) mide 678 lineas de código
    }
}
