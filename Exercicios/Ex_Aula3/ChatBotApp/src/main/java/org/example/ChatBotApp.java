package org.example;

import com.sun.xml.internal.ws.api.message.Message;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ChatBotApp {

        try {
            IServicoRemoto MsgUser = (IServicoRemoto) Naming.lookup("rmi://192.168.120.92:8282/ChatBotApp");

            Message messageUser = new Message();
           messageUser.set();

        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }



}