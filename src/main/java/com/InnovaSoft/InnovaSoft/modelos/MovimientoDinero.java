package com.InnovaSoft.InnovaSoft.modelos;

import javax.persistence.*;

@Entity
@Table(name="Movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Atributos
    private int id;
    private long monto;
    private String concepto;

    // Asociacion muchos a uno empleado
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Empleado usuario;

    //Getter And Setter Asociacion empleado
    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    //Constructor vacio
    public MovimientoDinero() {
    }

    //Constructor lleno
    public MovimientoDinero(long monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
