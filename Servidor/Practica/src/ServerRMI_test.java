
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfacesImp.SumaImplementacion;


public class ServerRMI_test {
    public static void main(String[]arg){
        try{
            SumaImplementacion sumaImplementacion= new SumaImplementacion();
            Registry registry = LocateRegistry.createRegistry(9090);
            registry.rebind("Suma", sumaImplementacion);
            System.out.println("Servidor corriendo");
        }catch(RemoteException e){
         System.out.println(e.getMessage());

        }


    }
    
}
