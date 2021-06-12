/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroelectronico;

/**
 *
 * @author Mao-U
 */
public class ClaseDeposito extends ClaseMetodos {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto dinero desea depositar: ");
        Depositar();
        
        transacciones = getSaldo();
        setSaldo(transacciones + depositar);
        System.out.println("Se depositaron "+ depositar);
        System.out.println("Su saldo actual es de: "+ getSaldo());
    }
    
}
