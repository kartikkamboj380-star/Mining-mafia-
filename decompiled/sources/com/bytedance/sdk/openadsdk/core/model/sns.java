package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class sns {
    private kq kq;
    private kq oq;

    public sns(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.kq = new kq(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.oq = new kq(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static kq bob(uml umlVar) {
        sns snsVarTau;
        if (umlVar == null || (snsVarTau = umlVar.tau()) == null) {
            return null;
        }
        return snsVarTau.kq;
    }

    public static boolean kq(uml umlVar) {
        return kq(umlVar, false);
    }

    public static kq oq(uml umlVar) {
        sns snsVarTau;
        if (umlVar == null || (snsVarTau = umlVar.tau()) == null) {
            return null;
        }
        return snsVarTau.oq;
    }

    public static class kq {
        C0271kq kq;
        C0271kq oq;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.sns$kq$kq, reason: collision with other inner class name */
        public static class C0271kq {
            String kq;

            public C0271kq(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.kq = jSONObject.optString("entry");
            }

            public boolean kq() {
                return !TextUtils.isEmpty(this.kq);
            }
        }

        public kq(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.kq = new C0271kq(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.oq = new C0271kq(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean kq() {
            C0271kq c0271kq = this.oq;
            if (c0271kq != null && c0271kq.kq()) {
                return true;
            }
            C0271kq c0271kq2 = this.kq;
            return c0271kq2 != null && c0271kq2.kq();
        }

        public String kq(boolean z9) {
            if (z9) {
                C0271kq c0271kq = this.kq;
                if (c0271kq != null) {
                    return c0271kq.kq;
                }
                return "";
            }
            C0271kq c0271kq2 = this.oq;
            if (c0271kq2 != null) {
                return c0271kq2.kq;
            }
            return "";
        }
    }

    public static boolean kq(uml umlVar, boolean z9) {
        sns snsVarTau;
        if (umlVar == null || (snsVarTau = umlVar.tau()) == null) {
            return false;
        }
        if (z9) {
            kq kqVar = snsVarTau.oq;
            return kqVar != null && kqVar.kq();
        }
        kq kqVar2 = snsVarTau.kq;
        return kqVar2 != null && kqVar2.kq();
    }
}
