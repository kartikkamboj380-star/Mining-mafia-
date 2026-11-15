package com.bytedance.adsdk.ugeno.kq.oq;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.kq.csi;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    private List<Keyframe> syt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kq.oq.fou$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[csi.values().length];
            kq = iArr;
            try {
                iArr[csi.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[csi.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public fou(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, Map<Float, String> map) {
        super(context, bobVar, str, map);
        this.syt = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public List<PropertyValuesHolder> csi() {
        String strOq = this.fou.oq();
        fou();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strOq + "X", (Keyframe[]) this.csi.toArray(new Keyframe[0]));
        this.rhi.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strOq + "Y", (Keyframe[]) this.syt.toArray(new Keyframe[0]));
        this.rhi.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorRhi = rhi();
        if (typeEvaluatorRhi != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorRhi);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorRhi);
        }
        return this.rhi;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void kq(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.fou == csi.TRANSLATE) {
                fOptDouble = syt.kq(this.kq, fOptDouble);
                fOptDouble2 = syt.kq(this.kq, fOptDouble2);
            }
            this.csi.add(Keyframe.ofFloat(f10, fOptDouble));
            this.syt.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void oq() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i10 = AnonymousClass1.kq[this.fou.ordinal()];
        if (i10 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rjo.nze());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rjo.mxq());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rjo.sns());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rjo.wcx());
        }
        if (keyframeOfFloat != null) {
            this.csi.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.syt.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public TypeEvaluator rhi() {
        return new FloatEvaluator();
    }
}
