public class Main {

  public static void main(String[] args) {
    try {
 // Cria um vetor para armazenar até 10 jogadores
  Vetor listaJogadores = new Vetor(10);

  // Insere scores de 5 jogadores
  listaJogadores.add(0, new Gamer("Ronaldo", 901).toString());
  listaJogadores.add(1, new Gamer("Aizen", 846).toString());
  listaJogadores.add(2, new Gamer("Osnair", 604).toString());
  listaJogadores.add(3, new Gamer("Ramud Ramid", 345).toString());
  listaJogadores.add(4, new Gamer("Indiana Jones", 190).toString());

  // Exibe a lista de scores
  System.out.println("Lista de Scores:");
  for (int i = 0; i < listaJogadores.size(); i++) {
      System.out.println(listaJogadores.get(i));
  }

  // Exibe quem está na primeira posição
  System.out.println("\nPrimeira posição:");
  System.out.println(listaJogadores.get(0));

  // Remove o jogador da terceira posição
  listaJogadores.remove(2);

  // Exibe a lista de scores novamente após remoção
  System.out.println("\nLista de Scores após remoção da terceira posição:");
  for (int i = 0; i < listaJogadores.size(); i++) {
      System.out.println(listaJogadores.get(i));
  }
   } catch (Exception e) {
  System.err.println(e.getMessage());
   }
    }

    public static class Vetor {
   private String[] elementos;
   private int tamanho;

   public Vetor(int capacidade) {
  this.elementos = new String[capacidade];
  this.tamanho = 0;
   }

   public boolean add(int posicao, String elemento) {
  if (posicao >= 0 && posicao < elementos.length) {
      elementos[posicao] = elemento;
      tamanho++;
      return true;
  }
  return false;
   }

   public String get(int posicao) {
  if (posicao >= 0 && posicao < tamanho) {
      return elementos[posicao];
  }
  throw new IndexOutOfBoundsException("Posição inválida");
   }

   public boolean remove(int posicao) {
  if (posicao >= 0 && posicao < tamanho) {
      for (int i = posicao; i < tamanho - 1; i++) {
     elementos[i] = elementos[i + 1];
      }
      elementos[tamanho - 1] = null;
      tamanho--;
      return true;
  }
  return false;
   }

   public int size() {
  return tamanho;
   }
    }
}