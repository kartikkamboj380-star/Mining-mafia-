package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17192c;

    /* synthetic */ w(String str, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, byte[] bArr) {
        this.f17190a = str;
        this.f17191b = z9;
        this.f17192c = z12;
    }

    final boolean a() {
        return this.f17192c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    final zzp b(Context context) {
        return new zzp(this.f17190a, this.f17191b, false, com.google.android.gms.dynamic.b.N0(context), false, true, false);
    }
}
