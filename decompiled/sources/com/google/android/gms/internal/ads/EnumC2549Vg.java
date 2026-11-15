package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2549Vg implements WL0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final XL0 f24337d = new XL0() { // from class: com.google.android.gms.internal.ads.Vg.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24339a;

    EnumC2549Vg(int i10) {
        this.f24339a = i10;
    }

    public static EnumC2549Vg c(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static YL0 d() {
        return C2601Wg.f24857a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24339a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f24339a;
    }
}
