package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0356b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0356b c0356b = new DynamiteModule.b.C0356b();
        int iA = aVar.a(context, str, false);
        c0356b.f17215b = iA;
        c0356b.f17216c = iA != 0 ? 1 : 0;
        return c0356b;
    }
}
