
package UNINOVE.meiostransporte;


public class Carro extends Automovel{
    private int qtdPortas;
    
    @Override
    public void imprimirInformações (){
        System.out.println ("O Carro "+getModelo()+" da marca "+getMarca()+" possui "+getQtdRodas()+" rodas,"+getQtdPortas()+" portas e está a "+getVelocidadeAtual()+" Km/h.");
    }
    
    public int  getQtdPortas(){
        return qtdPortas;
    }    
    
    public void  setQtdPortas(int val){
         qtdPortas = val ;
    }    

    void setPotenciaDoMotor(int i) {
        super.setPotenciaDoMotor(i);
    }
    
     public void setModelo(String valor){
        super.setModelo(valor);      
    }    
    
     public String getModelo(){
        return super.getModelo();      
    }    
     
    
     public void setQtdRodas(int valor){
        super.setQtdRodas(valor);      
    }    
    
     public int getQtdRodas(){
        return super.getQtdRodas();      
    }    
     
     public void setMarca(String valor){
        super.setMarca(valor);      
    }    
    
     public String getMarca(){
        return super.getMarca();      
    }    
    
}
