public class ArrayExercicio {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;

        // Preenchendo o array com números inteiros fornecidos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibindo o conteúdo do array, a soma dos números e o maior número
        System.out.println("Conteúdo do array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSoma de todos os números: " + soma);
        System.out.println("Maior número no array: " + maior);

        scanner.close();
    }
}
