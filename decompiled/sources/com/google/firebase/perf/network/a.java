package com.google.firebase.perf.network;

import S6.h;
import X6.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f40457a;

    a(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        super(httpURLConnection.getURL());
        this.f40457a = new c(httpURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f40457a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f40457a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f40457a.c();
    }

    public boolean equals(Object obj) {
        return this.f40457a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f40457a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f40457a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f40457a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f40457a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f40457a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f40457a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f40457a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f40457a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f40457a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f40457a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f40457a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f40457a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f40457a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f40457a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f40457a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f40457a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f40457a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f40457a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f40457a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f40457a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f40457a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f40457a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f40457a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f40457a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f40457a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f40457a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f40457a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f40457a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f40457a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f40457a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f40457a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f40457a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f40457a.L();
    }

    public int hashCode() {
        return this.f40457a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z9) {
        this.f40457a.M(z9);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f40457a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f40457a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z9) {
        this.f40457a.P(z9);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z9) {
        this.f40457a.Q(z9);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z9) {
        this.f40457a.R(z9);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f40457a.S(i10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f40457a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z9) {
        this.f40457a.V(z9);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f40457a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f40457a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f40457a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z9) {
        this.f40457a.Z(z9);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f40457a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f40457a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f40457a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f40457a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f40457a.T(j10);
    }
}
