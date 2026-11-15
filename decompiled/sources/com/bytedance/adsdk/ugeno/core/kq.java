package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private List<C0224kq> bob;
    private long csi;
    private long fou;
    private String kq;
    private float oq;
    private String rhi;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.kq$kq, reason: collision with other inner class name */
    public static class C0224kq {
        private String bob;
        private String csi;
        private String dgq;
        private long fou;
        private long kq;
        private String nn;
        private float oq;
        private float rhi;
        private float rjo;
        private float[] syt;

        public String bob() {
            return this.bob;
        }

        public String csi() {
            return this.csi;
        }

        public String dgq() {
            return this.dgq;
        }

        public long fou() {
            return this.fou;
        }

        public long kq() {
            return this.kq;
        }

        public String nn() {
            return this.nn;
        }

        public float oq() {
            return this.oq;
        }

        public float rhi() {
            return this.rhi;
        }

        public float rjo() {
            return this.rjo;
        }

        public float[] syt() {
            return this.syt;
        }

        public void bob(float f10) {
            this.rjo = f10;
        }

        public void fou(String str) {
            this.dgq = str;
        }

        public void kq(long j10) {
            this.kq = j10;
        }

        public void oq(long j10) {
            this.fou = j10;
        }

        public void bob(String str) {
            this.nn = str;
        }

        public void kq(float f10) {
            this.oq = f10;
        }

        public void oq(String str) {
            this.csi = str;
        }

        public void kq(String str) {
            this.bob = str;
        }

        public void oq(float f10) {
            this.rhi = f10;
        }

        public void kq(float[] fArr) {
            this.syt = fArr;
        }

        public static C0224kq kq(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
            if (jSONObject == null) {
                return null;
            }
            C0224kq c0224kq = new C0224kq();
            c0224kq.kq(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0224kq.kq(-1.0f);
            } else {
                try {
                    c0224kq.kq(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0224kq.kq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            c0224kq.kq(jSONObject.optString("loopMode"));
            c0224kq.oq(jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE));
            if (TextUtils.equals(c0224kq.csi(), "ripple")) {
                c0224kq.bob(jSONObject.optString("rippleColor"));
            }
            View viewUbx = bobVar.ubx();
            Context context = viewUbx != null ? viewUbx.getContext() : null;
            if (TextUtils.equals(c0224kq.csi(), "backgroundColor")) {
                String strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("valueTo"), bobVar.vvw());
                int iKq = com.bytedance.adsdk.ugeno.rjo.kq.kq(jSONObject.optString("valueFrom"));
                int iKq2 = com.bytedance.adsdk.ugeno.rjo.kq.kq(strKq);
                c0224kq.oq(iKq);
                c0224kq.bob(iKq2);
            } else if ((TextUtils.equals(c0224kq.csi(), "translateX") || TextUtils.equals(c0224kq.csi(), "translateY")) && context != null) {
                try {
                    float fKq = com.bytedance.adsdk.ugeno.rjo.syt.kq(context, (float) jSONObject.optDouble("valueFrom"));
                    float fKq2 = com.bytedance.adsdk.ugeno.rjo.syt.kq(context, (float) jSONObject.optDouble("valueTo"));
                    c0224kq.oq(fKq);
                    c0224kq.bob(fKq2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0224kq.oq((float) jSONObject.optDouble("valueFrom"));
                c0224kq.bob((float) jSONObject.optDouble("valueTo"));
            }
            c0224kq.fou(jSONObject.optString("interpolator"));
            String strKq2 = com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("startDelay"), bobVar.vvw());
            Log.d("TAG", "createAnimationModel: ");
            c0224kq.oq(com.bytedance.adsdk.ugeno.rjo.bob.kq(strKq2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0224kq.csi(), "translateX") || TextUtils.equals(c0224kq.csi(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.rjo.syt.kq(context, (float) kq.kq(jSONArrayOptJSONArray.optString(i10), bobVar.vvw()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) kq.kq(jSONArrayOptJSONArray.optString(i10), bobVar.vvw());
                        i10++;
                    }
                }
                c0224kq.kq(fArr);
            }
            return c0224kq;
        }
    }

    public List<C0224kq> bob() {
        return this.bob;
    }

    public long csi() {
        return this.csi;
    }

    public long fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public float oq() {
        return this.oq;
    }

    public String rhi() {
        return this.rhi;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(long j10) {
        this.csi = j10;
    }

    public void kq(float f10) {
        this.oq = f10;
    }

    public void oq(String str) {
        this.rhi = str;
    }

    public void kq(List<C0224kq> list) {
        this.bob = list;
    }

    public void kq(long j10) {
        this.fou = j10;
    }

    public static kq kq(String str, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kq(new JSONObject(str), bobVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static kq kq(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        return kq(jSONObject, null, bobVar);
    }

    public static kq kq(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (jSONObject == null) {
            return null;
        }
        kq kqVar = new kq();
        kqVar.kq(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            kqVar.kq(-1.0f);
        } else {
            try {
                kqVar.kq(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                kqVar.kq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        kqVar.kq(jSONObject.optLong("duration", 0L));
        kqVar.oq(com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("startDelay"), bobVar.vvw()), 0L));
        kqVar.oq(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.rjo.oq.kq(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0224kq.kq(jSONObjectOptJSONObject, bobVar));
            }
            kqVar.kq(arrayList);
        }
        return kqVar;
    }

    public static double kq(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
