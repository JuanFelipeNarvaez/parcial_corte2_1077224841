package com.corhuila.parcialdos.Controller;

import com.corhuila.parcialdos.Entity.Paciente;
import com.corhuila.parcialdos.IService.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/paciente")
public class PacienteController {
    @Autowired
    private IPacienteService service;

    @GetMapping()
    public List<Paciente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Paciente> findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @PostMapping()
    public Paciente save(@RequestBody Paciente paciente) {
        return service.save(paciente);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Paciente paciente, @PathVariable Long id) {
        service.update(paciente, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
