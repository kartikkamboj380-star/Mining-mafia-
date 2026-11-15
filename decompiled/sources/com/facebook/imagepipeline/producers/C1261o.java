package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1261o extends L {
    public C1261o(p013b2.i iVar) {
        super(W1.a.a(), iVar);
    }

    static byte[] g(String str) {
        Y1.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        Y1.k.g(strDecode);
        return strDecode.getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] strArrSplit = str.split(";");
        return strArrSplit[strArrSplit.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected O2.j d(U2.b bVar) {
        byte[] bArrG = g(bVar.v().toString());
        return c(new ByteArrayInputStream(bArrG), bArrG.length);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "DataFetchProducer";
    }
}
