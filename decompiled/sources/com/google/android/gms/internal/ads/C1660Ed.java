package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1660Ed extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18531h;

    public C1660Ed(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", c1966Ka, i10, 61);
        this.f18531h = c2645Xc.j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        long jLongValue = ((Long) this.f21302e.invoke(null, this.f21298a.b(), Boolean.valueOf(this.f18531h))).longValue();
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.V(jLongValue);
        }
    }
}
