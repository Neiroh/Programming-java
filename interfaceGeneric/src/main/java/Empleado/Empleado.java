/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String ap1;
    private String ap2;
    private String dni;
    private Date fechaNacimiento;
    private Direccion direccion;

    public Empleado() {
    }
    
    public Empleado(String nombre, String ap1) {
        this.nombre = nombre;
        this.ap1 = ap1;
    }
    
    public Empleado(int id, String nombre, String ap1, String ap2, String dni, Date fechaNacimiento, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + ap1 + " " + ap2 + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }

        return true;
    }

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

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
}
