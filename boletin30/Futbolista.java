package boletin30;
/**
 *
 * @author finfanterodal
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;
    //
    
    
        public Futbolista(int dorsal,String demarcacion,int id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    
    
    
    //
    
    
    public void entrevista(){
        System.out.println("Entrevista");
    }
    
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar partido futbolista");
    }
    
    //
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Futbolista " + "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }


    
    

}
