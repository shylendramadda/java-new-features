package com.shylu.javapractice.base64encode;

import java.util.Base64;

/**
 * @author Shylendra Madda
 */
public class MimeEncodeDecode {
    public static void main(String[] args) {
        // Getting MIME encoder
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, \nYou are informed regarding your inconsistency of work";
        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: " + eStr);

        // Getting MIME decoder
        Base64.Decoder decoder = Base64.getMimeDecoder();
        // Decoding MIME encoded message
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded message: " + dStr);
    }
}
