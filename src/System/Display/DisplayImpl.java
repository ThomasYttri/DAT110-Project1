package System.Display;

/**
 * @Author Thomas V.Yttri
 */
public class DisplayImpl implements RPCImpl {

    public void write(String message) {
        System.out.println("DISPLAY: " + message);

    }

    public byte[] invoke(byte[] request) {

        byte[] reply;
        byte rpcid;

        // TODO: 2020-02-04
        // Implement unmarshalling, call, and marshall for write RPC method
        // Look at how this is done in the SensorImpl for the read method

        if (true) {
            throw new UnsupportedOperationException(TODO.method());

        }

        return reply;
    }
}
