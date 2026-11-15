package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6188d6 extends AbstractC6170b6 {
    C6188d6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6170b6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        AbstractC6205f5 abstractC6205f5 = (AbstractC6205f5) obj;
        C6179c6 c6179c6 = abstractC6205f5.zzc;
        if (c6179c6 != C6179c6.a()) {
            return c6179c6;
        }
        C6179c6 c6179c6B = C6179c6.b();
        abstractC6205f5.zzc = c6179c6B;
        return c6179c6B;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6170b6
    final void b(Object obj) {
        ((AbstractC6205f5) obj).zzc.d();
    }
}
