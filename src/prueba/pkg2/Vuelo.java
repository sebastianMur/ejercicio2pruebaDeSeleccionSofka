
package prueba.pkg2;

import java.util.LinkedList;

public class Vuelo {
    private String codigo;
    private LinkedList Bultos;
   private int cargaActual;
    public Vuelo(String codigo, LinkedList Bultos) {
        this.codigo = codigo;
        this.Bultos = Bultos;
    }

    public Vuelo() {
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LinkedList getBultos() {
        return Bultos;
    }

    public void setBultos(LinkedList Bultos) {
        this.Bultos = Bultos;
    }
    
    public int cantidadBultos(){
   return  this.Bultos.size();
    }
    
    public void agregarBulto(Bulto bulto,int capacidad){
       boolean permitido=false;
        
       if(bulto.getPeso()<500 && this.cargaActual<capacidad){
           this.cargaActual=bulto.getPeso();
         this.Bultos.add(bulto);
        }else{
           System.out.println("bulto no cumple las condiciones");
       }
           
        
        
    }
    
    
    public int bultoMasPesado(){
        int bulto=0;
        Object lista=this.Bultos.clone();
        LinkedList list=(LinkedList)lista;
        Bulto aux=(Bulto)list.peek();
    int longi=list.size();
        for(int i=0;i<longi;i++){
            if(aux.getPeso()<= ((Bulto)list.peek()).getPeso()){
               aux=(Bulto)list.peek();
                bulto=aux.getPeso();
                  }
               list.pop(); 
            
            
        }
        
        return bulto;
    }
    
    public int bultoMasLiviano(){
        int bulto=0;
        Object lista=this.Bultos.clone();
        LinkedList list=(LinkedList)lista;
       
      Bulto aux=(Bulto)list.peek();
      aux.setPeso(bultoMasPesado());
       int longi=list.size();
         for(int i=0;i<longi;i++){  
            
    
            if(aux.getPeso()>=((Bulto)list.peek()).getPeso()){
               aux=(Bulto)list.peek();
                bulto=aux.getPeso();
            }
                list.pop(); 
            
           
        }
        
        return bulto;
        
    }
    
    public double promedioPeso(){
        double promedio=0;
       Object lista=this.Bultos.clone();
       LinkedList list=(LinkedList)lista;
        int longi=list.size();
        for(int i=0;i<longi;i++){
            promedio+=((Bulto)list.pop()).getPeso();        
        }
        return promedio/longi;
    }
    
    
        public void mostrarTablas(){
       int acu=0;
       Object lista=this.Bultos.clone();
       LinkedList list=(LinkedList)lista;
        int longi=list.size();
        for(int i=0;i<longi;i++){
            System.out.println((i+1)+". "+((Bulto)list.peek()).toString());   
         acu+=((Bulto)list.pop()).valorBulto();
        }
            System.out.println("valor total de la carga en pesos: "+acu+
                               "\nvalor total de la carga en dolares: "+(acu/3000));
       
    }
}
