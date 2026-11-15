package com.bytedance.sdk.component.rhi.kq.fou.kq;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.sdk.component.rhi.kq.fou.kq {
    private byte bob;
    private long csi;
    private String dgq;
    private byte fou;
    protected JSONObject kq;
    private byte nn;
    private oq oq;
    private long rhi;
    private long rjo;
    private String syt;
    private String ubx;
    private int vvw;

    public kq(String str, JSONObject jSONObject) {
        this.dgq = str;
        this.kq = jSONObject;
    }

    public static com.bytedance.sdk.component.rhi.kq.fou.kq bob(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            kq kqVar = new kq();
            kqVar.kq((byte) iOptInt);
            kqVar.oq((byte) iOptInt2);
            kqVar.kq(jSONObject.optJSONObject("event"));
            kqVar.kq(jSONObject.optString("localId"));
            kqVar.oq(jSONObject.optString("genTime"));
            kqVar.kq(jSONObject.optInt("channel"));
            return kqVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public byte csi() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public long dgq() {
        return this.rhi;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public byte fou() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public oq kq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public int nn() {
        return this.vvw;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public byte oq() {
        return this.nn;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public String rhi() {
        if (TextUtils.isEmpty(this.dgq)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.dgq);
            jSONObject.put("event", rjo());
            jSONObject.put("genTime", vvw());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.fou);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, (int) this.bob);
            jSONObject.put("channel", this.vvw);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public synchronized JSONObject rjo() {
        oq oqVar;
        try {
            if (this.kq == null && (oqVar = this.oq) != null) {
                this.kq = oqVar.kq(ubx());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public long syt() {
        return this.csi;
    }

    public String ubx() {
        return this.ubx;
    }

    public String vvw() {
        return this.syt;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void kq(JSONObject jSONObject) {
        this.kq = jSONObject;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void oq(String str) {
        this.syt = str;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void kq(byte b10) {
        this.bob = b10;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void oq(long j10) {
        this.rhi = j10;
    }

    public kq(String str, oq oqVar) {
        this.dgq = str;
        this.oq = oqVar;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void kq(String str) {
        this.dgq = str;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void oq(byte b10) {
        this.fou = b10;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void kq(long j10) {
        this.csi = j10;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void kq(int i10) {
        this.vvw = i10;
    }

    private kq() {
    }

    public void bob(byte b10) {
        this.nn = b10;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public String bob() {
        return this.dgq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq
    public void bob(long j10) {
        this.rjo = j10;
    }
}
