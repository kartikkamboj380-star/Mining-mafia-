package com.bytedance.adsdk.kq.oq.csi;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static boolean bob(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean fou(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean kq(char c10) {
        return c10 == ' ';
    }

    public static boolean oq(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }
}
