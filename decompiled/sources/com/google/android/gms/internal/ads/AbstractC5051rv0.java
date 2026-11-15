package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5051rv0 implements Comparator {
    protected AbstractC5051rv0() {
    }

    public static AbstractC5051rv0 b() {
        return C4800pv0.f32502a;
    }

    public static AbstractC5051rv0 c(Comparator comparator) {
        return new C3666gu0(comparator);
    }

    public AbstractC5051rv0 a() {
        return new C1541Bv0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final AbstractC5051rv0 d(InterfaceC1899Is0 interfaceC1899Is0) {
        return new C2420St0(interfaceC1899Is0, this);
    }
}
