package listasligadassimples;

public class ListasLigadasSimples {

    static No inicio = null;

    public static void main(String[] args) {
        inserir(10);
        inserir(20);
        inserir(30);
        inserir(40);
        inserir(50);

        exibir(); System.out.println("---");
        removeInicio();
        exibir(); System.out.println("---");
        removeFim();
        exibir(); System.out.println("---");
        removeValor(30);
        exibirInverso(inicio); System.out.println("---");

    }

    static void inserir(int v) {
        No novo = new No(v);

        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;

            while (temp.prox != null) {
                temp = temp.prox;
            }

            temp.prox = novo;
        }
    }

    static void exibir() {
        if (inicio == null) {
            System.out.println("Lista Vazia, impossível exibir");
        } else {
            No temp = inicio;
            while (temp != null) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    }

    static void removeInicio() {
        if (inicio == null) 
            System.out.println("Lista Vazia, impossível remover o início");
        else 
            inicio = inicio.prox;
    }

    static void removeFim() {
        if (inicio == null) 
            System.out.println("Lista Vazia, impossível remover o início");
        else 
            if (inicio.prox == null) //se houver somente um elemento na lista
                inicio = null;
            else{
                No temp = inicio;
                while (temp.prox.prox != null) 
                    temp = temp.prox;
            temp.prox = null;
        }
    }

    static void removeValor(int x) {
        if(inicio.valor == x)
            inicio = inicio.prox;
        else{
            No temp = inicio;
            while((temp.prox!=null) && (temp.prox.valor != x)){
                temp = temp.prox;
            }
            if(temp.prox == null)
                System.out.println("Valor "+x+" não encontrado para remoção !");
            else
                temp.prox = temp.prox.prox;
        }
    }
    
      static void exibirInverso(No temp){
          if(temp!=null){
              exibirInverso(temp.prox);
              System.out.println(temp.valor);
          }
      }

}
