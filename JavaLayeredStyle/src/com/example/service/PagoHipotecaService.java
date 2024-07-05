package com.example.service;

import com.example.model.PagoHipoteca;
import com.example.repository.PagoHipotecaRepository;

public class PagoHipotecaService {
    private PagoHipotecaRepository pagoHipotecaRepository;

    public PagoHipotecaService() {
        this.pagoHipotecaRepository = new PagoHipotecaRepository();
    }

    public PagoHipoteca getPagoById(String id) {
        return pagoHipotecaRepository.getPagoById(id);
    }

    public void savePago(PagoHipoteca pago) {
        pagoHipotecaRepository.savePago(pago);
    }
}
