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
        
        mcp = new Neuronio(qtdAtributos);
        
    }
    
    public void treinarRede(){
        
    }
}
