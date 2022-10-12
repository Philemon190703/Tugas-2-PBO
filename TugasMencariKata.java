import java.util.Scanner;
public class TugasMencariKata {
    public static void main(String[] args) {

        while (true) {
            String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
            String input;
            Scanner topo = new Scanner(System.in);

            System.out.print("Masukkan kata : ");
            input = topo.nextLine();
            if (kalimat.contains(input)){
                break;
            }
        }
    }
}