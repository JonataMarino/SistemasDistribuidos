package org.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;

public class Service {
    public Service() throws RemoteException {

        try{

            System.out.println("Inicio");

            Naming.rebind("rmi://192.168.1.6:8282/ChatBotApp", new ServicoRemotoImpl());
            System.out.println("Fim");
            /*for (Message messageuser : MsgUser.listarMensagem()){
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws RemoteException{
        new Service();
    }
}