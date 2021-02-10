package EncodeandDecodepassword;

import java.util.Base64;

public class EncodingAndDecodingString {

	public static void main(String[] args) {
		
		String str="Test123";
		byte[] encodedstring = Base64.getEncoder().encode(str.getBytes());
		System.out.println("encoded string is:"+new String(encodedstring));
		
//		byte[] decodedstring = Base64.getDecoder().decode(str.getBytes());
//		System.out.println("Decoded string is:"+new String(decodedstring));

	}

}
