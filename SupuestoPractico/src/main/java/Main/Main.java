package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */

/*
    Se va a realizar en el polideportivo Clara Campoamor un
    evento de videojuegos, en el que podrán participar personas
    de todas las edades.

    En el evento hay mesas para conectar los periféricos del usuario, y se identifican por su ID,
    siendo 1 la primera mesa, y 200 la última. Cada mesa tiene también el tamaño (ancho y largo), la altura,
    el color del equipo del jugador que se va a sentar en esa mesa y el juego al que está dedicado el lugar.

    Las personas que participarán en el evento deberán registrarse con su DNI, su nombre completo,
    su fecha de nacimiento, su dirección, si tiene carnet joven (número de carnet),
    si tiene carnet de minusvalía (num minusválido), si tiene familia numerosa (num libro familia numerosa), 
    o si no tiene carnet de ningún tipo, y en caso de que sea menor de edad,
    si tiene el justificante de sus padres.

    También tenemos a los trabajadores, que pueden estar dedicados a: (ENTRE PARÉNTESIS SE ALMACENA SU ATRIBUTO INDEPENDIENTE)
    - Juegos (juegos a los que se dedica)
    - Mantenimiento de Red (estudios)
    - Mantenimiento de Ordenadores (estudios)
    - Cocina (restaurantes trabajados)
    - Limpieza (zona donde debe limpiar)
    De estos trabajadores almacenaremos lo mismo que de los participandes, además de su código de trabajador,
    que estará definido por un número, y el trabajo que realizan.

    También debemos almacenar los equipos que van a participar, guardaremos su ID, su nombre, su color
    y los juegos en los que participan.

    Los juegos disponibles en el evento son:
    - League of Legends (posición)
    - World of Warcraft (clase principal y función)
    - FIFA (equipo)
    - Super Smash Bros Ultimate (personaje principal)

    Cada juego se jugará un día a partir de una hora

    Cada persona tendrá asignada una mesa; cada equipo tendrá asignado un conjunto de mesas.

    Para calcular lo que debe pagar cada jugador por su entrada, usaremos la siguiente operación:

    1.5 * tarifa_jugador

    Donde tarifa de jugador puede ser:
    - Carnet Joven --> 3€
    - Carnet Familia Numerosa --> 2.5€
    - Carnet Minusvalía --> 2€
    - Sin Carnet --> 5€
    En caso de que tuviera más de un carnet, se escogerá el de la tarifa más barata.

*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
