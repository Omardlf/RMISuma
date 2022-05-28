// Paso 2: Definir la implementación de la clase

package interfacesImp; //Agregar el paquete donde este la interfaz remota 

import Interfaces.Suma;// Importar la clase Adder para que pueda ser utilizada 

import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SumaImplementacion extends UnicastRemoteObject 
	implements Suma{
	
	private final int PUERTO = 9090;

    public SumaImplementacion() throws RemoteException { super(); }
    
    public void iniciarServidor() {
    	try {
			String localIP = (InetAddress.getLocalHost()).toString();
			System.out.println("Escuchando en ..."+ localIP +" en el puerto " + PUERTO);
			Registry registro = LocateRegistry.createRegistry(PUERTO);
			registro.bind("OperacionSuma", (Suma) this);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public int OperacionSuma(int num1, int num2) throws RemoteException{
    	int res = num1 + num2;
    	return res;
    }
    
    public static void main(String[] args) throws Exception {
    	(new SumaImplementacion()).iniciarServidor();
    }
}
