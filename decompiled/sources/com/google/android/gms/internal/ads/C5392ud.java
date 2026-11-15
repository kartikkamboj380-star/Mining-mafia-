package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5392ud extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f33854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f33855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f33856j;

    public C5392ud(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, Map map, View view, Context context) {
        super(c2645Xc, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", c1966Ka, i10, 85);
        this.f33854h = map;
        this.f33855i = view;
        this.f33856j = context;
    }

    private final long b(int i10) {
        Map map = this.f33854h;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) map.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        long[] jArr = {b(1), b(2)};
        Context contextB = this.f33856j;
        if (contextB == null) {
            contextB = this.f21298a.b();
        }
        long[] jArr2 = (long[]) this.f21302e.invoke(null, jArr, contextB, this.f33855i);
        long j10 = jArr2[0];
        Map map = this.f33854h;
        map.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.d0(j10);
            c1966Ka.e0(j11);
        }
    }
}
