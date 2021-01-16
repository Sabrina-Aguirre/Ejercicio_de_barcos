
package Logica;


public class Yate extends Barco {

    private int potenciaCV;
    private int nroCamarotes;

    public Yate(int potenciaCV, int nroCamarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    
    
    
    @Override
    public int devolverModuloEspecial() {
        int resu=this.devolverModuloNormal()+ this.potenciaCV + this.nroCamarotes;
        return resu;
    }
    
    
    
    
}
