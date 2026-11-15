package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3499fa implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28355a;

    public C3499fa(boolean z9) {
        this.f28355a = z9;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorA;
        Object objN;
        Object objN2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 496612959;
        C4001ja c4001ja = (C4001ja) obj;
        C4001ja c4001ja2 = (C4001ja) obj2;
        int i20 = c4001ja.f30492g;
        if (i20 != c4001ja2.f30492g) {
            throw new IllegalArgumentException();
        }
        int i21 = i19 ^ i18;
        try {
            if (i20 == 0) {
                throw null;
            }
            switch (i20 + i21) {
                case 0:
                    return 0;
                case 1:
                    if (this.f28355a) {
                        return c4001ja.l() != c4001ja2.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(c4001ja.m(), c4001ja2.m());
                case 3:
                    comparatorA = M9.f20777c;
                    objN = c4001ja.n();
                    objN2 = c4001ja2.n();
                    break;
                case 4:
                    objN = c4001ja.o();
                    objN2 = c4001ja2.o();
                    comparatorA = AbstractC3792hu0.a(this);
                    break;
                case 5:
                    if (this.f28355a) {
                        return c4001ja.p() != c4001ja2.p() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(c4001ja.q(), c4001ja2.q());
                default:
                    return 0;
            }
            return comparatorA.compare(objN, objN2);
        } catch (C3625ga e10) {
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
