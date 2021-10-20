
package testcomercial;


public class Principal {

    
    public static void main(String[] args) {
        
        System.out.println("probando SINGLETON ");
        
        Adhesiones adhesion= Adhesiones.Instancia();
        
        adhesion.setCliente(new Cliente("andres",25550,"arrobaGMAIL"));
        adhesion.setServicio(new Servicio("5 MBps","uno","familiar","unoDOS","basico"));
        adhesion.visualiza(); 
        
       /* System.out.println("------------");
        
        adhesion.setCliente(new Cliente("gustavo",1500,"gustavo@Gmail.com"));
        adhesion.setServicio(new Servicio("5 MBps","uno","industrial","unoDOS","premium"));
        adhesion.visualiza();*/
             
    }
    public static void visualiza(){
        Adhesiones adhesion = Adhesiones.Instancia();
        adhesion.visualiza();    
    }   
}
