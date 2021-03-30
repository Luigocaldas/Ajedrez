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
                    AdicionRonda();
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
    public static void AdicionRonda() {
        System.out.println("Ingrese el número de la partida a adicionar:");
        int partida = reader.nextInt();
        System.out.println("Ingrese la jugada de fichas blancas:");
        String njugadab = reader.next();
        System.out.println("Ingrese la jugada de fichas negras:");
        String njugadan = reader.next();

        switch (partida) {
            case 1:
                inputs.add(16, njugadab);
                inputs.add(17, njugadan);
                break;
            case 2:
                inputs.add(18, njugadab);
                inputs.add(19, njugadan);
                break;
            default:
                inputs.add((16 + (2 * partida - 2)), njugadab);
                inputs.add((16 + (2 * partida - 1)), njugadan);
                break;
        }

        System.out.println(inputs);

    }
        public static void Mostrar(String nombre1, String nombre2){
        int it=16;
        for(int y = 16; y < inputs.size()-2; y++){            
            System.out.println("Jugada "+(it-15)+" ficha blanca - "+nombre1+": "+inputs.get(it)+" ficha negra - "+nombre2+": "+inputs.get(it+1));
            it=y+2;
        }
    }
    
    public static void UnaJugada(String Nombre1, String Nombre2){
        System.out.println("Ingrese el número de la partida que desea ver:");
        int una = reader.nextInt();
        String jugadaBlanca;
        String jugadaNegra;
         switch (una) {
            case 1:
                jugadaBlanca=inputs.get(16);
                jugadaNegra=inputs.get(17);
                break;
            case 2:
                jugadaBlanca=inputs.get(18);
                jugadaNegra=inputs.get(19);
                break;
            default:
                jugadaBlanca=inputs.get((16 + (2 * una - 2)));
                jugadaNegra=inputs.get((16 + (2 * una - 1)));
                break;
        }
         System.out.println("Fichas Blancas - "+Nombre1+" :"+jugadaBlanca+". Fichas negras - "+ Nombre2+" :"+jugadaNegra);
    }
    
}
