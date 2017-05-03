package triangulos;

import java.util.Scanner;

/**
 *
 * @author camila
 */
public class Triangulos {

    public String validacaoDeTriangulos(int a, int b, int c) {
        // Condição de existência do triângulo
        String retorno;
        if (((Math.abs(b - c) < a) && (a < (b + c))) && ((Math.abs(a - c) < b) && (b < (a + c))) && ((Math.abs(a - b) < c) && (c < (a + b)))) {
            if (a == b && a == c) {
                retorno = "Esquilátero";
            } else if (a != b && b != c && a != c) {
                retorno = "Escaleno";
            } else {
                retorno = "Isosceles";
            }
        } else {
            retorno = "Não é triângulo";
        }

        return retorno;

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Triangulos triangulo = new Triangulos();
        int a, b, c;

        System.out.println("Informe o lado A: ");
        a = entrada.nextInt();

        System.out.println("Informe o lado B: ");
        b = entrada.nextInt();

        System.out.println("Informe o lado C: ");
        c = entrada.nextInt();

        System.out.println(triangulo.validacaoDeTriangulos(a, b, c));
        

    }

}
