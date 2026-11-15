package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4889qd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32690h;

    public C4889qd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, long j10, int i10, int i11) {
        super(c2645Xc, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", c1966Ka, i10, 25);
        this.f32690h = j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        long jLongValue = ((Long) this.f21302e.invoke(null, null)).longValue();
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            try {
                c1966Ka.i0(jLongValue);
                long j10 = this.f32690h;
                if (j10 != 0) {
                    c1966Ka.z0(jLongValue - j10);
                    c1966Ka.C0(j10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
