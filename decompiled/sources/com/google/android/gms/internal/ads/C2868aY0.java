package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2868aY0 extends C5741xO0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26554k;

    public C2868aY0() {
        super(2, 0);
        this.f26554k = 32;
    }

    @Override // com.google.android.gms.internal.ads.C5741xO0, com.google.android.gms.internal.ads.AbstractC2844aM0
    public final void a() {
        super.a();
        this.f26553j = 0;
    }

    public final void n(int i10) {
        this.f26554k = i10;
    }

    public final long o() {
        return this.f26552i;
    }

    public final int p() {
        return this.f26553j;
    }

    public final boolean q() {
        return this.f26553j > 0;
    }

    public final boolean r(C5741xO0 c5741xO0) {
        ByteBuffer byteBuffer;
        AbstractC2418Ss0.a(!c5741xO0.i(1073741824));
        AbstractC2418Ss0.a(!c5741xO0.i(268435456));
        AbstractC2418Ss0.a(!c5741xO0.i(4));
        if (q()) {
            if (this.f26553j >= this.f26554k) {
                return false;
            }
            ByteBuffer byteBuffer2 = c5741xO0.f34803d;
            if (byteBuffer2 != null && (byteBuffer = this.f34803d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.f26553j;
        this.f26553j = i10 + 1;
        if (i10 == 0) {
            this.f34805f = c5741xO0.f34805f;
            if (c5741xO0.i(1)) {
                g(1);
            }
        }
        ByteBuffer byteBuffer3 = c5741xO0.f34803d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f34803d.put(byteBuffer3);
        }
        this.f26552i = c5741xO0.f34805f;
        return true;
    }
}
