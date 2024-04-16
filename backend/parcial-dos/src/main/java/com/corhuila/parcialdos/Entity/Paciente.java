package com.corhuila.parcialdos.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_de_nacimiento")
    private LocalDate fechaDeNacimeinto;

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

    public LocalDate getFechaDeNacimeinto() {
        return fechaDeNacimeinto;
    }

    public void setFechaDeNacimeinto(LocalDate fechaDeNacimeinto) {
        this.fechaDeNacimeinto = fechaDeNacimeinto;
    }
}
