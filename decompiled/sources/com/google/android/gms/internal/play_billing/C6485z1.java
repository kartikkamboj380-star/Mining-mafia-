package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6485z1 extends AbstractC6477x1 {
    C6485z1() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ int a(Object obj) {
        return ((C6481y1) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ int b(Object obj) {
        return ((C6481y1) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC6445p0 abstractC6445p0 = (AbstractC6445p0) obj;
        C6481y1 c6481y1 = abstractC6445p0.zzc;
        if (c6481y1 != C6481y1.c()) {
            return c6481y1;
        }
        C6481y1 c6481y1F = C6481y1.f();
        abstractC6445p0.zzc = c6481y1F;
        return c6481y1F;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ Object d(Object obj) {
        return ((AbstractC6445p0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!C6481y1.c().equals(obj2)) {
            if (C6481y1.c().equals(obj)) {
                return C6481y1.e((C6481y1) obj, (C6481y1) obj2);
            }
            ((C6481y1) obj).d((C6481y1) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((C6481y1) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final void g(Object obj) {
        ((AbstractC6445p0) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC6445p0) obj).zzc = (C6481y1) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ void i(Object obj, P1 p10) {
        ((C6481y1) obj).k(p10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6477x1
    final /* synthetic */ void j(Object obj, P1 p10) {
        ((C6481y1) obj).l(p10);
    }
}
