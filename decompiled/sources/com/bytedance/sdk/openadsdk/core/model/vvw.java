package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import app.notifee.core.event.LogEvent;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vvw {
    private final float bob;
    private final float csi;
    private final int dgq;
    private final float fou;
    private final int[] kq;
    private final String mxq;
    private final int nn;
    private final JSONObject nze;
    private final int[] oq;
    private final float rhi;
    private final long rjo;
    private final JSONObject sns;
    private final int suf;
    private final long syt;
    private final int ubx;
    private final int vvw;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> wki;

    public static class kq {
        float bob;
        private long csi;
        private float dgq;
        private JSONObject fax;
        private long fou;
        private JSONObject gm;
        float kq;
        private int mxq;
        private int[] nn;
        private SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> nze;
        int oq;
        private float rhi;
        private float rjo;
        private String sns;
        private int suf;
        private float syt;
        private int[] ubx;
        private int vvw;
        private int wcx;
        private int wki;

        public kq bob(int i10) {
            this.oq = i10;
            return this;
        }

        public kq csi(float f10) {
            this.syt = f10;
            return this;
        }

        public kq fou(float f10) {
            this.rjo = f10;
            return this;
        }

        public kq kq(int i10) {
            this.wcx = i10;
            return this;
        }

        public kq oq(JSONObject jSONObject) {
            this.fax = jSONObject;
            return this;
        }

        public kq rhi(float f10) {
            this.dgq = f10;
            return this;
        }

        public kq bob(float f10) {
            this.rhi = f10;
            return this;
        }

        public kq csi(int i10) {
            this.wki = i10;
            return this;
        }

        public kq fou(int i10) {
            this.vvw = i10;
            return this;
        }

        public kq kq(JSONObject jSONObject) {
            this.gm = jSONObject;
            return this;
        }

        public kq oq(int i10) {
            this.mxq = i10;
            return this;
        }

        public kq rhi(int i10) {
            this.suf = i10;
            return this;
        }

        public kq kq(SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> sparseArray) {
            this.nze = sparseArray;
            return this;
        }

        public kq oq(float f10) {
            this.bob = f10;
            return this;
        }

        public kq kq(float f10) {
            this.kq = f10;
            return this;
        }

        public kq oq(long j10) {
            this.csi = j10;
            return this;
        }

        public kq kq(long j10) {
            this.fou = j10;
            return this;
        }

        public kq oq(int[] iArr) {
            this.ubx = iArr;
            return this;
        }

        public kq kq(int[] iArr) {
            this.nn = iArr;
            return this;
        }

        public kq kq(String str) {
            this.sns = str;
            return this;
        }

        public vvw kq() {
            return new vvw(this);
        }
    }

    public JSONObject kq() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.sns;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.sns.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.kq;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.kq[1]));
            }
            int[] iArr2 = this.oq;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.oq[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.bob)).putOpt("down_y", Float.toString(this.fou)).putOpt("up_x", Float.toString(this.csi)).putOpt("up_y", Float.toString(this.rhi)).putOpt("down_time", Long.valueOf(this.rjo)).putOpt("up_time", Long.valueOf(this.syt)).putOpt("toolType", Integer.valueOf(this.dgq)).putOpt("deviceId", Integer.valueOf(this.nn)).putOpt("source", Integer.valueOf(this.ubx)).putOpt("ft", kq(this.wki, this.vvw)).putOpt("click_area_type", this.mxq);
            int i10 = this.suf;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.nze;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private vvw(@NonNull kq kqVar) {
        this.kq = kqVar.nn;
        this.oq = kqVar.ubx;
        this.bob = kqVar.dgq;
        this.fou = kqVar.syt;
        this.csi = kqVar.rjo;
        this.rhi = kqVar.rhi;
        this.rjo = kqVar.csi;
        this.syt = kqVar.fou;
        this.dgq = kqVar.vvw;
        this.nn = kqVar.wki;
        this.ubx = kqVar.suf;
        this.vvw = kqVar.mxq;
        this.wki = kqVar.nze;
        this.mxq = kqVar.sns;
        this.suf = kqVar.wcx;
        this.nze = kqVar.gm;
        this.sns = kqVar.fax;
    }

    public static JSONObject kq(SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.bob.bob.kq kqVarValueAt = sparseArray.valueAt(i11);
                    if (kqVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(kqVarValueAt.bob)).putOpt("mr", Double.valueOf(kqVarValueAt.oq)).putOpt("phase", Integer.valueOf(kqVarValueAt.kq)).putOpt("ts", Long.valueOf(kqVarValueAt.fou));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt(LogEvent.LEVEL_INFO, jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
