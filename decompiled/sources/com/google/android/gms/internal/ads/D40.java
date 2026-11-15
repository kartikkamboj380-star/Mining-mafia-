package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class D40 implements InterfaceC3732hQ0 {
    public static D40 a() {
        return C40.f17780a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        Object arrayList = new ArrayList();
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.jd;
        if (!((String) H4.B.c().d(abstractC2759Zh)).isEmpty()) {
            arrayList = Arrays.asList(((String) H4.B.c().d(abstractC2759Zh)).split(","));
        }
        AbstractC4738pQ0.b(arrayList);
        return arrayList;
    }
}
