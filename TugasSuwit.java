import java.util.Random;
import java.util.Scanner;
    public class TugasSuwit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //opening
            System.out.println("--------------------------------------------");
            System.out.println("     SELAMAT DATANG DI GAME SUWIT  ");
            System.out.println("       J= JEMPOL  T= TELUNJUK K = KELINKING");
            System.out.println("--------------------------------------------");

            while (true) {
                String[] bgk = {"J", "T", "K"};
                String comMove = bgk[new Random().nextInt(bgk.length)];

                String userMove;

                while (true) {
                    System.out.println("Masukkan jari [J/T/K]");
                    userMove = sc.nextLine();
                    if (userMove.equals("J") || userMove.equals("T") || userMove.equals("K")) {
                        break;
                    }
                    System.out.println(userMove + " Tidak dimengerti. ");
                }
                System.out.println("Komputer memberi  :  " + comMove);

                if (userMove.equals(comMove)) {
                    System.out.println("SERI !");
                } else if (userMove.equals("J")) {
                    if (comMove.equals("K")) {
                        System.out.println("KAMU KALAH ! ");

                    } else if (comMove.equals("T")) {
                        System.out.println("KAMU MENANG !");
                    }
                } else if (userMove.equals("K")) {
                    if (comMove.equals("K")) {
                        System.out.println("KAMU MENANG ! ");

                    } else if (comMove.equals("J")) {
                        System.out.println("KAMU KALAH !");
                    }
                } else if (userMove.equals("K")) {
                    if (comMove.equals("J")) {
                        System.out.println("KAMU MENANG !");
                    } else if (comMove.equals("G")) {
                        System.out.println("KAMU KALAH !");
                    }
                    System.out.println("Ingin suwit dengan komputer lagi? [Y/N]");
                    String lagi = sc.nextLine();
                    if (!lagi.equals("Y")) {
                        System.out.println("YAHHH KASIAN :'(");
                        break;
                    }
                }
            }
        }
    }