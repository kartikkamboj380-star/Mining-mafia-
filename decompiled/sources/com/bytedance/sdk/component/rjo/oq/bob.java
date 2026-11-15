package com.bytedance.sdk.component.rjo.oq;

import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob {
    protected ubx bob;
    String csi;
    int rhi;
    protected String fou = null;
    protected final Map<String, String> rjo = new HashMap();
    protected String syt = null;
    protected boolean dgq = false;

    public bob(ubx ubxVar) {
        this.bob = ubxVar;
        try {
            bob(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void bob(String str) {
        this.fou = str;
    }

    public void fou(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.rjo.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void kq(String str) {
        this.csi = str;
    }

    public void oq(String str) {
        this.syt = str;
    }

    public String bob() {
        return this.fou;
    }

    public void kq(int i10) {
        this.rhi = i10;
    }

    public void oq(String str, String str2) {
        this.rjo.put(str, str2);
    }

    public String fou() {
        return this.syt;
    }

    protected void kq(vvw.kq kqVar) {
        if (kqVar != null && this.rjo.size() > 0) {
            for (Map.Entry<String, String> entry : this.rjo.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    kqVar.oq(key, value);
                }
            }
        }
    }

    public void oq() {
        ubx ubxVar;
        if (this.fou == null || (ubxVar = this.bob) == null) {
            return;
        }
        com.bytedance.sdk.component.oq.kq.fou fouVarKq = ubxVar.kq();
        synchronized (fouVarKq) {
            try {
                for (com.bytedance.sdk.component.oq.kq.oq oqVar : fouVarKq.bob()) {
                    if (this.fou.equals(oqVar.kq().kq())) {
                        oqVar.bob();
                    }
                }
                for (com.bytedance.sdk.component.oq.kq.oq oqVar2 : fouVarKq.fou()) {
                    if (this.fou.equals(oqVar2.kq().kq())) {
                        oqVar2.bob();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
