
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario(){
        raiz = null;
    
    }
    // metodo para inicializar un Nodo en el arbol
    public void agregarNodo(int d){
        NodoArbol nuevo = new NodoArbol(d);
        if(raiz==null){
            raiz =nuevo;
        
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
            
                padre = aux;
                if(d< aux.dato){
                    aux = aux.hijoIzquierdo;
                    if(aux==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                    
                }else{
                
                    aux = aux.hijoDerecho;
                    if(aux==null){
                    padre.hijoDerecho=nuevo;
                    return;
                        
                    }
                
                }
            }
        
        }
    
    }
      public void recorridoInorden(){
    
        ayudaInorden(raiz);
    }
      
      private void ayudaInorden(NodoArbol nodo){
         if(nodo==null)
            return;
         ayudaInorden(nodo.hijoIzquierdo);
         System.out.printf(" %d" , nodo.dato);
         ayudaInorden(nodo.hijoDerecho);
            
    }
    
    public NodoArbol buscarNodo(int d){
        NodoArbol aux= raiz;
        while(aux.dato!=d){
        if(d<aux.dato){
            aux= aux.hijoIzquierdo;
        
        }else{
            aux=aux.hijoDerecho;
        
        }
        if(aux==null){
        
            return null;
        }
        }
        
        return aux;
    }
    
    public boolean eliminarNodo(int d){
            NodoArbol aux=raiz;
            NodoArbol padre = raiz;
            boolean esHijoIz=true;
           while(aux.dato!=d){
               padre=aux;
               if(d<aux.dato){
                   esHijoIz =true;
                   aux = aux.hijoIzquierdo;
               }else{
               
                   esHijoIz=false;
                   aux=aux.hijoDerecho;
               }
               if(aux==null){
                   return false;
               }
           }//fin del while
           if(aux.hijoIzquierdo==null && aux.hijoDerecho==null){
               if(aux==raiz){
                   raiz=null;
               
               }else if(esHijoIz){
                   padre.hijoIzquierdo=null;
               
               }else{
                   padre.hijoDerecho=null;
               
               }
           
           } else if(aux.hijoDerecho==null){
                if(aux==raiz){
                   raiz=aux.hijoIzquierdo;
               
               }else if(esHijoIz){
                   padre.hijoIzquierdo=aux.hijoIzquierdo;
               
               }else{
                   padre.hijoDerecho=aux.hijoIzquierdo;
               
               }
           
           }else if (aux.hijoIzquierdo==null){
               if(aux==raiz){
                   raiz=aux.hijoDerecho;
               
               }else if(esHijoIz){
                   padre.hijoIzquierdo=aux.hijoDerecho;
               
               }else{
                   padre.hijoDerecho=aux.hijoDerecho;
               
               }
           
           
           }else{
               NodoArbol reemplazo=obtenerNodoReemplazo(aux);
               if(aux==raiz){
                   raiz=reemplazo;
                   
               }else if(esHijoIz){
                   padre.hijoIzquierdo=reemplazo;
                   
               }else{
                   padre.hijoDerecho=reemplazo;
                 
               }
               reemplazo.hijoIzquierdo=aux.hijoIzquierdo;
           }    
            return true;
    }
    
    //metodo encargado de delver el nodo reemplazdo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReem){
            NodoArbol reemPadre=nodoReem;
            NodoArbol reem= nodoReem;
            NodoArbol aux = nodoReem.hijoDerecho;
            while(aux!=null){
                reemPadre=reem;
                reem = aux;
                aux = aux.hijoIzquierdo;
            
            }
            if(reem!=nodoReem.hijoDerecho){
                reemPadre.hijoIzquierdo=reem.hijoDerecho;
                reem.hijoDerecho=nodoReem.hijoDerecho;
            
            }
            System.out.println("El nodo reemplazo es: " +reem);
            return reem;
    }
    
    
}
