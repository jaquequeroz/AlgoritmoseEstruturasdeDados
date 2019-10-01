class CDicionario
   {
      private CCelulaDicionario primeira, ultima;
      public CDicionario()
   {
      primeira = new CCelulaDicionario();
      ultima = primeira;
   }
      public boolean vazio()
   {
      return primeira == ultima;
   }
      public void adiciona(Object chave, Object valor)
   {
      ultima.prox = new CCelulaDicionario(chave, valor, null);
      ultima = ultima.prox;
   }
      public Object recebeValor(Object chave)
   { 
      boolean achou = false;
      CCelulaDicionario aux1 = primeira.prox;
      Object aux2 =null;
      while (aux1 != null && !achou) {
         achou = aux1.key.equals(chave);
         aux2 = aux1.value;
         aux1 = aux1.prox;
      }
      if (achou) {
      return aux2;
      } else {
      return null;
      }
      }
   }
