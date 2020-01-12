
package prueba.pkg2;

public class Bulto {
 private int peso;

    public Bulto() {
    }

    public Bulto(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int valorBulto(){
        int valorBulto=0;
        if(this.peso<=25){
            valorBulto=this.peso*600;
        }else{
            if(this.peso<=100){
                valorBulto=this.peso*1500;
            }else{
                if(this.peso<=300){
                    valorBulto=this.peso*2600;
                }else{
                    valorBulto=this.peso*3500;
                }
            }
        }
        
        return valorBulto;
    }

    @Override
    public String toString() {
        return "Bulto{" + "peso=" + peso +" la ganancia en pesos: "+this.valorBulto()+"la ganancia en dolares:"+(this.valorBulto()/3000) +'}';
    }
 
}
