package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4645oh implements WL0 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final XL0 f32169m = new XL0() { // from class: com.google.android.gms.internal.ads.oh.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32171a;

    EnumC4645oh(int i10) {
        this.f32171a = i10;
    }

    public static EnumC4645oh c(int i10) {
        switch (i10) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static YL0 d() {
        return C4771ph.f32452a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32171a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f32171a;
    }
}
