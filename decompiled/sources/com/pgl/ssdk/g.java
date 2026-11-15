package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i10) throws a {
        try {
            return h.a(qVar, aVar, i10);
        } catch (j e10) {
            throw new a(e10.getMessage());
        }
    }
}
