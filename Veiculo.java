
package UNINOVE.meiostransporte;


public class Veiculo {
    
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;
    
    public void acelerar(int valor){
        velocidade = valor + velocidade;      
    }    
    public void frear (int valor){
        velocidade = velocidade - valor;                
    }
    
    public void setVelocidadeAtual(int val){
        velocidade = val;
    }
    public int getVelocidadeAtual(){
        return velocidade;
    }
    public void imprimirInformações(){
        System.out.println ("O veículo "+modelo+" da marca "+marca+" possui "+qtdRodas+" e está a "+getVelocidadeAtual()+" Km/h.");
        
    }
    
    
    public void setMarca(String valor){
        marca = valor;      
    }    
    
     public String getMarca(){
        return marca;      
    }    
    
     public void setModelo(String valor){
        modelo = valor;      
    }    
    
     public String getModelo(){
        return modelo;      
    }    
     
     public void setQtdRodas(int valor){
        qtdRodas = valor;      
    }    
    
     public int getQtdRodas(){
        return qtdRodas;      
    }    
    
}
