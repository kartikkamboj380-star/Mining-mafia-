package com.google.ads.mediation.unity;

import B4.C0564a;
import B4.m;
import B4.t;
import N4.o;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.google.ads.mediation.unity.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f16742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f16743d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f16743d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16743d[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f16742c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16742c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16742c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16742c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16742c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            f16741b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16741b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16741b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            f16740a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16740a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16740a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16740a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public enum b {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    static C0564a b(int i10, String str) {
        return new C0564a(i10, str, "com.unity3d.ads");
    }

    static C0564a c(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return b(g(unityAdsInitializationError), str);
    }

    static C0564a d(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return b(h(unityAdsLoadError), str);
    }

    static C0564a e(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return b(i(unityAdsShowError), str);
    }

    static B4.b f(P4.a aVar) {
        Iterator it = aVar.a().iterator();
        if (it.hasNext()) {
            return ((o) it.next()).a();
        }
        return null;
    }

    static int g(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i10 = C0354a.f16741b[unityAdsInitializationError.ordinal()];
        if (i10 == 1) {
            return 301;
        }
        if (i10 != 2) {
            return i10 != 3 ? 300 : 303;
        }
        return 302;
    }

    static int h(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i10 = C0354a.f16742c[unityAdsLoadError.ordinal()];
        if (i10 == 1) {
            return TTAdConstant.MATE_IS_NULL_CODE;
        }
        if (i10 == 2) {
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        }
        if (i10 == 3) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (i10 != 4) {
            return i10 != 5 ? CommonGatewayClient.CODE_400 : TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_CODE;
    }

    static int i(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (C0354a.f16743d[unityAdsShowError.ordinal()]) {
            case 1:
                return PglCryptUtils.LOAD_SO_FAILED;
            case 2:
                return PglCryptUtils.INPUT_INVALID;
            case 3:
                return PglCryptUtils.COMPRESS_FAILED;
            case 4:
                return PglCryptUtils.BASE64_FAILED;
            case 5:
                return PglCryptUtils.ENCRYPT_FAILED;
            case 6:
                return PglCryptUtils.DECRYPT_FAILED;
            case 7:
                return PglCryptUtils.UNKNOWN_ERR;
            case 8:
                return 508;
            default:
                return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        }
    }

    static int j(BannerErrorInfo bannerErrorInfo) {
        int i10 = C0354a.f16740a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 == 1) {
            return 201;
        }
        if (i10 == 2) {
            return 202;
        }
        if (i10 == 3) {
            return 203;
        }
        if (i10 != 4) {
            return TTAdConstant.MATE_VALID;
        }
        return 204;
    }

    public static UnityBannerSize k(Context context, B4.f fVar, boolean z9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(B4.f.f226i);
        arrayList.add(B4.f.f229l);
        B4.f fVarA = m.a(context, fVar, arrayList);
        if (fVarA != null) {
            return new UnityBannerSize(fVarA.f(), fVarA.c());
        }
        if (z9) {
            return new UnityBannerSize(fVar.f(), fVar.c());
        }
        return null;
    }

    public static void l(t tVar, MetaData metaData) {
        if (m(tVar)) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }

    private static boolean m(t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        if (iC == 1 || iD == 1) {
            return false;
        }
        return iC == 0 || iD == 0;
    }
}
