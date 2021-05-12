/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author jose
 */
public class Direccion {
    
    private String calle;
    private int numero;
    private int planta;
    private int puerta;
    private int codigoPostal;
    private int ciudad;

    public Direccion() {
    }

    public Direccion(String calle, int numero, int planta, int puerta, int codigoPostal, int ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", planta=" + planta + ", puerta=" + puerta + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Direccion other = (Direccion) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.planta != other.planta) {
            return false;
        }
        if (this.puerta != other.puerta) {
            return false;
        }
        if (this.codigoPostal != other.codigoPostal) {
            return false;
        }
        if (this.ciudad != other.ciudad) {
            return false;
        }
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        return true;
    }
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
