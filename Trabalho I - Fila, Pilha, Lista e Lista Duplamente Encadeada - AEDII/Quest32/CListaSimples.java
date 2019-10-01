class CListaSimples {
   private CCelula primeira, ultima;
   
   public CListaSimples() {// Código da função construtora
      primeira = ultima;
      ultima = primeira;
   }
   
   public boolean vazia() {// Código para verificar se a Lista está vazia
      return primeira == ultima;
    }
    
  public void insereComeco(Object valorItem) {// Código para inserir valorItem no início da Lista
      primeira = new CCelula (valorItem, primeira);
      if (primeira.prox == null){
         ultima = primeira.prox;
         }
      }
    
   public Object removeComeco() {// Código para remover e retornar o elemento do início da Lista
      if (primeira != ultima) {
         CCelula aux = primeira.prox;
         primeira.prox = aux.prox;
      if (primeira.prox == null)
         ultima = primeira;
         return aux.item;
         }
         return null;
      }
      
      public void insereFim(Object valorItem){ // Código para inserir valorItem no fim da Lista
      ultima.prox = new CCelula(valorItem, null);
      ultima = ultima.prox;            
   }
 
      public Object removeFim() { // Código para remover e retornar o elemento do fim da Lista
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

      public void imprime() { // Código para imprimir todos os elementos da Lista
      CCelula aux = primeira.prox;   
      while (aux != null) {
         System.out.print(" "+aux.item);
         aux = aux.prox;
      }
   }

      public boolean contem(Object elemento) {// Código para verifica se a Lista contem o elemento passado
// como parâmetro
      boolean achou = false;
      CCelula aux = primeira.prox;
      while (aux != null && !achou) {
         achou = aux.item.equals(elemento);			
         aux = aux.prox;
      }			
      return achou;
   }

}