
package Logica;

public class Calculos {
    
    //método mostrar alquiler menor y mayo
    public Alquiler retornarAlquilerMenor(Alquiler listaAlquileres[]){
        
        Alquiler alquilerMenor = listaAlquileres[0];
        
        for(int i = 0; i < listaAlquileres.length;i++){
            if(alquilerMenor.calculoAlquiler()< listaAlquileres[i].calculoAlquiler()){
                
                alquilerMenor = listaAlquileres[i];
        }
    }
    return alquilerMenor;
    }
    
    public Alquiler retornarAlquilerMayor(Alquiler listaAlquileres[]){
        
        Alquiler alquilerMayor = listaAlquileres[0];
        
        for(int i = 0; i < listaAlquileres.length;i++){
            if(alquilerMayor.calculoAlquiler()> listaAlquileres[i].calculoAlquiler()){
                alquilerMayor = listaAlquileres[i];
        }
    }
    return alquilerMayor;
    }
    
    public int promediarAlquileresAnual(Alquiler listaAlquileres[]){
        int suma = 0;
        int numAlquileres = listaAlquileres.length;
        
        for(int i =0; i< numAlquileres; i++){
            
            suma += listaAlquileres[i].calculoAlquiler();
            
        }
        int promedio = suma /365;
        
        return promedio;     
    }
    
    public int promediarAlquileresMensual(Alquiler listaAlquileres[]){
        int suma = 0;
        int numAlquileres = listaAlquileres.length;
        
        for(int i =0; i< numAlquileres; i++){
            
            suma += listaAlquileres[i].calculoAlquiler();
            
        }
        int promedio = suma /30;
        
        return promedio;     
    }
             
}                   
    

