package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2684Xv0 extends OutputStream {
    C2684Xv0() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC2418Ss0.o(i10, i11 + i10, bArr.length);
    }
}
