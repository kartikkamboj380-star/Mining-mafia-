package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5896yd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5894yc f35421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f35422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f35423j;

    public C5896yd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, C5894yc c5894yc, long j10, long j11) {
        super(c2645Xc, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", c1966Ka, i10, 11);
        this.f35421h = c5894yc;
        this.f35422i = j10;
        this.f35423j = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        C5894yc c5894yc = this.f35421h;
        if (c5894yc != null) {
            C5642wc c5642wc = new C5642wc((String) this.f21302e.invoke(null, c5894yc.b(), Long.valueOf(this.f35422i), Long.valueOf(this.f35423j)));
            C1966Ka c1966Ka = this.f21301d;
            synchronized (c1966Ka) {
                try {
                    c1966Ka.u0(c5642wc.f34602b.longValue());
                    if (c5642wc.f34603c.longValue() >= 0) {
                        c1966Ka.b0(c5642wc.f34603c.longValue());
                    }
                    if (c5642wc.f34604d.longValue() >= 0) {
                        c1966Ka.c0(c5642wc.f34604d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
