
public class ListaEnlazada {
    protected Nodo inicio, fin; //punteros
    
    public ListaEnlazada(){
        inicio=null;
        fin=null;
    
    }
    
    //metodo para agregar al inicio
    public void agregarAlInicio(int elemen){
        //Crear un nodo
        inicio=new Nodo(elemen, inicio);
        if(fin==null){
            fin=inicio;
        
        }
    }
    //metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
        
    }
    
    //metodo para insertar al final de la lista
    public void agregarAlFinal(int elemen){
        if(!estaVacia()){
            fin.siguiente=new Nodo(elemen);
            fin=fin.siguiente;
            
        }else{
            inicio =fin=new Nodo(elemen);
        
        }
    
    }
    
    //metodo para mostrar datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer != null){
            System.out.print("[" + recorrer.dato  + "]----->");
            recorrer = recorrer.siguiente;
            
        }
    
    }
    
    public int borrarInicio(){
        int elemen = inicio.dato;
        if(inicio==fin){
            inicio = null; 
            fin = null;
        
        }else{
            inicio=inicio.siguiente;
        
        }
            return elemen;
    }   
    
    //borrar un nodo del final
    public int borrarFinal(){
        int elemen = fin.dato;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            Nodo temp = inicio;
            while(temp.siguiente!=fin){
                temp=temp.siguiente;
            
            }
            fin=temp;
            fin.siguiente=null;
        }
        return elemen;
    }
    
    //eliminar cualquier elemento
    public void eliminar(int elemen){
        if(!estaVacia()){
            if(inicio==fin && elemen ==inicio.dato){
                inicio = null;
                fin=null;
            
            }else if(elemen ==inicio.dato){
                inicio=inicio.siguiente;
            
            }else{
                Nodo anterior;
                Nodo temp;
                anterior=inicio;
                temp=inicio.siguiente;
                while(temp!=null && temp.dato!=elemen){
                    anterior=anterior.siguiente;
                    temp=temp.siguiente;
                
                }
                if(temp!=null){
                    anterior.siguiente=temp.siguiente;
                    if(temp==fin){
                        fin=anterior;
                    }
                }
            }
        
        }
    
    }
}
