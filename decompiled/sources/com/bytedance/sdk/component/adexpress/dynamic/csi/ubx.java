package com.bytedance.sdk.component.adexpress.dynamic.csi;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.bytedance.sdk.component.utils.uml;
import com.unity3d.services.UnityAdsConstants;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private static final Set<String> kq = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String oq;

    /* JADX WARN: Code duplicated, block: B:219:0x0435  */
    /* JADX WARN: Code duplicated, block: B:222:0x0443 A[Catch: Exception -> 0x0454, TryCatch #5 {Exception -> 0x0454, blocks: (B:220:0x0439, B:222:0x0443, B:227:0x044d), top: B:282:0x0439 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x044c  */
    public static oq.bob kq(String str, String str2, String str3, boolean z9, boolean z10, int i10, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, double d10, int i11, double d11, String str4, wki wkiVar) {
        float f10;
        float f11;
        oq.bob bobVarKq;
        int i12;
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi;
        String strOptString = str;
        int i13 = i10;
        String strFou = wkiVar.fou();
        int iRjo = wkiVar.rjo();
        if (com.bytedance.sdk.component.adexpress.fou.oq() && i11 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new oq.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        oq.bob bobVar = new oq.bob();
        if (strOptString.startsWith("<svg") || kq.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.fou.oq() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    bobVar.kq = fOptDouble;
                    bobVar.oq = fOptDouble;
                    return bobVar;
                }
            } catch (Exception unused) {
            }
            bobVar.kq = 10.0f;
            bobVar.oq = 10.0f;
            return bobVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_text_privacy_app_version") + strOptString;
            }
            int i14 = 0;
            if ("score-count".equals(str2)) {
                try {
                    i14 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                }
                if (com.bytedance.sdk.component.adexpress.fou.oq() && i14 < 0) {
                    return new oq.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return kq("(" + String.format(uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_comment_num"), Integer.valueOf(i14)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i14 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                }
                if (com.bytedance.sdk.component.adexpress.fou.oq() && i14 < 0) {
                    return new oq.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return kq("(" + String.format(new DecimalFormat("###,###,###").format(i14), Integer.valueOf(i14)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.fou.oq()) {
                oq.bob bobVar2 = new oq.bob();
                float fOq = (float) oq(str3);
                bobVar2.kq = fOq;
                bobVar2.oq = fOq;
                return bobVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!wkiVar.kq() || !com.bytedance.sdk.component.adexpress.fou.rhi.oq(strFou)) {
                    return d10 < 10.0d ? kq("0S", str3) : kq("00S", str3);
                }
                if (((int) (d10 + 0.5d)) - iRjo < 10) {
                    return com.bytedance.sdk.component.adexpress.fou.oq() ? kq("0s", str3) : kq(String.format(uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.fou.oq() ? kq("00s", str3) : kq(String.format(uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return kq("| " + uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return kq("| ".concat(String.format(uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                oq.bob bobVarKq2 = kq("| " + uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                    try {
                        bobVarKq2.oq = (float) ((((double) bobVarKq2.oq) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    bobVarKq2.kq = bobVarKq2.oq;
                }
                return bobVarKq2;
            }
            if ("skip".equals(str2)) {
                return kq(uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return kq("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.fou.oq() || (d11 >= 0.0d && d11 <= 5.0d)) ? kq("0.0", str3) : new oq.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return kq("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return kq("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.fou.oq() && TextUtils.isEmpty(strOptString) && (rhiVarCsi = sytVar.nn().csi()) != null) {
                strOptString = rhiVarCsi.wj() != null ? sytVar.nn().csi().wj().optString(com.bytedance.sdk.component.adexpress.fou.rjo.bob(com.bytedance.sdk.component.adexpress.fou.kq())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.fou.oq() && "open_ad".equals(strFou))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return kq(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble("fontSize");
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f12 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                if ("muted".equals(str2)) {
                    bobVar.kq = fOptDouble2;
                    bobVar.oq = fOptDouble2;
                    return bobVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.fou.oq() && (d11 < 0.0d || d11 > 5.0d || i11 != 4)) {
                        return new oq.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    oq.bob bobVarKq3 = kq("str", str3);
                    bobVarKq3.kq = fOptDouble2 * 5.0f;
                    return bobVarKq3;
                }
                if ("icon".equals(str2)) {
                    bobVar.kq = fOptDouble2;
                    bobVar.oq = fOptDouble2;
                    return bobVar;
                }
                if (z9) {
                    int i15 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z10 && i15 >= i13) {
                        i15 = i13;
                    }
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2 * i15)) * 1.2d);
                } else {
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f12 <= fOptDouble5) {
                        f11 = f12;
                    }
                    if ("title".equals(str2) || (com.bytedance.sdk.component.adexpress.fou.oq() && "open_ad".equals(strFou) && "source".equals(str2))) {
                        try {
                            bobVarKq = kq(strOptString.replace('\n', ' '), str3, false);
                            if (z9) {
                                i12 = ((int) (f12 / fOptDouble5)) + 1;
                                if (z10 || i12 < i13) {
                                    i13 = i12;
                                }
                                bobVarKq.oq *= i13;
                            }
                            return bobVarKq;
                        } catch (Exception unused5) {
                        }
                    }
                    bobVar.kq = f11;
                    bobVar.oq = f10;
                }
                f11 = fOptDouble5;
                if ("title".equals(str2)) {
                    bobVarKq = kq(strOptString.replace('\n', ' '), str3, false);
                    if (z9) {
                        i12 = ((int) (f12 / fOptDouble5)) + 1;
                        if (z10) {
                            i13 = i12;
                        } else {
                            i13 = i12;
                        }
                        bobVarKq.oq *= i13;
                    }
                    return bobVarKq;
                }
                bobVarKq = kq(strOptString.replace('\n', ' '), str3, false);
                if (z9) {
                    i12 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z10) {
                        i13 = i12;
                    } else {
                        i13 = i12;
                    }
                    bobVarKq.oq *= i13;
                }
                return bobVarKq;
            } catch (JSONException unused6) {
            }
        } else {
            if (!com.bytedance.sdk.component.adexpress.fou.oq() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || oq())) {
                return oq() ? kq(bobVar, strOptString, str3, oq) : kq(bobVar, strOptString, str3, "");
            }
            bobVar.kq = "union".equals(strOptString) ? 14.0f : 20.0f;
            bobVar.oq = 10.0f;
            if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                String strIbd = wkiVar.ibd();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strIbd)) {
                    bobVar.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                String str5 = str2 + strOptString;
                float fOq2 = (float) oq(str3);
                if (str5.contains("logoad")) {
                    String strRs = wkiVar.rs();
                    if (!TextUtils.isEmpty(strRs)) {
                        return kq(strRs, str3);
                    }
                    bobVar.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                bobVar.oq = fOq2;
                return bobVar;
            }
        }
        return bobVar;
    }

    public static double oq(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] oq(String str, float f10, boolean z9) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.fou.kq());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z9) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean oq() {
        return !TextUtils.isEmpty(oq);
    }

    public static String kq(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static oq.bob kq(oq.bob bobVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            bobVar.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bobVar.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return bobVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = kq(str);
        }
        if (TextUtils.isEmpty(str3)) {
            bobVar.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bobVar.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return bobVar;
        }
        return kq(str3, str2);
    }

    public static oq.bob kq(String str, String str2) {
        return kq(str, str2, false);
    }

    public static oq.bob kq(String str, String str2, boolean z9) {
        oq.bob bobVar = new oq.bob();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrKq = kq(str, (float) oq(str2), z9);
            bobVar.kq = iArrKq[0];
            bobVar.oq = iArrKq[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                bobVar.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } catch (Exception unused) {
        }
        return bobVar;
    }

    public static int[] kq(String str, float f10, boolean z9) {
        int[] iArrOq = oq(str, f10, z9);
        return new int[]{com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), iArrOq[0]), com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), iArrOq[1])};
    }

    public static String kq() {
        return oq;
    }
}
