import java.util.Scanner;

public class TugasInputNilai {
    public static void main(String[] args) {
        //Buat program untuk menginput nilai dari 0 - 10,
        // jika program tidak menerima inputan nilai tersebut,
        // maka program meminta user untuk menginput ulang.

        while (true) {
            String input;
            Scanner topo = new Scanner(System.in);

            System.out.print("Masukkan sebuah angka dari 0-10 : ");
            input = topo.nextLine();
            if (input.equals("0") || input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") || input.equals("10")){
                break;
            }
        }
    }
}