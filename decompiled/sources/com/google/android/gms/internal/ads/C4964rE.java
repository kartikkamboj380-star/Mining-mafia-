package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4964rE implements InterfaceC0580a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5468vE f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f32862b;

    C4964rE(C5468vE c5468vE, C6019zb0 c6019zb0) {
        this.f32861a = c5468vE;
        this.f32862b = c6019zb0;
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        this.f32861a.a(this.f32862b.f35798g);
    }
}
