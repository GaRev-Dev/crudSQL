package com.softka.contactos.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnt_id", nullable = false)
    private Integer id;

    @Column(name = "cnt_nombre", length = 100)
    private String nombre;

    @Column(name = "cnt_telefono", length = 10)
    private String telefono;

    @Column(name = "cnt_correo", length = 100)
    private String correo;

    @Column(name = "cnt_nacimiento", length = 10)
    private String nacimiento;
}