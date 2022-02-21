
package server;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {
    
    protected String stringaRicevuta = null;
    protected String stringaModifica = null;
    protected BufferedReader inDalServer;
    protected DataOutputStream  outVersoClient;

    protected Socket cliente;

    public ServerThread(Socket c){
        cliente = c;
        try{
            inDalServer = new BufferedReader(new InputStreamReader (cliente.getInputStream()));
            outVersoClient = new DataOutputStream(cliente.getOutputStream());
        }   
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Thread) Errore durante l'avvio del server");
            System.exit(1);
        }
        
    }

    //public void
}