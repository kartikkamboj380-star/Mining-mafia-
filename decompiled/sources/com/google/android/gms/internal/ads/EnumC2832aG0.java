package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2832aG0 implements WL0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26466a;

    EnumC2832aG0(int i10) {
        this.f26466a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f26466a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f26466a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
