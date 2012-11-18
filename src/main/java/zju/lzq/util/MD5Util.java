package zju.lzq.util;

import java.security.MessageDigest;

import org.apache.log4j.Logger;

public class MD5Util {
	private static final char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };

	private static Logger log = Logger.getLogger(MD5Util.class);

	public final static String MD5(String plaintext) {
		try {
			byte[] input = plaintext.getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(input);
			byte[] output = messageDigest.digest();
			int j = output.length;
			char[] ciphertext = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; ++i) {
				byte tmp = output[i];
				ciphertext[k++] = hexDigits[tmp >>> 4 & 0xf];
				ciphertext[k++] = hexDigits[tmp & 0xf];
			}
			return new String(ciphertext);
		} catch (Exception e) {
			e.printStackTrace();
			log.warn("fail to compute md5 value", e);
			return null;
		}
	}
}
