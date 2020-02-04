package Messaging;

/**
 * @Author Thomas V.Yttri
 */
public class Message {

    private byte[] payload;

    /**
     * Message Contructor
     * @param payload
     */
    public Message (byte[] payload){
        this.payload = payload;
        // TODO: 2020-02-04
        // Check for length within boundary
    }

    /**
     * Message Empty Construcktor
     */
    public Message(){
        super();
    }

    /**
     * getData Getter payload
     * @return payload
     */
    public byte[] getData() {
        return this.payload;
    }

    /**
     * encapsulate - Encapsulates the payload of the message in
     * the encoded byte array according to message format
     * @return
     */
    public byte[] encapsulate() {
        byte[] encoded = null;

        // TODO: 2020-02-04
        // encapsulate/encode the payload of this message in the
        // encoded byte array according to message format

        if (true){
            throw new UnsupportedOperationException(TODO.method());
        }
        return encoded;
    }

    /**
     * decapsulate - Decapsulates the data contained in the received
     * byte array and store it in the payload of the message
     * @param received
     */
    public void decapsulate(byte[] received) {

        // TODO: 2020-02-04
        // Decapsulates the data contained in the received
        // byte array and store it in the payload of the message

        throw new UnsupportedOperationException(TODO.method());
    }
}
