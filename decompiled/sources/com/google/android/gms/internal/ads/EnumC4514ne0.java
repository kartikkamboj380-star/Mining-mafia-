package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4514ne0 implements WL0 {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31854a;

    EnumC4514ne0(int i10) {
        this.f31854a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f31854a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f31854a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
