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
public class ClasePrincipal {
    public static void main(String[] args) {
    
        ClaseMetodos mensajero = new ClaseConsulta();
        mensajero.setSaldo(1000);
        mensajero.Operaciones();
        
    }
}
