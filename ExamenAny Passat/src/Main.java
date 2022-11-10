import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int opcio = 0;
    int numeroAlumnes = 0;
    double notaActivitat = 0;
    double notaProva = 0;
    double notaActitud = 0;
    double notaFinal = 0;
    int suspesos = 0;
    int aprovats = 0;
    int count2S = 0;
    int countS = 0;
    Scanner sc = new Scanner(System.in);
    boolean sortir = false;
        System.out.println("Introdueixi el numero total d'alumnes que vol posar la nota:");
        numeroAlumnes = sc.nextInt();
        String [] nom = new String[numeroAlumnes];
        int count = nom.length;
        int [] notas = new int [numeroAlumnes];
        int count2 = notas.length;

    do {
        String missatge = "Indrodueix una de les següents opcions:\n1.Introduir notes" +
                "\n2.Veure Estadístiques\n3.Sortir";

        System.out.println(missatge);
        opcio = sc.nextInt();

        switch (opcio) {
            case 1:

                bucle1:
                for (int i = 0; i < count; i++){
                    System.out.println("Introdueix el nom de l'alumne:");
                    nom[i] = sc.nextLine();
                    sc.nextLine();
                    bucle2:
                    for (int j = 0; j < count2; j++){
                        System.out.println("Introdueix la nota de l'activitat (0-10):");
                        notaActivitat = sc.nextDouble();
                        System.out.println("Introdueix la nota de la prova (0-10):");
                        notaProva = sc.nextDouble();
                        System.out.println("Introdueix la nota de l'actitud (0-10):");
                        notaActitud = sc.nextDouble();
                        if (notaActivitat < 4 && notaActitud < 4 && notaProva < 5){
                            notaFinal = 0;
                            suspesos++;
                        }else {
                            notaFinal = (notaActivitat * 0.20) + (notaProva * 0.60) + (notaActitud * 0.20);
                            aprovats++;
                        }
                        notas[j] = (int)notaFinal;
                        break bucle2;


                    }
                }break;

            case 2:

                System.out.println("Numero d'alumnes avaluats: " + numeroAlumnes);
                double aprovatss = ((aprovats * 100) / numeroAlumnes);
                System.out.println("La cantitat d'aprovats es d'un " + aprovatss + "%");
                double suspesoss = ((suspesos * 100) / numeroAlumnes);
                System.out.println("La cantitat de suspeosos es d'un " + suspesoss + "%");

                //Histograma ACABAR NO SE FER
                System.out.println("Aprovats: ");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k] >= 5 && notas[k] <= 6) {
                        System.out.print("*");
                    }
                }
                System.out.println("\nNotables: ");
                for (int k = 0; k < notas.length; k++){
                    if (notas[k] >= 7 && notas[k] <= 8){
                        System.out.print("*");
                    }
                }
                System.out.println("\nExcel·lent: ");
                for (int k = 0; k < notas.length; k++){
                    if (notas[k] >= 9 && notas[k] <= 10){
                        System.out.print("*");
                    }
                }
                System.out.println("\nSuspesos: ");
                for (int k = 0; k < notas.length; k++){
                    if (notas[k] < 5) {
                        System.out.print("*");
                    }
                }

                System.out.println("\n");
                break;

            default:
                System.out.println("Numero incorrecte, torni a introduïr una opció valida: 1-3\n");
        }
    }while (opcio !=3);
    }

    }
