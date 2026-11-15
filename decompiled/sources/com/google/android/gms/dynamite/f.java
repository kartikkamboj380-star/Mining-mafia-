package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0356b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0356b c0356b = new DynamiteModule.b.C0356b();
        int iB = aVar.b(context, str);
        c0356b.f17214a = iB;
        if (iB != 0) {
            c0356b.f17216c = -1;
            return c0356b;
        }
        int iA = aVar.a(context, str, true);
        c0356b.f17215b = iA;
        if (iA != 0) {
            c0356b.f17216c = 1;
        }
        return c0356b;
    }
}
