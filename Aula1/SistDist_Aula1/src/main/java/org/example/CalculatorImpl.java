package org.example;

import java.rmi.RemoteException;

public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator {

    public CalculatorImpl() throws RemoteException {
        super();
    }
    public long add(long a, long b) throws java.rmi.RemoteException{
        return a + b;
    }
    public long sub(long a, long b) throws java.rmi.RemoteException{
        return a - b;
    }
    public long mul(long a, long b) throws java.rmi.RemoteException{
        return a * b;
    }
    public long div(long a, long b) throws java.rmi.RemoteException{
        return a / b;
    }
}
