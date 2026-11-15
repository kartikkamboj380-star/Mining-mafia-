package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3074cC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2949bC f27062a;

    private C3074cC(C2949bC c2949bC) {
        this.f27062a = c2949bC;
    }

    public static C3074cC b(C2949bC c2949bC) {
        return new C3074cC(c2949bC);
    }

    public final ViewGroup a() {
        return this.f27062a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f27062a.a();
    }
}
