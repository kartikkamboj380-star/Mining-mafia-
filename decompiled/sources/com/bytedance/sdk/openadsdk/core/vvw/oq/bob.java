package com.bytedance.sdk.openadsdk.core.vvw.oq;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.ibd;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static final Map<String, oq> kq = new ConcurrentHashMap();
    private static final AtomicBoolean oq = new AtomicBoolean(false);
    private final String bob;
    private EnumC0290bob csi;
    private final boolean fou;
    private boolean rhi;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vvw.oq.bob$bob, reason: collision with other inner class name */
    enum EnumC0290bob {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class kq {
        private final String kq;
        private EnumC0290bob oq = EnumC0290bob.TRACKING_URL;
        private boolean bob = false;

        public kq(String str) {
            this.kq = str;
        }

        public kq kq(boolean z9) {
            this.bob = z9;
            return this;
        }

        public bob kq() {
            return new bob(this.kq, this.oq, Boolean.valueOf(this.bob));
        }
    }

    public static class oq {
        float bob;
        final uml kq;
        String oq;

        public oq(String str, uml umlVar) {
            this(str, umlVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public oq(String str, uml umlVar, float f10) {
            this.oq = str;
            this.kq = umlVar;
            this.bob = f10;
        }
    }

    static {
        ibd.kq(new ibd.kq() { // from class: com.bytedance.sdk.openadsdk.core.vvw.oq.bob.1
            @Override // com.bytedance.sdk.component.utils.ibd.kq
            public void kq(Context context, Intent intent, boolean z9, int i10) {
                if (i10 == 0 || bob.kq.size() <= 0) {
                    return;
                }
                bob.oq();
            }
        }, sns.kq());
    }

    protected bob(String str, EnumC0290bob enumC0290bob, Boolean bool) {
        this.bob = str;
        this.csi = enumC0290bob;
        this.fou = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.vvw.oq.kq> bob(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.kq.C0291kq(jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).kq());
                }
            }
        }
        return arrayList;
    }

    public static void oq(uml umlVar, @NonNull List<bob> list, com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar, long j10, String str, String str2) {
        kq(umlVar, list, kqVar, j10, str, null, str2);
    }

    public boolean csi() {
        return this.rhi;
    }

    public boolean fou() {
        return this.fou;
    }

    public void l_() {
        this.rhi = true;
    }

    public static List<String> kq(uml umlVar, @NonNull List<bob> list, com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar, long j10, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (bob bobVar : list) {
            if (bobVar != null && (!bobVar.csi() || bobVar.fou())) {
                arrayList.add(bobVar.bob());
                bobVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.vvw.bob.bob(arrayList, umlVar).kq(kqVar).kq(j10).oq(str).kq(str2).kq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq() {
        if (oq.compareAndSet(false, true)) {
            Map<String, oq> map = kq;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    kq((String) entry.getKey(), (oq) entry.getValue(), true);
                }
            }
            oq.set(false);
        }
    }

    public String bob() {
        return this.bob;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq(final boolean z9, final String str, final String str2, final oq oqVar, final String str3, final boolean z10) {
        uml umlVar;
        if (oqVar == null || (umlVar = oqVar.kq) == null) {
            return;
        }
        final boolean zBns = umlVar.bns();
        final String str4 = zBns ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.fou.bob.kq(new syt(str4) { // from class: com.bytedance.sdk.openadsdk.core.vvw.oq.bob.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, oqVar.oq);
                    jSONObject.put("success", z9);
                    jSONObject.put("url", str3);
                    if (zBns) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        float f10 = oqVar.bob;
                        if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            jSONObject.put(ReactProgressBarViewManager.PROP_PROGRESS, ((double) Math.round(f10 * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.fou.bob.kq(System.currentTimeMillis(), oqVar.kq, str2, str4, new com.bytedance.sdk.openadsdk.mxq.bob.kq() { // from class: com.bytedance.sdk.openadsdk.core.vvw.oq.bob.3.1
                    @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
                    public JSONObject bob() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
                    public JSONObject kq() {
                        if (!z10) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.vvw.oq.oq> oq(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.oq.kq(jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).kq());
                }
            }
        }
        return arrayList;
    }

    public static boolean kq(uml umlVar, @NonNull List<bob> list, com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar, long j10, String str, oq oqVar, String str2) {
        List<String> listKq = kq(umlVar, list, kqVar, j10, str, str2);
        kq(listKq, oqVar);
        return !listKq.isEmpty();
    }

    public static void kq(List<String> list, oq oqVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                kq(str, oqVar, false);
            }
        }
    }

    private static void kq(final String str, final oq oqVar, final boolean z9) {
        com.bytedance.sdk.component.rjo.oq.oq oqVarBob = com.bytedance.sdk.openadsdk.gm.oq.oq().bob().bob();
        if (oqVarBob == null) {
            return;
        }
        oqVarBob.kq(true);
        oqVarBob.oq(str);
        oqVarBob.kq(new com.bytedance.sdk.component.rjo.kq.kq() { // from class: com.bytedance.sdk.openadsdk.core.vvw.oq.bob.2
            @Override // com.bytedance.sdk.component.rjo.kq.kq
            public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, com.bytedance.sdk.component.rjo.oq oqVar2) {
                String str2;
                boolean z10;
                oq oqVar3 = oqVar;
                if (oqVar3 == null || oqVar3.kq == null) {
                    return;
                }
                String str3 = null;
                if (oqVar2 == null || !oqVar2.rhi()) {
                    if (oqVar2 != null) {
                        str3 = oqVar2.kq() + ":" + oqVar2.oq();
                        if (!z9 && (oqVar2.kq() <= 300 || oqVar2.kq() >= 400)) {
                            bob.kq.put(str, oqVar);
                        }
                    }
                    str2 = str3;
                    z10 = false;
                } else {
                    str2 = null;
                    z10 = true;
                }
                bob.oq(z10, str2, wol.bob(oqVar.kq.ain()), oqVar, str, z9);
                if (!z10 || bob.kq.isEmpty()) {
                    return;
                }
                bob.oq();
            }

            @Override // com.bytedance.sdk.component.rjo.kq.kq
            public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, IOException iOException) {
                uml umlVar;
                oq oqVar2 = oqVar;
                if (oqVar2 != null && (umlVar = oqVar2.kq) != null) {
                    bob.oq(false, iOException != null ? iOException.getMessage() : null, wol.bob(umlVar.ain()), oqVar, str, z9);
                }
                if (z9 || oqVar == null) {
                    return;
                }
                bob.kq.put(str, oqVar);
            }
        });
    }

    public static JSONArray kq(List<bob> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).bob());
        }
        return jSONArray;
    }

    public static List<bob> kq(JSONArray jSONArray) {
        return kq(jSONArray, false);
    }

    public static List<bob> kq(JSONArray jSONArray, boolean z9) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new kq(strOptString).kq(z9).kq());
                }
            }
        }
        return arrayList;
    }
}
