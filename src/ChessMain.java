import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ChessMain {

    static Scanner reader = new Scanner(System.in);
    static ArrayList<String> inputs = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("Ingrese nombre de jugador 1 (Fichas blancas):");
        reader.useDelimiter("\n");
        String Jugador1 = reader.next();
        System.out.println("Ingrese nombre de jugador 2 (Fichas negras):");
        reader.useDelimiter("\n");
        String Jugador2 = reader.next();
//        ArrayList<String> inputs1 = new ArrayList<>();

        boolean k = true;
        inputs.add("Ra1");
        inputs.add("Ra8");
        inputs.add("Nb1");
        inputs.add("Nb8");
        inputs.add("Bc1");
        inputs.add("Bc8");
        inputs.add("kd1");
        inputs.add("kd8");
        inputs.add("Qe1");
        inputs.add("Qe8");
        inputs.add("Bf1");
        inputs.add("Bf8");
        inputs.add("Ng1");
        inputs.add("Ng8");
        inputs.add("Rh1");
        inputs.add("Rh8");
        System.out.println("SI EL JUEGO APENAS EMPIEZA, POR FAVOR ESCOGER 1");
        while (k) {
            //Mensajes en consola 
            System.out.println("menú de consola-escoja un número");
            System.out.println("1 para agregar jugadas del juego (en orden)");
            System.out.println("2 para ver las fichas capturadas");
            System.out.println("3 para corregir una jugada");
            System.out.println("4 para adición de ronda en medio de partida");
            System.out.println("5 para mostrar las jugadas hasta el momento");
            System.out.println("6 para imprimir una jugada");
            System.out.println("7 para eliminar jugada");
            System.out.println("8 para cerrar consola");
            

            int m;
            m = reader.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Ingrese las partidas, escriba done cuando esta haya"
                            + " acabado o desee volver al menu principal");
                    String in = reader.next();
                    while (!"done".equals(in)) {
                        inputs.add(in);
                        in = reader.next();
                    }
                    k = true;
                    break;
                case 2:                    
                    k = true;
                    break;
                case 3:                    
                    k = true;
                    break;
                case 4:                    
                    k = true;
                    break;
                case 5:                    
                    k = true;
                    break;
                case 6:                    
                    break;
                case 7:                    
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
    
}
