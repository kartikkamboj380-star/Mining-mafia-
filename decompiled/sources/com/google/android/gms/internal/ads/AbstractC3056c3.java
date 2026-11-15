package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3056c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC5570w2 f27008a;

    protected AbstractC3056c3(InterfaceC5570w2 interfaceC5570w2) {
        this.f27008a = interfaceC5570w2;
    }

    protected abstract boolean a(P10 p10);

    protected abstract boolean b(P10 p10, long j10);

    public final boolean c(P10 p10, long j10) {
        return a(p10) && b(p10, j10);
    }
}
