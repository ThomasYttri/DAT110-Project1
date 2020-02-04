package System.Controller;

/**
 * @Author Thomas V.Yttri
 */
public class Controller {

    private static int N = 5;

    public static void main (String[] args){

        Display display;
        Sensor sensor;

        RPCClient displayclient, sensorclient;

        System.out.println("Controller starting ...");

        RPCServerStopStub stopdisplay = new RPCServerStopStub();
        RPCServerStopStub stopsensor = new RPCServerStopStub();

        displayclient = new RPCClient(Common.DISPLAYHOST, Common.DISPLAYPORT);
        sensorclient = new RPCClient(Common.SENSORHOST, Common.SENSORPORT);

        // TODO: 2020-02-04
        // Connect to sensor and display RPC servers
        // Create local display and sensor objects
        // Register display and sensor objects in the RPC layer

        if (true){
            throw new UnsupportedOperationException(TODO.method());
        }

        // Register stop methods in the RPC layer
        displayclient.register(stopdisplay);
        sensorclient.register(stopsensor);

        // TODO: 2020-02-04
        // Loop while reading from sensor and write to display via RPC

        if (true){
            throw new UnsupportedOperationException(TODO.method());
        }

        stopdisplay.stop();
        stopsensor.stop();

        displayclient.disconnect();
        sensorclient.disconnect();

        System.out.println("Controller stopping ...");
    }
}
