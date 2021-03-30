
import java.util.ArrayList;

public class Adicionar {
    
    private ArrayList<String> arreglo = new ArrayList<>();
    private String posicion;
    private String[] vposicion;
    private ArrayList<String> arreglosplit = new ArrayList<>();
    int[][] conteo = new int[6][2];

    public Adicionar(ArrayList inputs1) {
        arreglo.clear();
        this.arreglo = inputs1;

    }

    public void CapturaFichas() {
        for (int i = 0; i < arreglo.size(); i++) {
            posicion = arreglo.get(i);
            vposicion = posicion.split("");
            for (String character : vposicion) {
                arreglosplit.add(character);

            }
            arreglosplit.add("0");

        }
    }

    public void EncontrarX() {
        CapturaFichas();
        int sum = 0;
        int kb = 0;
        int Qb = 0;
        int Rb = 0;
        int Bb = 0;
        int Nb = 0;
        int Pb = 0;
        int kn = 0;
        int Qn = 0;
        int Rn = 0;
        int Bn = 0;
        int Nn = 0;
        int Pn = 0;

        for (int i = 0; i < arreglosplit.size(); i++) {

            if ("0".equals(arreglosplit.get(i))) {
                sum = sum + 1;
            }

            if ("x".equals(arreglosplit.get(i))) {
                String letra = arreglosplit.get(i + 1);
                String numero = arreglosplit.get(i + 2);

                for (int j = i; j > 0; j--) {
                    if (numero.equals(arreglosplit.get(j)) && letra.equals(arreglosplit.get(j - 1))) {
                        if ("x".equals(arreglosplit.get(j - 2))) {

                            String f = arreglosplit.get(j - 3);
                            switch (f) {
                                case "k":
                                    if (sum % 2 == 0) {
                                        kn = kn + 1;
                                        conteo[0][0] = kn;
                                    } else {
                                        kb = kb + 1;
                                        conteo[0][1] = kb;
                                    }
                                    break;
                                case "Q":
                                    if (sum % 2 == 0) {
                                        Qn = Qn + 1;
                                        conteo[1][0] = Qn;
                                    } else {
                                        Qb = Qb + 1;
                                        conteo[1][1] = Qb;
                                    }
                                    break;
                                case "R":
                                    if (sum % 2 == 0) {
                                        Rn = Rn + 1;
                                        conteo[2][0] = Rn;
                                    } else {
                                        Rb = Rb + 1;
                                        conteo[2][1] = Rb;
                                    }
                                    break;
                                case "B":
                                    if (sum % 2 == 0) {
                                        Bn = Bn + 1;
                                        conteo[3][0] = Bn;
                                    } else {
                                        Bb = Bb + 1;
                                        conteo[3][1] = Bb;
                                    }
                                    break;
                                case "N":
                                    if (sum % 2 == 0) {
                                        Nn = Nn + 1;
                                        conteo[4][0] = Nn;
                                    } else {
                                        Nb = Nb + 1;
                                        conteo[4][1] = Nb;
                                    }
                                    break;
                                default:
                                    if ("0".equals(arreglosplit.get(j - 4))) {

                                        if (sum % 2 == 0) {
                                            Pn = Pn + 1;
                                            conteo[5][0] = Pn;
                                        } else {
                                            Pb = Pb + 1;
                                            conteo[5][1] = Pb;
                                        }

                                    } else {
                                        String f2 = arreglosplit.get(j - 4);
                                        switch (f2) {
                                            case "k":
                                                if (sum % 2 == 0) {
                                                    kn = kn + 1;
                                                    conteo[0][0] = kn;
                                                } else {
                                                    kb = kb + 1;
                                                    conteo[0][1] = kb;
                                                }
                                                break;
                                            case "Q":
                                                if (sum % 2 == 0) {
                                                    Qn = Qn + 1;
                                                    conteo[1][0] = Qn;
                                                } else {
                                                    Qb = Qb + 1;
                                                    conteo[1][1] = Qb;
                                                }
                                                break;
                                            case "R":
                                                if (sum % 2 == 0) {
                                                    Rn = Rn + 1;
                                                    conteo[2][0] = Rn;
                                                } else {
                                                    Rb = Rb + 1;
                                                    conteo[2][1] = Rb;
                                                }
                                                break;
                                            case "B":
                                                if (sum % 2 == 0) {
                                                    Bn = Bn + 1;
                                                    conteo[3][0] = Bn;
                                                } else {
                                                    Bb = Bb + 1;
                                                    conteo[3][1] = Bb;
                                                }
                                                break;
                                            case "N":
                                                if (sum % 2 == 0) {
                                                    Nn = Nn + 1;
                                                    conteo[4][0] = Nn;
                                                } else {
                                                    Nb = Nb + 1;
                                                    conteo[4][1] = Nb;
                                                }
                                                break;

                                        }
                                    }

                            }

                        } else {
                            String f = arreglosplit.get(j - 2);
                            switch (f) {
                                case "k":
                                    if (sum % 2 == 0) {
                                        kn = kn + 1;
                                        conteo[0][0] = kn;
                                    } else {
                                        kb = kb + 1;
                                        conteo[0][1] = kb;
                                    }
                                    break;
                                case "Q":
                                    if (sum % 2 == 0) {
                                        Qn = Qn + 1;
                                        conteo[1][0] = Qn;
                                    } else {
                                        Qb = Qb + 1;
                                        conteo[1][1] = Qb;
                                    }
                                    break;
                                case "R":
                                    if (sum % 2 == 0) {
                                        Rn = Rn + 1;
                                        conteo[2][0] = Rn;
                                    } else {
                                        Rb = Rb + 1;
                                        conteo[2][1] = Rb;
                                    }
                                    break;
                                case "B":
                                    if (sum % 2 == 0) {
                                        Bn = Bn + 1;
                                        conteo[3][0] = Bn;
                                    } else {
                                        Bb = Bb + 1;
                                        conteo[3][1] = Bb;
                                    }
                                    break;
                                case "N":
                                    if (sum % 2 == 0) {
                                        Nn = Nn + 1;
                                        conteo[4][0] = Nn;
                                    } else {
                                        Nb = Nb + 1;
                                        conteo[4][1] = Nb;
                                    }
                                    break;
                                default:
                                    if ("0".equals(arreglosplit.get(j - 2))) {

                                        if (sum % 2 == 0) {
                                            Pn = Pn + 1;
                                            conteo[5][0] = Pn;
                                        } else {
                                            Pb = Pb + 1;
                                            conteo[5][1] = Pb;
                                        }

                                    } else {
                                        String f2 = arreglosplit.get(j - 4);
                                        switch (f2) {
                                            case "k":
                                                if (sum % 2 == 0) {
                                                    kn = kn + 1;
                                                    conteo[0][0] = kn;
                                                } else {
                                                    kb = kb + 1;
                                                    conteo[0][1] = kb;
                                                }
                                                break;
                                            case "Q":
                                                if (sum % 2 == 0) {
                                                    Qn = Qn + 1;
                                                    conteo[1][0] = Qn;
                                                } else {
                                                    Qb = Qb + 1;
                                                    conteo[1][1] = Qb;
                                                }
                                                break;
                                            case "R":
                                                if (sum % 2 == 0) {
                                                    Rn = Rn + 1;
                                                    conteo[2][0] = Rn;
                                                } else {
                                                    Rb = Rb + 1;
                                                    conteo[2][1] = Rb;
                                                }
                                                break;
                                            case "B":
                                                if (sum % 2 == 0) {
                                                    Bn = Bn + 1;
                                                    conteo[3][0] = Bn;
                                                } else {
                                                    Bb = Bb + 1;
                                                    conteo[3][1] = Bb;
                                                }
                                                break;
                                            case "N":
                                                if (sum % 2 == 0) {
                                                    Nn = Nn + 1;
                                                    conteo[4][0] = Nn;
                                                } else {
                                                    Nb = Nb + 1;
                                                    conteo[4][1] = Nb;
                                                }
                                                break;

                                        }
                                    }

                            }

                        }break;

                    }
                    

                }
            }
        }
        String ultima = arreglo.get(arreglo.size()-1);        
        if ("1-0".equals(ultima)){
            conteo[0][0]=kn+1;
        }if("0-1".equals(ultima)){
            conteo[0][1]=kn+1;
        }
        

    }

    public void MostrarSplit() {
//        CapturaFichas();
        EncontrarX();
        System.out.println("B: Bishop Black: " + conteo[3][0]);
        System.out.println("B: Bishop white :" + conteo[3][1]);
        System.out.println("N: knight Black :" + conteo[4][0]);
        System.out.println("N: knight white :" + conteo[4][1]);
        System.out.println("P: Peon Black :" + conteo[5][0]);
        System.out.println("P: Peon White :" + conteo[5][1]);
        System.out.println("R: Rook Blcak :" + conteo[2][0]);
        System.out.println("R: Rook White :" + conteo[2][1]);
        System.out.println("Q: Queen Black: "+ conteo[1][0]);
        System.out.println("Q: Queen White: " + conteo[1][1]);        
        System.out.println("k: King Black: " + conteo[0][0]);
        System.out.println("k: King White: " + conteo[0][1]);
        
        if (conteo[0][0]==1){
            System.out.println("Gana las fichas negras");
        }if(conteo[0][1]==1){
            System.out.println("Gana las fichas blancas");            
        }
//        System.out.println("split " + arreglosplit);
//        System.out.println("split " + arreglo);
    }
}
