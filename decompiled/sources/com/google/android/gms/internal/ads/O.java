package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface O extends Executor {
    static O J(Executor executor, InterfaceC3977jO interfaceC3977jO) {
        return new N(executor, interfaceC3977jO);
    }

    void zza();
}
