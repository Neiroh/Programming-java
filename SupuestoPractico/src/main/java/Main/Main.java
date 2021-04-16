package Main;

import Equipo.Equipo;
import Evento.Evento;
import Juego.Juego;
import Juego.JuegoFifa;
import Juego.JuegoLol;
import Juego.JuegoSmash;
import Juego.JuegoWow;
import Mesa.Mesa;
import Participante.Participante;
import Participante.ParticipanteFamNum;
import Participante.ParticipanteJoven;
import Participante.ParticipanteMinusvalido;
import Participante.ParticipanteVacio;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
//        Date actual = new Date();
//        
//        Date fechaWow = new Date(2021, 10, 13, 16, 15);
//        Date fechaSmash = new Date(2021, 10, 14, 16, 15);
//        Date fechaLol = new Date(2021, 10, 15, 16, 15);
//        Date fechaFifa = new Date(2021, 10, 16, 16, 15);
//        
//        Date fechaNacMenor = new Date(2004, 5, 7);
//        Date fechaNacMayor1 = new Date(2001, 7, 13);
//        Date fechaNacMayor2 = new Date(1995, 7, 20);
//        Date fechaNacMayor3 = new Date(2000, 3, 17);
//        Date fechaNacMayor4 = new Date(2001, 12, 20);
//        
//        Juego wow = new Juego("World of Warcraft", "MMORPG");
//        Juego lol = new Juego("League of Legends", "MOBA");
//        Juego smash = new Juego("Super Smash Bros Ultimate", "Fighting Game");
//        Juego fifa = new Juego("FIFA20", "Fútbol");
//        
//        Juego[] juegos1 = new Juego[2];
//        juegos1[0] = wow;
//        juegos1[1] = lol;
//        
//        Juego[] juegos2 = new Juego[1];
//        juegos1[0] = fifa;
//        
//        Juego[] juegos3 = new Juego[2];
//        juegos1[0] = wow;
//        juegos1[1] = smash;
//        
//        Mesa mesaMia = new Mesa(1, 20, 40, 35, "Rojo");
//        Mesa mesa1 = new Mesa(2, 20, 40, 35, "Azul");
//        Mesa mesa2 = new Mesa(3, 20, 40, 35, "Verde");
//        Mesa mesa3 = new Mesa(4, 20, 40, 35, "Rosa");
//        Mesa mesa4 = new Mesa(5, 20, 40, 35, "Negro");
//        
//        ParticipanteJoven raul = new ParticipanteJoven(123, "123456789A", "Raúl", "Fernández", "Arce", fechaNacMayor1, "Calle agonía", juegos3, mesaMia);
//        ParticipanteVacio alvaro = new ParticipanteVacio("122345678B", "Álvaro", "Bautista", "Arce", fechaNacMayor2, "Calle Agonía", juegos3, mesa1);
//        ParticipanteFamNum antonio = new ParticipanteFamNum(321, "123345678C", "Antonio", "Cambelo", "González", fechaNacMayor4, "Calle Desesperación", juegos2, mesa3);
//        ParticipanteMinusvalido jose = new ParticipanteMinusvalido(111, "123445678D", "José Luis", "Fernández", "Gutiérrez", fechaNacMayor3, "Calle Aburrimiento", juegos1, mesa4);
//        ParticipanteVacio menor = new ParticipanteVacio("123455678E", "Joselito", "De la Rosa", "Jiménez", fechaNacMenor, "Calle Sin Derechos", juegos1, mesa2, false);
//        
//        Participante[] unnamed = new Participante[5];
//        unnamed[0] = raul;
//        unnamed[1] = alvaro;
//        unnamed[2] = antonio;
//        unnamed[3] = jose;
//        unnamed[4] = menor;
//        
//        Equipo unnamedE = new Equipo(1, "Unnamed Ceuta", "Rojo", juegos3, unnamed, raul);
//        
//        System.out.println(mesaMia);
//        System.out.println("");
//        System.out.println(Arrays.toString(juegos3));
//        System.out.println("");
//        System.out.println(unnamedE);
//        System.out.println("");
//        System.out.println(raul);
//        System.out.println("");
//        System.out.println(alvaro);
//        System.out.println("");
//        System.out.println(antonio);

        String rolWow;
        String rolLol;
        int numJuegos;
        int idMesa = 1;
        boolean justificante = false;

        System.out.println("Ingresa tu DNI...");
        String dni = sc.next();
        
        while(validaDni(dni)){
            System.out.println("DNI incorrecto...");
            dni = sc.next();
        }
        
        System.out.println("Ingresa tu nombre...");
        String nombre = sc.next();
        
        System.out.println("Ingresa tu primer apellido...");
        String ap1 = sc.next();
        
        System.out.println("Ingresa tu segundo apellido...");
        String ap2 = sc.next();
        
        System.out.println("Ingresa tu fecha de nacimiento...");
        System.out.println("Día...");
        int dia = sc.nextInt();
        
        System.out.println("Mes...");
        int mes = sc.nextInt();
        mes =- 1;
        
        System.out.println("Año...");
        int año = sc.nextInt();
        
        Date fechaNac = new Date(año, mes, dia);
        Date act = new Date();
        
        if(fechaNac.compareTo(act) < 18){
            System.out.println("Ingresa la ruta donde se encuentra una imagen del permiso paterno...");
            String ruta = sc.next();
            
            for(int i = 0; i < 3; i++){
                if(ruta == null){
                    System.out.println("NECESITA UN PERMISO");
                    System.out.println("LE QUEDAN " + (3-i) + " INTENTOS");
                }
            }
            if(ruta == null){
                System.exit(0);
            }else{
                justificante = true;
            }
        }
        
        System.out.println("Ingresa tu Dirección...");
        String direccion = sc.next();
           
        System.out.println("Inserta el número de juegos en los que va a participar...");
        numJuegos = sc.nextInt();

        if(numJuegos < 0 || numJuegos > 4){
            while(numJuegos < 0 || numJuegos > 4){
                System.out.println("NÚMERO INCORRECTO");
                System.out.println("Inserta el número de juegos en los que va a participar...");
                numJuegos = sc.nextInt();
            }
        }

        Juego[] juegos = new Juego[numJuegos];
            
            
        for(int i = 0; i < numJuegos; i++){
            System.out.println("Ingresa un juego...");
            String juego = sc.next();
            
            if(juego.equalsIgnoreCase("wow") || juego.equalsIgnoreCase("world of warcraft")){
                
                System.out.println("Ingresa tu clase...");
                String clase = sc.next();
                    
                    System.out.println("Ingresa tu rol...");
                    rolWow = sc.next();

                juegos[i] = new JuegoWow("World of Warcraft", "MMORP", clase, rolWow);
                
            }else if(juego.equalsIgnoreCase("lol") || juego.equalsIgnoreCase("League of Legends") ||
                    juego.equalsIgnoreCase("league")){
                    
                    System.out.println("Ingresa tu rol...");
                    rolLol = sc.next();
                
                juegos[i] = new JuegoLol("League of Legends", "MOBA", rolLol);
                
            }else if(juego.equalsIgnoreCase("smash") || juego.equalsIgnoreCase("super smash") || 
                    juego.equalsIgnoreCase("super smash bros") || juego.equalsIgnoreCase("smash bros") || 
                    juego.equalsIgnoreCase("super smash bros ultimate")){
                
                System.out.println("Ingresa el nombre de tu personaje...");
                String pj = sc.next();
                
                juegos[i] = new JuegoSmash("Super Smash Bros Ultimate", "Fighting Game", pj);
                
            }else if(juego.equalsIgnoreCase("fifa")){
                
                System.out.println("Ingresa el nombre del equipo con el que vas a jugar...");
                String eq = sc.next();
                
                juegos[i] = new JuegoFifa("FIFA", "Fútbol", eq);
                
            }else{
                
                System.out.println("JUEGO INCORRECTO");
                
            }
        }
        
        if(idMesa == 201){
            System.out.println("Lamentamos informarle de que no quedan plazas. Muchas Gracias");
        }
        //Sé que esto debería estar en un while que cubriera todo el main, ya que las plazas giran en torno a esto
        //pero al ser un supuesto no quiero que sea infinito
        
        System.out.println("Se le ha asignado la mesa número " + idMesa);
        idMesa++;
        
        Mesa mesa = new Mesa(idMesa);
        
        System.out.println("Inserta qué tipo de usuario eres...");
        System.out.println("Carnet Joven | Minusválido | Familia Numerosa | Normal");
        String tipoUsuario = sc.next();
        
        if(tipoUsuario.equalsIgnoreCase("carnet joven")){
            
            System.out.println("Inserta el número de Carnet Joven...");
            int numCarnet = sc.nextInt();
            
            ParticipanteJoven pJ = new ParticipanteJoven(numCarnet, dni, nombre, ap1, ap2, fechaNac, direccion, juegos, mesa, justificante);
            pJ.toString();
            
            System.out.println("A pagar " + pJ.pago());
            
        }else if(tipoUsuario.equalsIgnoreCase("minusvalido") || tipoUsuario.equalsIgnoreCase("minusválido")){
            
            System.out.println("Inserta el número de minusvalía...");
            int numMinus = sc.nextInt();
            
            ParticipanteMinusvalido pM = new ParticipanteMinusvalido(numMinus, dni, nombre, ap1, ap2, fechaNac, direccion, juegos, mesa, justificante);
            pM.toString();
            
            System.out.println("A pagar " + pM.pago());
            
        }else if(tipoUsuario.equalsIgnoreCase("familia numerosa")){
            
            System.out.println("Inserta el número de libro de Familia Numerosa");
            int numLibro = sc.nextInt();
            
            ParticipanteFamNum pF = new ParticipanteFamNum(numLibro, dni, nombre, ap1, ap2, fechaNac, direccion, juegos, mesa, justificante);
            pF.toString();
            
            System.out.println("A pagar " + pF.pago());
            
        }else{
            
            ParticipanteVacio pV = new ParticipanteVacio(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, mesa, justificante);
            pV.toString();
            
            System.out.println("A pagar " + pV.pago());
            
        }
    }
    
    public static boolean validaDni(String dni){
        if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false){
            return true;
        }else{
            return false;
        }
    }
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
