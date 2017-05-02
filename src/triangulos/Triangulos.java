package triangulos;

import java.util.Scanner;

/**
 *
 * @author camila
 */
public class Triangulos {

    
    
    public Boolean validacaoDeTriangulos(int a, int b, int c){
        // Condição de existência do triângulo
        if (((Math.abs(b - c) < a) && (a < (b + c))) && ((Math.abs(a - c) < b) && (b < (a + c))) && ((Math.abs(a - b) < c) && (c < (a + b)))) {
            if (a == b && a == c) {
                System.out.println("Esquilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Escaleno");
            } else {
                System.out.println("Isosceles");
            }
            return true;
        } else {
            System.out.println("Não é triângulo.");
            return false;
        }

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

        triangulo.validacaoDeTriangulos(a,b,c);
        
    }

    
}
