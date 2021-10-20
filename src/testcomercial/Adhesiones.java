
package testcomercial;

import java.util.ArrayList;


public class Adhesiones  {
    
    protected  Servicio servicio;
    protected Cliente cliente;
    private static Adhesiones instancia =null;
    
    private Adhesiones(){}
    
     public static Adhesiones Instancia(){
         if(instancia == null) instancia =new Adhesiones();
             return instancia;   
     }
     
     public void visualiza(){
         System.out.println( cliente.toString() );
         System.out.println(servicio.toString());
     
     }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
}