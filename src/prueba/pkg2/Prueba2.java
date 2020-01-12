
package prueba.pkg2;

import java.util.LinkedList;

public class Prueba2 {

    public static void main(String[] args) {

Avion avion =new Avion("BOEING",1800);
Vuelo vuelo=new Vuelo("1234", new LinkedList());
vuelo.setCargaActual(0);

Pasajero pasajero1=new Pasajero("1523456", "claudia");
Bulto bulto1=new Bulto(150);
vuelo.agregarBulto(bulto1,avion.getCapacidad());

Pasajero pasajero2=new Pasajero("1556451354", "roberta");
Bulto bulto2=new Bulto(170);
vuelo.agregarBulto(bulto2,avion.getCapacidad());

Pasajero pasajero3=new Pasajero("2356544", "pedro");
Bulto bulto3=new Bulto(250);
vuelo.agregarBulto(bulto3,avion.getCapacidad());

Pasajero pasajero4=new Pasajero("358441", "ana");
Bulto bulto4=new Bulto(310);
vuelo.agregarBulto(bulto4,avion.getCapacidad());

Pasajero pasajero5=new Pasajero("3528423", "sofia");
Bulto bulto5=new Bulto(410);
vuelo.agregarBulto(bulto5,avion.getCapacidad());

Pasajero pasajero6=new Pasajero("3698741", "lenne");
Bulto bulto6=new Bulto(254);
vuelo.agregarBulto(bulto6,avion.getCapacidad());

Pasajero pasajero7=new Pasajero("78954123", "karina");
Bulto bulto7=new Bulto(122);
vuelo.agregarBulto(bulto7,avion.getCapacidad());

Pasajero pasajero8=new Pasajero("3698542545", "luisa");
Bulto bulto8=new Bulto(140);
vuelo.agregarBulto(bulto8,avion.getCapacidad());

Pasajero pasajero9=new Pasajero("36985474", "fernanda");
Bulto bulto9=new Bulto(170);
vuelo.agregarBulto(bulto9,avion.getCapacidad());

Pasajero pasajero10=new Pasajero("32587453", "juan");
Bulto bulto10=new Bulto(190);
vuelo.agregarBulto(bulto10,avion.getCapacidad());

Pasajero pasajero11=new Pasajero("3698574236", "ernesto");
Bulto bulto11=new Bulto(268);
vuelo.agregarBulto(bulto11,avion.getCapacidad());

Pasajero pasajero12=new Pasajero("369874125", "al");
Bulto bulto12=new Bulto(348);
vuelo.agregarBulto(bulto12,avion.getCapacidad());

Pasajero pasajero13=new Pasajero("258745698", "fredo");
Bulto bulto13=new Bulto(499);
vuelo.agregarBulto(bulto13,avion.getCapacidad());


Pasajero pasajero14=new Pasajero("6325874", "rocio");
Bulto bulto14=new Bulto(380);
vuelo.agregarBulto(bulto14,avion.getCapacidad());


Pasajero pasajero15=new Pasajero("1000894432", "clara");
Bulto bulto15=new Bulto(154);
vuelo.agregarBulto(bulto15,avion.getCapacidad());

Pasajero pasajero16=new Pasajero("1000894432", "llema");
Bulto bulto16=new Bulto(650);
vuelo.agregarBulto(bulto16,avion.getCapacidad());


        System.out.println("a) la cantidad de bultos en el vuelo "+vuelo.getCodigo()+ " es de "+vuelo.cantidadBultos()+" kilogramos");
        System.out.println("---------------------------------------------///-------------------------------------------------///");
        System.out.println("b) bulto mas liviano: "+vuelo.bultoMasLiviano()+"\n"+ "bulto mas Pesado: "+vuelo.bultoMasPesado());
        System.out.println("---------------------------------------------///-------------------------------------------------///");
        System.out.println("c) el promedio del peso de la carga es: "+vuelo.promedioPeso());
        System.out.println("---------------------------------------------///-------------------------------------------------///");
        System.out.println("d) tabla de ingresos por vuelo");
        vuelo.mostrarTablas();
    }
    
}
