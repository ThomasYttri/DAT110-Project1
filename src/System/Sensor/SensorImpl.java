package System.Sensor;

/**
 * @Author Thomas V.Yttri
 */
public class SensorImpl implements RPCImpl {

    static final int RANGE = 20;

    public int read() {

        long seconds = System.currentTimeMillis();

        double temp = RANGE * Math.sin(seconds / 1000);

        return (int) Math.ceil(temp);

    }
    
    public byte[] invoke(byte[] request) {

        RPCUtils.unmarshallVoid(request);

        int temp = read();

        byte rpcid = request[0];

        byte[] reply = RPCUtils.marshallInteger(rpcid, temp);

        return reply;
    }
}
