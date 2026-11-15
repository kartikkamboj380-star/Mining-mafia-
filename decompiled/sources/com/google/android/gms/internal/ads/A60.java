package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class A60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17245b;

    public A60(String str, int i10) {
        this.f17244a = str;
        this.f17245b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putString("request_id", this.f17244a);
        if (this.f17245b == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AF) obj).f17276b.putString("request_id", this.f17244a);
    }
}
