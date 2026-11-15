package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5272tg implements WL0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final XL0 f33450h = new XL0() { // from class: com.google.android.gms.internal.ads.tg.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33452a;

    EnumC5272tg(int i10) {
        this.f33452a = i10;
    }

    public static EnumC5272tg c(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONNECTING;
        }
        if (i10 == 2) {
            return CONNECTED;
        }
        if (i10 == 3) {
            return DISCONNECTING;
        }
        if (i10 == 4) {
            return DISCONNECTED;
        }
        if (i10 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static YL0 d() {
        return C5398ug.f33875a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33452a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f33452a;
    }
}
