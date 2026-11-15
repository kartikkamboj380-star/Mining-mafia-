package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class syt extends bob {
    private int ubx;
    private int vvw;
    private int wki;

    public syt(Context context) {
        super(context);
        this.ubx = -1;
        this.vvw = -1;
        this.wki = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[0]), -1);
            int iKq2 = com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[1]), -1);
            int iKq3 = com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.csi;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                map2.put("fromIndex", Integer.valueOf(iKq));
                map2.put("toIndex", Integer.valueOf(iKq2));
                map2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(iKq3));
                Iterator<com.bytedance.adsdk.ugeno.fou.rhi.kq> it = this.bob.oq().iterator();
                while (it.hasNext()) {
                    it.next().oq(map2);
                }
                this.kq.kq(this.oq, this.rhi, this.bob.oq());
            } else {
                this.ubx = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("fromIndex"), -1);
                this.vvw = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("toIndex"), -1);
                int iKq4 = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE), -1);
                this.wki = iKq4;
                if (iKq == this.ubx && iKq2 == this.vvw && iKq3 == iKq4) {
                    this.kq.kq(this.oq, this.rhi, this.bob.oq());
                }
            }
        }
        return false;
    }
}
