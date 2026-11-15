package com.bytedance.adsdk.ugeno.csi;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.adsdk.ugeno.oq.kq<csi> {
    private int et;
    private int iaf;
    private int jwr;
    private int oz;
    private int rxz;

    public static class kq extends com.bytedance.adsdk.ugeno.oq.kq.C0230kq {
        public int ebt;
        public float fgm;
        public int ha;
        public float ibd;
        public int ktb;
        public float rs;
        public int wf;
        public int xn;
        public int zfx;

        public kq(com.bytedance.adsdk.ugeno.oq.kq kqVar) {
            super(kqVar);
            this.ebt = 1;
            this.ibd = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ha = -1;
            this.fgm = -1.0f;
            this.zfx = -1;
            this.ktb = -1;
            this.wf = 16777215;
            this.xn = 16777215;
        }

        private float bob(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private int csi(String str) {
            str.getClass();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        private float fou(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float oq(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        public String toString() {
            return "LayoutParams{mWidth=" + this.kq + ", mHeight=" + this.oq + ", mMargin=" + this.csi + ", mMarginLeft=" + this.rhi + ", mMarginRight=" + this.rjo + ", mMarginTop=" + this.syt + ", mMarginBottom=" + this.dgq + ", mParams=" + this.nb + ", mOrder=" + this.ebt + ", mFlexGrow=" + this.ibd + ", mFlexShrink=" + this.rs + ", mAlignSelf=" + this.ha + ", mFlexBasisPercent=" + this.fgm + ", mMinWidth=" + this.zfx + ", mMinHeight=" + this.ktb + ", mMaxWidth=" + this.wf + ", mMaxHeight=" + this.xn + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        public void kq(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.kq(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.fgm = fou(str2);
                    break;
                case "order":
                    this.ebt = kq(str2);
                    break;
                case "flexShrink":
                    this.rs = bob(str2);
                    break;
                case "flexGrow":
                    this.ibd = oq(str2);
                    break;
                case "alignSelf":
                    this.ha = csi(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
        public csi.kq kq() {
            csi.kq kqVar = new csi.kq((int) this.kq, (int) this.oq);
            ((ViewGroup.MarginLayoutParams) kqVar).leftMargin = (int) this.rhi;
            ((ViewGroup.MarginLayoutParams) kqVar).rightMargin = (int) this.rjo;
            ((ViewGroup.MarginLayoutParams) kqVar).topMargin = (int) this.syt;
            ((ViewGroup.MarginLayoutParams) kqVar).bottomMargin = (int) this.dgq;
            kqVar.bob(this.ebt);
            kqVar.fou(this.ha);
            kqVar.kq(this.ibd);
            kqVar.oq(this.rs);
            kqVar.bob(this.fgm);
            return kqVar;
        }

        private int kq(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public rhi(Context context) {
        super(context);
    }

    private int mxq(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    private int nze(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private int sns(String str) {
        byte b10;
        switch (str) {
            case "stretch":
                b10 = 4;
                break;
            case "baseline":
                b10 = 3;
                break;
            case "center":
                b10 = 2;
                break;
            case "flex_start":
                b10 = 0;
                break;
            case "flex_end":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return 0;
        }
        if (b10 == 1) {
            return 1;
        }
        if (b10 != 2) {
            return b10 != 3 ? 4 : 3;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private int wcx(String str) {
        byte b10;
        switch (str) {
            case "stretch":
                b10 = 5;
                break;
            case "center":
                b10 = 2;
                break;
            case "space_around":
                b10 = 3;
                break;
            case "flex_start":
                b10 = 0;
                break;
            case "space_between":
                b10 = 4;
                break;
            case "flex_end":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return 0;
        }
        if (b10 == 1) {
            return 1;
        }
        if (b10 == 2) {
            return 2;
        }
        if (b10 != 3) {
            return b10 != 4 ? 5 : 3;
        }
        return 4;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public csi kq() {
        csi csiVar = new csi(this.oq);
        csiVar.kq(this);
        return csiVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq
    public com.bytedance.adsdk.ugeno.oq.kq.C0230kq nn() {
        return new kq(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        ((csi) this.csi).setFlexDirection(this.et);
        ((csi) this.csi).setFlexWrap(this.jwr);
        ((csi) this.csi).setJustifyContent(this.rxz);
        ((csi) this.csi).setAlignItems(this.iaf);
        ((csi) this.csi).setAlignContent(this.oz);
    }

    int suf(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.iaf = sns(str2);
                break;
            case "flexDirection":
                this.et = suf(str2);
                break;
            case "alignContent":
                this.oz = wcx(str2);
                break;
            case "flexWrap":
                this.jwr = nze(str2);
                break;
            case "justifyContent":
                this.rxz = mxq(str2);
                break;
        }
    }
}
