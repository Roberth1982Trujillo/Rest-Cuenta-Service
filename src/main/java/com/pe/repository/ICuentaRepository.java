package com.pe.repository;

import com.pe.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {
}
