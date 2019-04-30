package boletin30;

import java.util.ArrayList;


/**
 *
 * @author finfanterodal
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();

        SeleccionFutbol futbolista = new Futbolista(14, "Extremo", 112, "Francisco", "Infante", 24);

        SeleccionFutbol entrenador = new Entrenador(1123, 112, "Francis", "Bonaparte", 40);

        SeleccionFutbol masajista = new Masajista("Graduado", 10, 112, "James", "Gordon", 32);

        SeleccionFutbol seleccionador = new Seleccionador(112, "Francisco", "Wayne", 24);
        
       
        
        //
        lista.add(futbolista);
        lista.add(entrenador);
        lista.add(masajista);
        lista.add(seleccionador);
        //
        
        
        //
        for (SeleccionFutbol sFutbol : lista) {
            System.out.println(sFutbol);
        }
        
       // ((Futbolista)futbolista).entrevista();
    }

}
