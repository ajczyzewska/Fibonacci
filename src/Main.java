import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj numer liczby do obliczenia");
        Scanner scanner = new Scanner(System.in);
        int liczba = 1;
        liczba = scanner.nextInt();
       System.out.println("Liczba fibonacciego to: "+ fibonacci(liczba));




    }
    public static int fibonacci(int liczba)
    {
        int A = 0;
        int B = 1;
        int wynik = 0;
        if (liczba < 2)
            return liczba;

        for(int i = 2; i <= liczba; i++){
            wynik = A + B;
            A = B;
            B = wynik;
        }

        return wynik;
    }


}
