package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2129Ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2181Oe f21305a;

    RunnableC2129Ne(C2181Oe c2181Oe) {
        Objects.requireNonNull(c2181Oe);
        this.f21305a = c2181Oe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2181Oe c2181Oe = this.f21305a;
        synchronized (c2181Oe.f()) {
            if (c2181Oe.g().get() && c2181Oe.h()) {
                c2181Oe.g().set(false);
                int i10 = AbstractC0786o0.f2696b;
                L4.p.a("App went background");
                Iterator it = c2181Oe.i().iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC2233Pe) it.next()).h0(false);
                    } catch (Exception e10) {
                        L4.p.d("", e10);
                    }
                }
            } else {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.a("App is still foreground");
            }
        }
    }
}
