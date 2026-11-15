package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC6050zr implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f35864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1636Dr f35865b;

    CallableC6050zr(C1636Dr c1636Dr, Context context) {
        this.f35864a = context;
        Objects.requireNonNull(c1636Dr);
        this.f35865b = c1636Dr;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C5924yr c5924yrA;
        C1636Dr c1636Dr = this.f35865b;
        WeakHashMap weakHashMapB = c1636Dr.b();
        Context context = this.f35864a;
        C1584Cr c1584Cr = (C1584Cr) weakHashMapB.get(context);
        if (c1584Cr != null) {
            if (c1584Cr.f17948a + ((Long) AbstractC2709Yi.f25688d.e()).longValue() < G4.t.o().currentTimeMillis()) {
                c5924yrA = new C5798xr(context).a();
            } else {
                c5924yrA = new C5798xr(context, c1584Cr.f17949b).a();
            }
        } else {
            c5924yrA = new C5798xr(context).a();
        }
        c1636Dr.b().put(context, new C1584Cr(c1636Dr, c5924yrA));
        return c5924yrA;
    }
}
