public class CLista {
    
   private CCelula primeira;  // Referencia a célula cabeça
   private CCelula ultima; // Referencia a última célula da lista
   private int qtde; // Contador de itens na lista. Deve ser incrementado sempre que um item for inserido e decrementado quando um item for excluído.
    
   // Função construtora. Aloca a célula cabeça e faz todas as referências apontarem para ela.
   public CLista() {
      primeira = new CCelula();
      ultima = primeira;
   }
    
   // Verifica se a lista está vazia. Retorna TRUE se a lista estiver vazia e FALSE se ela tiver elementos.
   public boolean vazia() {
      return primeira == ultima;
   }
    
   // Insere um novo Item no fim da lista.
   public void insereFim(Object valorItem) {
      ultima.prox = new CCelula(valorItem);
      ultima = ultima.prox;            
      qtde++;
   }
    
   // Insere um novo Item no começo da lista.
   public void insereComeco(Object valorItem) {
      primeira.prox = new CCelula(valorItem, primeira.prox);
      if (primeira.prox.prox == null)
         ultima = primeira.prox;
      qtde++;
   }
 
   // Insere o Item passado por parâmetro na posição determinada.
   // O parâmetro "valorItem" é o item a ser inserido na lista.
   // O parâmetro "posicao" é a posição na qual o elemento será inserido. O primeiro elemento está na posição 1, e assim por diante.
   // Se a posição existir e o método conseguir inserir o elemento, retorna TRUE. Caso a posição não exista, retorna FALSE.
   public boolean insereIndice(Object valorItem, int posicao) {
      // Exercício
      return true;
   }
   
   // Imprime todos os elementos da lista usando o comando while 
   public void imprime() {
      CCelula aux = primeira.prox;
   
      while (aux != null) {
         System.out.println(aux.item);
         aux = aux.prox;
      }
   }
   
   // Imprime todos os elementos da lista usando o comando for 
   public void imprimeFor() {
      for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
         System.out.print(aux.item + " ");   		
   }
   
   // Imprime todos os elementos simulando formato de lista: [/]->[7]->[21]->[13]->null 
   public void imprimeFormatoLista() {
      System.out.print("[/]->");
      for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
         System.out.print("[" + aux.item + "]->");
      System.out.println("null");
   }

// Imprime todos os elementos simulando formato de lista: [/]->[7]->[21]->[13]->null 
   public void imprimeFormatoLista(String titulo) {
      System.out.println(titulo+"\n");
      System.out.print("[/]->");
      for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
         System.out.print("[" + aux.item + "]->");
      System.out.println("null");
   }   
   
   // Verifica se o elemento passado como parâmetro está contido na lista.
   // O parâmetro "elemento" é o item a ser localizado. O método retorna TRUE caso o Item esteja presente na lista.
   public boolean contem(Object elemento) {
      boolean achou = false;
      CCelula aux = primeira.prox;
      while (aux != null && !achou) {
         achou = aux.item.equals(elemento);			
         aux = aux.prox;
      }			
      return achou;
   }
	    
   // Verifica se o elemento passado como parâmetro está contido na lista. (Obs: usando o comando FOR)
   // O parâmetro "elemento" é o item a ser localizado. O método retorna TRUE caso o Item esteja presente na lista.
   public boolean contemFor(Object elemento) {
      boolean achou = false;
      for (CCelula aux = primeira.prox; aux != null && !achou; aux = aux.prox)
         achou = aux.item.equals(elemento);
      return achou;
   }

   // Retorna um Object contendo o primeiro Item da lista. Se a lista estiver vazia a função retorna null.
   public Object retornaPrimeiro() {
      if (primeira != ultima)
         return primeira.prox.item;
      else
         return null;
   }

   // Retorna um Object contendo o último Item da lista. Se a lista estiver vazia a função retorna null.
   public Object retornaUltimo() {
      if (primeira != ultima)
         return ultima.item;
      else
         return null;
   }

