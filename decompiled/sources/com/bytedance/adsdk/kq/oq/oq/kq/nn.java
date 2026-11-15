package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn implements com.bytedance.adsdk.kq.oq.oq.kq {
    private com.bytedance.adsdk.kq.oq.kq.kq bob;
    private boolean fou;
    private com.bytedance.adsdk.kq.oq.oq.kq[] kq;
    private String oq;

    public nn(String str) {
        this.oq = str;
    }

    public boolean bob() {
        return this.fou;
    }

    public void kq(com.bytedance.adsdk.kq.oq.oq.kq[] kqVarArr) {
        this.kq = kqVarArr;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.oq);
        sb.append("(");
        com.bytedance.adsdk.kq.oq.oq.kq[] kqVarArr = this.kq;
        if (kqVarArr != null && kqVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.kq.oq.oq.kq[] kqVarArr2 = this.kq;
                if (i10 >= kqVarArr2.length) {
                    break;
                }
                sb.append(kqVarArr2[i10].oq());
                sb.append(",");
                i10++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void kq(boolean z9) {
        this.fou = z9;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        com.bytedance.adsdk.kq.oq.kq.kq kqVar = new com.bytedance.adsdk.kq.oq.kq.kq();
        this.bob = kqVar;
        kqVar.kq(this.oq);
        Object[] objArr = new Object[this.kq.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.kq.oq.oq.kq[] kqVarArr = this.kq;
            if (i10 < kqVarArr.length) {
                com.bytedance.adsdk.kq.oq.oq.kq kqVar2 = kqVarArr[i10];
                if (kqVar2 != null) {
                    objArr[i10] = kqVar2.kq(map);
                }
                i10++;
            } else {
                this.bob.kq(objArr);
                return com.bytedance.adsdk.kq.mxq.kq(this.oq).kq(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.oq.METHOD;
    }
}
