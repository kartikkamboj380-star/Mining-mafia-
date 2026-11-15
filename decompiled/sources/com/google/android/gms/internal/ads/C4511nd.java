package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4511nd extends AbstractCallableC2127Nd {
    public C4511nd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", c1966Ka, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        C1966Ka c1966Ka = this.f21301d;
        c1966Ka.s0(-1L);
        c1966Ka.t0(-1L);
        int[] iArr = (int[]) this.f21302e.invoke(null, this.f21298a.b());
        synchronized (c1966Ka) {
            try {
                c1966Ka.s0(iArr[0]);
                c1966Ka.t0(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    c1966Ka.R(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
