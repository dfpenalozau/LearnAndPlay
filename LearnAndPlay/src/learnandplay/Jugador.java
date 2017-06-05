
package learnandplay;

public class Jugador {
    
    public int Aciertos=0;
    
    public void CalcularGanador(){
        if(Aciertos==5){
            Aviso miGrafica=new Aviso();
            miGrafica.setVisible(true);
        }
    }
    
}
