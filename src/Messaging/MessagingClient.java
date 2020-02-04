package Messaging;

import java.net.Socket;

/**
 * @Author Thomas V.Yttri
 */
public class MessagingClient {

    private String server;
    private int port;

    /**
     * MessagingClient Constructor
     * @param server
     * @param port
     */
    public MessagingClient(String server, int port){
        this.server = server;
        this.port = port;
    }

    /**
     * connect - Connecting to messaging server
     * @return connection
     */
    public Connection connect() {

        Socket clientSocket;
        Connection connection = null;

        // TODO: 2020-02-04
        // Create TCP socket for client and connection
        // Create connection object

        if (true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return connection;
    }
}
