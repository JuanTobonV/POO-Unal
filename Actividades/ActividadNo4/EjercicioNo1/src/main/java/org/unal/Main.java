package org.unal;

import org.unal.models.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuentaJuanito = new Cuenta(13, 20000);

        cuentaJuanito.consignar(20000);
        cuentaJuanito.consignar(20000);
        cuentaJuanito.retirar(2000);

        System.out.println(cuentaJuanito);

    }
}