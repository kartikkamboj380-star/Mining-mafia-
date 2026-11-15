package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4988rQ implements InterfaceC5472vG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1750Fw f32897a;

    C4988rQ(InterfaceC1750Fw interfaceC1750Fw) {
        this.f32897a = interfaceC1750Fw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void P(Context context) {
        InterfaceC1750Fw interfaceC1750Fw = this.f32897a;
        if (interfaceC1750Fw != null) {
            interfaceC1750Fw.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void e(Context context) {
        InterfaceC1750Fw interfaceC1750Fw = this.f32897a;
        if (interfaceC1750Fw != null) {
            interfaceC1750Fw.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void h(Context context) {
        InterfaceC1750Fw interfaceC1750Fw = this.f32897a;
        if (interfaceC1750Fw != null) {
            interfaceC1750Fw.onResume();
        }
    }
}
