package com.corhuila.parcialdos.IService;

import com.corhuila.parcialdos.Entity.Medico;
import java.util.List;
import java.util.Optional;

public interface IMedicoService {
    List<Medico> findAll();
    Optional<Medico> findById(Long id);
    Medico save(Medico medico);
    void update(Medico medico, Long id);
    void delete(Long id);
}
