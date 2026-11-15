package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6123s1 extends AbstractC6115p1 {
    C6123s1() {
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6115p1
    final /* synthetic */ Object a(Object obj) {
        return ((C0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6115p1
    final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        if (!C6120r1.a().equals(obj2)) {
            if (C6120r1.a().equals(obj)) {
                return C6120r1.c((C6120r1) obj, (C6120r1) obj2);
            }
            ((C6120r1) obj).b((C6120r1) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6115p1
    final void c(Object obj) {
        ((C0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6115p1
    final /* synthetic */ void d(Object obj, Object obj2) {
        ((C0) obj).zzc = (C6120r1) obj2;
    }
}
