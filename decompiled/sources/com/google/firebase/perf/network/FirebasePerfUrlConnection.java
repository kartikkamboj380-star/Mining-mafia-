package com.google.firebase.perf.network;

import S6.h;
import W6.k;
import X6.l;
import X6.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    static Object a(n nVar, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent() : uRLConnectionA.getContent();
        } catch (IOException e10) {
            hVarC.q(jE);
            hVarC.u(lVar.c());
            hVarC.x(nVar.toString());
            U6.d.d(hVarC);
            throw e10;
        }
    }

    static Object b(n nVar, Class[] clsArr, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr);
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr) : uRLConnectionA.getContent(clsArr);
        } catch (IOException e10) {
            hVarC.q(jE);
            hVarC.u(lVar.c());
            hVarC.x(nVar.toString());
            U6.d.d(hVarC);
            throw e10;
        }
    }

    static InputStream c(n nVar, k kVar, l lVar) throws IOException {
        if (!k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getInputStream();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e10) {
            hVarC.q(jE);
            hVarC.u(lVar.c());
            hVarC.x(nVar.toString());
            U6.d.d(hVarC);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new l(), h.c(k.k()));
        }
        return obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new l(), h.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.k(), new l());
    }
}
