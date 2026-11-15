package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6758p extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f41272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f41273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41274c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f41278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f41280i;

    C6758p(Iterable iterable) {
        this.f41272a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f41274c++;
        }
        this.f41275d = -1;
        if (a()) {
            return;
        }
        this.f41273b = Internal.EMPTY_BYTE_BUFFER;
        this.f41275d = 0;
        this.f41276e = 0;
        this.f41280i = 0L;
    }

    private boolean a() {
        this.f41275d++;
        if (!this.f41272a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f41272a.next();
        this.f41273b = byteBuffer;
        this.f41276e = byteBuffer.position();
        if (this.f41273b.hasArray()) {
            this.f41277f = true;
            this.f41278g = this.f41273b.array();
            this.f41279h = this.f41273b.arrayOffset();
        } else {
            this.f41277f = false;
            this.f41280i = V.k(this.f41273b);
            this.f41278g = null;
        }
        return true;
    }

    private void c(int i10) {
        int i11 = this.f41276e + i10;
        this.f41276e = i11;
        if (i11 == this.f41273b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f41275d == this.f41274c) {
            return -1;
        }
        if (this.f41277f) {
            int i10 = this.f41278g[this.f41276e + this.f41279h] & 255;
            c(1);
            return i10;
        }
        int iX = V.x(((long) this.f41276e) + this.f41280i) & 255;
        c(1);
        return iX;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f41275d == this.f41274c) {
            return -1;
        }
        int iLimit = this.f41273b.limit();
        int i12 = this.f41276e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f41277f) {
            System.arraycopy(this.f41278g, i12 + this.f41279h, bArr, i10, i11);
            c(i11);
            return i11;
        }
        int iPosition = this.f41273b.position();
        AbstractC6759q.d(this.f41273b, this.f41276e);
        this.f41273b.get(bArr, i10, i11);
        AbstractC6759q.d(this.f41273b, iPosition);
        c(i11);
        return i11;
    }
}
