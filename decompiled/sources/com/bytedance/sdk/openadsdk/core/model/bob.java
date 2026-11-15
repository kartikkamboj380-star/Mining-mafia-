package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    public int bob = 1;
    public AdSlot csi;
    public ArrayList<Integer> fou;
    public String kq;
    public int oq;
    public String rhi;
    public int rjo;

    public int bob() {
        return this.bob;
    }

    public ArrayList<Integer> csi() {
        return this.fou;
    }

    public AdSlot fou() {
        return this.csi;
    }

    public String kq() {
        return this.kq;
    }

    public int oq() {
        return this.oq;
    }

    public void bob(int i10) {
        this.rjo = i10;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(int i10) {
        this.bob = i10;
    }

    public void kq(int i10) {
        this.oq = i10;
    }

    public void oq(String str) {
        this.rhi = str;
    }

    public void kq(AdSlot adSlot) {
        this.csi = adSlot;
    }

    public void kq(ArrayList<Integer> arrayList) {
        this.fou = arrayList;
    }

    public static void kq(bob bobVar) {
        int iOq;
        if (bobVar == null || bobVar.fou() == null || (iOq = bobVar.oq()) >= 0 || iOq == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.mxq.bob.kq();
        com.bytedance.sdk.openadsdk.mxq.bob.kq("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.core.model.bob.1
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", bob.this.bob());
                jSONObject.put("err_code", bob.this.oq());
                jSONObject.put("err_msg", bob.this.rhi);
                jSONObject.put("ext_from", bob.this.rjo);
                jSONObject.put("server_res_str", bob.this.kq());
                if (bob.this.csi() != null && bob.this.csi().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) bob.this.csi()).toString());
                }
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("rd_client_custom_error").kq(bob.this.fou().getDurationSlotType()).oq(jSONObject.toString());
            }
        });
    }
}
