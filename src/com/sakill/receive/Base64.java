package com.sakill.receive;
import java.io.UnsupportedEncodingException;
import sun.misc.*;

    public class Base64 {
        // ����
        public static String encode(String str) {
            byte[] b = null;
            String s = null;
            try {
                b = str.getBytes("utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (b != null) {
                s = new BASE64Encoder().encode(b);
            }
            return s;
        }

        // ����
        public static String decode(String s) {
            byte[] b = null;
            String result = null;
            if (s != null) {
                BASE64Decoder decoder = new BASE64Decoder();
                try {
                    b = decoder.decodeBuffer(s);
                    result = new String(b, "utf-8");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }