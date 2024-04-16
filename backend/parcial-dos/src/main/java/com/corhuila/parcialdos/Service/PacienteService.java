package com.corhuila.parcialdos.Service;

import com.corhuila.parcialdos.Entity.Paciente;
import com.corhuila.parcialdos.IRepository.IPacienteRepository;
import com.corhuila.parcialdos.IService.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService implements IPacienteService {
    @Autowired
    private IPacienteRepository repository;

    @Override
    public List<Paciente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Paciente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return repository.save(paciente);
    }
    @Override
    public void update(Paciente paciente, Long id) {
        Optional<Paciente> ps = repository.findById(id);

        if (!ps.isEmpty()){
            Paciente pacienteUpdate = ps.get();
            pacienteUpdate.setNombre(paciente.getNombre());
            pacienteUpdate.setFechaDeNacimeinto(paciente.getFechaDeNacimeinto());

            repository.save(pacienteUpdate);
        }else{
            System.out.println("No existe el paciente");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
