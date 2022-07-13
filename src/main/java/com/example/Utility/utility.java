package com.example.Utility;

public class utility {

    public static String SHA256hash(String s1) {
        try {
            return org.apache.commons.codec.digest.DigestUtils.sha256Hex(s1);
        }catch(Exception e) {
            return null;
        }
    }


}
