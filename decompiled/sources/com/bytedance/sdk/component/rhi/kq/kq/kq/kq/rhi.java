package com.bytedance.sdk.component.rhi.kq.kq.kq.kq;

import android.content.Context;
import com.bytedance.sdk.component.rhi.kq.syt;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends rjo {
    public rhi(Context context, com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        super(context, kqVar);
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.rjo
    public byte bob() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.rjo
    public byte kq() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.rjo, com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    public String oq() {
        return syt.rjo().fou().csi();
    }

    public static String kq(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
