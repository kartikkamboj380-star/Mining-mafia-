package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class L60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f20382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20383c;

    public L60(String str, Bundle bundle, String str2) {
        this.f20381a = str;
        this.f20382b = bundle;
        this.f20383c = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putString("rtb", this.f20381a);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29787c5)).booleanValue()) {
            String str = this.f20383c;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.f20382b;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
