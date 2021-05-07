/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrumento;

import Interface.IMantenimiento;

/**
 *
 * @author Raul
 */
public abstract class Instrumento implements IMantenimiento{
    
    String def;
    String desc;
    String ejec;
    
    public Instrumento(){
        
    }
    
    public Instrumento(String def, String desc, String ejec){
        this.def = def;
        this.desc = desc;
        this.ejec = ejec;
    }
    
    public boolean equals(Instrumento other){
        return def.equals(other.def) && desc.equals(other.desc);
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "def=" + def + ", desc=" + desc + '}';
    }
}
