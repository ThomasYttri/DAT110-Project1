package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {
		// Implement marshalling, call and unmarshalling for write RPC method

		byte[] req = RPCUtils.marshallString(RPCID, message);

		byte[] res = rpcclient.call(req);

		String str = RPCUtils.unmarshallString(res);
		System.out.println("Message : " + str);
	}
}
