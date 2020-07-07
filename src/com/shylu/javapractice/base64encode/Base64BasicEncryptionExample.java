package com.shylu.javapractice.base64encode;

import java.util.Arrays;
import java.util.Base64;

/**
 * @author Shylendra Madda
 */
public class Base64BasicEncryptionExample {
    public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();
        // Creating byte array
        byte[] byteArr = {
                1, 2
        };
        // encoding byte array
        byte[] byteArr2 = encoder.encode(byteArr);
        System.out.println("Encoded byte array: " + Arrays.toString(byteArr2));
        byte[] byteArr3;
        byteArr3 = new byte[5]; // Make sure it has enough size to store copied bytes
        int numberOfBytes = encoder.encode(byteArr, byteArr3);    // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: " + Arrays.toString(byteArr3));
        System.out.println("Number of bytes written: " + numberOfBytes);

        // Encoding string
        String str = encoder.encodeToString("JavaTpoint".getBytes());
        System.out.println("Encoded string: " + str);
        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();
        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: " + dStr);
    }
}
