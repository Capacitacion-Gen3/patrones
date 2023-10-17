package com.nibado.example.websocket.clase6.strategy;

public class InvocaStrategy {

    public static void main(String[] args) {
        PruebaFuncionalidadVehiculo pfv = new PruebaFuncionalidadVehiculo();
        
        // vean estos 2 renglones:
        FuncionalidadVehiculo objetoDeTipoFuncionalidadVehículo = new VehiculoAuto();
        pfv.prueba(objetoDeTipoFuncionalidadVehículo);
        
        // ahora vean estos otros 2 renglones:
        //FuncionalidadVehiculo fv = new VehiculoMoto();
        //pfv.prueba(fv);
    }

}
