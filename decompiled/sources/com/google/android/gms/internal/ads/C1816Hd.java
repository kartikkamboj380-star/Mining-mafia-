package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1816Hd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC3379ed f19328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19329i;

    public C1816Hd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, ViewOnAttachStateChangeListenerC3379ed viewOnAttachStateChangeListenerC3379ed) {
        super(c2645Xc, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", c1966Ka, i10, 53);
        this.f19328h = viewOnAttachStateChangeListenerC3379ed;
        if (viewOnAttachStateChangeListenerC3379ed != null) {
            this.f19329i = viewOnAttachStateChangeListenerC3379ed.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        if (this.f19328h != null) {
            this.f21301d.H(((Long) this.f21302e.invoke(null, Long.valueOf(this.f19329i))).longValue());
        }
    }
}
