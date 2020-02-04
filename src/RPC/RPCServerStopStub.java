package RPC;

/**
 * @Author Thomas V.Yttri
 *
 * Client-side (local) implementation of the built-in server stop RPC method
 */
public class RPCServerStopStub extends RPCStub{

    public void stop() {

        byte[] request = RPCUtils.marshallVoid(RPCCommon.RPIDSTOP);

        byte[] response = rpcclient.call(request);

        RPCUtils.unmarshallVoid(response);
    }


}
