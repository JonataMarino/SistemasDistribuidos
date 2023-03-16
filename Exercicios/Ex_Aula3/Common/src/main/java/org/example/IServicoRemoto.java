package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {

    void inserir (Message msg) throws RemoteException;
    List<Message> throws RemoteException;
}
