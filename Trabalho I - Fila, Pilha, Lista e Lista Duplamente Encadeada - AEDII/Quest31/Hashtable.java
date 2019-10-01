import java.util.Scanner;
public class Hashtable {
   public static void main(String[] args) {
   CDicionario dicionario = new CDicionario();

      dicionario.adiciona("UUU", "Fenilalanina");
      dicionario.adiciona("UUC", "Fenilalanina");
      
      dicionario.adiciona("UUA", "Leucina");
      dicionario.adiciona("UUG", "Leucina");
      dicionario.adiciona("CUU", "Leucina");
      dicionario.adiciona("CUC", "Leucina");
      dicionario.adiciona("CUA", "Leucina");
      dicionario.adiciona("CUG", "Leucina");
      
      dicionario.adiciona("AUU", "Isoleucina");
      dicionario.adiciona("AUC", "Isoleucina");
      dicionario.adiciona("AUA", "Isoleucina");
      
      dicionario.adiciona("AUG", "Metionina");
      
      dicionario.adiciona("GUU", "Valina");
      dicionario.adiciona("GUC", "Valina");
      dicionario.adiciona("GUA", "Valina");
      dicionario.adiciona("GUG", "Valina");
      
      dicionario.adiciona("UCU", "Serina");
      dicionario.adiciona("UCC", "Serina");
      dicionario.adiciona("UCA", "Serina");
      dicionario.adiciona("UCG", "Serina");
      
      dicionario.adiciona("CCU", "Prolina");
      dicionario.adiciona("CCC", "Prolina");
      dicionario.adiciona("CCA", "Prolina");
      dicionario.adiciona("CCG", "Prolina");
      
      dicionario.adiciona("ACU", "Treonina");
      dicionario.adiciona("ACC", "Treonina");
      dicionario.adiciona("ACA", "Treonina");
      dicionario.adiciona("ACG", "Treonina");
         
   Scanner entrada = new Scanner (System.in);
   
   System.out.println ("Digite a trinca correspondente: ");
   String trinca = entrada.next();
   System.out.println(dicionario.recebeValor(trinca));
   }
}
//INSERIR O RESTANTE