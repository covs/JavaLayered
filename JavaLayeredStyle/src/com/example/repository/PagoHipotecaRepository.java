package com.example.repository;

import com.example.model.PagoHipoteca;

import java.util.HashMap;
import java.util.Map;

public class PagoHipotecaRepository {
    private Map<String, PagoHipoteca> pagoDatabase = new HashMap<>();

    public PagoHipoteca getPagoById(String id) {
        return pagoDatabase.get(id);
    }

    public void savePago(PagoHipoteca pago) {
        pagoDatabase.put(pago.getId(), pago);
    }
}
