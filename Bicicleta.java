
package UNINOVE.meiostransporte;


public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;
        
    @Override
    public void imprimirInformações (){
        System.out.println ("A bicicleta "+getMarca()+" modelo "+getModelo()+" possui "+getnumMarchas()+" numeros de marchas, vem com "+getQtdRodas()+" rodas,"
                + " contém bagageiro? ("+getBagageiro()+"). E está a velocidade de "+getVelocidadeAtual()+" Km/h.");
}
    
    
    public void setBagageiro(boolean val){
        bagageiro = val;
    }    
    
    public boolean getBagageiro(){
        return bagageiro ;
    }    
    
    public void setnumMarchas(int val){
        numMarchas = val;
    }    
    
    public int getnumMarchas(){
        return numMarchas;
    }    
    
    
    
}