package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5725xG0 implements WL0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34783a;

    EnumC5725xG0(int i10) {
        this.f34783a = i10;
    }

    public static EnumC5725xG0 c(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 == 4) {
            return CRUNCHY;
        }
        if (i10 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34783a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f34783a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
