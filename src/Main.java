
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String [] args){
            int valor = 0,el;
            int elemento = 0;
            int valorlista=0;
            Scanner scc = new Scanner(System.in);
            Random sc = new Random(); 
            ArbolBinario arbol = new ArbolBinario();
            ListaEnlazada lista = new ListaEnlazada();
       
            
         
             System.out.println("Inserte ahora los valores de su arbol binario");
                for(int i = 0;i<10;i++){
                valor = sc.nextInt(100);
                System.out.println(valor + " ");
                arbol.agregarNodo(valor);
                    
            
                }
            
                System.out.println("Seleccione su elemento a buscar");
                elemento = scc.nextInt();
		
              if(arbol.buscarNodo(elemento)==null){
                    System.out.println("El nodo no fue encontrado");
                
                }else{
                
                    System.out.println("Nodo encontrado "+arbol.buscarNodo(elemento));
              }
                   
               
                System.out.println("Seleccione el nodo a borrar" );
                elemento=scc.nextInt();
               
                if(arbol.eliminarNodo(elemento)==false){
                    System.out.println("El nodo a eliminar no fue encontrado");
                
                }else{
                
                    System.out.println("Nodo Eliminado ");
                
                }
                
               System.out.println("\n\n Recorrido Inorden");
               arbol.recorridoInorden();
               
               System.out.println("");
                System.out.println("--------------------------------");
                
                
                System.out.println("Inserte los valores de su lista enlazada");
                for(int i = 0;i<10;i++){
                valorlista = scc.nextInt();
               // System.out.println(valorlista + " ");
                lista.agregarAlInicio(valorlista);
                    
            
                }
                lista.mostrarLista();
                
                System.out.println("\nAgregue un dato al final");
                valorlista = scc.nextInt();
                lista.agregarAlFinal(valorlista);
                lista.mostrarLista();
                
                System.out.println("\nBorrar un nodo del inicio");
                el=lista.borrarInicio();
                System.out.println("El elemento borrado es: "+el);
                lista.mostrarLista();
                
                System.out.println("\nBorrar un nodo al final");
                el=lista.borrarFinal();
                System.out.println("El elemento borrado es: "+el);
                lista.mostrarLista();
                
                System.out.println("\nBorrar un nodo en especifico");
                el=scc.nextInt();
                lista.eliminar(el);
                System.out.println("El elemento borrado es: "+el);
                lista.mostrarLista();
                
                
                
                System.out.println("");
    }
    
}
