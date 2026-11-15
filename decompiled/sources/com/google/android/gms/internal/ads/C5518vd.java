package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518vd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f34143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f34144i = new Object();

    public C5518vd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", c1966Ka, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        if (f34143h == null) {
            synchronized (f34144i) {
                try {
                    if (f34143h == null) {
                        f34143h = (Long) this.f21302e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.B0(f34143h.longValue());
        }
    }
}
