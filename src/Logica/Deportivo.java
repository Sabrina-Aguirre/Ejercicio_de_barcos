
package Logica;


public class Deportivo extends Barco{
    private int potenciaCV;

    public Deportivo(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    
    @Override
    public int devolverModuloEspecial() {
        int resu = this.devolverModuloNormal()+ this.potenciaCV;
        return resu;
    }
    
    

    

   
    
    
}
