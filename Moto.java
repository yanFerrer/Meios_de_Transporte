
package UNINOVE.meiostransporte;

public class Moto extends Automovel {
    private boolean partidaEletrica;
    
    
    @Override
    public void imprimirInformações (){
        System.out.println ("A moto "+getModelo()+" da marca "+getMarca()+" possui "+getQtdRodas()+" rodas, e está a "+getVelocidadeAtual()+" Km/h.");
    }    
    
    
     
    public static void  a (){
        System.out.println ("AAAA");
    }    

    public void setPartidaEletrica(boolean val){
        partidaEletrica = val;
    }  
    
    public boolean getPartidaEletrica(){
        return partidaEletrica;
    }    

  
}
