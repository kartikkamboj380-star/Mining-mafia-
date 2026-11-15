package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class KI implements IH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20164a = ((Integer) H4.B.c().d(AbstractC3892ii.f29631N1)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20165b = ((Integer) H4.B.c().d(AbstractC3892ii.re)).intValue();

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
    }

    public final synchronized int a() {
        return this.f20164a;
    }

    public final synchronized int b() {
        return this.f20165b;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final synchronized void i(C5011rb0 c5011rb0) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29641O1)).booleanValue()) {
            try {
                C3880ib0 c3880ib0 = c5011rb0.f32991b.f32672b;
                this.f20164a = c3880ib0.f29456c;
                this.f20165b = c3880ib0.f29457d;
            } catch (NullPointerException unused) {
            }
        }
    }
}
