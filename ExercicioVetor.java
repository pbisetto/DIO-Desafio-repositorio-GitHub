import java.util.Scanner;

class ExercicioVetor {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Qual o tamanho do vetor?");
        int tamanho = input.nextInt();
        int[] valor = new int[tamanho];
        input.nextLine();


        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = input.nextInt();}

        int maior = valor[0];

        for (int i = 1; i < valor.length; i++) {
            if (valor[i] > maior) {
                maior = valor[i];
            }
        }

        int menor = valor[0];

        for (int j = 1; j < valor.length; j++) {
            if (valor[j] < menor) {
                menor = valor[j];
            }
        }
        MaiorDiferença(maior, menor);
        OrdemCrescente(tamanho, valor);

    }


    private static void MaiorDiferença(int maior, int menor) {
        int resultado = (maior - menor);
            System.out.print("A maior diferença entre 2 números é " + resultado); System.out.print("");

}
    static boolean OrdemCrescente(int tamanho, int[] valor) {
    boolean ordem = false;
        for (int i = 1; i < tamanho; i++)
            if (valor[i - 1] > valor[i]) {
ordem= false;
    }
else ordem = true;
        System.out.println();
        System.out.println(ordem);
        return ordem;
    }
}