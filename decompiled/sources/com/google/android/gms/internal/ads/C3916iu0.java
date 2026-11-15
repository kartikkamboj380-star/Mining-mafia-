package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3916iu0 extends AbstractC4168ku0 {
    C3916iu0() {
        super(null);
    }

    static final AbstractC4168ku0 j(int i10) {
        if (i10 < 0) {
            return AbstractC4168ku0.f30896b;
        }
        return i10 > 0 ? AbstractC4168ku0.f30897c : AbstractC4168ku0.f30895a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4168ku0
    public final AbstractC4168ku0 a(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4168ku0
    public final AbstractC4168ku0 b(int i10, int i11) {
        return j(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4168ku0
    public final AbstractC4168ku0 c(boolean z9, boolean z10) {
        return j(Boolean.compare(z10, z9));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4168ku0
    public final AbstractC4168ku0 d(boolean z9, boolean z10) {
        return j(Boolean.compare(z9, z10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4168ku0
    public final int e() {
        return 0;
    }
}
