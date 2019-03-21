package projetoK;

public class carro {
    String modelo,cor,marca,chassi,;
    int nportas,nmarchas,marchaAtual;
    double velocidademax,velocidadeatual,vlcombustivel;
    boolean tetosolar,cambioautomatico;
    proprietario proprietario;

    void acelera (){
        velocidadeatual += 1;
    }
     void freia (){
        velocidadeatual = 0;
     }
     void trocamarcha (int marchaDesejada){
        marchaAtual = marchaDesejada;
    }
     void redMarcha(){
        marchaAtual = marchaAtual - 1;

    }
}



