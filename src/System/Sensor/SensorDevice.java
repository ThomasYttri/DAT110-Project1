package System.Sensor;

/**
 * @Author Thomas V.Yttri
 */
public class SensorDevice {

    public static void main(String[] args) {

        System.out.println("Sensor server starting ...");

        SensorImpl sensor = new SensorImpl();

        RPCServer sensorserver = new RPCServer(Common.SENSORPORT);

        sensorserver.register(1, sensor);

        sensorserver.run();

        sensorserver.stop();

        System.out.println("Sensor server stopping ...");
    }
}
