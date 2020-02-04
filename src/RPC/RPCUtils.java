package RPC;

/**
 * @Author Thomas V.Yttri
 *
 * Utility methods for marshalling and demarshalling of parameters and return values
 * in RPC request and RPC responses
 * Data bytearrays and return byte array is according to the
 * RPC message syntax [rpcid, parameter/ return value]
 */
public class RPCUtils {

    /**
     * marshallString - Marshall RPC identifier and string into byte array
     * @param rpcid
     * @param str
     * @return encoded
     */
    public static byte[] marshallString(byte rpcid, String str){

        byte[] encoded;

        // TODO: 2020-02-04
        // Marshall RPC identifier and string into byte array

        if(true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return encoded;
    }

    /**
     * unmarshallString - Unmarshalls string contained in data into decoded
     * @param data
     * @return decoded
     */
    public static String unmarshallString(byte[] data){

        String decoded;

        // TODO: 2020-02-04
        // Unmarshall String contained in data into decoded

        if (true) {
            throw new UnsupportedOperationException(TODO.method());
        }

        return decoded;
    }

    /**
     * marshallVoid - Marshall RPC identifier in case of void type
     * @param rpcid
     * @return encoded
     */
    public static byte[] marshallVoid(byte rpcid){

        byte[] encoded;

        // TODO: 2020-02-04
        // Marshall RPC identifier in case of void type

        if(true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return encoded;
    }

    /**
     * unmarshallVoid - unmarshalls void type
     * @param data
     */
    public static void unmarshallVoid(byte[] data){

        // TODO: 2020-02-04
        // Unmarshall void type
    }

    /**
     * marshallBoolean
     * @param rpcid
     * @param b
     * @return encoded
     */
    public static byte[] marhsallBoolean(byte rpcid, boolean b){

        byte[] encoded = new byte[2];

        encoded[0] = rpcid;

        if (b){
            encoded[1] = 1;
        } else {
            encoded[1] = 0;
        }
        return encoded;
    }

    /**
     * unmarshallBoolean - Unmarshall a boolean
     * @param data
     * @return data[1] > 0;
     */
    public static boolean unmarshallBoolean(byte[] data){

        return (data[1] > 0);
    }

    /**
     * marshallInteger - Marshall an Integer
     * @param rpcid
     * @param x
     * @return encoded
     */
    public static byte[] marshallInteger(byte rpcid, int x){

        byte[] encoded;

        // TODO: 2020-02-04
        // Marshall RPC identifier and string into byte array

        if(true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return encoded;
    }

    /**
     * unmarshallInteger - Unmarshall an Integer.
     * @param data
     * @return decoded
     */
    public static int unmarshallInteger(byte[] data){

        int decoded;

        // TODO: 2020-02-04
        // Unmarshall integer contained in data

        if(true){
            throw new UnsupportedOperationException(TODO.method());
        }

        return decoded;
    }

}
