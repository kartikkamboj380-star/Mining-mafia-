package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1512Bh implements WL0 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final XL0 f17681e = new XL0() { // from class: com.google.android.gms.internal.ads.Bh.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17683a;

    EnumC1512Bh(int i10) {
        this.f17683a = i10;
    }

    public static EnumC1512Bh c(int i10) {
        if (i10 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i10 == 1) {
            return IOS;
        }
        if (i10 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static YL0 d() {
        return C1564Ch.f17921a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17683a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f17683a;
    }
}
