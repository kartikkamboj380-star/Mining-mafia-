package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4013jg implements WL0 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final XL0 f30523f = new XL0() { // from class: com.google.android.gms.internal.ads.jg.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30525a;

    EnumC4013jg(int i10) {
        this.f30525a = i10;
    }

    public static EnumC4013jg c(int i10) {
        if (i10 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return TWO_G;
        }
        if (i10 == 2) {
            return THREE_G;
        }
        if (i10 != 4) {
            return null;
        }
        return LTE;
    }

    public static YL0 d() {
        return C4139kg.f30852a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30525a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f30525a;
    }
}
