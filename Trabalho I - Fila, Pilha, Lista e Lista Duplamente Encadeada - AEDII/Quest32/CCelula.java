class CCelula
{
   public Object item;
   public CCelula prox;

   public CCelula(Object valorItem, CCelula proxCelula)
    {
        item = valorItem;
        prox = proxCelula;
    }    
}