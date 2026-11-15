package com.bytedance.sdk.openadsdk.core.ubx;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private int csi;
    private int dgq;
    private boolean fax;
    private Context gm;
    protected String kq;
    private float mxq;
    private TextUtils.TruncateAt nn;
    private float nze;
    private int rjo;
    private float sns;
    private boolean suf;
    private float ubx;
    private float vvw;
    private float wcx;
    private int wki;
    protected int oq = -16777216;
    private float bob = 12.0f;
    private float fou = -1.0f;
    private int rhi = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int syt = 8388611;

    public oq(Context context, boolean z9) {
        this.gm = context;
        this.fax = z9;
    }

    private TextUtils.TruncateAt bob(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int fou(String str) {
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

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int oq(String str) {
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

    public void kq(com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar) {
        if (kqVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.kq)) {
            kqVar.setText(TextUtils.equals("null", this.kq) ? "" : this.kq);
        }
        kqVar.setTextSize(1, this.bob);
        kqVar.setMinTextSize(syt.kq(this.gm, this.fou));
        kqVar.setTextColor(this.oq);
        kqVar.setGravity(this.syt);
        kqVar.setLines(this.rjo);
        kqVar.setMaxLines(this.rhi);
        int i10 = this.dgq;
        if (i10 != Integer.MAX_VALUE) {
            kqVar.setPaintFlags(i10);
        }
        kqVar.setEllipsize(this.nn);
        if (this.ubx > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.fax) {
                bob(kqVar);
            } else {
                oq(kqVar);
            }
        }
        kqVar.setTypeface(kq((int) this.vvw));
        fou(kqVar);
        float fKq = syt.kq(this.gm, this.bob);
        if (fKq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kqVar.setLetterSpacing(this.wcx / fKq);
        }
        kqVar.setIncludeFontPadding(false);
    }

    private void bob(com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar) {
        float f10 = this.ubx;
        if (f10 <= 3.0f) {
            kqVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(syt.kq(this.gm, (f10 - (this.bob * 1.2f)) / 2.0f));
            kqVar.setPadding(kqVar.getPaddingLeft(), kqVar.getPaddingTop() + iRound, kqVar.getPaddingRight(), kqVar.getPaddingBottom() + iRound);
            kqVar.setLineHeight(Math.round(syt.kq(this.gm, this.ubx)));
        }
    }

    private void fou(com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar) {
        if (!this.fax) {
            kqVar.setShadowLayer(this.sns, this.nze, this.mxq, this.wki);
        } else if (this.suf) {
            float f10 = this.sns;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f10 = 1.0E-5f;
            }
            kqVar.setShadowLayer(f10, this.nze, this.mxq, this.wki);
        }
    }

    private void oq(com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar) {
        kqVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ubx);
    }

    public void kq(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "shadowColor":
                this.wki = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                this.suf = true;
                break;
            case "shadowOffsetX":
                this.nze = syt.kq(this.gm, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.mxq = syt.kq(this.gm, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.syt = kq(str2);
                break;
            case "textColor":
                this.oq = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "textStyle":
                this.csi = oq(str2);
                break;
            case "shadowBlur":
                this.sns = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textSize":
                this.bob = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.dgq = fou(str2);
                break;
            case "fontWeight":
                float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, -1.0f);
                this.vvw = fKq;
                if (fKq < 1.0f || fKq > 1000.0f) {
                    this.vvw = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.ubx = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f);
                break;
            case "text":
                this.kq = str2;
                break;
            case "lines":
                this.rjo = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0);
                break;
            case "ellipsis":
                this.nn = bob(str2);
                break;
            case "minTextSize":
                this.fou = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, -1.0f);
                break;
            case "maxLines":
                int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                if (iKq > 0) {
                    i10 = iKq;
                }
                this.rhi = i10;
                break;
            case "letterSpacing":
                this.wcx = syt.kq(this.gm, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }

    private int kq(String str) {
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

    private Typeface kq(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i10, false);
        }
        return i10 >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
