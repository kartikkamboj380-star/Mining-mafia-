package com.bytedance.adsdk.ugeno.kq.oq;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.kq.csi;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kq.oq.oq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[csi.values().length];
            kq = iArr;
            try {
                iArr[csi.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[csi.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[csi.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[csi.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[csi.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[csi.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kq[csi.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kq[csi.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kq[csi.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public oq(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, TreeMap<Float, String> treeMap) {
        super(context, bobVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void kq(float f10, String str) {
        this.csi.add(Keyframe.ofFloat(f10, (this.oq.startsWith(csi.TRANSLATE.kq()) || this.fou == csi.BORDER_RADIUS) ? syt.kq(this.kq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : com.bytedance.adsdk.ugeno.rjo.bob.kq(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public void oq() {
        float fNze;
        switch (AnonymousClass1.kq[this.fou.ordinal()]) {
            case 1:
                fNze = this.rjo.nze();
                break;
            case 2:
                fNze = this.rjo.mxq();
                break;
            case 3:
                fNze = this.rjo.sns();
                break;
            case 4:
                fNze = this.rjo.wcx();
                break;
            case 5:
                fNze = this.rjo.gm();
                if (this.rjo.ubx() != null) {
                    this.rjo.ubx().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fNze = this.rjo.fax();
                if (this.rjo.ubx() != null) {
                    this.rjo.ubx().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fNze = this.rjo.mq();
                break;
            case 8:
                fNze = this.rjo.jhe();
                break;
            case 9:
                fNze = this.rjo.uml();
                break;
            default:
                fNze = 0.0f;
                break;
        }
        this.csi.add(Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fNze));
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq.kq
    public TypeEvaluator rhi() {
        return new FloatEvaluator();
    }
}
