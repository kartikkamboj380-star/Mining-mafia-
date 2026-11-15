package com.bytedance.sdk.component.kq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq {
    protected rjo bob;
    protected String csi;
    protected Context kq;
    protected ubx oq;
    rhi rjo;
    protected Handler fou = new Handler(Looper.getMainLooper());
    protected volatile boolean rhi = false;
    private final Map<String, rhi> syt = new HashMap();

    protected kq() {
    }

    final void bob(dgq dgqVar) {
        this.kq = kq(dgqVar);
        this.bob = dgqVar.fou;
        this.oq = dgqVar.syt;
        this.rjo = new rhi(dgqVar, this);
        this.csi = dgqVar.nn;
        oq(dgqVar);
    }

    protected void invokeMethod(final String str) {
        if (this.rhi) {
            return;
        }
        this.fou.post(new Runnable() { // from class: com.bytedance.sdk.component.kq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                suf sufVarKq;
                if (kq.this.rhi) {
                    return;
                }
                try {
                    sufVarKq = kq.this.kq(new JSONObject(str));
                } catch (Exception unused) {
                    sufVarKq = null;
                }
                if (!suf.kq(sufVarKq)) {
                    kq.this.kq(sufVarKq);
                    return;
                }
                Objects.toString(sufVarKq);
                if (sufVarKq != null) {
                    kq.this.oq(gm.kq(new mxq(sufVarKq.kq, "Failed to parse invocation.")), sufVarKq);
                }
            }
        });
    }

    protected abstract Context kq(dgq dgqVar);

    protected abstract String kq();

    protected abstract void kq(String str);

    protected void oq() {
        this.rjo.kq();
        Iterator<rhi> it = this.syt.values().iterator();
        while (it.hasNext()) {
            it.next().kq();
        }
        this.fou.removeCallbacksAndMessages(null);
        this.rhi = true;
    }

    protected abstract void oq(dgq dgqVar);

    protected void kq(String str, suf sufVar) {
        kq(str);
    }

    protected final void kq(suf sufVar) {
        String strKq;
        if (this.rhi || (strKq = kq()) == null) {
            return;
        }
        rhi rhiVarOq = oq(sufVar.rjo);
        if (rhiVarOq == null) {
            sufVar.toString();
            if (this.oq != null) {
                kq();
            }
            oq(gm.kq(new mxq(-4, "Namespace " + sufVar.rjo + " unknown.")), sufVar);
            return;
        }
        csi csiVar = new csi();
        csiVar.oq = strKq;
        csiVar.kq = this.kq;
        csiVar.bob = rhiVarOq;
        try {
            rhi.kq kqVarKq = rhiVarOq.kq(sufVar, csiVar);
            if (kqVarKq == null) {
                sufVar.toString();
                if (this.oq != null) {
                    kq();
                }
                oq(gm.kq(new mxq(-2, "Function " + sufVar.fou + " is not registered.")), sufVar);
                return;
            }
            if (kqVarKq.kq) {
                oq(kqVarKq.oq, sufVar);
            }
            if (this.oq != null) {
                kq();
            }
        } catch (Exception e10) {
            sufVar.toString();
            oq(gm.kq(e10), sufVar);
        }
    }

    final void oq(String str, suf sufVar) {
        JSONObject jSONObject;
        if (this.rhi || TextUtils.isEmpty(sufVar.rhi)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            syt.kq(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        kq(wki.kq().kq("__msg_type", "callback").kq("__callback_id", sufVar.rhi).kq("__params", jSONObject).oq(), sufVar);
    }

    private rhi oq(String str) {
        if (!TextUtils.equals(str, this.csi) && !TextUtils.isEmpty(str)) {
            return this.syt.get(str);
        }
        return this.rjo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public suf kq(JSONObject jSONObject) {
        String strOptString;
        if (this.rhi) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (kq() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return suf.kq().kq(string2).oq(string).bob(strOptString3).fou(strOptString).csi(strOptString2).rhi(strOptString4).rjo(jSONObject.optString("__iframe_url")).kq();
        } catch (JSONException unused2) {
            return suf.kq(strOptString2, -1);
        }
    }
}
