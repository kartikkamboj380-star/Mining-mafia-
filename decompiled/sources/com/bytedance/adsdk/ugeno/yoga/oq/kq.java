package com.bytedance.adsdk.ugeno.yoga.oq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.bytedance.adsdk.ugeno.yoga.csi;
import com.bytedance.adsdk.ugeno.yoga.fou;
import com.bytedance.adsdk.ugeno.yoga.nn;
import com.bytedance.adsdk.ugeno.yoga.rhi;
import com.bytedance.adsdk.ugeno.yoga.suf;
import com.bytedance.adsdk.ugeno.yoga.wki;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.oq.kq<bob> {
    private csi et;
    private com.bytedance.adsdk.ugeno.yoga.kq iaf;
    private suf jwr;
    private com.bytedance.adsdk.ugeno.yoga.kq oz;
    private rhi rxz;
    private nn zp;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.oq.kq$kq, reason: collision with other inner class name */
    public static class C0235kq extends com.bytedance.adsdk.ugeno.oq.kq.C0230kq {
        private boolean bss;
        public int ebt;
        public float fgm;
        public int ha;
        public float ibd;
        public int ktb;
        public int nz;
        public float rs;
        private boolean syw;
        private boolean tvh;
        private boolean wbn;
        private boolean wee;
        public int wf;
        private boolean wol;
        public int xn;
        public float yyl;
        public int zfx;

        public C0235kq(com.bytedance.adsdk.ugeno.oq.kq kqVar) {
            super(kqVar);
            this.ebt = 1;
            this.ibd = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rs = 1.0f;
            this.ha = com.bytedance.adsdk.ugeno.yoga.kq.AUTO.kq();
            this.fgm = -1.0f;
            this.zfx = wki.RELATIVE.kq();
        }

        private void fou() {
            com.bytedance.adsdk.ugeno.oq.kq kqVar = this.ou;
            if (kqVar instanceof kq) {
                if (((kq) kqVar).pms() == csi.ROW && this.ou.nz() == -2 && this.kq == -1.0f && !this.ou.syw()) {
                    this.kq = -2.0f;
                    this.rs = 1.0f;
                    this.ibd = 1.0f;
                    this.wol = true;
                    this.fgm = -1.0f;
                }
                if (((kq) this.ou).pms() == csi.COLUMN && this.ou.yyl() == -2 && this.oq == -1.0f && !this.ou.syw()) {
                    this.oq = -2.0f;
                    this.rs = 1.0f;
                    this.ibd = 1.0f;
                    this.wol = true;
                    this.fgm = -1.0f;
                }
            }
        }

        public boolean bob() {
            float f10 = this.kq;
            if (f10 == -1.0f && this.oq == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.oq == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
        public bob.kq kq() {
            fou();
            bob.kq kqVar = new bob.kq((int) this.kq, (int) this.oq);
            kqVar.vvw((int) (this.fax ? this.rhi : this.csi));
            kqVar.suf((int) (this.mq ? this.rjo : this.csi));
            kqVar.ubx((int) (this.jhe ? this.syt : this.csi));
            kqVar.wki((int) (this.uml ? this.dgq : this.csi));
            kqVar.kq(this.ebt);
            kqVar.csi(this.ha);
            kqVar.oq(this.ibd);
            kqVar.bob(this.rs);
            kqVar.mxq(this.bob);
            kqVar.sns(this.fou);
            if (this.wol) {
                kqVar.fou(this.fgm);
            }
            kqVar.rhi(this.zfx);
            if (this.bss) {
                kqVar.rjo(this.ktb);
            }
            if (this.wee) {
                kqVar.dgq(this.wf);
            }
            if (this.tvh) {
                kqVar.syt(this.xn);
            }
            if (this.wbn) {
                kqVar.nn(this.nz);
            }
            if (this.syw && bob()) {
                float f10 = this.yyl;
                if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    kqVar.nze(f10);
                    kqVar.bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    kqVar.oq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            return kqVar;
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        public String toString() {
            return "LayoutParams{mOrder=" + this.ebt + ", mFlexGrow=" + this.ibd + ", mFlexShrink=" + this.rs + ", mAlignSelf=" + this.ha + ", mFlexBasis=" + this.fgm + ", mPosition=" + this.zfx + ", mTop=" + this.ktb + ", mBottom=" + this.wf + ", mLeft=" + this.xn + ", mRight=" + this.nz + '}';
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        public void kq(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.kq(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.wol = true;
                    float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, -1.0f);
                    this.fgm = fKq;
                    this.fgm = syt.kq(context, fKq);
                    break;
                case "bottom":
                    this.wee = true;
                    this.wf = (int) syt.kq(context, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0));
                    break;
                case "top":
                    this.bss = true;
                    this.ktb = (int) syt.kq(context, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0));
                    break;
                case "left":
                    this.tvh = true;
                    this.xn = (int) syt.kq(context, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0));
                    break;
                case "order":
                    this.ebt = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1);
                    break;
                case "ratio":
                    this.syw = true;
                    this.yyl = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "right":
                    this.wbn = true;
                    this.nz = (int) syt.kq(context, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0));
                    break;
                case "position":
                    this.zfx = wki.kq(str2).kq();
                    break;
                case "flexShrink":
                    this.rs = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.ibd = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "alignSelf":
                    this.ha = com.bytedance.adsdk.ugeno.yoga.kq.kq(str2).kq();
                    break;
            }
        }
    }

    public kq(Context context) {
        super(context);
        this.et = csi.ROW;
        this.jwr = suf.NO_WRAP;
        this.rxz = rhi.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.kq kqVar = com.bytedance.adsdk.ugeno.yoga.kq.STRETCH;
        this.iaf = kqVar;
        this.oz = kqVar;
    }

    public csi pms() {
        return this.et;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    protected void rs() {
        ImageView.ScaleType scaleType;
        if (this.tvh) {
            com.bytedance.adsdk.ugeno.csi.kq().oq().kq(this.dgq, this.wol, new com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq() { // from class: com.bytedance.adsdk.ugeno.yoga.oq.kq.1
                @Override // com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq
                public void kq(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn != null) {
                            com.bytedance.adsdk.ugeno.core.rhi unused = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn;
                            String unused2 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).wol;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn != null) {
                        com.bytedance.adsdk.ugeno.core.rhi unused3 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn;
                        String unused4 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).wol;
                    }
                    final Bitmap bitmapKq = syt.kq(((com.bytedance.adsdk.ugeno.oq.bob) kq.this).oq, bitmap, (int) ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).wee);
                    if (bitmapKq != null) {
                        syt.kq(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.oq.kq.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                kq.this.kq(new BitmapDrawable(bitmapKq));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.dgq.fou.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.fou.kq(this.oq);
        com.bytedance.adsdk.ugeno.csi.kq().oq().kq(this.dgq, this.wol, kqVar, this.csi.getWidth(), this.csi.getHeight(), new com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq() { // from class: com.bytedance.adsdk.ugeno.yoga.oq.kq.2
            @Override // com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq
            public void kq(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn != null) {
                        com.bytedance.adsdk.ugeno.core.rhi unused = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn;
                        String unused2 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).wol;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn != null) {
                    com.bytedance.adsdk.ugeno.core.rhi unused3 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).evn;
                    String unused4 = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).wol;
                }
            }
        });
        if (!this.wbn || (scaleType = this.bss) == ImageView.ScaleType.FIT_XY) {
            kqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            kqVar.setScaleType(scaleType);
        }
        kqVar.setCornerRadius(this.syw);
        bob.kq kqVar2 = new bob.kq(-1, -1);
        kqVar2.rhi(wki.ABSOLUTE.kq());
        kqVar2.rjo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kqVar2.syt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t10 = this.csi;
        if (t10 instanceof bob) {
            ((bob) t10).addView(kqVar, 0, kqVar2);
            kq(kqVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public bob kq() {
        bob bobVar = new bob(this.oq);
        bobVar.kq(this);
        this.zp = bobVar.getYogaNode();
        return bobVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public C0235kq nn() {
        return new C0235kq(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        this.zp.kq(this.et);
        this.zp.kq(this.jwr);
        this.zp.kq(this.rxz);
        this.zp.kq(this.iaf);
        this.zp.bob(this.oz);
        this.zp.kq(true);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    protected void suf() {
        if (this.zfx) {
            this.zp.oq(fou.ALL, this.ebt);
        }
        if (this.ktb) {
            this.zp.oq(fou.LEFT, this.ibd);
        }
        if (this.wf) {
            this.zp.oq(fou.RIGHT, this.rs);
        }
        if (this.xn) {
            this.zp.oq(fou.TOP, this.ha);
        }
        if (this.nz) {
            this.zp.oq(fou.BOTTOM, this.fgm);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    protected void kq(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.dgq.fou.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.fou.kq(this.oq);
        kqVar.setImageDrawable(drawable);
        if (this.wbn && (scaleType = this.bss) != ImageView.ScaleType.FIT_XY) {
            kqVar.setScaleType(scaleType);
        } else {
            kqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        kqVar.setCornerRadius(this.syw);
        bob.kq kqVar2 = new bob.kq(-1, -1);
        kqVar2.rhi(wki.ABSOLUTE.kq());
        kqVar2.rjo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kqVar2.syt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t10 = this.csi;
        if (t10 instanceof bob) {
            ((bob) t10).addView(kqVar, 0, kqVar2);
            kq(kqVar);
        }
    }

    private void kq(final com.bytedance.adsdk.ugeno.dgq.fou.kq kqVar) {
        this.csi.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.oq.kq.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                nn nnVarKq;
                if (((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi == null || (nnVarKq = ((bob) ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi).kq(kqVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi.getWidth();
                nnVarKq.fou(width);
                int height = ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi.getHeight();
                nnVarKq.rhi(height);
                kqVar.setCornerRadius(((com.bytedance.adsdk.ugeno.oq.bob) kq.this).syw);
                ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.oq.bob) kq.this).csi.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq
    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        super.kq(bobVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq
    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, ViewGroup.LayoutParams layoutParams) {
        if (bobVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oq.kq) this).kq.add(bobVar);
        View viewUbx = bobVar.ubx();
        if (viewUbx != null) {
            ((bob) this.csi).addView(viewUbx, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.iaf = com.bytedance.adsdk.ugeno.yoga.kq.kq(str2);
                break;
            case "flexDirection":
                this.et = csi.kq(str2);
                break;
            case "alignContent":
                this.oz = com.bytedance.adsdk.ugeno.yoga.kq.kq(str2);
                break;
            case "flexWrap":
                this.jwr = suf.kq(str2);
                break;
            case "justifyContent":
                this.rxz = rhi.kq(str2);
                break;
        }
    }
}
