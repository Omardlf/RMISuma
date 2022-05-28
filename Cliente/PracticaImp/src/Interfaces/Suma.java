package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Suma extends Remote {
    public int OperacionSuma (int a, int b) throws RemoteException;
}
