package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1568Cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f17928a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f17929b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static InterfaceC1464Aj a() {
        return (InterfaceC1464Aj) f17928a.get();
    }

    static InterfaceC1516Bj b() {
        p070h.w.a(f17929b.get());
        return null;
    }

    public static void c(InterfaceC1464Aj interfaceC1464Aj) {
        f17928a.set(interfaceC1464Aj);
    }
}
