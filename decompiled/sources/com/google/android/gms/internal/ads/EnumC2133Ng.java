package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2133Ng implements WL0 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final XL0 f21312f = new XL0() { // from class: com.google.android.gms.internal.ads.Ng.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21314a;

    EnumC2133Ng(int i10) {
        this.f21314a = i10;
    }

    public static EnumC2133Ng c(int i10) {
        if (i10 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i10 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i10 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static YL0 d() {
        return C2185Og.f21629a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21314a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f21314a;
    }
}
