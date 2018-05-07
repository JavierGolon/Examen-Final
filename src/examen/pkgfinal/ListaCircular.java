
package examen.pkgfinal;

import javax.swing.JOptionPane;


public class ListaCircular {
 NodoCircular ultimo;
 int tamaño=0;
 NodoCircular busca;
 private JOptionPane mensaje = new JOptionPane();
  public ListaCircular(){
     ultimo=null;
  }
 // metodo lista vacia
 
  public boolean vacia(){
      return ultimo==null;
  }
 // metodo para insertar
  public ListaCircular insertar(int id,String nombre){
      NodoCircular nuevo=new NodoCircular(id,nombre);
      if(ultimo!=null){
          nuevo.siguiente=ultimo.siguiente;
          ultimo.siguiente=nuevo;
      }
      
      ultimo=nuevo;
      tamaño++;
      return this;
  }
  
  
  // metodo recorrer lista
   public void mostrar(){
       NodoCircular aux=ultimo.siguiente;
       do{
          
            mensaje.showMessageDialog(null,"ID:  "+aux.getId()+"\n"
                    + "Nombre:   "+aux.getNombre());
             aux=aux.siguiente;
       }while(aux!=ultimo.siguiente);
   }
   
   // metodo par buscar dato
  public boolean busca(int id){
       
   busca=ultimo.siguiente;
   
       do{
          
             busca=busca.siguiente;
       }while(busca!=ultimo.siguiente&&busca.getId()!=id);
       return busca.getId()!=id;
   
      
   
  }
   
   // metodo para eliminar un dato
   public boolean eliminar(int i){
       NodoCircular actual;
       boolean encontrado=false;
       actual=ultimo;
       
       while(actual.siguiente!=ultimo&&!encontrado){
            encontrado=(actual.siguiente.id==i);
           if(!encontrado){
               actual=actual.siguiente;
           }
       }
       encontrado=actual.siguiente.getId()==i;
       if(encontrado){
           NodoCircular auxi=actual.siguiente;
            if(ultimo==ultimo.siguiente){
                ultimo=null;
                
            }else{
                if(auxi==ultimo){
                ultimo=actual;
                
                }
              actual.siguiente=auxi.siguiente;  
            }
            auxi=null;
           tamaño--; 
       }
       return encontrado==true;
   }
   
   
}
