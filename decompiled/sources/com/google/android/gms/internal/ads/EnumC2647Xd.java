package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2647Xd implements WL0 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25348a;

    EnumC2647Xd(int i10) {
        this.f25348a = i10;
    }

    public static EnumC2647Xd c(int i10) {
        if (i10 == 0) {
            return UNSUPPORTED;
        }
        if (i10 == 2) {
            return ARM7;
        }
        if (i10 == 999) {
            return UNKNOWN;
        }
        if (i10 == 4) {
            return X86;
        }
        if (i10 == 5) {
            return ARM64;
        }
        if (i10 == 6) {
            return X86_64;
        }
        if (i10 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static YL0 d() {
        return C2595Wd.f24831a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f25348a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f25348a;
    }
}
