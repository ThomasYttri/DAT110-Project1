package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		// Implement marshalling, call and unmarshalling for read RPC method

		int temp = 0;

		byte[] req = RPCUtils.marshallInteger(RPCID, temp);
		byte[] res = rpcclient.call(req);

		temp = RPCUtils.unmarshallInteger(res);
		return temp;
	}
	
}
