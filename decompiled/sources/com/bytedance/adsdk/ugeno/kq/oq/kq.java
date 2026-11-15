package com.bytedance.adsdk.ugeno.kq.oq;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.kq.csi;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq {
    protected Map<Float, String> bob;
    protected csi fou;
    protected Context kq;
    protected String oq;
    protected com.bytedance.adsdk.ugeno.oq.bob rjo;
    protected List<PropertyValuesHolder> rhi = new ArrayList();
    protected List<Keyframe> csi = new ArrayList();

    public kq(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, Map<Float, String> map) {
        this.kq = context;
        this.oq = str;
        this.bob = map;
        this.fou = csi.kq(this.oq);
        this.rjo = bobVar;
    }

    public void bob() {
        Map<Float, String> map = this.bob;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.bob;
        if (map2 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map2).lastKey();
            if (f10.floatValue() != 100.0f) {
                kq(100.0f, this.bob.get(f10));
            }
        }
    }

    public List<PropertyValuesHolder> csi() {
        String strOq = this.fou.oq();
        fou();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strOq, (Keyframe[]) this.csi.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorRhi = rhi();
        if (typeEvaluatorRhi != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorRhi);
        }
        this.rhi.add(propertyValuesHolderOfKeyframe);
        return this.rhi;
    }

    public void fou() {
        Map<Float, String> map = this.bob;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!kq()) {
            oq();
        }
        for (Map.Entry<Float, String> entry : this.bob.entrySet()) {
            if (entry != null) {
                kq(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        bob();
    }

    public abstract void kq(float f10, String str);

    public boolean kq() {
        Map<Float, String> map = this.bob;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.bob.containsKey(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public abstract void oq();

    public abstract TypeEvaluator rhi();
}
