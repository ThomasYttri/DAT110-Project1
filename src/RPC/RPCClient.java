package RPC;

import Messaging.Connection;
import Messaging.MessagingClient;

/**
 * @Author Thomas V.Yttri
 */
public class RPCClient {

    private MessagingClient msgclient;
    private Connection connection;

    /**
     * RPCClient Constructor
     * @param server
     * @param port
     */
    public RPCClient(String server, int port){
        msgclient = new MessagingClient(server, port);
    }

    /**
     * register - Registers RPCClient to the remote RPCStub (?????)
     * @param remote
     */
    public void register(RPCStub remote){
        remote.register(this);
    }

    /**
     * connect - Connect using underlying message layer connection
     */
    public void connect() {

        // TODO: 2020-02-04
        // Connect using the underlying message layer connection

        throw new UnsupportedOperationException(TODO.method());
    }

    /**
     * disconnect - Disconnect the underlying messaging connection
     */
    public void disconnect(){

        // TODO: 2020-02-04
        // Disconnect/close the underlying messaging connection

        throw new UnsupportedOperationException(TODO.method());
    }

    /**
     * call - Makes a remote call on the RPC server by sending the
     * RPC request message and receive an RPC reply message
     * @param rpcrequest
     * @return rpcreply
     */
    public byte[] call (byte[] rpcrequest){

        byte[] rpcreply;

        // TODO: 2020-02-04
        // Make a remote call on the RPC server by sending the
        // RPC request message and receive an RPC reply message
        //
        // rpcrequest is the marshalled rpcrequest from the client-stub
        // rpcreply is the rpcreply to be unmarshalled by the client-stub

        if (true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return rpcreply;

    }
}
