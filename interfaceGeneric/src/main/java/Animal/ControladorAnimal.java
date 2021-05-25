/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class ControladorAnimal {

    private ViewAnimal vista = new ViewAnimal();

    public ControladorAnimal() {
    }

    //llama al DAO para guardar un empleado
    public void registrar(Animal animal) {
        DAOAnimal dao = new DAOAnimalImpl();
        dao.registrar(animal);
    }

    //llama al DAO para actualizar un empleado
    public void actualizar(Animal animal) {
        DAOAnimal dao = new DAOAnimalImpl();
        dao.actualizar(animal);
    }

    //llama al DAO para eliminar un empleado
    public void eliminar(Animal animal) {
        DAOAnimal dao = new DAOAnimalImpl();
        dao.eliminar(animal);
    }

    //llama al DAO para obtener todos los empleados y luego los muestra en la vista
    public void verAnimales() {
        List<Animal> animales = new ArrayList<Animal>();
        DAOAnimal dao = new DAOAnimalImpl();
        animales = dao.obtener();
        vista.verAnimales(animales);
    }
}
