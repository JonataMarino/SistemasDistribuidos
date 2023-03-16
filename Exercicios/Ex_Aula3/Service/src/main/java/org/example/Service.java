package org.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Service {
    public Service() throws RemoteException {

        try{
            LocateRegistry.createRegistry(8282);
            System.out.println("Inicio");
            Naming.rebind("rmi://192.168.120.92:8282/ChatBotApp", new ServicoRemotoImpl());
            System.out.println("Fim");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws RemoteException{
        new Service();
    }
}