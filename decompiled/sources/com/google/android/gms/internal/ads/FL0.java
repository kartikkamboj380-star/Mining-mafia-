package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class FL0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f18737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DatagramPacket f18738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f18739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DatagramSocket f18740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MulticastSocket f18741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InetAddress f18742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18744l;

    public FL0(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f18737e = bArr;
        this.f18738f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws C3596gL0 {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18744l == 0) {
            try {
                DatagramSocket datagramSocket = this.f18740h;
                if (datagramSocket == null) {
                    throw null;
                }
                DatagramPacket datagramPacket = this.f18738f;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f18744l = length;
                g(length);
            } catch (SocketTimeoutException e10) {
                throw new C3596gL0(e10, 2002);
            } catch (IOException e11) {
                throw new C3596gL0(e11, 2001);
            }
        }
        int length2 = this.f18738f.getLength();
        int i12 = this.f18744l;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f18737e, length2 - i12, bArr, i10, iMin);
        this.f18744l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C3596gL0 {
        Uri uri = c4454nA0.f31730a;
        this.f18739g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f18739g.getPort();
        c(c4454nA0);
        try {
            this.f18742j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f18742j, port);
            if (this.f18742j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f18741i = multicastSocket;
                multicastSocket.joinGroup(this.f18742j);
                this.f18740h = this.f18741i;
            } else {
                this.f18740h = new DatagramSocket(inetSocketAddress);
            }
            this.f18740h.setSoTimeout(8000);
            this.f18743k = true;
            f(c4454nA0);
            return -1L;
        } catch (IOException e10) {
            throw new C3596gL0(e10, 2001);
        } catch (SecurityException e11) {
            throw new C3596gL0(e11, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f18739g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f18739g = null;
        MulticastSocket multicastSocket = this.f18741i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f18742j;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.f18741i = null;
            } catch (IOException unused) {
            }
        }
        DatagramSocket datagramSocket = this.f18740h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f18740h = null;
        }
        this.f18742j = null;
        this.f18744l = 0;
        if (this.f18743k) {
            this.f18743k = false;
            h();
        }
    }
}
