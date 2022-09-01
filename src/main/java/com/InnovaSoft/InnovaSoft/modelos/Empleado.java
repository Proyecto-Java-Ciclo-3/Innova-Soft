package com.InnovaSoft.InnovaSoft.modelos;

import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Atributos
    private int id;
    private String nombre;
    private String correo;
    private String rol;


    // Se crea la asociacion de muchos a uno para la entidad empresa
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    // Getter And Setter Asociacion
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    //Constructor vacio
    public Empleado() {
    }

    //Constructor lleno
    public Empleado(String nombre, String correo, String rol, Empresa empresa) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
    }

    // Getters And Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
