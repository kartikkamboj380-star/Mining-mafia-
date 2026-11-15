package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2899ao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final K4.E f26639b = new C2719Yn();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final K4.E f26640c = new C2771Zn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2095Mn f26641a;

    public C2899ao(Context context, L4.a aVar, String str, RunnableC4262le0 runnableC4262le0) {
        this.f26641a = new C2095Mn(context, aVar, str, f26639b, f26640c, runnableC4262le0);
    }

    public final InterfaceC2303Qn a(String str, InterfaceC2459Tn interfaceC2459Tn, InterfaceC2407Sn interfaceC2407Sn) {
        return new C3653go(this.f26641a, str, interfaceC2459Tn, interfaceC2407Sn);
    }

    public final C4281lo b() {
        return new C4281lo(this.f26641a);
    }

    public final void c() {
        this.f26641a.c();
    }
}
