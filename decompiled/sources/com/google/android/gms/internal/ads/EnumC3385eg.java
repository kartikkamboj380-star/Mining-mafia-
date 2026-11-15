package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3385eg implements WL0 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final XL0 f28047v = new XL0() { // from class: com.google.android.gms.internal.ads.eg.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28049a;

    EnumC3385eg(int i10) {
        this.f28049a = i10;
    }

    public static EnumC3385eg c(int i10) {
        switch (i10) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static YL0 d() {
        return C3511fg.f28456a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f28049a);
    }

    @Override // com.google.android.gms.internal.ads.WL0
    public final int zza() {
        return this.f28049a;
    }
}
