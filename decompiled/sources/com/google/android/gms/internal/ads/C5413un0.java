package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.un0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5413un0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f33895f;

    C5413un0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Map map, C5043rr0 c5043rr0) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(118));
        this.f33895f = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Map map = this.f33895f;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (c1966Ka) {
            try {
                c1966Ka.u0(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    c1966Ka.b0(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    c1966Ka.c0(jLongValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
