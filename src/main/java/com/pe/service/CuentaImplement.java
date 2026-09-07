package com.pe.service;

import com.pe.model.Cuenta;
import com.pe.repository.ICuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaImplement implements ICuentaService {
    @Autowired
    ICuentaRepository repoCuenta;

    @Override
    public List<Cuenta> listAllCuenta() {
        return repoCuenta.findAll();
    }

    @Override
    public String createCuenta(Cuenta cuenta) {
        repoCuenta.save(cuenta);
        return "Cuenta creada";
    }
}
