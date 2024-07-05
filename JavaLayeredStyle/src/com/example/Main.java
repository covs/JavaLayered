package com.example;

import com.example.controller.PagoHipotecaController;
import com.example.model.PagoHipoteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        PagoHipotecaController pagoHipotecaController = new PagoHipotecaController();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Obtener datos del pago del usuario
            System.out.print("Ingrese el ID del pago: ");
            String id = reader.readLine();

            System.out.print("Ingrese el número de cuenta: ");
            String cuenta = reader.readLine();

            System.out.print("Ingrese el monto del pago: ");
            double monto = Double.parseDouble(reader.readLine());

            // Crear un nuevo pago de hipoteca
            PagoHipoteca newPago = new PagoHipoteca(id, cuenta, monto);
            pagoHipotecaController.savePago(newPago);

            // Recuperar el pago
            PagoHipoteca retrievedPago = pagoHipotecaController.getPagoById(id);
            System.out.println("Pago Recuperado: Cuenta: " + retrievedPago.getCuenta() + ", Monto: " + retrievedPago.getMonto());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
