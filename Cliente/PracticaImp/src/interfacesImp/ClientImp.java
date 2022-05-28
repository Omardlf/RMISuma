package interfacesImp;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interfaces.Suma;


public class ClientImp {
    public void ConnectorServer(){
        try{
            int resultado;
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",9090);
            Suma suma = (Suma) registry.lookup("Suma");
            resultado = suma.OperacionSuma(2,2);
            System.out.println(resultado);

        }catch (RemoteException | NotBoundException e){
            e.printStackTrace();

        }

    }
}
