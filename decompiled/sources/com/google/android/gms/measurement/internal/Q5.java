package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC6329t4;
import com.google.android.gms.internal.measurement.EnumC6338u4;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Y5.j f37690a = Y5.j.s("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean c(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        int i15;
        int i16;
        Y5.l lVar2;
        String str4;
        P5 p10;
        char c10;
        int iE = e(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i14, str, str2, str3, z9, z10, true) == EnumC6338u4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC6329t4 == EnumC6329t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                lVar2 = lVar;
                str4 = str;
                if (i17 == 1) {
                    if (lVar2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                lVar2 = lVar;
                str4 = str;
            }
            if (kVar.containsKey(enumC6329t4) && (p10 = (P5) kVar.get(enumC6329t4)) != null) {
                int iOrdinal = p10.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true) == EnumC6338u4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true) : g(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true);
                        }
                        if (iOrdinal == 3) {
                            return i(enumC6329t4, kVar, kVar2, lVar2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z9, z10, true) == EnumC6338u4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true) : h(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true);
                        }
                        c10 = '0';
                    } else if (i(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true) != EnumC6338u4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true);
                    }
                } else if (i(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true) != EnumC6338u4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z9, z10, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        if (!z11) {
            return Y5.k.i();
        }
        EnumC6329t4 enumC6329t4 = EnumC6329t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC6338u4 enumC6338u4 = (EnumC6338u4) kVar2.get(enumC6329t4);
        EnumC6329t4 enumC6329t5 = EnumC6329t4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC6338u4 enumC6338u5 = (EnumC6338u4) kVar2.get(enumC6329t5);
        EnumC6329t4 enumC6329t6 = EnumC6329t4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC6338u4 enumC6338u6 = (EnumC6338u4) kVar2.get(enumC6329t6);
        EnumC6329t4 enumC6329t7 = EnumC6329t4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC6338u4 enumC6338u7 = (EnumC6338u4) kVar2.get(enumC6329t7);
        Y5.k.a aVarF = Y5.k.a().f("Version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        String str4 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        Y5.k.a aVarI = aVarF.f("VendorConsent", true != z9 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).f("VendorLegitimateInterest", true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).f("gdprApplies", i12 != 1 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC6338u4 != null ? enumC6338u4.zza() : EnumC6338u4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC6338u5 != null ? enumC6338u5.zza() : EnumC6338u4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC6338u6 != null ? enumC6338u6.zza() : EnumC6338u4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC6338u7 != null ? enumC6338u7.zza() : EnumC6338u4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(Y5.k.j("Purpose1", f(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true), "Purpose3", f(enumC6329t5, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true), "Purpose4", f(enumC6329t6, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true), "Purpose7", f(enumC6329t7, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true)));
        Object obj = true != c(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true) ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        Object obj2 = true != c(enumC6329t5, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true) ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        Object obj3 = true != c(enumC6329t6, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true) ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        if (true != c(enumC6329t7, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true)) {
            str4 = "0";
        }
        return aVarI.i(Y5.k.k("AuthorizePurpose1", obj, "AuthorizePurpose3", obj2, "AuthorizePurpose4", obj3, "AuthorizePurpose7", str4, "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int e(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        if (enumC6329t4 == EnumC6329t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC6329t4 == EnumC6329t4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC6329t4 == EnumC6329t4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC6329t4 == EnumC6329t4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < enumC6329t4.zza()) ? "0" : String.valueOf(str2.charAt(enumC6329t4.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC6329t4.zza()) {
            strValueOf = String.valueOf(str3.charAt(enumC6329t4.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean g(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        char c10;
        int iE = e(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true);
        if (!z9) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC6329t4.zza()) {
                char cCharAt = str2.charAt(enumC6329t4.zza() - 1);
                boolean z12 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z12;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final boolean h(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        char c10;
        int iE = e(enumC6329t4, kVar, kVar2, lVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z9, z10, true);
        if (!z10) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC6329t4.zza()) {
                char cCharAt = str3.charAt(enumC6329t4.zza() - 1);
                boolean z12 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z12;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final EnumC6338u4 i(EnumC6329t4 enumC6329t4, Y5.k kVar, Y5.k kVar2, Y5.l lVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z9, boolean z10, boolean z11) {
        return (EnumC6338u4) kVar2.getOrDefault(enumC6329t4, EnumC6338u4.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
