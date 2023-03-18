package org.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
    public ServicoRemotoImpl() throws RemoteException{
        super();
    }
    public String talk(String Message) throws RemoteException{
        String resposta = "";
        if (Message.contains("Oi") || Message.contains("Ola")){
            resposta = "Olá! em que posso ajudar ?";
        }else if (Message.contains("Boa Tarde") || Message.contains("boa tarde")) {
            resposta = "Boa Tarde! Como posso ajudar ?";
        }else if (Message.contains("Bom dia") || Message.contains("bom dia") ){
            resposta = "Bom dia! em que posso ajudar ?";
        }else{
            resposta = "Não sei responder a isso";
        }

        return resposta;
    }

    public static void main(String[] args) {
        try{
            ServicoRemotoImpl chatBot = new ServicoRemotoImpl();
            Naming.rebind("Chatbot", chatBot);
        }catch (Exception e){
            System.out.println("ServicoRemotoImpl erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }
//    private static List<Message> lstMessage = new ArrayList<>();

//    protected ServicoRemotoImpl() throws RemoteException{
//    }
//
//
//    @Override
//    public void inserir (Message msg) throws RemoteException{
//        lstMessage.add(msg);
//    }
//
//    @Override
//    public List<Message> listarMensagem() throws RemoteException {
//        return lstMessage;
//    }

}
