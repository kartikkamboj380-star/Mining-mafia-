package com.bytedance.adsdk.ugeno.dgq.rhi;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oq.bob;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob<kq> {
    private float aed;
    private float ayo;
    protected int et;
    private boolean fsp;
    private int iaf;
    private int job;
    private float ju;
    private float jwr;
    private int kfr;
    protected String kq;

    @Deprecated
    private float oyl;
    private int oz;
    private float rxz;
    private float tk;
    private float vi;

    @Deprecated
    private TextUtils.TruncateAt vt;

    @Deprecated
    private float wqw;
    private float xb;
    private int ymy;
    private TextUtils.TruncateAt yo;
    private int zp;

    public oq(Context context) {
        super(context);
        this.et = -16777216;
        this.jwr = 12.0f;
        this.rxz = -1.0f;
        this.oz = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.ymy = 8388611;
        this.yo = TextUtils.TruncateAt.END;
        this.aed = -1.0f;
        this.ju = 400.0f;
    }

    private void dgq() {
        float f10 = this.aed;
        if (f10 <= 3.0f) {
            ((kq) this.csi).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(syt.kq(this.oq, (f10 - (this.jwr * 1.2f)) / 2.0f));
            int paddingTop = ((kq) this.csi).getPaddingTop() + iRound;
            int paddingBottom = ((kq) this.csi).getPaddingBottom() + iRound;
            T t10 = this.csi;
            ((kq) t10).setPadding(((kq) t10).getPaddingLeft(), paddingTop, ((kq) this.csi).getPaddingRight(), paddingBottom);
            ((kq) this.csi).setLineHeight(Math.round(syt.kq(this.oq, this.aed)));
        }
    }

    private void fou() {
        ((kq) this.csi).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.aed);
    }

    private int gm(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    private TextUtils.TruncateAt mxq(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private TextUtils.TruncateAt nze(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.vt = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.vt = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.vt = TextUtils.TruncateAt.START;
                break;
            default:
                this.vt = null;
                break;
        }
        return this.vt;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int sns(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals("bold")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("normal")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (str.equals("italic")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            return b10 != 1 ? 0 : 2;
        }
        return 1;
    }

    private int wcx(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public kq kq() {
        kq kqVar = new kq(this.oq);
        kqVar.kq(this);
        return kqVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        if (TextUtils.equals("null", this.kq)) {
            this.kq = "";
        }
        suf(this.kq);
        ((kq) this.csi).setTextSize(1, this.jwr);
        ((kq) this.csi).setTextColor(this.et);
        ((kq) this.csi).setLines(this.zp);
        ((kq) this.csi).setMaxLines(this.oz);
        ((kq) this.csi).setGravity(this.ymy);
        ((kq) this.csi).setIncludeFontPadding(false);
        ((kq) this.csi).setMinTextSize(syt.kq(this.oq, this.rxz));
        kq(this.kfr);
        if (zfx()) {
            kq(this.yo);
        } else {
            kq(this.vt);
        }
        if (this.aed > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (zfx()) {
                dgq();
            } else {
                fou();
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ((kq) this.csi).setBreakStrategy(0);
        if (!zfx()) {
            ((kq) this.csi).setShadowLayer(this.ayo, this.oyl, this.wqw, this.job);
        } else if (this.fsp) {
            if (this.ayo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.ayo = 1.0E-5f;
            }
            ((kq) this.csi).setShadowLayer(this.ayo, this.vi, this.xb, this.job);
        }
        int i11 = this.iaf;
        if (i11 == 1) {
            ((kq) this.csi).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((kq) this.csi).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.ju, i11 == 2));
        } else if (this.ju >= 500.0f) {
            ((kq) this.csi).setTypeface(Typeface.DEFAULT, 1);
        }
        if (syt.kq(this.oq, this.jwr) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((kq) this.csi).setLetterSpacing(this.tk / syt.kq(this.oq, this.jwr));
        }
    }

    public void suf(String str) {
        this.kq = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.kq = "";
        }
        ((kq) this.csi).setText(this.kq);
    }

    public void kq(int i10) {
        this.kfr = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((kq) this.csi).setPaintFlags(i10);
    }

    public void kq(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((kq) this.csi).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.ayo = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowColor":
                this.job = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                this.fsp = true;
                break;
            case "shadowOffsetX":
                this.vi = syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.xb = syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.ymy = wcx(str2);
                break;
            case "textColor":
                this.et = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "textStyle":
                this.iaf = sns(str2);
                break;
            case "textSize":
                this.jwr = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.kfr = gm(str2);
                break;
            case "shadowDx":
                this.oyl = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowDy":
                this.wqw = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "fontWeight":
                float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, -1.0f);
                this.ju = fKq;
                if (fKq < 1.0f || fKq > 1000.0f) {
                    this.ju = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.aed = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f);
                break;
            case "text":
                this.kq = str2;
                break;
            case "lines":
                this.zp = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0);
                break;
            case "ellipsis":
                this.yo = mxq(str2);
                break;
            case "minTextSize":
                this.rxz = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, -1.0f);
                break;
            case "maxLines":
                int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                if (iKq > 0) {
                    i10 = iKq;
                }
                this.oz = i10;
                break;
            case "ellipsize":
                this.vt = nze(str2);
                break;
            case "letterSpacing":
                this.tk = syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }
}
