package com.google.firebase.perf.network;

import S6.h;
import X6.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f40458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f40459b;

    b(HttpsURLConnection httpsURLConnection, l lVar, h hVar) {
        super(httpsURLConnection.getURL());
        this.f40459b = httpsURLConnection;
        this.f40458a = new c(httpsURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f40458a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f40458a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f40458a.c();
    }

    public boolean equals(Object obj) {
        return this.f40458a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f40458a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f40459b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f40458a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f40458a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f40458a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f40458a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f40458a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f40458a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f40458a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f40458a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f40458a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f40458a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f40458a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f40458a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f40458a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f40458a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f40458a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f40458a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f40458a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f40458a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f40459b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f40458a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f40458a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f40458a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f40458a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f40459b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f40459b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f40458a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f40459b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f40458a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f40458a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f40458a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f40458a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f40458a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f40458a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f40458a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f40459b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f40459b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f40458a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f40458a.L();
    }

    public int hashCode() {
        return this.f40458a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z9) {
        this.f40458a.M(z9);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f40458a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f40458a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z9) {
        this.f40458a.P(z9);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z9) {
        this.f40458a.Q(z9);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z9) {
        this.f40458a.R(z9);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f40458a.S(i10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f40459b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f40458a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z9) {
        this.f40458a.V(z9);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f40458a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f40458a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f40458a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f40459b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z9) {
        this.f40458a.Z(z9);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f40458a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f40458a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f40458a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f40458a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f40458a.T(j10);
    }
}
