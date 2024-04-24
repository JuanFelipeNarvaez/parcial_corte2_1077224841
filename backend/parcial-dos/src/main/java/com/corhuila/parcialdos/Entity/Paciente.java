package com.corhuila.parcialdos.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_de_nacimiento")
    private Date fechaDeNacimeinto;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimeinto() {
        return fechaDeNacimeinto;
    }

    public void setFechaDeNacimeinto(Date fechaDeNacimeinto) {
        this.fechaDeNacimeinto = fechaDeNacimeinto;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
