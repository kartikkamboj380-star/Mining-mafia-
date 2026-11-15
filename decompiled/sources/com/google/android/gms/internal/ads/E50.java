package com.google.android.gms.internal.ads;

import Q4.AbstractC0928c;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class E50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f18383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f18384b;

    E50(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C6019zb0 c6019zb0) {
        this.f18383a = interfaceExecutorServiceC1805Gx0;
        this.f18384b = c6019zb0;
    }

    final /* synthetic */ F50 a() {
        return new F50("requester_type_2".equals(AbstractC0928c.c(this.f18384b.f35795d)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f18383a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.D50
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f18075a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 21;
    }
}
