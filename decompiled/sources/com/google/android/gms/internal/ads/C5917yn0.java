package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5917yn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f35442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f35443g;

    C5917yn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, Map map, Context context, C5043rr0 c5043rr0) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(120));
        this.f35442f = context;
        this.f35443g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l10 = (Long) method.invoke("", this.f35442f);
                if (l10 == null) {
                    throw null;
                }
                lValueOf = l10;
            } else {
                com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) this.f35443g.get("gs");
                if (pVar != null && pVar.isDone()) {
                    lValueOf = Long.valueOf(((C4255lb) pVar.get()).c1());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (c1966Ka) {
            c1966Ka.W(lValueOf.longValue());
        }
    }
}
