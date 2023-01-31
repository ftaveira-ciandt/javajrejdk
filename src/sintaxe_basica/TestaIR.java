package sintaxe_basica;

public class TestaIR {

    public static void main(String[] args) {

        double salario = 1500;

        if (salario < 1900) {
            System.out.println("Você não paga IR");
        } else if (salario >= 1900 & salario <= 2800) {
            System.out.println("Você paga aliquota de 7,5% e pode deduzir R$ 142,00 na declaração de IR");
        } else if (salario > 2800 & salario <= 3750) {
            System.out.println("Você paga aliquota de 15% e pode deduzir R$ 350,00 na declaração de IR");
        } else if (salario > 3750 & salario <= 4664) {
            System.out.println("Você paga aliquota de 22,5% e pode deduzir R$ 636 na declaração de IR");

        }
    }

}
