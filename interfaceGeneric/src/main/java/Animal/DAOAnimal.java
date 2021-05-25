/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import Empleado.*;
import java.util.List;
import Empleado.Empleado;

/**
 *
 * @author jose
 */
public interface DAOAnimal {

    public boolean registrar(Animal animal);

    public List<Animal> obtener();

    public boolean actualizar(Animal animal);

    public boolean eliminar(Animal animal);
}
