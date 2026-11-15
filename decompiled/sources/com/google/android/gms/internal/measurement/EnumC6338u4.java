package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6338u4 implements InterfaceC6223h5 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36925a;

    EnumC6338u4(int i10) {
        this.f36925a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f36925a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6223h5
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f36925a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
