package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3127cc0 {
    public static H4.Z0 a(Throwable th) {
        if (th instanceof C4879qY) {
            C4879qY c4879qY = (C4879qY) th;
            return c(c4879qY.a(), c4879qY.b());
        }
        if (th instanceof C4619oU) {
            return th.getMessage() == null ? d(((C4619oU) th).a(), null, null) : d(((C4619oU) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof K4.A)) {
            return d(1, null, null);
        }
        K4.A a10 = (K4.A) th;
        return new H4.Z0(a10.a(), AbstractC4040jt0.a(a10.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static H4.Z0 b(Throwable th, C5004rY c5004rY) {
        H4.Z0 z9;
        H4.Z0 z0A = a(th);
        int i10 = z0A.f1252a;
        if ((i10 == 3 || i10 == 0) && (z9 = z0A.f1255d) != null && !z9.f1254c.equals(MobileAds.ERROR_DOMAIN)) {
            z0A.f1255d = null;
        }
        if (c5004rY != null) {
            z0A.f1256e = c5004rY.f();
        }
        return z0A;
    }

    public static H4.Z0 c(int i10, H4.Z0 z9) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) H4.B.c().d(AbstractC3892ii.D9)).intValue() > 0) {
                return z9;
            }
            i10 = 8;
        }
        return d(i10, null, z9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static H4.Z0 d(int i10, String str, H4.Z0 z9) {
        String str2;
        int i11 = i10 - 1;
        if (str == null) {
            if (i10 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i11) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) H4.B.c().d(AbstractC3892ii.G9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 0;
        int i13 = 2;
        switch (i11) {
            case 0:
            case 11:
            case 15:
                i13 = i12;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i13 = 1;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 2:
            case 10:
            case 18:
                i13 = 3;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 3:
                i12 = 8;
                i13 = i12;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 4:
            case 8:
            case 17:
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 7:
                i12 = 4;
                i13 = i12;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 12:
                if (((Integer) H4.B.c().d(AbstractC3892ii.G9)).intValue() <= 0) {
                    i12 = 9;
                    i13 = i12;
                } else {
                    i13 = 3;
                }
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 13:
                i12 = 10;
                i13 = i12;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            case 14:
                i12 = 11;
                i13 = i12;
                return new H4.Z0(i13, str3, MobileAds.ERROR_DOMAIN, z9, null);
            default:
                switch (i10) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
