package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
    private static List<Message> lstUser = new ArrayList<>();

    public ServicoRemotoImpl() throws RemoteException{
    }

    @Override

}
