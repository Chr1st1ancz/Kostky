import java.util.Scanner;
public class Kostky {
    public static int Pocethracu;
    static int pocetKostek;
    static int random1 = 0;
    static int [] field;
    static int soucet;
    static int promennaHrace;
    static int promenna;
    static Scanner sc = new Scanner(System.in);
    static boolean isRunning = true;
    public static void main(String[] args) {
        while (isRunning) {
            System.out.println("Zadej počet hráčů:");
            Pocethracu = sc.nextInt();
            System.out.println("Zadej počet kostek: ");
            pocetKostek = sc.nextInt();
            field = new int[pocetKostek];
            kostky();
            dalsiHry();
        }
    }
    public static void kostky(){

            for (int j = 0; j < Pocethracu; j++) {
                System.out.println("Hraje hráč" + (j+1));

                for (int i = 0; i < pocetKostek; i++) {
                    System.out.println("Hod kostkou číslo" + (i+1));
                    random1 = (int) (Math.random() * 6 + 1);
                    field[i] = random1;
                        soucet = soucet + random1;
                    System.out.println(field[i]);
                    if(i == pocetKostek-1){
                        if(promenna<soucet){
                            promennaHrace = (j+1);
                        }
                        promenna = 0;
                    }
                }
                promenna = soucet;


                System.out.println("Součet hráče " + (j+1) + " je:");
                System.out.println(soucet);
                soucet = 0;
            }
        System.out.println("Vyhral hráč " + promennaHrace);
        }

    public static void dalsiHry(){
        System.out.println("Chceš hodit další kostky? \n1 - ANO");
        System.out.println("2 - NE");
        int proceed;
        proceed = sc.nextInt();
        switch (proceed) {
            case 1:
                break;
            case 2:
                isRunning = false;
                System.out.println("Program se ukončuje");
                break;
            default:
                break;
        }
    }
}
