public class CPessoa {
  private String nome;
  private String CPF;
  private byte idade;

  // Método construtor
  public CPessoa(){

  }

  public CPessoa(String nome, String CPF, byte idade) {
    this.nome = nome;
    this.CPF = CPF;
    setIdade(idade);
  }

  // Setters
  public void setNome(String nome) {
    // Nesse contexto, o this diferencia o atributo da classe (this.nome) do parâmetro formal (nome)
    this.nome = nome;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public void setIdade(byte idade) {
    this.idade = (idade >=0 && idade <= 120)? idade : -1;
  }

  // Getters
  public String getNome() {
    return nome;
  }

  public String getCPF() {
    return CPF;
  }

  public byte getIdade() {
    return idade;
  } 

  // Você pode ver como sobrecarregar o método toString() em
  // https://www.devmedia.com.br/como-criar-sobreposicoes-usando-o-metodo-tostring-em-java/29042 
  /*
  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("Nome: ");
    stringBuffer.append(nome);
    stringBuffer.append("\nCPF: ");
    stringBuffer.append(CPF);
    stringBuffer.append("\nIdade: ");
    stringBuffer.append(idade);
         
    return stringBuffer.toString();
  }
  */

  // Alternativa 2
  /*
  @Override
  public String toString() {
    return getClass().getName()+"@"+Integer.toHexString(hashCode())+"\n\nNome: "+nome+"\nCPF: "+CPF+"\nIdade: "+idade;
  }    
  */
}


