package RPC;

/**
 * @Author Thomas V.Yttri
 *
 * Server-side (remote) implementation of the built-in stop RPC method
 */
public class RPCServerStopImpl implements RPCImpl{

    /**
     * invoke - Method that unmarshalls request and forms a reply
     * @param request
     * @return reply
     */
    public byte[] invoke(byte[] request){

        RPCUtils.unmarshallVoid(request);

        byte[] reply = RPCUtils.marshallVoid(RPCCommon.RPIDSTOP);

        stop();

        return reply;
    }

    /**
     * stop - Prints warning that RPC server is shutting down.
     */
    public void stop() {
        System.out.println("RPC server executing stop");
    }
}
