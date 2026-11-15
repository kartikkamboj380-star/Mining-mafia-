package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3724hM0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f28934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f28935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28936c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f28940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f28942i;

    C3724hM0(Iterable iterable) {
        this.f28934a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f28936c++;
        }
        this.f28937d = -1;
        if (a()) {
            return;
        }
        this.f28935b = AbstractC3346eM0.f27767c;
        this.f28938e = 0;
        this.f28942i = 0L;
    }

    private final boolean a() {
        ByteBuffer byteBuffer;
        do {
            this.f28937d++;
            if (!this.f28934a.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.f28934a.next();
            this.f28935b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f28938e = this.f28935b.position();
        if (this.f28935b.hasArray()) {
            this.f28939f = true;
            this.f28940g = this.f28935b.array();
            this.f28941h = this.f28935b.arrayOffset();
        } else {
            this.f28939f = false;
            this.f28942i = AbstractC3726hN0.y(this.f28935b);
            this.f28940g = null;
        }
        return true;
    }

    private final void c(int i10) {
        int i11 = this.f28938e + i10;
        this.f28938e = i11;
        if (i11 == this.f28935b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f28937d == this.f28936c) {
            return -1;
        }
        if (this.f28939f) {
            int i10 = this.f28940g[this.f28938e + this.f28941h] & 255;
            c(1);
            return i10;
        }
        int iX = AbstractC3726hN0.x(((long) this.f28938e) + this.f28942i) & 255;
        c(1);
        return iX;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f28937d == this.f28936c) {
            return -1;
        }
        int iLimit = this.f28935b.limit();
        int i12 = this.f28938e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f28939f) {
            System.arraycopy(this.f28940g, i12 + this.f28941h, bArr, i10, i11);
            c(i11);
            return i11;
        }
        int iPosition = this.f28935b.position();
        this.f28935b.position(this.f28938e);
        this.f28935b.get(bArr, i10, i11);
        this.f28935b.position(iPosition);
        c(i11);
        return i11;
    }
}
