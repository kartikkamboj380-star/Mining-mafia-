package com.bytedance.adsdk.ugeno.kq.oq;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.kq.csi;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq {
    public bob(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, TreeMap<Float, String> treeMap) {
        super(context, bobVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void kq(float f10, String str) {
        this.csi.add(this.fou == csi.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.rjo.kq.kq(str)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.rjo.bob.kq(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void oq() {
        if (this.fou == csi.BACKGROUND_COLOR) {
            this.csi.add(Keyframe.ofInt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rjo.bss()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public TypeEvaluator rhi() {
        return this.fou == csi.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }
}
