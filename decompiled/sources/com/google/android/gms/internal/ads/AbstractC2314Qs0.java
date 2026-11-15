package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2314Qs0 implements Serializable {
    AbstractC2314Qs0() {
    }

    public static AbstractC2314Qs0 c() {
        return C5927ys0.f35474a;
    }

    public static AbstractC2314Qs0 d(Object obj) {
        return obj == null ? C5927ys0.f35474a : new C2678Xs0(obj);
    }

    public abstract Object a(Object obj);

    public abstract AbstractC2314Qs0 b(InterfaceC1899Is0 interfaceC1899Is0);
}
