package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.AbstractC6151i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {
    private static final g zza;
    private static final g zzb;
    private static final HashMap zzc;

    static {
        f fVar = new f();
        fVar.a("com.google.android.gms");
        fVar.b(204200000L);
        s sVar = u.f17181f;
        fVar.c(AbstractC6151i.p(sVar.J(), u.f17179d.J(), u.f17177b.J()));
        s sVar2 = u.f17180e;
        byte[] bArrJ = sVar2.J();
        s sVar3 = u.f17178c;
        fVar.d(AbstractC6151i.p(bArrJ, sVar3.J(), u.f17176a.J()));
        zza = fVar.e();
        f fVar2 = new f();
        fVar2.a("com.android.vending");
        fVar2.b(82240000L);
        fVar2.c(AbstractC6151i.m(sVar.J()));
        fVar2.d(AbstractC6151i.o(sVar2.J(), sVar3.J()));
        zzb = fVar2.e();
        zzc = new HashMap();
    }
}
