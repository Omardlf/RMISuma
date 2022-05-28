/*
 * Esta sera la clase que se correra por parte del cliente
 * Esta clase unicamente se comunica con la interfaz del sirvidor
 * */

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interfaces.Suma;

public class ClienteMain {
    public static void main(String[] args) {
    	
    	String IPAdd = "localhost";
    	int SrvPort = 9090;
        int resultado;
        
        try{
            Registry registry = LocateRegistry.getRegistry(IPAdd,SrvPort);
            Suma servidorObj = (Suma) registry.lookup("OperacionSuma");
            resultado = servidorObj.OperacionSuma(2,2);
            System.out.println("El resultado de la suma 2+2 es igual a "+resultado);

        }catch (RemoteException | NotBoundException e){
            e.printStackTrace();

        }
    }
}
