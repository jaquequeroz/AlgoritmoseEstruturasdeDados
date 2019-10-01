class Main {
  public static void main(String[] args) {
    CListaDup LD = new CListaDup();
    for(int i = 1; i <= 5; i++) {
       LD.insereFim(6);
        LD.insereFim(i+1);   
       }
    System.out.println("\nLISTA \n==============");    
    LD.imprimeFormatoLista();
    LD.RemovePos(3);
    System.out.println("\nLISTA APOS REMOCAO DO ELEMENTO NA POSICAO 3\n=============="); 
    LD.imprimeFormatoLista();

      
//    System.out.println("\nLISTA INVERTIDA\n===============");
//    LD.imprimeInvFormatoLista();

//    if(LD.quantidade() >= 5)
//      System.out.println("\nElemento na posicao 5 = "+LD.retornaIndice(5));
  }
}