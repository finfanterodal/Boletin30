package boletin30;

/**
 *
 * @author finfanterodal
 */
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar partido seleccionador");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
