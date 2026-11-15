package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4133kd extends AbstractCallableC2127Nd {
    public C4133kd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", c1966Ka, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() throws InvocationTargetException {
        C1966Ka c1966Ka = this.f21301d;
        c1966Ka.l0(3);
        try {
            int i10 = 1;
            if (true == ((Boolean) this.f21302e.invoke(null, this.f21298a.b())).booleanValue()) {
                i10 = 2;
            }
            c1966Ka.l0(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
