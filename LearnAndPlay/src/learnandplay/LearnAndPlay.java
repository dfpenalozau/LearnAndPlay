package learnandplay;

public class LearnAndPlay {
    
    Paises MiPais=new Paises();
    SurAmerica MiSurAmerica=new SurAmerica();
    
    int Respuesta=MiPais.Respuesta;
    int PaisElegido=MiSurAmerica.PaisElegido;

    public static void main(String[] args) {
        
        Introduccion miGrafica=new Introduccion();
        miGrafica.setVisible(true);
        
    }
    
}