   // Retorna o Item contido na posição passada por parâmetro
   public Object retornaIndice(int posicao) {
      // EXERCÍCIO : deve retornar o elemento da posição p passada por parâmetro
      // [cabeça]->[7]->[21]->[13]->null
      // retornaIndice(2) deve retornar o elemento 21. retornaIndice de uma posiçao inexistente deve retornar null.
      // Verifica se é uma posição válida e se a lista possui elementos
      if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
          
        // Procura a posicao a ser retornada
        CCelula aux = primeira.prox;
        for (int i = 1; i < posicao; i++, aux = aux.prox) ;
        return aux.item;
      }
      return null;
   }
   
   // Remove e retorna o primeiro item da lista (remoção física, ou seja, elimina a célula que contém o elemento).
   // Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
   public Object removeRetornaComeco() {
      // Verifica se há elementos na lista
      if (primeira != ultima) {
         CCelula aux = primeira.prox;
         primeira.prox = aux.prox;
         if (primeira.prox == null) // Se a célula cabeça está apontando para null, significa que o único elemento da lista foi removido
            ultima = primeira;
         qtde--;
         return aux.item;
      }
      return null;
   }
	
   // Remove e retorna o primeiro item da lista (remoção lógica, ou seja, remove a célula cabeça fazendo com que a célula seguinte ela se torne a nova célula cabeça).
   // Retorna um Object contendo o item removido ou null caso a lista esteja vazia.
   public Object removeRetornaComecoSimples() {
      // Verifica se há elementos na lista
      if (primeira != ultima) {
         primeira = primeira.prox;
         qtde--;
         return primeira.item;
      }
      return null;
   }

   // Remove o primeiro item da lista fazendo com que a célula seguinte à célula cabeça se torne a nova célula cabeça. Não retorna o item removido.
   public void removeComecoSemRetorno() {
      if (primeira != ultima) {
         primeira = primeira.prox;
         qtde--;
      }
   }
    
   // Remove o último Item da lista.
   // Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
   public Object removeRetornaFim() {
      if (primeira != ultima) {
         CCelula aux = primeira;
         while (aux.prox != ultima)
            aux = aux.prox;      
         CCelula aux2 = aux.prox;
         ultima = aux;
         ultima.prox = null;
         qtde--;
         return aux2.item;
      }
      return null;
   }

   // Remove o último Item da lista sem retorná-lo.
   public void removeFimSemRetorno() {
      if (primeira != ultima) {
         CCelula aux = primeira;
         while (aux.prox != ultima)
            aux = aux.prox;      
         ultima = aux;
         ultima.prox = null;
         qtde--;
      }
   }

   // Localiza o Item passado por parâmetro e o remove da Lista
   // O parâmetro "valorItem" é o item a ser removido da lista.
   public void remove(Object valorItem) {
      if (primeira != ultima) {
         CCelula aux = primeira;
         boolean achou = false;
         while (aux.prox != null && !achou) {
            achou = aux.prox.item.equals(valorItem);
            if (!achou)
               aux = aux.prox;
         }
         if (achou) { 
            // achou o elemento
            aux.prox = aux.prox.prox;
            if (aux.prox == null)
               ultima = aux;
            qtde--;
         }
      }
   }

   // Remove o elemento na posição passada como parâmetro.
   // O parâmetro "posicao" é a posição a ser removida. OBS: o primeiro elemento está na posição 1, e assim por diante.
   // O método retorna TRUE se a posição existe e foi removida com sucesso, e FALSE caso a posição não exista.
   public boolean removeIndice(int posicao) {
      // Verifica se é uma posição válida e se a lista possui elementos
      if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
         int i = 0;
         CCelula aux = primeira;
         while (i < posicao - 1) {
            aux = aux.prox;
            i++;
         }
         aux.prox = aux.prox.prox;
         if (aux.prox == null)
            ultima = aux;
         qtde--;
         return true;
      }
      return false;
   }

   // Remove e retorna o elemento na posição passada como parâmetro.
   // O parâmetro "posicao" é a  posição a ser removida. OBS: o primeiro elemento está na posição 1, e assim por diante.
   // O método retorna um object contendo o elemento removido da lista. Caso a posição seja inválida, retorna null.
   public Object removeRetornaIndice(int posicao) {
      // Verifica se é uma posição válida e se a lista possui elementos
      if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
         int i = 0;
         CCelula aux = primeira;
         while (i < posicao - 1) {
            aux = aux.prox;
            i++;
         }
         CCelula aux2 = aux.prox;
         aux.prox = aux.prox.prox;
         if (aux.prox == null)
            ultima = aux;
         qtde--;
         return aux2.item;
      }
      return null;
   }

   // Método(getter) que retorna a quantidade de itens da lista.
   public int quantidade() {
      return qtde;
   }
   public void InsereAntesDe(Object ElementoAInserir, Object Elemento) {
      if (!contem(Elemento)) {
   System.out.println("O elemento [" +Elemento + "] nao consta na lista");
   } else {
      boolean achou = false;
      CCelula aux  = primeira; 
      CCelula aux2 = primeira.prox;
      achou = aux2.item.equals(Elemento); //confere se o primeiro elemento é o que procuramos, caso seja, não entra no while. 
      while (aux2 != null && !achou) {
         aux   = aux.prox;
         aux2  = aux2.prox;
         achou = aux2.item.equals(Elemento);
      }
      aux.prox = new CCelula(ElementoAInserir, aux2);
      qtde++;   
   }
   }
   
   public void InsereDepoisDe(Object ElementoAInserir, Object Elemento) {
   if (!contem(Elemento)) {
   System.out.println("O elemento [" +Elemento + "] nao consta na lista");
   } else {
      boolean achou = false;
      CCelula aux  = primeira; 
      CCelula aux2 = primeira.prox;
      achou = aux2.item.equals(Elemento); //confere se o primeiro elemento é o que procuramos, caso seja, não entra no while. 
      while (aux != null && !achou) {
         aux   = aux.prox;
         aux2  = aux2.prox;
         achou = aux2.item.equals(Elemento);
      }
      aux = aux2.prox;
      aux2.prox = new CCelula(ElementoAInserir, aux);
      qtde++;   
   }
   }

   public void InsereOrdenado(int ElementoAInserir) {
     if (vazia()) {  
       insereComeco(ElementoAInserir);
     }
     else  {  
         if (ElementoAInserir < (int)retornaPrimeiro()) {
         insereComeco(ElementoAInserir);
         } 
         else { 
            if (ElementoAInserir > (int) retornaUltimo()) {
               insereFim(ElementoAInserir);
            } 
            else { 
            CCelula aux = primeira.prox;
            CCelula aux2 = primeira.prox.prox;
                while (true) {
                  if ((int) aux.item <= ElementoAInserir && (int) aux2.item >= ElementoAInserir) {
                     aux.prox = new
                     CCelula(ElementoAInserir, aux2);
                     qtde++;
                     break;
                  }
                   aux = aux.prox;
                   aux2 = aux2.prox;
                } 
            } 
         }
     }
   }
     public void  RemovePos(int n){
     if ((n > 0) && (n <= qtde) && (primeira != ultima)) { // lista não vazia e posição maior que 0
        CCelula aux = primeira.prox; 
        if (n == 1) {//caso seja para remover o primeiro elemento, muda o elemento apontado pela célula cabeça
         primeira.prox = primeira.prox.prox;
         } else {         
           for (int i = 1; i < n - 1; i++, aux = aux.prox) ; //encontra a n-ésima posição. 
            aux.prox = aux.prox.prox; //faz o aux.prox apontar para o prox.prox.
      }
      qtde--;
     } 
   }

  public Object[] copiaParaVetor() {
      Object vetor[];
      vetor = new Object[qtde]; //o vetor é criado com o tamanho para a quantidade de itens da lista
      CCelula aux = primeira.prox;
      
      for(int i = 0; i < qtde; i++){
      vetor[i] = aux.item; 
      aux  = aux.prox;
      }
      for(int j = 0; j < qtde; j++){//apenas para mostrar como ficou o vetor
      System.out.print (vetor[j] + " - ");
      }    
         return null;
   }

 
 
 }//fecha tudo