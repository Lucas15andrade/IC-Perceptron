/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icperceptron;

/**
 *
 * @author lucas
 */
public class Neuronio {
    
    int[] x;
    double[] w;
    int y;
    double e;
    double n;

    public Neuronio(int entradas) {
        this.x = new int[entradas];
        this.w = new double[entradas];
        this.n = 0.3;
        inicializaPesos();
    }
    
    private void inicializaPesos(){
        for (int i = 0; i < this.w.length; i++) {
            this.w[i] = 1;
        }
    }
    
    public void setEntradas(int indice, int valor){
        this.x[indice] = valor;
    }
    
    public void calculaSaida(){
        double soma = 0;
        for (int i = 0; i < this.x.length; i++) {
            soma = this.x[i] * this.w[i];
        }
        if(soma > 0)
            y = 1;
        else
            y = 0;
    }
    
    public void setErro(int yd){
        e = yd - y;
    }
    
    public void atualizaPeso(){
        for (int i = 0; i < this.w.length; i++) {
            this.w[i] = this.w[i] + n * e * this.x[i];
        }
    }

    public double getE() {
        return e;
    }

    public double getN() {
        return n;
    }

    
}
