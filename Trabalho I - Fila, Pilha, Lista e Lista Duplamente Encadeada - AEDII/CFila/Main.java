class Main {
  public static void main(String[] args) {
    CFila F = new CFila();
    //F.mostra();
   // if(F.vazia())
   //    System.out.println("FILA VAZIA");
   // else
   //    System.out.println("FILA TEM ELEMENTOS");    
   for(int i = 0; i < 10; i++){
    F.enfileira(i*2);
    }
    System.out.println("FILA ANTES DA REMOCAO");
    F.mostra();
    F.RemoverApos(6);
    System.out.println("FILA APOS A REMOCAO");
    F.mostra();
/*    if(F.vazia())
       System.out.println("FILA VAZIA");
    else
       System.out.println("FILA TEM ELEMENTOS");
    F.mostra();
    System.out.println("ANTES DESENFILEIRA");
    System.out.println("Quantidade: "+F.quantidade());
    System.out.println(F.desenfileira());
    System.out.println("DEPOIS DESENFILEIRA");
    System.out.println("Quantidade: "+F.quantidade());
    F.mostra();
    System.out.println(F.peek());
    System.out.println("DEPOIS PEEK");
    System.out.println("Quantidade: "+F.quantidade());
    F.mostra();
    System.out.println(F.peek());
    System.out.println("DEPOIS PEEK");
    System.out.println("Quantidade: "+F.quantidade());
  */}
}