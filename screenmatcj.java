
import java.util.Scanner;

public class screenmatcj {

    public static void main(String[] args)
    {
        //System.out.println("hello word");
        System.out.println("Pelicula Matrix");
        //DECLARACION DE VARIABLES
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5; 
        boolean incluidoEnElPlanBasico = true; 
        String nombre = "Matrix"; //recordar que String lleva la S en mayuscula
        String sinopsis = """
                La mejor pelicula de ficcion de la ultima decada
                """; //las triple comillas nos deja escribir bloques de texto

        double mediaEvaluacionDeUsuario = 0;

        System.out.println("Pelicula: "+nombre);        //imprime los valores en pantalla. el simbolo + concatena, es decir, une el print con la variable declarada anteriormente
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento); //imprime los valores en pantalla
        System.out.println("Puntuacion: "+evaluacion); //imprime los valores en pantalla
        System.out.println("Incluye plan basico: "+incluidoEnElPlanBasico); //imprime los valores en pantalla sout
        
        double puntajeDePelicula = (5 + 2 + 3.6)/3;
        System.out.println("Puntaje de la Pelicula: " + puntajeDePelicula);

        if (fechaDeLanzamiento > 2023)
            {
                System.out.println("pelicula popular del momento");
            }
        else
            {
                System.out.println("pelicula retro");
            }
        
            
            for (int i =0; i < 3; i++) 
            {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese la nota qie le darias a la pelicula: ");
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionDeUsuario= mediaEvaluacionDeUsuario + notaMatrix;
            }
        System.out.println("La media de la pelicula es:" + mediaEvaluacionDeUsuario/3);
    }
}