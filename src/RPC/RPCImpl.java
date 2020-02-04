package RPC;

/**
 * @Author Thomas V.Yttri
 *
 * Server-side (remote objects) must implement this interface
 */
public interface RPCImpl {

    public byte[] invoke(byte[] request);

}
