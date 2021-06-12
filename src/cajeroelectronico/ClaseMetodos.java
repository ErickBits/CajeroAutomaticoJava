
package cajeroelectronico;
import java.util.Scanner;

public abstract class ClaseMetodos {
    
    protected int retirar,depositar,transacciones;
    private static int saldo;
    
    Scanner introducir = new Scanner(System.in);
    
    public void Operaciones() {
    
        int bandera = 0;
        int seleccion = 0;
        
        do{
        
            do{

                System.out.println("Seleccione una opcion:");
                System.out.println(" (1) consultar saldo.");
                System.out.println(" (2) retirar efectivo.");
                System.out.println(" (3) depositar efectivo.");
                System.out.println(" (4) salir.");
                seleccion = introducir.nextInt();

                if(seleccion >=1 && seleccion <= 4) {
                    bandera = 1;
                }else{
                    System.out.println("elija una de las opciones mostradas anteriormente"); 
                }

            }while(bandera == 0);
            
            if(seleccion == 1) {
                ClaseMetodos mensajero = new ClaseConsulta();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClaseMetodos mensajero = new ClaseRetiro();
                mensajero.Transacciones();
            }else if(seleccion == 3) {
            ClaseMetodos mensajero = new ClaseDeposito();
                mensajero.Transacciones();
            }else if(seleccion == 4) {
                System.out.println("okey, que tenga un feliz dia");
                bandera = 2;
            }
            
        }while (bandera != 2);
        
        
    }
    
    public void Retirar() {
        retirar = introducir.nextInt();
    }
    
    public void Depositar() {
        depositar = introducir.nextInt();
    }
    
    public abstract void Transacciones();
        
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
