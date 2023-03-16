package org.example;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class AppPrincipal {
    public static void main(String[] args) {
        try{
            IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

            Professor p1 = new Professor();
            p1.setId(1);
            p1.setNome("Pedro");
            p1.setTelefone("(16) 99999 9999");
            p1.setCidade("Araraquara");

            Professor p2 = new Professor();
            p2.setId(2);
            p2.setNome("Paulo");
            p2.setTelefone("(16) 98888 8888");
            p2.setCidade("Araraquara");

            //Inserir Professor
            objPessoa.inserir(p1);
            objPessoa.inserir(p2);

            //Listar
            for (Pessoa professor : objPessoa.listarPessoa()){
                System.out.println("ID: " + professor.getId());
                System.out.println("Nome: "+ professor.getNome());
                System.out.println("Telefone: "+ professor.getCidade());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();//throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
