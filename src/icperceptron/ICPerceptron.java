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
public class ICPerceptron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rede rede = new Rede();
        rede.iniciarRede();
        rede.treinarRede();
        rede.testarRede();
    }
    
}
