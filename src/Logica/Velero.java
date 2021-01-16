
package Logica;


public class Velero extends Barco {
    
    private int numeroMastiles;

    public Velero(String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }


    public Velero(int numeroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    @Override
            public int devolverModuloEspecial(){
            int resu = this.devolverModuloNormal() + this.numeroMastiles;
            return resu;
            }
    
    
}
