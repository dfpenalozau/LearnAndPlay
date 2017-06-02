
package learnandplay;

public class Jugador {
    
    public int Aciertos=0;
    
    public void CalcularGanador(){
        if(Aciertos==5){
            Aviso3 miGrafica=new Aviso3();
            miGrafica.setVisible(true);
        }
    }
    
}
