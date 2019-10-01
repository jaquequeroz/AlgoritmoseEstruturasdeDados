import java.util.Scanner;
public class Hashtable {
   public static void main(String[] args) {
   CDicionario dicionario = new CDicionario();
   dicionario.adiciona("www.google.com", "172.217.5.100");
   dicionario.adiciona("www.yahoo.com", "98.138.219.231");
   dicionario.adiciona("www.amazon.com", "172.231.14.116");
   dicionario.adiciona("www.uol.com.br", "54.239.132.82");
   dicionario.adiciona("www.pucminas.br", "200.229.32.27");
   dicionario.adiciona("www.microsoft.com", "184.27.30.29");
   dicionario.adiciona("research.microsoft.com", "13.67.218.189");
   dicionario.adiciona("www.uol.com.br", "54.239.132.82");  
   dicionario.adiciona("www.gmail.com", "172.217.0.37");
   dicionario.adiciona("www.twitter.com", "104.244.42.129");
   dicionario.adiciona("www.facebook.com", "157.240.22.35");
   dicionario.adiciona("www.cplusplus.com", "167.114.170.15");  
   dicionario.adiciona("www.youtube.com", "172.217.164.110");
   dicionario.adiciona("www.brasil.gov.br",  "170.246.252.243");
   dicionario.adiciona("www.whitehouse.gov", "23.9.33.34");  
   dicionario.adiciona("www.capes.gov.br", "200.130.18.222"); 
   dicionario.adiciona("www.whitehouse.gov", "23.9.33.34");
   dicionario.adiciona("www.nyt.com", "151.101.189.164");
   dicionario.adiciona("www.capes.gov.br", "200.130.18.222"); 
   dicionario.adiciona("www.wikipedia.com", "198.35.26.96");
   dicionario.adiciona("www.answers.com", "151.101.188.203");
   dicionario.adiciona("www.apple.com", "172.230.107.90");

   Scanner entrada = new Scanner (System.in);
   
   System.out.println ("Digite o site desejado: ");
   String site = entrada.next();
   System.out.println(dicionario.recebeValor(site));
   }
}