package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4265lg implements WL0 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final XL0 f31325e = new XL0() { // from class: com.google.android.gms.internal.ads.lg.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31327a;

    EnumC4265lg(int i10) {
        this.f31327a = i10;
    }

    public static EnumC4265lg c(int i10) {
        if (i10 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return CELL;
        }
        if (i10 != 2) {
            return null;
        }
        return WIFI;
    }

    public static YL0 d() {
        return C4391mg.f31561a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f31327a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f31327a;
    }
}
