package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2162Nu0 extends AbstractC5425ut0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f21393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC2470Ts0 f21394d;

    C2162Nu0(Iterator it, InterfaceC2470Ts0 interfaceC2470Ts0) {
        this.f21393c = it;
        this.f21394d = interfaceC2470Ts0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5425ut0
    protected final Object a() {
        InterfaceC2470Ts0 interfaceC2470Ts0;
        Object next;
        do {
            Iterator it = this.f21393c;
            if (!it.hasNext()) {
                b();
                return null;
            }
            interfaceC2470Ts0 = this.f21394d;
            next = it.next();
        } while (!interfaceC2470Ts0.zza(next));
        return next;
    }
}
