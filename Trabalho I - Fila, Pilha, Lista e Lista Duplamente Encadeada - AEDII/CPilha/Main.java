import java.util.Random;

class Main {
  public static void main(String[] args) {
    // Inserindo 15 elementos aleat�rios entre 0 e 49
    Random R = new Random();
    CPilha P = new CPilha();
    for(int i = 0; i < 15; i++)
       P.empilha(R.nextInt(50));
    
    System.out.println("Qtde. elementos antes do peek() = "+P.quantidade());
    /*System.out.println("P.peek() retorna => "+P.peek());
    System.out.println("Qtde. elementos ap�s o peek()= "+P.quantidade());

    System.out.println("Qtde. elementos antes do desempilha() = "+P.quantidade());
    System.out.println("P.desempilha() retorna => "+P.desempilha());
    System.out.println("Qtde. elementos ap�s o desempilha()= "+P.quantidade());

    while(!P.vazia())
    {
       System.out.print("Elemento retirado = "+P.desempilha());
       System.out.println(" - qtde. elementos = "+P.quantidade());       
    }
    //Perceba que essa forma remove todos os elementos 
    // Pense em uma forma de fazer a impress�o dos elementos sem eliminar
    // os elementos da Pilha usando os m�todos peek(), empilha() e desempilha()
 
    // Inserindo 10 novos elementos aleat�rios entre 0 e 30
    for(int i = 0; i < 10; i++)
       P.empilha(R.nextInt(31));

    for(int i = 0; i < 31; i++)
       if(P.contem(i))
          System.out.println("O elemento "+i+" est� contido na Pilha P.");
*/
  }
}