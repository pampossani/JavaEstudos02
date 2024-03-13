import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("----------| Contagem com For Loop |----------\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número = " + i);
        }


        System.out.printf("----------|  For Loop e Arrays |----------\n");
        String[] livros = {"Dom Casmurro","O Alienista","O Cortiço","Memórias Póstumas de Brás Cubas"};

        for (int i = 0; i < livros.length; i++) {
            System.out.println("Livro: " + livros[i]);
        }

        System.out.printf("----------|  Nested Loops (Matriz)|----------\n");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.println(x + " " + y);
                                        }
                                    }

        System.out.printf("\n----------|  While Loops |----------\n");
        int a = 0;
       while ( a < 5){
           System.out.println("Oi, eu sou o "+ a);
           a++;
       }

        System.out.println("\n----|0 a 100 - PARES|---");

        for (int num=0;num <= 100; num=num+2 )
        {
            System.out.print(num+" ");
        }
        System.out.println("\n");

        for (int num=0;num <= 100; num++ )
        {
            if ((num%2) == 0){
                System.out.printf(num + " ");
            }
        }

        System.out.println("\n-----| Ímpares|----\n");

        for (int num=0;num <= 100; num++ )
        {
            if ((num%2) == 1){
                System.out.printf(num + " ");
            }

        }
        System.out.println("\n\n----| Escreva uma frase |---\n");

        Scanner digito = new Scanner(System.in); /*preparar o scanner para receber*/

        String palavras =digito.nextLine(); /* Digite as palavras com espaço */
        String[] resultado =palavras.split("");/*fazer um array do resultado, dividindo a palavra recebida com split*/

            for(String letra:resultado){ /* Usando a String letra para passar por cada do resultado que foi cortado em qlq item*/
                System.out.print(letra+" ");
            }
        System.out.println("\n");

            for(int i=0; i < palavras.length();i++){ /*rodar pelo contador*/
                System.out.print(palavras.charAt(i) + " "); /*pega pelo char*/
            }

    }
}