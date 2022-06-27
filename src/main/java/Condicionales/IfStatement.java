package Condicionales;

import java.awt.desktop.AboutEvent;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send File
            fileSended++;
            System.out.println("Archivo Enviado");
            int i = 0;
            i++;
        } else {
            System.out.println("Por favor enciende el bluetooh para iniciar la transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
        // System.out.println(i);

    }
}
