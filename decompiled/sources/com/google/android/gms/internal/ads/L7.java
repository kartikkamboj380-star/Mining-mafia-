package com.google.android.gms.internal.ads;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class L7 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f20384a = new P10(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4689p2 f20385b = new C4689p2(-1, -1, ClipboardModule.MIMETYPE_WEBP);

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f20385b.d(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        P10 p10 = this.f20384a;
        p10.z(4);
        C5946z1 c5946z1 = (C5946z1) j10;
        c5946z1.H(p10.H(), 0, 4, false);
        if (p10.Y() == 1380533830) {
            c5946z1.c(4, false);
            p10.z(4);
            c5946z1.H(p10.H(), 0, 4, false);
            if (p10.Y() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f20385b.f(l10);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        return this.f20385b.g(j10, c3933j2);
    }
}
