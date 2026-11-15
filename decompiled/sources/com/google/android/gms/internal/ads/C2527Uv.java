package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2527Uv extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f24126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2579Vv f24127b;

    C2527Uv(C2579Vv c2579Vv) {
        Objects.requireNonNull(c2579Vv);
        this.f24127b = c2579Vv;
        this.f24126a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket a(Socket socket) throws SocketException {
        C2579Vv c2579Vv = this.f24127b;
        if (c2579Vv.j() > 0) {
            socket.setReceiveBufferSize(c2579Vv.j());
        }
        c2579Vv.i(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.f24126a.createSocket(str, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f24126a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f24126a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.f24126a.createSocket(str, i10, inetAddress, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f24126a.createSocket(inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.f24126a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z9) throws IOException {
        Socket socketCreateSocket = this.f24126a.createSocket(socket, str, i10, z9);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
