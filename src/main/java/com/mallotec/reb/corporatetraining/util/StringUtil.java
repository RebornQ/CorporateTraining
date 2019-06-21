package com.mallotec.reb.corporatetraining.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtil {

    /***
     * 32位MD5加密方法
     * 16位小写加密只需StringUtil.MD5("xxx").substring(8,24);即可
     *
     * @param str 要加密的字串
     * @return 加密后的字串，若加密失败则返回原字串
     */
    public static String MD5(String str){
        try {
            MessageDigest bmd5 = MessageDigest.getInstance("MD5");
            bmd5.update(str.getBytes());
            int i;
            StringBuffer buf = new StringBuffer();
            byte[] bytes = bmd5.digest(); // 加密
            for (int offset = 0; offset < bytes.length; offset++) {
                i = bytes[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return str;
    }
}
