package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3044bx0 extends AbstractC1855Hw0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AbstractC2738Yw0 f26960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C1701Ex0 f26961k = new C1701Ex0(AbstractC3044bx0.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile Set f26962h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    volatile int f26963i;

    static {
        Throwable th;
        AbstractC2738Yw0 c2918ax0;
        byte[] bArr = null;
        try {
            c2918ax0 = new C2790Zw0(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c2918ax0 = new C2918ax0(bArr);
        }
        f26960j = c2918ax0;
        if (th != null) {
            f26961k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC3044bx0(int i10) {
        this.f26963i = i10;
    }

    final Set B() {
        Set set = this.f26962h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        D(setNewSetFromMap);
        f26960j.a(this, null, setNewSetFromMap);
        Set set2 = this.f26962h;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int C() {
        return f26960j.b(this);
    }

    abstract void D(Set set);
}
