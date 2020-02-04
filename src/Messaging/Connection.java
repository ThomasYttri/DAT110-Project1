package Messaging;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author Thomas V.Yttri
 */
public class Connection {
    private DataOutputStream outStream;     // For writing bytes to the underlying TCP connection
    private DataInputStream inStream;       // For reading bytes from the underlying TCP connection
    private Socket socket;                  // Socket for the underlying TCP connection

    /**
     * Connection Constructor
     * @param socket
     */
    public Connection(Socket socket){

        try {
            this.socket = socket;
            outStream = new DataOutputStream(socket.getOutputStream());
            inStream = new DataInputStream(socket.getInputStream();
        } catch (IOException ex) {
            System.out.println("Connection: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /**
     * send - Encapsulates the data contained in the message and writes it to output stream
     * @param message
     */
    public void send(Message message) {

        // TODO: 2020-02-04
        // Encapsulate the data contained in the message and write to the output stream
        // Hint: use the encapsulate method on the message
        throw new UnsupportedOperationException(TODO.method());
    }

    /**
     * recieve - Reads segment from input stream and decapsulates into message
     * @return message
     */
    public Message recieve() {

        Message message;
        byte[] recvbuf;

        // TODO: 2020-02-04
        // Read a segment (128 bytes) from the input stream and decapsulate into message
        // Hint: create a new Message object and use the decapsulate method

        if (true) {
            throw new RuntimeException("not yet implemented");
        }

        return message;
    }

    /**
     * close - Close the connection by closing streams and the underlying socket
     */
    public void close() {

        try {

            outStream.close();
            inStream.close();

            socket.close();
        } catch (IOException ex) {
            System.out.println("Connection: " + ex.getMessage());
        }
    }
}
