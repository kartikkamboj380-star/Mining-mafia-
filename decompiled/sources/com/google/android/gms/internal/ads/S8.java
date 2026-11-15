package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class S8 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23137b;

    S8(InputStream inputStream, long j10) {
        super(inputStream);
        this.f23136a = j10;
    }

    final long a() {
        return this.f23136a - this.f23137b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f23137b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f23137b += (long) i12;
        }
        return i12;
    }
}
