package com.corhuila.parcialdos.Controller;

import com.corhuila.parcialdos.Entity.Medico;
import com.corhuila.parcialdos.Entity.Paciente;
import com.corhuila.parcialdos.IService.IMedicoService;
import com.corhuila.parcialdos.IService.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/medico")
public class MedicoController {
    @Autowired
    private IMedicoService service;

    @GetMapping()
    public List<Medico> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Medico> findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @PostMapping()
    public Medico save(@RequestBody Medico medico) {
        return service.save(medico);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Medico medico, @PathVariable Long id) {
        service.update(medico, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
