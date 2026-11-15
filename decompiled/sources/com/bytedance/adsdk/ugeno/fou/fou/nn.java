package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nn extends bob implements com.bytedance.adsdk.ugeno.rjo.dgq.kq {
    private int suf;
    private int ubx;
    private int vvw;
    private Handler wki;

    public nn(Context context) {
        super(context);
        this.vvw = 0;
        this.wki = new com.bytedance.adsdk.ugeno.rjo.dgq(Looper.getMainLooper(), this);
        this.suf = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        Map<String, String> map = this.csi;
        if (map != null) {
            int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(map.get("loop"), 0);
            this.ubx = iKq;
            if (iKq <= 0) {
                this.suf = -1;
            } else {
                this.suf = iKq;
            }
            this.vvw = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("duration"), 0);
        }
        this.wki.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.vvw);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.rjo.dgq.kq
    public void kq(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.suf);
        this.kq.kq(this.oq, this.rhi, this.bob.oq());
        int i12 = this.suf + (-1);
        this.suf = i12;
        if (i12 < 0 && (i11 = this.vvw) != 0) {
            this.wki.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, i11);
        } else if (i12 > 0 && (i10 = this.vvw) != 0) {
            this.wki.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, i10);
        } else {
            this.wki.removeMessages(BackupConstant.SCENE_RENDER_FAIL);
        }
    }
}
