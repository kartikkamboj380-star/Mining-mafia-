package com.bytedance.sdk.openadsdk.mq.oq;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private List<C0309kq> bob;
    private String kq;
    private List<C0309kq> oq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mq.oq.kq$kq, reason: collision with other inner class name */
    public static class C0309kq {
        private int bob;
        private String kq;
        private String oq;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0309kq)) {
                return super.equals(obj);
            }
            String str2 = this.kq;
            if (str2 != null) {
                C0309kq c0309kq = (C0309kq) obj;
                if (str2.equals(c0309kq.kq) && (str = this.oq) != null && str.equals(c0309kq.oq)) {
                    return true;
                }
            }
            return false;
        }

        public static C0309kq kq(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0309kq c0309kq = new C0309kq();
            c0309kq.kq = jSONObject.optString("url");
            c0309kq.oq = jSONObject.optString("md5");
            c0309kq.bob = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            return c0309kq;
        }

        public String kq() {
            return this.kq;
        }
    }

    public List<C0309kq> bob() {
        return this.bob;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(List<C0309kq> list) {
        this.bob = list;
    }

    public void kq(List<C0309kq> list) {
        this.oq = list;
    }

    public List<C0309kq> oq() {
        return this.oq;
    }

    public static kq oq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            kq kqVar = new kq();
            kqVar.kq(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0309kq c0309kqKq = C0309kq.kq(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0309kqKq != null) {
                        if (c0309kqKq.bob != 1) {
                            if (c0309kqKq.bob == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0309kqKq);
                            }
                        } else {
                            arrayList.add(c0309kqKq);
                        }
                    }
                }
            }
            kqVar.kq(arrayList);
            kqVar.oq(arrayList2);
            return kqVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String kq() {
        return this.kq;
    }
}
