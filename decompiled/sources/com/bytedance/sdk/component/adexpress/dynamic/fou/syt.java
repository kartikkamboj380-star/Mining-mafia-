package com.bytedance.sdk.component.adexpress.dynamic.fou;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private float bob;
    private float csi;
    private csi dgq;
    private float fou;
    private String kq;
    private List<syt> nn;
    private float oq;
    private float rhi;
    private float rjo;
    private boolean suf;
    private float syt;
    private syt ubx;
    private List<List<syt>> vvw;
    private String wki;
    private Map<String, String> nze = new HashMap();
    private Map<Integer, String> mxq = new HashMap();

    public String bob() {
        return this.kq;
    }

    public float csi() {
        return this.csi;
    }

    public float dgq() {
        return this.rjo;
    }

    public Map<String, String> fax() {
        return this.nze;
    }

    public float fou() {
        return this.fou;
    }

    public boolean gm() {
        return this.suf;
    }

    public boolean jhe() {
        return TextUtils.equals(this.dgq.csi().rs(), "flex");
    }

    public String kq() {
        return this.wki;
    }

    public void mq() {
        List<List<syt>> list = this.vvw;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<syt> list2 : this.vvw) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.vvw = arrayList;
    }

    public float mxq() {
        rhi rhiVarCsi = this.dgq.csi();
        return suf() + rhiVarCsi.sns() + rhiVarCsi.suf() + (rhiVarCsi.vvw() * 2.0f);
    }

    public boolean nb() {
        return this.dgq.csi().wxb() < 0 || this.dgq.csi().rrl() < 0 || this.dgq.csi().noa() < 0 || this.dgq.csi().rao() < 0;
    }

    public csi nn() {
        return this.dgq;
    }

    public float nze() {
        rhi rhiVarCsi = this.dgq.csi();
        return wki() + rhiVarCsi.nze() + rhiVarCsi.mxq() + (rhiVarCsi.vvw() * 2.0f);
    }

    public Map<Integer, String> oq() {
        return this.mxq;
    }

    public float rhi() {
        return this.oq;
    }

    public float rjo() {
        return this.bob;
    }

    public List<List<syt>> sns() {
        return this.vvw;
    }

    public int suf() {
        rhi rhiVarCsi = this.dgq.csi();
        return rhiVarCsi.ls() + rhiVarCsi.rz();
    }

    public float syt() {
        return this.rhi;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.kq + "', x=" + this.oq + ", y=" + this.bob + ", width=" + this.rhi + ", height=" + this.rjo + ", remainWidth=" + this.syt + ", rootBrick=" + this.dgq + ", childrenBrickUnits=" + this.nn + '}';
    }

    public List<syt> ubx() {
        return this.nn;
    }

    public String uml() {
        return this.dgq.csi().uml();
    }

    public syt vvw() {
        return this.ubx;
    }

    public boolean wcx() {
        List<syt> list = this.nn;
        return list == null || list.size() <= 0;
    }

    public int wki() {
        rhi rhiVarCsi = this.dgq.csi();
        return rhiVarCsi.pfu() + rhiVarCsi.oxe();
    }

    public void bob(float f10) {
        this.oq = f10;
    }

    public void csi(float f10) {
        this.rhi = f10;
    }

    public void fou(float f10) {
        this.bob = f10;
    }

    public void kq(String str) {
        this.wki = str;
    }

    public void oq(String str) {
        this.kq = str;
    }

    public void rhi(float f10) {
        this.rjo = f10;
    }

    public void rjo(float f10) {
        this.syt = f10;
    }

    public void bob(String str) {
        this.dgq.csi().rhi(str);
    }

    public void kq(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.mxq.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void oq(float f10) {
        this.csi = f10;
    }

    public void oq(List<List<syt>> list) {
        this.vvw = list;
    }

    public void kq(float f10) {
        this.fou = f10;
    }

    public void kq(csi csiVar) {
        this.dgq = csiVar;
    }

    public void kq(List<syt> list) {
        this.nn = list;
    }

    public void kq(syt sytVar) {
        this.ubx = sytVar;
    }

    public void kq(boolean z9) {
        this.suf = z9;
    }

    public void kq(String str, String str2) {
        this.nze.put(str, str2);
    }

    public String kq(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dgq.oq());
        sb.append(":");
        sb.append(this.kq);
        if (this.dgq.csi() != null) {
            sb.append(":");
            sb.append(this.dgq.csi().zp());
        }
        sb.append(":");
        sb.append(i10);
        return sb.toString();
    }
}
