package com.pe.controller;

import com.pe.model.Cuenta;
import com.pe.service.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cuenta")
public class CuentaController {
    @Autowired
    ICuentaService servCuenta;

    @GetMapping("/listCuenta")
    public List<Cuenta> listarCuentas(){ return servCuenta.listAllCuenta(); }

    @PostMapping("/crearCuenta")
    public String crearCuenta(@RequestBody Cuenta cuenta){ return servCuenta.createCuenta(cuenta); }

}