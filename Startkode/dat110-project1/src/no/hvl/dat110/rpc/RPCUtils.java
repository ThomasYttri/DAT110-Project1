package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;

import no.hvl.dat110.TODO;

public class RPCUtils {

	// Utility methods for marshalling and marshalling of parameters and return values
	// in RPC request and RPC responses
	// data bytearrays and return byte arrays is according to the 
	// RPC message syntax [rpcid,parameter/return value]
	
	public static byte[] marshallString(byte rpcid, String str) {
		// marshall RPC identifier and string into byte array

		byte[] encoded = new byte[1 + str.length()];
		encoded[0] = rpcid;

		for(int i = 0; i < str.length(); i++) {
			encoded[i + 1] = str.getBytes()[i];
		}

		return encoded;
	}

	public static String unmarshallString(byte[] data) {
		// Unmarshall String contained in data into decoded
		String decoded;
		byte[] array = new byte[data.length - 1];

		for(int i = 0; i < array.length; i++) {
			array[i] = data[i + 1];
		}

		decoded = new String(array);

		return decoded;
	}

	public static byte[] marshallVoid(byte rpcid) {
		//Marshall RPC identifier in case of void type

		byte[] encoded = new byte[1];
		encoded[0] = rpcid;

		return encoded;

	}

	public static void unmarshallVoid(byte[] data) {

		// TODO: unmarshall void type

		byte[] array = new byte[data.length - 1];

		for(int i = 0; i < array.length; i++) {
			array[i] = data[i + 1];
		}

	}

	public static byte[] marshallBoolean(byte rpcid, boolean b) {

		byte[] encoded = new byte[2];

		encoded[0] = rpcid;

		if (b) {
			encoded[1] = 1;
		} else {
			encoded[1] = 0;
		}

		return encoded;
	}

	public static boolean unmarshallBoolean(byte[] data) {

		return (data[1] > 0);

	}

	public static byte[] marshallInteger(byte rpcid, int x) {
		// Marshall RPC identifier and string into byte array

		byte[] encoded = new byte[5];
		encoded[0] = rpcid;
		byte[] array = ByteBuffer.allocate(4).putInt(x).array();

		for (int i = 0; i < array.length; i++) {
			encoded[i + 1] = array[i];
		}

		return encoded;
	}

	public static int unmarshallInteger(byte[] data) {
		// Unmarshall integer contained in data

		int decoded = ByteBuffer.wrap(data).getInt(1);
		return decoded;

	}
}
