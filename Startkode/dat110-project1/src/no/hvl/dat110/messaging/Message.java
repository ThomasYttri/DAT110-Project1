package no.hvl.dat110.messaging;

public class Message {

	private static int MSG_SIZE = 128;
	private byte[] payload;

	public Message(byte[] payload) {
		//check for length within boundary
		if (payload.length <= MSG_SIZE){
			this.payload = payload;
		} else {
			throw new IllegalArgumentException("Payload is out of boundary");
		}
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		
		byte[] encoded = new byte[MSG_SIZE];
		encoded[0] = (byte) payload.length;
		for(int i = 0; i < payload.length; i++){
			encoded[i+1] = payload[i];
		}

		return encoded;
		
	}

	public void decapsulate(byte[] received) {
		// decapsulate the data contained in the received byte array and store it
		// in the payload of this message

		int length = received[0];
		payload = new byte[length];
		for(int i = 0; i < length; i++){
			payload[i] = received[i+1];
		}
		
	}
}
