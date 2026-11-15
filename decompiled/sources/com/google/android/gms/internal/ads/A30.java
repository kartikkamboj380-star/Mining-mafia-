package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class A30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H4.s2 f17234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17235b;

    public A30(H4.s2 s2Var, boolean z9) {
        this.f17234a = s2Var;
        this.f17235b = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29975t6)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f17235b);
        }
        H4.s2 s2Var = this.f17234a;
        if (s2Var != null) {
            int i10 = s2Var.f1431a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
