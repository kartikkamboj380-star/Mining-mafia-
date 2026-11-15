package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rs {
    private int bob;
    private String csi;
    private String dgq;
    private int fou;
    private String kq;
    private String nn;
    private String oq;
    private String rhi;
    private String rjo;
    private int syt;
    private int ubx;

    public String bob() {
        return this.dgq;
    }

    public String csi() {
        return this.rhi;
    }

    public boolean dgq() {
        return this.ubx == 1;
    }

    public String fou() {
        return this.csi;
    }

    public String kq() {
        return this.rjo;
    }

    public String nn() {
        return this.bob == 2 ? this.oq : this.kq;
    }

    public int oq() {
        return this.syt;
    }

    public void rhi(String str) {
        this.kq = str;
    }

    public void rjo(String str) {
        this.oq = str;
    }

    public boolean syt() {
        return this.fou == 2;
    }

    public JSONObject ubx() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.kq)) {
                jSONObject.put("market_dpl", this.kq);
            }
            if (!TextUtils.isEmpty(this.oq)) {
                jSONObject.put("market_dpl_auto", this.oq);
            }
            if (!TextUtils.isEmpty(this.csi)) {
                jSONObject.put("market_pkg", this.csi);
            }
            if (!TextUtils.isEmpty(this.rjo)) {
                jSONObject.put("app_pkg", this.rjo);
            }
            if (!TextUtils.isEmpty(this.rhi)) {
                jSONObject.put("regex", this.rhi);
            }
            jSONObject.put("exec_type", this.bob);
            jSONObject.put("oem_vendor_type", this.fou);
            jSONObject.put("overlay", this.syt);
            jSONObject.put("gp_card", this.ubx);
            if (!TextUtils.isEmpty(this.dgq)) {
                jSONObject.put("caller_id", this.dgq);
            }
            if (!TextUtils.isEmpty(this.nn)) {
                jSONObject.put("ext_map", this.nn);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("OemModel", th.getMessage());
            return null;
        }
    }

    public void bob(String str) {
        this.nn = str;
    }

    public void csi(String str) {
        this.rhi = str;
    }

    public void fou(String str) {
        this.csi = str;
    }

    public void kq(String str) {
        this.rjo = str;
    }

    public void oq(int i10) {
        this.syt = i10;
    }

    public int rhi() {
        return this.fou;
    }

    public boolean rjo() {
        return this.fou == 1;
    }

    public void bob(int i10) {
        this.bob = i10;
    }

    public void fou(int i10) {
        this.fou = i10;
    }

    public void kq(int i10) {
        this.ubx = i10;
    }

    public void oq(String str) {
        this.dgq = str;
    }

    public static rs kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        rs rsVar = new rs();
        try {
            rsVar.rhi(jSONObject.optString("market_dpl", ""));
            rsVar.rjo(jSONObject.optString("market_dpl_auto", ""));
            rsVar.bob(jSONObject.optInt("exec_type", 0));
            rsVar.fou(jSONObject.optInt("oem_vendor_type", 0));
            rsVar.fou(jSONObject.optString("market_pkg", ""));
            rsVar.csi(jSONObject.optString("regex", ""));
            rsVar.oq(jSONObject.optInt("overlay", 1));
            rsVar.oq(jSONObject.optString("caller_id", ""));
            rsVar.bob(jSONObject.optString("ext_map", null));
            rsVar.kq(jSONObject.optInt("gp_card", 0));
            rsVar.kq(jSONObject.optString("app_pkg", ""));
            return rsVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("OemModel", th.getMessage());
            return rsVar;
        }
    }

    public void kq(Intent intent) {
        if (TextUtils.isEmpty(this.nn)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.nn);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
