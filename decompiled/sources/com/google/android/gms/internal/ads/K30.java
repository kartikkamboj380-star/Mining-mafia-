package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class K30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f20052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f20053b;

    public K30(String str, int i10) {
        this.f20052a = str;
        this.f20053b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = ((AF) obj).f17275a;
        String str = this.f20052a;
        if (TextUtils.isEmpty(str) || (i10 = this.f20053b) == -1) {
            return;
        }
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", str);
        bundleA.putInt("pvid_s", i10);
    }
}
