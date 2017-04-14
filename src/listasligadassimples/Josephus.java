package listasligadassimples;

public class Josephus {
    
    static No inicio = null;

    public static void main(String[] args) {
        int N = 10000;
        int S = 10000;
        
        for(int i=1; i<=N; i++)
            inserir(i);
        
      //  josephusIterativo(S);
                
        josephusRecursivo(inicio,S,S);
        
        System.out.println("N: "+N+"\nS: "+S+"\nVENCEDOR: "+inicio.valor+"\n");
        

    }
    
    static void josephusIterativo(int s){
        No temp = inicio;
        while(temp != temp.prox){
             for(int i=1; i<(s-1); i++)
                 temp = temp.prox;
             //System.out.println("Matando: "+temp.prox.valor);
             temp.prox = temp.prox.prox;
             temp = temp.prox;
         }
        inicio = temp;
    }
    
    static void josephusRecursivo(No temp, int s, int k){
        if(temp.prox != temp){
            if(k!=2){
                josephusRecursivo(temp.prox, s, k-1);
            }else{
                //System.out.println("Matando: "+temp.prox.valor);
                temp.prox = temp.prox.prox;
                josephusRecursivo(temp.prox, s, s);
            }
        }else
            inicio = temp;
    }
    
    static void inserir(int v) {
        No novo = new No(v);
        
        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;
            
            while (temp.prox != inicio) {
                temp = temp.prox;
            }
            temp.prox = novo;
        }
        novo.prox = inicio;
    }

    static void exibir() {
        if (inicio == null) {
            System.out.println("Lista Vazia, impossível exibir");
        } else {
            No temp = inicio.prox;
            System.out.print(inicio.valor+ " ");
            while (temp != inicio) {
                System.out.print(temp.valor+" ");
                temp = temp.prox;
            }
        }
        System.out.println("\n");
    }    
    
    
}
