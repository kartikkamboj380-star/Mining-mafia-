package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5959z70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f35646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f35647b;

    /* synthetic */ C5959z70(String str, int i10, byte[] bArr) {
        this.f35646a = str;
        this.f35647b = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AF af = (AF) obj;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Sb)).booleanValue()) {
            String str = this.f35646a;
            if (!TextUtils.isEmpty(str)) {
                af.f17275a.putString("topics", str);
            }
            int i10 = this.f35647b;
            if (i10 != -1) {
                af.f17275a.putInt("atps", i10);
            }
        }
    }
}
