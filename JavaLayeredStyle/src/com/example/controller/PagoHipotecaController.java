package com.example.controller;

import com.example.model.PagoHipoteca;
import com.example.service.PagoHipotecaService;

public class PagoHipotecaController {
    private PagoHipotecaService pagoHipotecaService;

    public PagoHipotecaController() {
        this.pagoHipotecaService = new PagoHipotecaService();
    }

    public PagoHipoteca getPagoById(String id) {
        return pagoHipotecaService.getPagoById(id);
    }

    public void savePago(PagoHipoteca pago) {
        pagoHipotecaService.savePago(pago);
    }
}
