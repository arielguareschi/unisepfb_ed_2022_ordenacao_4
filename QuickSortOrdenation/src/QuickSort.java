
public class QuickSort {

	int particionar(int ArrayPrincipal[], int Menor, int Maior)
    {
        int pivo = ArrayPrincipal[Maior];
        int i = (Menor - 1); // Index de elementos menores.
        for (int j = Menor; j < Maior; j ++)
        {
            // Se o elemento é menor ou igual ao Pivô.
            if (ArrayPrincipal[j] <= pivo)
            {
                i ++;
 
                // swap ArrayPrincipal[i] and ArrayPrincipal[j]
                int temp = ArrayPrincipal[i];
                ArrayPrincipal[i] = ArrayPrincipal[j];
                ArrayPrincipal[j] = temp;
            }
        }
 
        // swap ArrayPrincipal[i+1] and ArrayPrincipal[Maior] (or pivot)
        int temp = ArrayPrincipal[i + 1];
        ArrayPrincipal[i + 1] = ArrayPrincipal[Maior];
        ArrayPrincipal[Maior] = temp;
 
        return i + 1;
    }
 
    /* A função Main que implementa o QuickSort()
      ArrayPrincipal[] --> Array para ser ordenada,
      Menor  --> Index inicial,
      Maior  --> Index Final */
    void ordenar(int ArrayPrincipal[], int Menor, int Maior)
    {
        if (Menor < Maior)
        {
            /* particao é um Index de Partição, ArrayPrincipal[particao] está agora
             * à direita. */
            int particao = particionar(ArrayPrincipal, Menor, Maior);
 
            // Recursivamente ordena os elementos;
            // partition and after partition
            ordenar(ArrayPrincipal, Menor, particao - 1);
            ordenar(ArrayPrincipal, particao + 1, Maior);
        }
    }
 
    /* Faz impressão de uma array com N elementos */
    static void printArray(int ArrayPrincipal[])
    {
        int nTamanhoArray = ArrayPrincipal.length;
        for (int i = 0; i < nTamanhoArray; ++ i)
            System.out.print(ArrayPrincipal[i] + " ");
        System.out.println();
    }
 
    // Main (Principal).
    public static void main(String args[])
    {
        int ArrayPrincipal[] = {10, 7, 8, 9, 1, 5};
        int nTamanhoArray = ArrayPrincipal.length;
 
        QuickSort qOrdenacao = new QuickSort();
        qOrdenacao.ordenar(ArrayPrincipal, 0, nTamanhoArray - 1);
 
        System.out.println("Array Ordenada:");
        printArray(ArrayPrincipal);
    }
}
