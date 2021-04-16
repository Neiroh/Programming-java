/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mesa;

/**
 *
 * @author Neiroh
 */
public class Mesa {

    protected int id;
    protected double ancho;
    protected double alto;
    protected double largo;
    protected String color;
    
    public Mesa(){
        
    }
    
    public Mesa(int id, double ancho, double alto, double largo, String color){
        this.id = id;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.color = color;
    }
    
    public Mesa(int id){
        this.id = id;
    }
    
    public boolean equals(Mesa other){
        return id == other.id;
    }
    
    @Override
    public String toString(){
        return "Mesa{\n"
                + "ID: " + id + "\n"
                + "Ancho: " + ancho + "\n"
                + "Alto: " + alto + "\n"
                + "Largo: " + largo + "\n"
                + "Color: " + color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
