package System.Controller;

import RPC.RPCStub;

/**
 * @Author Thomas V.Yttri
 */
public class Sensor extends RPCStub {

    private byte RPCID = 1;

    /**
     * read - Implements marshalling, call and unmarshalling for read RPC method
     * @return temp
     */
    public int read(){

        int temp;

        // TODO: 2020-02-04
        // Implement marshalling, call and unmarshalling for read RPC method

        if(true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return temp;
    }
}
