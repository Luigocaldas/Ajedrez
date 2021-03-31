import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ChessMain {

    public static Scanner reader = new Scanner(System.in);
    public static Scanner reader2 = new Scanner(System.in);
    public static ArrayList<String> inputs = new ArrayList<>();
    public static String jugador_blancas;
    public static String jugador_negras;
    
    
    public static void main(String[] args) {
        String nombre1 = "";
        String nombre2 = ""; 
        String color1  = "";
        String color2  = "";
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("bienvenido al anotador de jugadas de ajedrez");
        System.out.println("Ingrese el nombre del primer jugador:");
        reader2.useDelimiter("\n");
        nombre1 = reader2.next();
        System.out.println("eliga por favor un color de fichas para " + nombre1 );
        System.out.println("B--> Fichas blancas");
        System.out.println("N--> Fichas negras");
        
        color1 = reader.next();
        color1 = color1.toUpperCase(); //En caso de que se ingrese en mayúscula
        if(color1.equals("B")){
            jugador_blancas = nombre1;
            color2 = "N";
        } else if(color1.equals("N")){
            jugador_negras = nombre1;
            color2 = "B";
        }
        
        System.out.println("Ingrese el nombre del segundo jugador:");
        reader2.useDelimiter("\n");
        nombre2 = reader2.next();
        System.out.println("--------------------------------------------");
        if(color2.equals("B")){
            jugador_blancas = nombre2;
        }else if(color2.equals("N")){
            jugador_negras = nombre2;
        }
        
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
            System.out.println("--------------------------------------------");
            System.out.println("menú de consola-escoja un número");
            System.out.println("1 para agregar jugadas del juego (en orden)");
            System.out.println("2 para ver las fichas capturadas");
            System.out.println("3 para corregir una jugada");
            System.out.println("4 para adición de ronda en medio de partida");
            System.out.println("5 para mostrar las jugadas hasta el momento");
            System.out.println("6 para imprimir una jugada");
            System.out.println("7 para eliminar jugada");
            System.out.println("8 para cerrar consola");
            System.out.println("--------------------------------------------");

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
                    Adicionar mensajero = new Adicionar(inputs);
                    mensajero.MostrarSplit();
                    k = true;
                    break;
                case 3:                    
                    Corregir();
                    k = true;
                    break;
                case 4:                    
                    AdicionRonda();
                    k = true;
                    break;
                case 5:                    
                    Mostrar();
                    k = true;
                    break;
                case 6:                    
                    UnaJugada(jugador_blancas, jugador_negras);
                    break;
                case 7:
                    Eliminar();
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
    
    public static void Corregir() {
        System.out.println("Ingrese el número de la partida a corregir:");
        int corregirPartida = reader.nextInt();
        System.out.println("Ingrese la nueva jugada de fichas blancas:");
        String nuevaB = reader.next();
        System.out.println("Ingrese la nueva jugada de fichas negras:");
        String nuevaN = reader.next();

        switch (corregirPartida) {
            case 1:
                inputs.set(16, nuevaB);
                inputs.set(17, nuevaN);
                break;
            case 2:
                inputs.set(18, nuevaB);
                inputs.set(19, nuevaN);
                break;
            default:
                inputs.set((16 + (2 * corregirPartida - 2)), nuevaB);
                inputs.set((16 + (2 * corregirPartida - 1)), nuevaN);
                break;
        }

        System.out.println(inputs);
    }
    
    
    
    public static void Mostrar(){
        int ronda = 1;
        if(inputs.isEmpty()){
           System.out.println("No hay rondas registradas aún en esta partida");  
       } else {
           System.out.println("----------------------------------");
           for (int i=16; i <= (inputs.size() - 2) ; i+=2){
               System.out.println("++++++++++++++++++++++++++");
               System.out.println(ronda + ". " + inputs.get(i) + " " + inputs.get(i + 1));
               ronda += 1 ;
           }
           System.out.println("----------------------------------");
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
         System.out.println("Fichas Blancas - " + Nombre1 + " :"+ jugadaBlanca + ". Fichas negras - "+ Nombre2 + " :" + jugadaNegra);
    }
    
    public static void Eliminar(){
        System.out.println("Ingrese el número de la partida a eliminar:");
        int idx_eliminar = reader.nextInt();
        switch (idx_eliminar) {
            case 1:
                inputs.remove(16);
                inputs.remove(17);
                break;
            case 2:
                inputs.remove(18);
                inputs.remove(19);
                break;
            default:
                inputs.remove((16 + (2 * idx_eliminar - 2)));
                inputs.remove((16 + (2 * idx_eliminar - 1)));
                break;
        }
    
    
    
    }
    
}
