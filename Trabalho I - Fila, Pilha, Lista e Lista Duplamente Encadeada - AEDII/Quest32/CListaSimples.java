class CListaSimples {
   private CCelula primeira, ultima;
   
   public CListaSimples() {// C�digo da fun��o construtora
      primeira = ultima;
      ultima = primeira;
   }
   
   public boolean vazia() {// C�digo para verificar se a Lista est� vazia
      return primeira == ultima;
    }
    
  public void insereComeco(Object valorItem) {// C�digo para inserir valorItem no in�cio da Lista
      primeira = new CCelula (valorItem, primeira);
      if (primeira.prox == null){
         ultima = primeira.prox;
         }
      }
    
   public Object removeComeco() {// C�digo para remover e retornar o elemento do in�cio da Lista
      if (primeira != ultima) {
         CCelula aux = primeira.prox;
         primeira.prox = aux.prox;
      if (primeira.prox == null)
         ultima = primeira;
         return aux.item;
         }
         return null;
      }
      
      public void insereFim(Object valorItem){ // C�digo para inserir valorItem no fim da Lista
      ultima.prox = new CCelula(valorItem, null);
      ultima = ultima.prox;            
   }
 
      public Object removeFim() { // C�digo para remover e retornar o elemento do fim da Lista
      if (primeira != ultima) {
         CCelula aux = primeira;
         while (aux.prox != ultima)
            aux = aux.prox;      
         CCelula aux2 = aux.prox;
         ultima = aux;
         ultima.prox = null;
         
         return aux2.item;
      }
      return null;
   }

      public void imprime() { // C�digo para imprimir todos os elementos da Lista
      CCelula aux = primeira.prox;   
      while (aux != null) {
         System.out.print(" "+aux.item);
         aux = aux.prox;
      }
   }

      public boolean contem(Object elemento) {// C�digo para verifica se a Lista contem o elemento passado
// como par�metro
      boolean achou = false;
      CCelula aux = primeira.prox;
      while (aux != null && !achou) {
         achou = aux.item.equals(elemento);			
         aux = aux.prox;
      }			
      return achou;
   }

}