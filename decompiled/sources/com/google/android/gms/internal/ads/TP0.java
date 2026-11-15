package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class TP0 extends YP0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f23506a;

    public TP0(String str) {
        this.f23506a = str;
    }

    @Override // com.google.android.gms.internal.ads.YP0
    public final void a(String str) {
        String str2 = this.f23506a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
