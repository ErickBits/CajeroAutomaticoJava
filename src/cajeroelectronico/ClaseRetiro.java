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
public class ClaseRetiro extends ClaseMetodos {
 
    @Override
    public void Transacciones() {
        int saldo = getSaldo();
        /*int billetes50 = 0, billetes20 = 0, billetes10 = 0, total50 = 0, total20 = 0,
        total10 = 0, restante, restante20; */
        
        System.out.println("Ingrese la cantidad que desea retirar: ");
        Retirar();
        
        
        
        while (retirar > saldo | retirar > 1200000 | retirar % 10000 != 0){    
            setSaldo(saldo - retirar);

            if(retirar > 1200000 ) {
                
                System.out.println("No se puede sacar más de 1.200.000 por cada retiro :");
                Retirar();

            }else if (retirar % 10000 != 0) {
    
                System.out.println("Recuerde que solo puede retirar en multiplos de 10.000:");
                Retirar();

            }else if (retirar > saldo) {
                System.out.println("No tienes saldo suficiente, intente con otra cantidad:");
                Retirar();

            }
        
        }
        
        System.out.println("usted retiro : "+ retirar);
        System.out.println("su saldo actual es de: "+ getSaldo());
                   
    }
    
}
    
    

