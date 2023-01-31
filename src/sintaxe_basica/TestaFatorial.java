package sintaxe_basica;

public class TestaFatorial {

    public static void main(String[] args) {

        for (int n = 1, fatorial = 1; n <= 10; n++) {
            fatorial = fatorial * n;
            System.out.println("Fatorial de " + n + " é " + fatorial);
        }

    }
}



