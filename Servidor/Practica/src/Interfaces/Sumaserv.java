// Paso 1: Crear la interfaz remota

package Interfaces; //Agregar el paquete donde este la interfaz remota 

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Sumaserv extends Remote {
    public int OperacionSuma (int a, int b) throws RemoteException;
}
