package com.bytedance.adsdk.ugeno.oq;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq<E extends ViewGroup> extends bob {
    protected List<bob<View>> kq;

    public kq(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    protected bob bob(String str) {
        bob<T> bobVarRjo;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.vvw) && this.xk == 0) {
            return this;
        }
        if (this.xk != 0) {
            return null;
        }
        for (bob<View> bobVar : this.kq) {
            if (bobVar != null && (bobVarRjo = bobVar.rjo(str)) != 0) {
                return bobVarRjo;
            }
        }
        return null;
    }

    public List<bob<View>> dgq() {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    protected bob fou(String str) {
        bob<T> bobVarSyt;
        if (!TextUtils.isEmpty(str) && wki(str) != null) {
            return this;
        }
        for (bob<View> bobVar : this.kq) {
            if (bobVar != null && (bobVarSyt = bobVar.syt(str)) != 0) {
                return bobVarSyt;
            }
        }
        return null;
    }

    public void kq(bob bobVar) {
        if (bobVar == null) {
            return;
        }
        this.kq.add(bobVar);
        View viewUbx = bobVar.ubx();
        if (viewUbx != null) {
            ((ViewGroup) this.csi).addView(viewUbx);
        }
    }

    public C0230kq nn() {
        return new C0230kq(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
    }

    public kq(Context context, kq kqVar) {
        super(context, kqVar);
        this.kq = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public bob oq(String str) {
        bob<T> bobVarRhi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.vvw)) {
            return this;
        }
        for (bob<View> bobVar : this.kq) {
            if (bobVar != null && (bobVarRhi = bobVar.rhi(str)) != 0) {
                return bobVarRhi;
            }
        }
        return null;
    }

    public void kq(bob bobVar, ViewGroup.LayoutParams layoutParams) {
        if (bobVar == null) {
            return;
        }
        this.kq.add(bobVar);
        View viewUbx = bobVar.ubx();
        if (viewUbx != null) {
            ((ViewGroup) this.csi).addView(viewUbx, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public bob kq(String str) {
        bob<T> bobVarCsi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.ubx)) {
            return this;
        }
        for (bob<View> bobVar : this.kq) {
            if (bobVar != null && (bobVarCsi = bobVar.csi(str)) != 0) {
                return bobVarCsi;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.oq.kq$kq, reason: collision with other inner class name */
    public static class C0230kq {
        protected float csi;
        protected float dgq;
        protected boolean fax;
        protected boolean gm;
        protected boolean jhe;
        protected boolean mq;
        protected boolean mxq;
        protected ViewGroup.LayoutParams nb;
        protected float nn;
        protected boolean nze;
        protected kq ou;
        protected float rhi;
        protected float rjo;
        protected boolean sns;
        protected float suf;
        protected float syt;
        protected float ubx;
        protected boolean uml;
        protected float vvw;
        protected boolean wcx;
        protected float wki;
        protected float kq = -2.0f;
        protected float oq = -2.0f;
        protected float bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        protected float fou = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public C0230kq(kq kqVar) {
            this.ou = kqVar;
        }

        public void kq(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.ubx = syt.kq(context, str2);
                    this.mxq = true;
                    break;
                case "minWidth":
                    this.bob = syt.kq(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.oq = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.oq = syt.kq(context, str2);
                        } else {
                            this.oq = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.csi = syt.kq(context, str2);
                    break;
                case "marginTop":
                    this.syt = syt.kq(context, str2);
                    this.jhe = true;
                    break;
                case "padding":
                    this.nn = syt.kq(context, str2);
                    this.nze = true;
                    break;
                case "marginBottom":
                    this.dgq = syt.kq(context, str2);
                    this.uml = true;
                    break;
                case "minHeight":
                    this.fou = syt.kq(context, str2);
                    break;
                case "paddingTop":
                    this.vvw = syt.kq(context, str2);
                    this.wcx = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.kq = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.kq = syt.kq(context, str2);
                        } else {
                            this.kq = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.suf = syt.kq(context, str2);
                    this.gm = true;
                    break;
                case "paddingRight":
                    this.wki = syt.kq(context, str2);
                    this.sns = true;
                    break;
                case "marginRight":
                    this.rjo = syt.kq(context, str2);
                    this.mq = true;
                    break;
                case "marginLeft":
                    this.rhi = syt.kq(context, str2);
                    this.fax = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.kq + ", mHeight=" + this.oq + ", mMargin=" + this.csi + ", mMarginLeft=" + this.rhi + ", mMarginRight=" + this.rjo + ", mMarginTop=" + this.syt + ", mMarginBottom=" + this.dgq + ", mParams=" + this.nb + '}';
        }

        public ViewGroup.LayoutParams kq() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.kq, (int) this.oq);
            marginLayoutParams.leftMargin = (int) (this.fax ? this.rhi : this.csi);
            marginLayoutParams.rightMargin = (int) (this.mq ? this.rjo : this.csi);
            marginLayoutParams.topMargin = (int) (this.jhe ? this.syt : this.csi);
            marginLayoutParams.bottomMargin = (int) (this.uml ? this.dgq : this.csi);
            return marginLayoutParams;
        }
    }
}
