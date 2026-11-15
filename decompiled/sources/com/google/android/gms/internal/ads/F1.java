package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 implements InterfaceC5570w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18622a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void c(long j10, int i10, int i11, int i12, C5444v2 c5444v2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void e(P10 p10, int i10, int i11) {
        p10.J(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void f(JY0 jy0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final int h(PQ0 pq0, int i10, boolean z9, int i11) throws EOFException {
        int iF = pq0.F(this.f18622a, 0, Math.min(CodedOutputStream.DEFAULT_BUFFER_SIZE, i10));
        if (iF != -1) {
            return iF;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }
}
