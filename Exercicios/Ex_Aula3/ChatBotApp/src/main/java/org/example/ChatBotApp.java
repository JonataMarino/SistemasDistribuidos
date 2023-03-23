package org.example;
import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class ChatBotApp {
    public static void main(String[] args) throws RemoteException {
        try {
            IServicoRemoto MsgUser = (IServicoRemoto) Naming.lookup("rmi://192.168.1.6:8282/ChatBotApp");
            String message = JOptionPane.showInputDialog("Digite uma mensagem");
            String resposta= MsgUser.talk(message);
            JOptionPane.showMessageDialog(null, resposta);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}

 /*           Message messageUser = new Message();
            System.out.println("Informe seu Nome: ");
            String name = sc.next();
            messageUser.setName(name);
            System.out.println("Digite sua Mensagem: ");
            String text = sc.next();
            messageUser.setMessage(text);

            MsgUser.inserir(messageUser);

           for (Message msg : MsgUser.listarMensagem()){
                System.out.println("Nome:"+ msg.getName());
                System.out.println("Mensagem: "+ msg.getMessage());
           }
   */


