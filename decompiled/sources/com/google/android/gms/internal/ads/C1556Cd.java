package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1556Cd extends AbstractCallableC2127Nd {
    public C1556Cd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", c1966Ka, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        try {
            boolean zBooleanValue = ((Boolean) this.f21302e.invoke(null, this.f21298a.b())).booleanValue();
            C1966Ka c1966Ka = this.f21301d;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            c1966Ka.n0(i10);
        } catch (InvocationTargetException unused) {
            this.f21301d.n0(3);
        }
    }
}
