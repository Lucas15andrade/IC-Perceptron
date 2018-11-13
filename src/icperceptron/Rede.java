/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icperceptron;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Rede {
    int qtdAtributos;
    int qtdPadroes;
    Neuronio mcp;
    int padroes[][] = { {0,0}, {0,1}, {1,0}, {1,1} };
    int saidaDesejada[];
    Scanner scan = new Scanner(System.in);

    public Rede() {
    }
    
    public void iniciarRede(){
        this.qtdAtributos = this.padroes[0].length;
        this.qtdPadroes = this.padroes[0].length;
        System.out.println("Quantidade de atributos: "+qtdAtributos);
        mcp = new Neuronio(qtdAtributos);
        
        this.saidaDesejada = new int[qtdAtributos];
        
        for (int i = 0; i < qtdAtributos; i++) {
            saidaDesejada[i] = scan.nextInt();
        }
        
    }
    
    public void treinarRede(){
        
        int erroTotal = 0;
        int cont = 0;
        do{
            cont++;
            for(int x = 0; x < this.qtdAtributos; x++){
                //for(int y = 0; y < this.qtdPadroes; y++){
                    System.out.println("Digite uma entrada para a posicão: "+ x);
                    mcp.setEntradas(padroes[cont][x],scan.nextInt());
                    mcp.calculaSaida();
                    System.out.println("Saída desejada");
                    mcp.setErro(scan.nextInt());
                    
                    if(mcp.getE() > 0){
                        mcp.atualizaPeso();
                        erroTotal += mcp.getE();
                    }
                //}
            }
            
        }while(erroTotal == 0);
    }
    
    public void testarRede(){
        
    }
}
