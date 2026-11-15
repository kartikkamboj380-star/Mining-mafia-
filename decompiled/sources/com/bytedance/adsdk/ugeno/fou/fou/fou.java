package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class fou extends bob implements com.bytedance.adsdk.ugeno.fou.kq.fou {
    private com.bytedance.adsdk.ugeno.fou.kq.bob ubx;

    public fou(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        com.bytedance.adsdk.ugeno.fou.kq.kq kqVarWee = this.oq.wee();
        if (kqVarWee == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.fou.kq.bob bobVarKq = kqVarWee.kq(this.rhi);
        this.ubx = bobVarKq;
        if (bobVarKq != null) {
            bobVarKq.kq(this);
            return false;
        }
        kqVarWee.kq(this.rhi, new com.bytedance.adsdk.ugeno.fou.kq.oq());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fou.kq.fou
    public void kq(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.kq.kq(this.oq, this.rhi, this.bob.oq());
    }
}
