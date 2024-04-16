package com.corhuila.parcialdos.IRepository;

import com.corhuila.parcialdos.Entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico, Long> {
}
