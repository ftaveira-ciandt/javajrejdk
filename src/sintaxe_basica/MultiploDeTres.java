package sintaxe_basica;

import java.security.cert.CertPathValidatorSpi;

public class MultiploDeTres {

    public static void main(String[] args) {

        for (int multiplo3 = 0; multiplo3 <= 100; multiplo3++) {
            if (multiplo3 % 3 == 0) {

                System.out.println("É multiplo de 3 : " + multiplo3);
            }

        }

    }

}

