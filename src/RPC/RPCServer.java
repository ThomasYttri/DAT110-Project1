package RPC;

import Messaging.Connection;
import Messaging.MessagingServer;

import java.util.HashMap;

/**
 * @Author Thomas V.Yttri
 */
public class RPCServer {

    private MessagingServer msgserver;
    private Connection connection;

    // HashMap to register RPC methods which are required to implement RPCImpl
    private HashMap<Integer, RPCImpl> services;

    /**
     * RPCServer - Constructor
     * @param port
     */
    public RPCServer(int port){

        this.msgserver = new MessagingServer(port);
        this.services = new HashMap<Integer, RPCImpl>();

        //The stop RPC methods is built into the server
        services.put((int)RPCCommon.RPIDSTOP, new RPCServerStopImpl());
    }

    /**
     * run - Run methods, runs initializes connection, continuing to loop while rpcid != RPIDSTOP
     */
    public void run() {

        System.out.println("RPC SERVER RUN - Services: " + services.size());

        connection = msgserver.accept();

        System.out.println("RPC SERVER ACCEPTED");

        boolean stop = false;

        while(!stop){

            int rpcid;

            // TODO: 2020-02-04
            // - receive message containing RPC request
            // - find the identifier for the RPC methods to invoke
            // - lookup the method to be invoked
            // - invoke the method
            // - send back message containing RPC reply

            if(true){
                throw new UnsupportedOperationException(TODO.method());
            }

            if(rpcid == RPCCommon.RPIDSTOP) {
                stop = true;
            }
        }
    }

    /**
     * register - Registers to service
     * @param rpcid
     * @param impl
     */
    public void register(int rpcid, RPCImpl impl){
        services.put(rpcid, impl);
    }

    /**
     * stop - Stop method that calls connection close and msgserver stop
     */
    public void stop(){
        connection.close();
        msgserver.stop();
    }
}
