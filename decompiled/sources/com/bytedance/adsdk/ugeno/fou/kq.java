package com.bytedance.adsdk.ugeno.fou;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq implements syt {
    @Override // com.bytedance.adsdk.ugeno.fou.syt
    public List<rjo> kq() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rjo("slide") { // from class: com.bytedance.adsdk.ugeno.fou.kq.1
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.csi(context);
            }
        });
        arrayList.add(new rjo("tap") { // from class: com.bytedance.adsdk.ugeno.fou.kq.2
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.dgq(context);
            }
        });
        arrayList.add(new rjo("timer") { // from class: com.bytedance.adsdk.ugeno.fou.kq.3
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.nn(context);
            }
        });
        arrayList.add(new rjo("touchStart") { // from class: com.bytedance.adsdk.ugeno.fou.kq.4
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.vvw(context);
            }
        });
        arrayList.add(new rjo("touchEnd") { // from class: com.bytedance.adsdk.ugeno.fou.kq.5
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.ubx(context);
            }
        });
        arrayList.add(new rjo("animateState") { // from class: com.bytedance.adsdk.ugeno.fou.kq.6
            @Override // com.bytedance.adsdk.ugeno.fou.rjo
            public com.bytedance.adsdk.ugeno.fou.fou.bob kq(Context context) {
                return new com.bytedance.adsdk.ugeno.fou.fou.oq(context);
            }
        });
        return arrayList;
    }
}
