package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1668Eh implements WL0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final XL0 f18545e = new XL0() { // from class: com.google.android.gms.internal.ads.Eh.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18547a;

    EnumC1668Eh(int i10) {
        this.f18547a = i10;
    }

    public static EnumC1668Eh c(int i10) {
        if (i10 == 0) {
            return ENUM_FALSE;
        }
        if (i10 == 1) {
            return ENUM_TRUE;
        }
        if (i10 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static YL0 d() {
        return C1720Fh.f18815a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18547a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f18547a;
    }
}
