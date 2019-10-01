class Main {
  public static void main(String[] args) {
  
  Deque D = new Deque();

   System.out.println ("Inserindo a esquerda: ");
   for(int i = 1; i <= 5; i++){
   D.pushLeft(i);
   }
   D.imprime();
   
   System.out.println ("Inserindo a direita: "); 
   for(int i = 1; i <= 5; i++){
   D.pushRight(i);
   }  
   D.imprime();
   
   System.out.println ("Remover a esquerda: "); 
   D.popLeft(); 
   D.imprime();
   
   System.out.println ("Remover a direita: ");
   D.popRight(); 
   D.imprime();

}
}