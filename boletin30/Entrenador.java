package boletin30;

/**
 *
 * @author finfanterodal
 */
public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;
    //
        public Entrenador(int idFederacion,int id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }
    
    
    //

    public void planificarEntrenamiento(){
        System.out.println("Entrenar");
    }
        
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar partido entrenador");
    }
    
    //

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion +  super.toString();
    }

    
    
}
