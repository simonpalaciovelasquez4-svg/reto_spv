package com.example.reto_spv.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reto_spv.models.Empresa;

@Repository

public interface IRepositorioEmpresa extends JpaRepository<Empresa, UUID> {

}
