
package examen.pkgfinal;


public class NodoCircular {
   int id;
   String nombre;
   NodoCircular siguiente;
   public NodoCircular(int d,String n){
       this.id=d;
       this.nombre=n;
       siguiente=this;
   }
    public void setId(int d){
        id=d;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    
    public String getNombre(){
        return nombre;
    } 
    
    
}
