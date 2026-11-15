package com.bytedance.sdk.openadsdk.core.vvw;

import com.bytedance.sdk.openadsdk.core.model.uml;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    protected com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq bob;
    protected String csi;
    protected com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq fou;
    protected int kq;
    private String nn;
    protected int oq;
    protected List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> rhi;
    protected List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> rjo;
    protected String syt;
    private uml vvw;
    private final AtomicBoolean ubx = new AtomicBoolean(false);
    protected String dgq = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vvw.bob$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.values().length];
            kq = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bob(int i10, int i11, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar, String str, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list2, String str2) {
        this.rhi = new ArrayList();
        this.rjo = new ArrayList();
        this.kq = i10;
        this.oq = i11;
        this.bob = enumC0289kq;
        this.fou = oqVar;
        this.csi = str;
        this.rhi = list;
        this.rjo = list2;
        this.syt = str2;
    }

    public int bob() {
        return this.oq;
    }

    public String csi() {
        if (this.fou == com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.STATIC_RESOURCE && this.bob == com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.IMAGE) {
            return this.csi;
        }
        return null;
    }

    public String fou() {
        int i10 = AnonymousClass1.kq[this.fou.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.csi;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.kq + "\" height=\"" + this.oq + "\" src=\"" + this.csi + "\"></iframe>";
        }
        com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq = this.bob;
        if (enumC0289kq == com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.csi + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0289kq != com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.csi + "\"></script>";
    }

    public void kq(long j10) {
        com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(null, this.rhi, null, j10, this.nn, new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(this.dgq, this.vvw), null);
    }

    public int oq() {
        return this.kq;
    }

    public String rhi() {
        return this.csi;
    }

    public static float kq(int i10, int i11, int i12, int i13, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq) {
        if (i11 == 0 || i13 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = i10;
        float f11 = i12;
        return kq(oqVar, enumC0289kq) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public void oq(long j10) {
        if (this.ubx.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq((uml) null, this.rjo, (com.bytedance.sdk.openadsdk.core.vvw.kq.kq) null, j10, this.nn, (String) null);
        }
    }

    public static bob oq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONArrayOptJSONArray.optString(i10)).kq());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONArrayOptJSONArray2.optString(i11)).kq());
        }
        return new bob(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float kq(com.bytedance.sdk.openadsdk.core.vvw.bob.kq.oq oqVar, com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq enumC0289kq) {
        int i10 = AnonymousClass1.kq[oqVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1.2f;
            }
            if (i10 != 3) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.JAVASCRIPT.equals(enumC0289kq)) {
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.vvw.bob.kq.EnumC0289kq.IMAGE.equals(enumC0289kq)) {
            return 0.8f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void kq(String str) {
        this.nn = str;
    }

    public JSONObject kq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.kq);
        jSONObject.put("height", this.oq);
        jSONObject.put("creativeType", this.bob.toString());
        jSONObject.put("resourceType", this.fou.toString());
        jSONObject.put("contentUrl", this.csi);
        jSONObject.put("clickThroughUri", this.syt);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.rhi));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.rjo));
        return jSONObject;
    }

    public void kq(uml umlVar) {
        this.vvw = umlVar;
    }
}
