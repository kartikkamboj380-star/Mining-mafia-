package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class YC implements InterfaceC5520ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1750Fw f25562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f25563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f25564c = new AtomicReference();

    YC(InterfaceC1750Fw interfaceC1750Fw, Executor executor) {
        this.f25562a = interfaceC1750Fw;
        this.f25563b = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final synchronized void s0(C5394ue c5394ue) {
        final InterfaceC1750Fw interfaceC1750Fw = this.f25562a;
        if (interfaceC1750Fw != null) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.ce)).booleanValue()) {
                if (c5394ue.f33869j) {
                    AtomicReference atomicReference = this.f25564c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f25563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.XC
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                interfaceC1750Fw.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.f25564c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f25563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.WC
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                interfaceC1750Fw.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
