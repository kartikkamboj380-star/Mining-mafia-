package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5897yd0 {
    public static final C1661Ed0 a(com.google.common.util.concurrent.p pVar, Object obj, AbstractC1713Fd0 abstractC1713Fd0) {
        return new C1661Ed0(abstractC1713Fd0, obj, null, AbstractC1713Fd0.f18800d, Collections.EMPTY_LIST, pVar, null);
    }

    public static final C1661Ed0 b(Callable callable, Object obj, AbstractC1713Fd0 abstractC1713Fd0) {
        return c(callable, abstractC1713Fd0.e(), obj, abstractC1713Fd0);
    }

    public static final C1661Ed0 c(Callable callable, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Object obj, AbstractC1713Fd0 abstractC1713Fd0) {
        return new C1661Ed0(abstractC1713Fd0, obj, null, AbstractC1713Fd0.f18800d, Collections.EMPTY_LIST, interfaceExecutorServiceC1805Gx0.e0(callable), null);
    }

    public static final C1661Ed0 d(final InterfaceC5267td0 interfaceC5267td0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Object obj, AbstractC1713Fd0 abstractC1713Fd0) {
        return c(new Callable() { // from class: com.google.android.gms.internal.ads.xd0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                interfaceC5267td0.zza();
                return null;
            }
        }, interfaceExecutorServiceC1805Gx0, obj, abstractC1713Fd0);
    }
}
