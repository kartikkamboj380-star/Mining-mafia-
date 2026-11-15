package com.google.firebase.perf.network;

import S6.h;
import X6.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final R6.a f40460f = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f40461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f40462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40463c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40464d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f40465e;

    public c(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        this.f40461a = httpURLConnection;
        this.f40462b = hVar;
        this.f40465e = lVar;
        hVar.x(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f40463c == -1) {
            this.f40465e.g();
            long jE = this.f40465e.e();
            this.f40463c = jE;
            this.f40462b.q(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f40462b.l(strF);
        } else if (o()) {
            this.f40462b.l("POST");
        } else {
            this.f40462b.l("GET");
        }
    }

    public boolean A() {
        return this.f40461a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f40461a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f40461a.getOutputStream();
            return outputStream != null ? new U6.b(outputStream, this.f40462b, this.f40465e) : outputStream;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f40461a.getPermission();
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public int E() {
        return this.f40461a.getReadTimeout();
    }

    public String F() {
        return this.f40461a.getRequestMethod();
    }

    public Map G() {
        return this.f40461a.getRequestProperties();
    }

    public String H(String str) {
        return this.f40461a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f40464d == -1) {
            long jC = this.f40465e.c();
            this.f40464d = jC;
            this.f40462b.v(jC);
        }
        try {
            int responseCode = this.f40461a.getResponseCode();
            this.f40462b.m(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f40464d == -1) {
            long jC = this.f40465e.c();
            this.f40464d = jC;
            this.f40462b.v(jC);
        }
        try {
            String responseMessage = this.f40461a.getResponseMessage();
            this.f40462b.m(this.f40461a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public URL K() {
        return this.f40461a.getURL();
    }

    public boolean L() {
        return this.f40461a.getUseCaches();
    }

    public void M(boolean z9) {
        this.f40461a.setAllowUserInteraction(z9);
    }

    public void N(int i10) {
        this.f40461a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f40461a.setConnectTimeout(i10);
    }

    public void P(boolean z9) {
        this.f40461a.setDefaultUseCaches(z9);
    }

    public void Q(boolean z9) {
        this.f40461a.setDoInput(z9);
    }

    public void R(boolean z9) {
        this.f40461a.setDoOutput(z9);
    }

    public void S(int i10) {
        this.f40461a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f40461a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f40461a.setIfModifiedSince(j10);
    }

    public void V(boolean z9) {
        this.f40461a.setInstanceFollowRedirects(z9);
    }

    public void W(int i10) {
        this.f40461a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f40461a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f40462b.y(str2);
        }
        this.f40461a.setRequestProperty(str, str2);
    }

    public void Z(boolean z9) {
        this.f40461a.setUseCaches(z9);
    }

    public void a(String str, String str2) {
        this.f40461a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f40463c == -1) {
            this.f40465e.g();
            long jE = this.f40465e.e();
            this.f40463c = jE;
            this.f40462b.q(jE);
        }
        try {
            this.f40461a.connect();
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f40461a.usingProxy();
    }

    public void c() {
        this.f40462b.u(this.f40465e.c());
        this.f40462b.b();
        this.f40461a.disconnect();
    }

    public boolean d() {
        return this.f40461a.getAllowUserInteraction();
    }

    public int e() {
        return this.f40461a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f40461a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f40462b.m(this.f40461a.getResponseCode());
        try {
            Object content = this.f40461a.getContent();
            if (content instanceof InputStream) {
                this.f40462b.r(this.f40461a.getContentType());
                return new U6.a((InputStream) content, this.f40462b, this.f40465e);
            }
            this.f40462b.r(this.f40461a.getContentType());
            this.f40462b.s(this.f40461a.getContentLength());
            this.f40462b.u(this.f40465e.c());
            this.f40462b.b();
            return content;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f40462b.m(this.f40461a.getResponseCode());
        try {
            Object content = this.f40461a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f40462b.r(this.f40461a.getContentType());
                return new U6.a((InputStream) content, this.f40462b, this.f40465e);
            }
            this.f40462b.r(this.f40461a.getContentType());
            this.f40462b.s(this.f40461a.getContentLength());
            this.f40462b.u(this.f40465e.c());
            this.f40462b.b();
            return content;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f40461a.getContentEncoding();
    }

    public int hashCode() {
        return this.f40461a.hashCode();
    }

    public int i() {
        a0();
        return this.f40461a.getContentLength();
    }

    public long j() {
        a0();
        return this.f40461a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f40461a.getContentType();
    }

    public long l() {
        a0();
        return this.f40461a.getDate();
    }

    public boolean m() {
        return this.f40461a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f40461a.getDoInput();
    }

    public boolean o() {
        return this.f40461a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f40462b.m(this.f40461a.getResponseCode());
        } catch (IOException unused) {
            f40460f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f40461a.getErrorStream();
        return errorStream != null ? new U6.a(errorStream, this.f40462b, this.f40465e) : errorStream;
    }

    public long q() {
        a0();
        return this.f40461a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f40461a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f40461a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f40461a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f40461a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f40461a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f40461a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f40461a.getHeaderFieldLong(str, j10);
    }

    public Map x() {
        a0();
        return this.f40461a.getHeaderFields();
    }

    public long y() {
        return this.f40461a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f40462b.m(this.f40461a.getResponseCode());
        this.f40462b.r(this.f40461a.getContentType());
        try {
            InputStream inputStream = this.f40461a.getInputStream();
            return inputStream != null ? new U6.a(inputStream, this.f40462b, this.f40465e) : inputStream;
        } catch (IOException e10) {
            this.f40462b.u(this.f40465e.c());
            U6.d.d(this.f40462b);
            throw e10;
        }
    }
}
