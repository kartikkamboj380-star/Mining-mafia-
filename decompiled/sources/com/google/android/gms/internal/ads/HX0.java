package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class HX0 implements KX0 {
    HX0() {
    }

    @Override // com.google.android.gms.internal.ads.KX0
    public final int a(JY0 jy0) {
        return jy0.f19933s != null ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.KX0
    public final DX0 b(FX0 fx0, JY0 jy0) {
        if (jy0.f19933s == null) {
            return null;
        }
        return new LX0(new CX0(new MX0(1), 6001));
    }
}
