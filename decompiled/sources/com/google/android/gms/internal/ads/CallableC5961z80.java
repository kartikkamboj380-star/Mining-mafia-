package com.google.android.gms.internal.ads;

import K4.AbstractC0780l0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CallableC5961z80 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ CallableC5961z80 f35660a = new CallableC5961z80();

    private /* synthetic */ CallableC5961z80() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap map = new HashMap();
        String str = (String) H4.B.c().d(AbstractC3892ii.f29969t0);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) H4.B.c().d(AbstractC3892ii.f29980u0)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, AbstractC0780l0.a(str2));
                }
            }
        }
        return new B80(map);
    }
}
