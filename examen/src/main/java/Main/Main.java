/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Abonado.Abonado;
import Abonado.Asociacion;
import Abonado.Cliente;
import Abonado.Empresa;
import Factura.FacAsociacion;
import Factura.FacCliente;
import Factura.FacEmpresa;
import Factura.Factura;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        //@param Date
        //@param año, se escribe 120 porque en este campo se suma desde 1900, para alcanzar 2020
        //@param mes, piensa en el numero de un mes y restale uno, como cuando haces un array
        //@param dia, escribe el dia, sin distincion, ni arrays ni na de na
        Date fecha1 = new Date(120, 0, 1);
        Date fecha2 = new Date(120, 6, 1);
        Date fecha3 = new Date(120, 1, 1);
        Date fecha4 = new Date(120, 7, 1);
        Date fecha5 = new Date(120, 2, 1);
        Date fecha6 = new Date(120, 8, 1);

        //@param Factura
        //@param fecha de salida de la factura, tipo de dato Date
        //@param consumo de agua tipo de dato double
        //@param tarifaBasura es un tipo de dato double, es la tarifa por la basura
        //@param tarifa (tarifaCliente | tarifaEmpresa | tarifaAsociacion) depende del tipo de abonado, es double y es la tarifa por el consumo de agua
        Factura[] fc = new Factura[6];
        fc[0] = new FacCliente(fecha1, 100, 27.5, 10);
        fc[1] = new FacCliente(fecha2, 125, 27.5, 10);
        fc[2] = new FacEmpresa(fecha3, 70, 27.5, 7.75);
        fc[3] = new FacEmpresa(fecha4, 83, 27.5, 7.75);
        fc[4] = new FacAsociacion(fecha5, 127, 27.5, 12);
        fc[5] = new FacAsociacion(fecha6, 56, 27.5, 12);
        
    //    FacCliente fc1 = new FacCliente(fecha1, 100, 27.5, 10);
    //    FacCliente fc2 = new FacCliente(fecha2, 125, 27.5, 10);
    //    FacEmpresa fe1 = new FacEmpresa(fecha3, 70, 27.5, 7.75);
    //    FacEmpresa fe2 = new FacEmpresa(fecha4, 83, 27.5, 7.75);
    //    FacAsociacion fa1 = new FacAsociacion(fecha5, 127, 27.5, 12);
    //    FacAsociacion fa2 = new FacAsociacion(fecha6, 56, 27.5, 12);

    
        //@param Abonado (Cliente | Empresa | Asociacion)
        //@param nombre es un tipo String, y pues eso, es el nombre
        //@param direccion es un tipo de dato String y es la dirección a la que se manda la factura
        //@param factura es un Array de Factura, y almacena las facturas
        //@param dni | cif | ca  es un tipo de dato String y almacena el DNI, el CIF o el código de la asociación
        Abonado c1 = new Cliente("Francisco Perez Perez", "Calle Salvador nº7 2ºB", "12345678A");
        Abonado e1 = new Empresa("José María Fernández López", "Calle Dolorosa nº8 4ºA", "12345678B");
        Abonado a1 = new Asociacion("Parque Nacional", "Calle Gran Vía s/n", "12345678C");
        
        //@param mediaCliente
        //@param fc es un array de tipo Factura y almacena el array sobre el que queremos hacer la media
        System.out.println(e1);
        System.out.println(a1);
        System.out.println(c1 + "\n\nMedia del año: " + mediaCliente(fc));
    }
    
    public static double mediaCliente(Factura[] f){
        
        double media = 0;
        
        for(int i = 0; i < f.length; i++){
            media += f[i].importeFactura();
        }
        
        return media /= f.length;
    }
}
