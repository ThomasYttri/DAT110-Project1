package RPC;

/**
 * @Author Thomas V.Yttri
 *
 * Client-side stubs (local ovjects) must extend this class
 */
public abstract class RPCStub {

    protected RPCClient rpcclient;

    /**
     * register - Method that registers the client
     * @param rmiclient
     */
    public void register(RPCClient rmiclient){
        this.rpcclient = rmiclient;
    }
}
