package com.bytedance.sdk.component.rhi.kq.kq.kq.kq;

import android.content.Context;
import com.bytedance.sdk.component.rhi.kq.syt;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    public fou(Context context, com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        super(context, kqVar);
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.kq
    public byte bob() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.kq
    public byte fou() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.kq, com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    public String oq() {
        com.bytedance.sdk.component.rhi.kq.kq.csi csiVarFou = syt.rjo().fou();
        if (csiVarFou != null) {
            return csiVarFou.kq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    protected long rhi() {
        return com.bytedance.sdk.component.rhi.kq.rjo.kq.oq();
    }

    public static String bob(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
