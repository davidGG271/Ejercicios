
package observerpattern;

import javax.swing.JOptionPane;


public class ObserverPattern {

    
    public static void main(String[] args) {
        
        String nombreDeArtista= JOptionPane.showInputDialog("Ingrese el nombre del artista");
        int fechaConcierto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha del concierto"));
        String categoria = JOptionPane.showInputDialog("Ingrese la categoria ");
        
        
        Teleticket teleticket = new Teleticket(nombreDeArtista,fechaConcierto,categoria,false);
        
        Fanatico fan1 = new Fanatico("Angel", "Serrano","Ozuna");
        Fanatico fan2 = new Fanatico("Henry", "Huaman", "Neymar");
        
        fan1.suscribirse(teleticket);
        fan2.suscribirse(teleticket);
        
        if( fechaConcierto == 15 ){
            teleticket.setDisponibilidad(true);
            teleticket.notificar();
        }
        
        
    }
    
}
