
package Logica;


public class Main {

    
    public static void main(String[] args) {
        
        //Creacion de barcos:
        Barco velero1 = new Velero (1,"AHT",5,2001);
        Barco yate1 = new Yate (30,4,"ATG",5,2011);
        Barco deportivo3 = new Deportivo (40,"AHT",5,2001);
        
        //alquileres
        Alquiler alquiler1 = new Alquiler("Mariana Juarez",12345678,6,18,10,velero1);
        Alquiler alquiler2 = new Alquiler("Juan Juarez",12345777,5,19,11,yate1);
        Alquiler alquiler3 = new Alquiler("Lucas Panchi",33345678,6,18,10,deportivo3);
        
        // lista de alquileres de Marzo
        Alquiler listaAlquileres[]=new Alquiler[3];
        listaAlquileres[0]=alquiler1;
        listaAlquileres[1]=alquiler2;
        listaAlquileres[2]=alquiler3;
        
        //creacion de obj calculos
       Calculos calculos = new Calculos();
       
       Alquiler Mayoralquiler = calculos.retornarAlquilerMayor(listaAlquileres);
       Alquiler Menoralquiler = calculos.retornarAlquilerMenor(listaAlquileres);
       int promediarAlquileres = calculos.promediarAlquileresAnual(listaAlquileres);
        int promediarAlquileres2 = calculos.promediarAlquileresMensual(listaAlquileres);
       
        System.out.println("En el mes de enero el mayor al quiler fue de: " + Mayoralquiler.toString()+".");
        System.out.println("El alquiler menor fue de " + Menoralquiler.toString()+".");
        System.out.println("El alquiler mayor fue de " + Mayoralquiler.toString()+".");
        System.out.println("El promedio anual fue de " + promediarAlquileres +".");
        System.out.println("El promedio mensual fue de " + promediarAlquileres2 +".");
        
        
   
    
    }
    
}
