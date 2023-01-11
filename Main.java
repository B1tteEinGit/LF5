import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inhöhe = new Scanner(System.in);
        System.out.println("Treppenhöhe: ");
        int hohe = inhöhe.nextInt();

        Scanner inbreite = new Scanner(System.in);
        System.out.println("Stufenbreite: ");
        int breite = inbreite.nextInt();

        String a = "*";
        String b = "";

        //int z = breite * hohe;

        for(int i = 0; i < breite; i++){
            b = b+a;
        }

        String c = "";
        String d = "";
        for(int i = 0; i < hohe; i++){
            c = c + b;
            //z -= 2;
            // z Leerzeichen müssen vor c
            System.out.println(c);
        }
    }
}