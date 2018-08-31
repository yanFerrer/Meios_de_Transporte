
package UNINOVE.meiostransporte;


public class Principal {

   
    public static void main(String[] args) {
        //Carro
       Carro c1 = new Carro();
       c1.setPotenciaDoMotor(2);
       c1.setQtdPortas(4);
       c1.setMarca("Fiat");
       c1.setQtdRodas(4);
       c1.setModelo("Uno");
       c1.setVelocidadeAtual(0);
       //c1. = 0;
       
       //Moto
       Moto m1 = new Moto();
       m1.setPotenciaDoMotor(2);
       m1.setMarca("Kawasaki");
       m1.setQtdRodas(2);
       m1.setModelo("Ninja 300");
       m1.setVelocidadeAtual(0);
       
       
       //Bicileta
       Bicicleta b1 = new Bicicleta();
       b1.setnumMarchas(12);
       b1.setBagageiro(true);       
       b1.setMarca("Caloi");
       b1.setQtdRodas(2);
       b1.setModelo("Speed Bike");
       b1.setVelocidadeAtual(0);
       
       //Carro Acelerar - Frear
       c1.acelerar(0);
       c1.frear(1);
       
       //Moto Acelerar - Frear
       m1.acelerar(0);
       m1.frear(1);
       
       //Bicicleta Acelerar - Frear
       b1.acelerar(0);
       b1.frear(1);
       
           
       //Imprimir
       c1.imprimirInformações();
       m1.imprimirInformações();
       b1.imprimirInformações();
       
    }
    
}
