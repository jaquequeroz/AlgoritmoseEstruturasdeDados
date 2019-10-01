class Main {
  public static void main(String[] args) {
    CListaSimples L = new CListaSimples ();

    for(int i = 0; i < 10; i++)
    L.insereComeco(i+1);

    L.imprime();
   System.out.println(" ");  
    L.insereComeco(10);
       L.imprime();
  }
}