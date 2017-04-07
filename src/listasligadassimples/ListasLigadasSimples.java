package listasligadassimples;

public class ListasLigadasSimples {
    
    static No inicio = null;
    
    public static void main(String[] args) {
        inserir(10);
        inserir(20);
        inserir(30);
        inserir(40);
        inserir(50);
        
        exibir();
    }
    
    static void inserir(int v){
        No novo = new No(v);
        
        if(inicio == null)
            inicio = novo;
        else{
            No temp = inicio;
            
            while(temp.prox != null)
                temp = temp.prox;
            
            temp.prox = novo;
        }
    }
    
    static void exibir(){
        if(inicio == null)
            System.out.println("Lista Vazia, impossível exibir");
        else{
            No temp = inicio;
            while(temp != null){
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    }
    
}
