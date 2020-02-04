package Messaging;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Author Thomas V.Yttri
 */
public class MessagingServer {

    private ServerSocket welcomeSocket;

    /**
     * MessagingServer Constructor
     * @param port
     */
    public MessagingServer(int port){

        try {

            this.welcomeSocket = new ServerSocket(port);

        } catch (IOException ex){

            System.out.println("Messaging server: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public Connection accept(){

        Connection connection = null;

        // TODO: 2020-02-04
        // Accept TCP connection on welcome socket and create messaging connection

        if (true){

            throw new UnsupportedOperationException(TODO.method());

        }

        return connection;
    }

    public void stop(){

        if(welcomeSocket != null){

            try {
                welcomeSocket.close();
            } catch (IOException ex){
                System.out.println("Messaging server: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
