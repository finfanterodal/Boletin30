package boletin30;

/**
 *
 * @author finfanterodal
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;
    
    //
    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }



    @Override
    public void concentrarse() {
        System.out.println("");
    }

    @Override
    public void viajar() {
        System.out.println("");
    }

    @Override
    public void entrenar() {
        System.out.println("");
    }

  
    @Override
    public void jugarPartido() {
        System.out.println("");
    }

    
    
    
    //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad;
    }
    
    
}
