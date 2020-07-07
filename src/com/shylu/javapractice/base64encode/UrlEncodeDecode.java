package com.shylu.javapractice.base64encode;

import java.util.Base64;

/**
 * @author Shylendra Madda
 */
public class UrlEncodeDecode {
    public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();
        // Encoding URL
        String eStr = encoder.encodeToString("https://www.techatcore.com/".getBytes());
        System.out.println("Encoded URL: " + eStr);
        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();
        // Decoding URl
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded URL: " + dStr);
    }
}
