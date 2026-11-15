package com.bytedance.sdk.openadsdk.fou.kq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class csi implements com.bytedance.sdk.component.rhi.kq.kq.csi {
    public static final csi kq = new csi();
    private volatile SQLiteDatabase oq;

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String bob() {
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String csi() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String fou() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public SQLiteDatabase kq(Context context) {
        if (this.oq == null) {
            synchronized (this) {
                try {
                    if (this.oq == null) {
                        this.oq = com.bytedance.sdk.openadsdk.core.csi.kq(context).kq().kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String oq() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String rhi() {
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.csi
    public String kq() {
        return "loghighpriority";
    }
}
