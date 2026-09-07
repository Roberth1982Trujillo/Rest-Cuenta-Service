package com.pe.service;

import com.pe.model.Cuenta;

import java.util.List;

public interface ICuentaService {
    public List<Cuenta> listAllCuenta();
    public String       createCuenta(Cuenta cuenta);
}