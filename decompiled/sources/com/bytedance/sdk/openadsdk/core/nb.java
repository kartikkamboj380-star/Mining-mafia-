package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nb implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene kq;

    public nb(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.kq = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        ou.kq(1, this.kq, i10);
        return com.bytedance.sdk.component.utils.kq.kq(jSONObject);
    }
}
