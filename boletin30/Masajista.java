package boletin30;

/**
 *
 * @author finfanterodal
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;
    
    //

    public Masajista(String titulacion,int aniosExperiencia,Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.aniosExperiencia=aniosExperiencia;
        this.titulacion=titulacion;
    }

    
    //


    public void darMasaje() {
        System.out.println("Masaje");
    }
    

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar masajusta");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar partido masajista");
    }
    
    //
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia +  super.toString();
    }

    
}
