package com.corhuila.parcialdos.IService;


import com.corhuila.parcialdos.Entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {
    List<Paciente> findAll();
    Optional<Paciente> findById(Long id);
    Paciente save(Paciente paciente);
    void update(Paciente paciente, Long id);
    void delete(Long id);
}
