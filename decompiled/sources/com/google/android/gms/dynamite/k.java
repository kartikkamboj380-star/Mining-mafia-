package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class k implements DynamiteModule.b {
    k() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0356b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0356b c0356b = new DynamiteModule.b.C0356b();
        int iB = aVar.b(context, str);
        c0356b.f17214a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0356b.f17215b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0356b.f17215b = iA;
        }
        int i12 = c0356b.f17214a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0356b.f17216c = i10;
            return c0356b;
        }
        i11 = i12;
        if (iA < i11) {
            i10 = -1;
        }
        c0356b.f17216c = i10;
        return c0356b;
    }
}
