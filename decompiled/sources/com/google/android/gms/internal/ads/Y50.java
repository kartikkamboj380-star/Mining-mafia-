package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class Y50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3376eb0 f25536a;

    public Y50(C3376eb0 c3376eb0) {
        this.f25536a = c3376eb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AF af = (AF) obj;
        C3376eb0 c3376eb0 = this.f25536a;
        if (c3376eb0 != null) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.td)).booleanValue()) {
                return;
            }
            Bundle bundle = af.f17275a;
            bundle.putBoolean("render_in_browser", c3376eb0.b());
            bundle.putBoolean("disable_ml", c3376eb0.c());
        }
    }
}
