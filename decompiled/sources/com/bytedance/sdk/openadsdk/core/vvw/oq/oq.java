package com.bytedance.sdk.openadsdk.core.vvw.oq;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob implements Comparable<oq> {
    private final float kq;

    public static class kq {
        private bob.EnumC0290bob bob = bob.EnumC0290bob.TRACKING_URL;
        private boolean fou = false;
        private final String kq;
        private final float oq;

        public kq(String str, float f10) {
            this.kq = str;
            this.oq = f10;
        }

        public oq kq() {
            return new oq(this.oq, this.kq, this.bob, Boolean.valueOf(this.fou));
        }
    }

    public boolean kq(float f10) {
        return this.kq <= f10 && !csi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.vvw.oq.bob
    public void l_() {
        super.l_();
    }

    public JSONObject oq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, bob());
        jSONObject.put("trackingFraction", this.kq);
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private oq(float f10, String str, bob.EnumC0290bob enumC0290bob, Boolean bool) {
        super(str, enumC0290bob, bool);
        this.kq = f10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(oq oqVar) {
        if (oqVar == null) {
            return 1;
        }
        float f10 = this.kq;
        float f11 = oqVar.kq;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
