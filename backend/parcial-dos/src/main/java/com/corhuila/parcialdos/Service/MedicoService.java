package com.corhuila.parcialdos.Service;

import com.corhuila.parcialdos.Entity.Medico;
import com.corhuila.parcialdos.IRepository.IMedicoRepository;
import com.corhuila.parcialdos.IService.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService implements IMedicoService{
    @Autowired
    private IMedicoRepository repository;

    @Override
    public List<Medico> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Medico> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Medico save(Medico medico) {
        return repository.save(medico);
    }
    @Override
    public void update(Medico medico, Long id) {
        Optional<Medico> ps = repository.findById(id);

        if (!ps.isEmpty()){
            Medico medicoUpdate = ps.get();
            medicoUpdate.setNombre(medico.getNombre());
            medicoUpdate.setEspecialidad(medico.getEspecialidad());
            medicoUpdate.setPaciente(medico.getPaciente());

            repository.save(medicoUpdate);
        }else{
            System.out.println("No existe el medico");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
