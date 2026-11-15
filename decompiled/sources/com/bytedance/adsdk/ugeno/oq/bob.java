package com.bytedance.adsdk.ugeno.oq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.mxq;
import com.bytedance.adsdk.ugeno.core.nn;
import com.bytedance.adsdk.ugeno.core.nze;
import com.bytedance.adsdk.ugeno.core.oq.csi;
import com.bytedance.adsdk.ugeno.core.rhi;
import com.bytedance.adsdk.ugeno.core.rjo;
import com.bytedance.adsdk.ugeno.core.suf;
import com.bytedance.adsdk.ugeno.core.syt;
import com.bytedance.adsdk.ugeno.core.ubx;
import com.bytedance.adsdk.ugeno.core.wcx;
import com.bytedance.adsdk.ugeno.core.wki;
import com.bytedance.adsdk.ugeno.fou;
import com.bytedance.adsdk.ugeno.fou.dgq;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob<T extends View> implements View.OnTouchListener, nze.kq, nze.oq, fou {
    private String aed;
    protected float aq;
    protected boolean aqe;
    private boolean ax;
    private String ayo;
    private com.bytedance.adsdk.ugeno.fou.kq.kq be;
    protected JSONObject bob;
    protected ImageView.ScaleType bss;
    protected Map<Integer, wki> clh;
    protected T csi;
    protected ubx dgq;
    private float dra;
    protected float ea;
    protected float ebt;
    private boolean et;
    protected rhi evn;
    protected float fax;
    protected float fgm;
    protected float fm;
    protected JSONObject fou;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oq.oq fsp;
    private boolean gg;
    protected float gm;
    protected float ha;
    protected ViewGroup.LayoutParams hlh;
    protected float hn;
    private boolean iaf;
    protected float ibd;
    private long iy;
    protected boolean jhe;
    protected float jhy;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oq.rhi job;
    protected boolean jq;
    private boolean jqv;
    private com.bytedance.adsdk.ugeno.core.kq ju;
    private boolean jvy;
    private boolean jwr;
    private boolean kfr;
    private boolean kiq;
    private boolean kq;
    protected boolean ktb;
    protected dgq ldy;
    private JSONObject lqo;
    protected float ls;
    protected float mq;
    protected float mxq;
    protected float mz;
    protected boolean nb;
    protected boolean nn;
    protected float noa;
    protected boolean nz;
    protected float nze;
    protected Context oq;
    protected boolean ou;
    protected float oxe;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oq.bob oyl;
    private boolean oz;
    protected float pfu;
    protected boolean pms;
    protected nze pw;
    protected com.bytedance.adsdk.ugeno.kq.kq qdf;
    protected int qip;
    private wcx qvq;
    protected float rao;
    protected float rhg;
    protected kq<ViewGroup> rhi;
    protected kq<ViewGroup> rjo;
    protected float rrl;
    protected float rs;
    protected float rul;
    private boolean rxz;
    protected float rz;
    protected float sns;
    protected float suf;
    protected rjo.kq syt;
    protected float syw;
    private boolean tk;
    private boolean tn;
    protected boolean tvh;
    protected boolean uaj;
    protected String ubx;
    protected float ui;
    protected com.bytedance.adsdk.ugeno.rjo.kq.C0232kq ul;
    protected boolean uml;
    protected mxq vd;
    private boolean vdk;
    protected syt vho;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.oq.fou.kq vi;
    private boolean vt;
    protected String vvw;
    protected boolean wbn;
    protected float wcx;
    protected float wee;
    protected boolean wf;
    protected com.bytedance.adsdk.ugeno.kq.rhi wj;
    protected float wki;
    protected String wol;

    @Deprecated
    private csi wqw;
    protected float wxb;
    private nn xb;
    private boolean xgx;
    protected int xk;
    protected boolean xn;
    protected boolean xp;
    protected boolean ye;
    private boolean ymy;
    private GradientDrawable yo;
    protected String ysx;
    protected int yyl;
    private boolean ze;
    protected boolean zfx;
    private boolean zp;

    public bob(Context context) {
        this(context, null);
    }

    private void dgq() {
        wki wkiVar;
        if (this.pw == null || !oq(18) || (wkiVar = this.clh.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectBob = wkiVar.bob();
        if (jSONObjectBob != null) {
            try {
                jSONObjectBob.put("rotateZ", com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObjectBob.optString("rotateZ"), this.fou));
            } catch (JSONException unused) {
            }
        }
        this.pw.kq(wkiVar, this, this);
    }

    @Deprecated
    private void fou() {
        com.bytedance.adsdk.ugeno.core.oq.fou fouVarFou;
        this.csi.setVisibility(this.xk);
        float f10 = this.jhy;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.csi.setRotation(f10);
        }
        rjo.kq kqVar = this.syt;
        if (kqVar != null && TextUtils.isEmpty(kqVar.oq())) {
            this.csi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.oq.bob.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    bob bobVar = bob.this;
                    if (bobVar.vho != null) {
                        boolean unused = bobVar.jvy;
                    }
                }
            });
        } else if (oq(1) && !this.tk) {
            this.csi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.oq.bob.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    bob bobVar = bob.this;
                    if (bobVar.pw == null || !bobVar.jvy) {
                        return;
                    }
                    bob bobVar2 = bob.this;
                    nze nzeVar = bobVar2.pw;
                    wki wkiVar = bobVar2.clh.get(1);
                    bob bobVar3 = bob.this;
                    nzeVar.kq(wkiVar, bobVar3, bobVar3);
                }
            });
        }
        if (this.pw != null && oq(4)) {
            if (oq(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + wf());
                this.xgx = true;
                this.wqw = new csi(this.oq, this.clh.get(4), this.clh.get(1), this.xgx, jq());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + wf());
                this.wqw = new csi(this.oq, this.clh.get(4), this.xgx, jq());
            }
        }
        if (this.pw != null && oq(1) && this.tk) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.tk + ", view.id: " + wf());
            this.oyl = new com.bytedance.adsdk.ugeno.core.oq.bob(this.oq, this.clh.get(1));
        }
        dgq();
        if (this.pw != null && oq(3) && (fouVarFou = com.bytedance.adsdk.ugeno.csi.kq().fou()) != null) {
            this.vi = fouVarFou.kq(this.oq, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.oq.bob.3
            };
        }
        if (this.pw != null && oq(9)) {
            com.bytedance.adsdk.ugeno.core.oq.rhi rhiVar = new com.bytedance.adsdk.ugeno.core.oq.rhi(this.oq, this.clh.get(9), this);
            this.job = rhiVar;
            rhiVar.kq(this.pw);
        }
        if (oq(10)) {
            com.bytedance.adsdk.ugeno.core.oq.oq oqVar = new com.bytedance.adsdk.ugeno.core.oq.oq(this.oq, this.clh.get(10), this);
            this.fsp = oqVar;
            oqVar.kq(this.pw);
        }
    }

    private void nn() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ubx);
        this.csi.setContentDescription(sb);
    }

    private void pms() {
        if (TextUtils.equals("dashed", this.ysx)) {
            GradientDrawable gradientDrawable = this.yo;
            float f10 = this.ea;
            gradientDrawable.setStroke((int) f10, this.qip, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.ysx)) {
                this.yo.setStroke((int) this.ea, this.qip);
                return;
            }
            GradientDrawable gradientDrawable2 = this.yo;
            float f11 = this.ea;
            gradientDrawable2.setStroke((int) f11, this.qip, f11 / 2.0f, f11);
        }
    }

    private void xp() {
        float f10 = this.ye ? this.ls : this.syw;
        float f11 = this.jq ? this.pfu : this.syw;
        float f12 = this.pms ? this.rz : this.syw;
        float f13 = this.xp ? this.oxe : this.syw;
        this.yo.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    public int bss() {
        return this.yyl;
    }

    public bob<T> csi(String str) {
        return kq(str);
    }

    public JSONObject ebt() {
        return this.bob;
    }

    public float fax() {
        return this.mz;
    }

    public rjo.kq fgm() {
        return this.syt;
    }

    public float gm() {
        return this.rrl;
    }

    public ViewGroup.LayoutParams ha() {
        return this.hlh;
    }

    protected void ibd() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapKq;
        if (TextUtils.isEmpty(this.wol)) {
            if (this.aqe) {
                kq(this.ul);
                return;
            } else {
                this.yo.setColor(this.yyl);
                fou(this.yyl);
                return;
            }
        }
        if (!this.wol.startsWith("local://")) {
            rs();
            return;
        }
        String strReplace = this.wol.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.tvh ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.oq.getResources().openRawResource(com.bytedance.adsdk.ugeno.rjo.fou.oq(this.oq, strReplace)), null, options);
            if (!this.tvh || (bitmapKq = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, bitmapDecodeStream, (int) this.wee)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.oq.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.oq.getResources(), bitmapKq);
            }
            kq(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public float jhe() {
        return this.rul;
    }

    public boolean jq() {
        return this.jqv;
    }

    public T kq() {
        return null;
    }

    public kq ktb() {
        return this.rhi;
    }

    public float ls() {
        T t10 = this.csi;
        return t10 instanceof com.bytedance.adsdk.ugeno.kq.rjo ? ((com.bytedance.adsdk.ugeno.kq.rjo) t10).getRipple() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float mq() {
        return this.jhy;
    }

    public float mxq() {
        return this.fm;
    }

    public nze nb() {
        return this.pw;
    }

    public int nz() {
        return (int) this.wki;
    }

    public float nze() {
        return this.aq;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        csi csiVar;
        nze nzeVar;
        com.bytedance.adsdk.ugeno.core.oq.bob bobVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            tvh();
        } else if (action == 1 || action == 3) {
            wbn();
        }
        mxq mxqVar = this.vd;
        if (mxqVar != null) {
            mxqVar.kq(this, motionEvent);
        }
        if (oq(17) && motionEvent.getAction() == 0) {
            this.pw.kq(this.clh.get(17), this, this);
        }
        if (oq(1) && this.tk && (nzeVar = this.pw) != null && (bobVar = this.oyl) != null) {
            return bobVar.kq(nzeVar, this, motionEvent);
        }
        nze nzeVar2 = this.pw;
        if (nzeVar2 != null && (csiVar = this.wqw) != null) {
            return csiVar.kq(nzeVar2, this, motionEvent, jq());
        }
        dgq dgqVar = this.ldy;
        if (dgqVar != null) {
            return dgqVar.kq(motionEvent);
        }
        return false;
    }

    public void oq(JSONObject jSONObject) {
        this.fou = jSONObject;
        wki();
    }

    public long ou() {
        return this.iy;
    }

    public float oxe() {
        T t10 = this.csi;
        return t10 instanceof com.bytedance.adsdk.ugeno.kq.rjo ? ((com.bytedance.adsdk.ugeno.kq.rjo) t10).getRubIn() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float pfu() {
        T t10 = this.csi;
        return t10 instanceof com.bytedance.adsdk.ugeno.kq.rjo ? ((com.bytedance.adsdk.ugeno.kq.rjo) t10).getStretch() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public bob<T> rhi(String str) {
        return oq(str);
    }

    public void rjo() {
        com.bytedance.adsdk.ugeno.core.kq kqVar = this.ju;
        if (kqVar != null) {
            nn nnVar = new nn(this.csi, kqVar);
            this.xb = nnVar;
            nnVar.kq();
        }
        com.bytedance.adsdk.ugeno.kq.kq kqVar2 = this.qdf;
        if (kqVar2 != null) {
            kqVar2.kq();
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            rhiVar.oq();
        }
        dgq dgqVar = this.ldy;
        if (dgqVar != null) {
            dgqVar.csi();
        }
        if (this.fsp != null && oq(10)) {
            this.fsp.kq();
        }
        if (this.job != null && oq(9)) {
            this.job.kq();
        }
        csi csiVar = this.wqw;
        if (csiVar != null) {
            csiVar.kq();
        }
        this.iy = System.currentTimeMillis();
    }

    protected void rs() {
        com.bytedance.adsdk.ugeno.csi.kq().oq().kq(this.dgq, this.wol, new com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq() { // from class: com.bytedance.adsdk.ugeno.oq.bob.4
            @Override // com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq
            public void kq(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                bob bobVar = bob.this;
                if (!bobVar.tvh) {
                    com.bytedance.adsdk.ugeno.rjo.syt.kq(new Runnable() { // from class: com.bytedance.adsdk.ugeno.oq.bob.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            bob.this.kq(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapKq = com.bytedance.adsdk.ugeno.rjo.syt.kq(bobVar.oq, bitmap, (int) bobVar.wee);
                if (bitmapKq != null) {
                    com.bytedance.adsdk.ugeno.rjo.syt.kq(new Runnable() { // from class: com.bytedance.adsdk.ugeno.oq.bob.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            bob.this.kq(new BitmapDrawable(bitmapKq));
                        }
                    });
                }
            }
        });
    }

    public float rz() {
        T t10 = this.csi;
        return t10 instanceof com.bytedance.adsdk.ugeno.kq.rjo ? ((com.bytedance.adsdk.ugeno.kq.rjo) t10).getShine() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float sns() {
        return this.noa;
    }

    protected void suf() {
        this.csi.setPadding((int) (this.ktb ? this.ibd : this.ebt), (int) (this.xn ? this.ha : this.ebt), (int) (this.wf ? this.rs : this.ebt), (int) (this.nz ? this.fgm : this.ebt));
    }

    public void syt() {
        nn nnVar = this.xb;
        if (nnVar != null) {
            nnVar.oq();
        }
        com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
        if (kqVar != null) {
            kqVar.bob();
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            rhiVar.bob();
        }
    }

    public boolean syw() {
        return this.ui > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    protected void tvh() {
    }

    public T ubx() {
        return this.csi;
    }

    public float uml() {
        return this.syw;
    }

    public JSONObject vvw() {
        return this.fou;
    }

    protected void wbn() {
    }

    public float wcx() {
        return this.rao;
    }

    public com.bytedance.adsdk.ugeno.fou.kq.kq wee() {
        return this.be;
    }

    public String wf() {
        return this.ubx;
    }

    public void wki() {
        this.jqv = this.fou.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.jqv);
    }

    public boolean wol() {
        return this.uaj;
    }

    public String xn() {
        return this.vvw;
    }

    public boolean ye() {
        return this.vt;
    }

    public int yyl() {
        return (int) this.suf;
    }

    public boolean zfx() {
        return this.nn;
    }

    public bob(Context context, kq<ViewGroup> kqVar) {
        this.wki = -2.0f;
        this.suf = -2.0f;
        this.ysx = "solid";
        this.xk = 0;
        this.uaj = true;
        this.hn = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.aq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.rhg = 1.0f;
        this.noa = 1.0f;
        this.rao = 1.0f;
        this.wxb = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.rrl = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.jhy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.rul = 1.0f;
        this.kfr = true;
        this.jvy = true;
        this.tn = false;
        this.gg = false;
        this.jqv = false;
        this.dra = 12.0f;
        this.oq = context;
        this.rhi = kqVar;
        this.clh = new HashMap();
        this.yo = new GradientDrawable();
        this.csi = (T) kq();
    }

    private void bob() {
        if (this.kq) {
            this.csi.setTranslationX(this.aq);
        }
        if (this.et) {
            this.csi.setTranslationY(this.fm);
        }
        if (this.jwr) {
            this.csi.setScaleX(this.noa);
        }
        if (this.rxz) {
            this.csi.setScaleY(this.rao);
        }
        if (this.iaf) {
            this.csi.setRotation(this.wxb);
        }
        if (this.oz) {
            this.csi.setRotationX(this.rrl);
        }
        if (this.zp) {
            this.csi.setRotationY(-this.mz);
        }
        if (this.ymy) {
            this.csi.setAlpha(this.rul);
        }
        float f10 = this.jhy;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.csi.setRotation(f10);
        }
        if (this.iaf || this.oz || this.zp) {
            this.csi.setCameraDistance(10000.0f);
        }
    }

    private boolean nze(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void csi() {
        if (this.qvq == null || this.vdk) {
            return;
        }
        this.vdk = true;
    }

    public void kq(JSONObject jSONObject) {
        this.fou = jSONObject;
        wki();
        JSONObject jSONObject2 = this.bob;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        kq.C0230kq c0230kqNn = this.rhi != null ? this.rhi.nn() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(this.bob.optString(next), jSONObject);
            kq(next, strKq);
            if (c0230kqNn != null) {
                c0230kqNn.kq(this.oq, next, strKq);
            }
        }
        if (c0230kqNn != null) {
            kq(c0230kqNn.kq());
        }
        if (this.lqo == null || this.fou == null) {
            return;
        }
        try {
            if (!zfx()) {
                this.fou.put("i18n", this.lqo);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.lqo);
            this.fou.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void rhi() {
        if (this.qvq == null || this.kiq) {
            return;
        }
        this.kiq = true;
    }

    public List<com.bytedance.adsdk.ugeno.fou.fou.bob> ubx(String str) {
        dgq dgqVar;
        if (TextUtils.isEmpty(str) || (dgqVar = this.ldy) == null) {
            return null;
        }
        return dgqVar.kq(str);
    }

    public com.bytedance.adsdk.ugeno.fou.fou.bob vvw(String str) {
        dgq dgqVar;
        if (TextUtils.isEmpty(str) || (dgqVar = this.ldy) == null) {
            return null;
        }
        return dgqVar.oq(str);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void oq() {
        ibd();
        suf();
        bob(this.xk);
        bob();
        fou();
        dgq dgqVar = this.ldy;
        if (dgqVar != null) {
            dgqVar.kq();
            this.ldy.oq();
            this.ldy.bob();
        }
        this.csi.setOnTouchListener(this);
        nn();
        ViewGroup viewGroup = (ViewGroup) this.csi.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.kfr);
        }
        com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
        if (kqVar != null) {
            kqVar.fou();
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            rhiVar.kq();
        }
        dgq dgqVar2 = this.ldy;
        if (dgqVar2 != null) {
            dgqVar2.fou();
        }
        if (this.pw == null || !oq(22)) {
            return;
        }
        this.pw.kq(this.clh.get(22), this, this);
    }

    public com.bytedance.adsdk.ugeno.kq.kq wki(String str) {
        com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
        if (kqVar != null && TextUtils.equals(str, kqVar.csi())) {
            return this.qdf;
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            return rhiVar.kq(str);
        }
        return null;
    }

    public void nn(String str) {
        this.vvw = str;
    }

    public void csi(int i10) {
        if (zfx()) {
            T t10 = this.csi;
            if (t10 instanceof oq) {
                ((oq) t10).kq(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof oq) {
                ((oq) viewParent).kq(this.csi, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.csi.getLayoutParams();
        layoutParams.width = i10;
        this.csi.setLayoutParams(layoutParams);
    }

    public void rhi(int i10) {
        if (zfx()) {
            T t10 = this.csi;
            if (t10 instanceof oq) {
                ((oq) t10).oq(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof oq) {
                ((oq) viewParent).oq(this.csi, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.csi.getLayoutParams();
        layoutParams.height = i10;
        this.csi.setLayoutParams(layoutParams);
    }

    private ImageView.ScaleType suf(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.bss = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.bss = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.bss = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.bss = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.bss;
    }

    public bob<T> syt(String str) {
        return fou(str);
    }

    public void dgq(String str) {
        this.ubx = str;
    }

    public bob<T> rjo(String str) {
        return bob(str);
    }

    public void kq(wcx wcxVar) {
        this.qvq = wcxVar;
    }

    public void kq(mxq mxqVar) {
        this.vd = mxqVar;
    }

    public void bob(int i10) {
        ViewParent viewParent = (ViewGroup) this.csi.getParent();
        if (viewParent instanceof oq) {
            ((oq) viewParent).bob(this.csi, i10);
        } else {
            this.csi.setVisibility(i10);
        }
    }

    public void kq(nze nzeVar) {
        this.pw = nzeVar;
    }

    protected void kq(com.bytedance.adsdk.ugeno.rjo.kq.C0232kq c0232kq) {
        if (c0232kq == null) {
            return;
        }
        this.yo.setShape(0);
        this.yo.setOrientation(c0232kq.kq);
        if (Build.VERSION.SDK_INT >= 29) {
            this.yo.setColors(c0232kq.oq, c0232kq.bob);
        } else {
            this.yo.setColors(c0232kq.oq);
        }
        xp();
        pms();
        this.csi.setBackground(this.yo);
    }

    public boolean oq(int i10) {
        Map<Integer, wki> map = this.clh;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void bob(JSONObject jSONObject) {
        this.bob = jSONObject;
    }

    protected bob<T> oq(String str) {
        if (TextUtils.isEmpty(this.vvw) || !TextUtils.equals(this.vvw, str)) {
            return null;
        }
        return this;
    }

    protected bob<T> bob(String str) {
        if (!TextUtils.isEmpty(this.vvw) && TextUtils.equals(this.vvw, str) && this.xk == 0) {
            return this;
        }
        return null;
    }

    protected void oq(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.clh == null) {
            return;
        }
        try {
            int iKq = suf.kq(str).kq();
            wki wkiVar = new wki();
            wkiVar.kq(iKq);
            wkiVar.kq(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iKq == 3) {
                try {
                    this.dra = Float.parseFloat(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("shakeAmplitude"), this.fou));
                } catch (NumberFormatException unused) {
                    this.dra = 12.0f;
                }
            }
            if (!(this.pw instanceof com.bytedance.adsdk.ugeno.core.kq.oq)) {
                kq(iKq, jSONObject, wkiVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    protected void kq(Drawable drawable) {
        this.csi.setBackground(drawable);
    }

    protected void fou(int i10) {
        this.yo.setShape(0);
        this.yo.setColor(i10);
        xp();
        pms();
        this.csi.setBackground(this.yo);
    }

    public void kq(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.csi;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.hlh = layoutParams;
    }

    public void kq(boolean z9, boolean z10) {
        if (this.csi != null) {
            kq(this.hlh);
            if (z9) {
                csi((int) this.wki);
            }
            if (z10) {
                rhi((int) this.suf);
            }
        }
    }

    protected bob<T> fou(String str) {
        if (wki(str) != null) {
            return this;
        }
        return null;
    }

    public void kq(rjo.kq kqVar) {
        this.syt = kqVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void oq(Canvas canvas) {
        if (this instanceof kq) {
            com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
            if (kqVar != null) {
                kqVar.oq(canvas);
            }
            com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
            if (rhiVar != null) {
                rhiVar.oq(canvas);
            }
        }
    }

    protected bob<T> kq(String str) {
        if (TextUtils.isEmpty(this.ubx) || !TextUtils.equals(this.ubx, str)) {
            return null;
        }
        return this;
    }

    public void kq(boolean z9) {
        this.nn = z9;
    }

    public void kq(kq kqVar) {
        this.rhi = kqVar;
    }

    public void kq(ubx ubxVar) {
        this.dgq = ubxVar;
    }

    public void kq(syt sytVar) {
        this.vho = sytVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void oq(int i10, int i11, int i12, int i13) {
        nn nnVar = this.xb;
        if (nnVar != null) {
            nnVar.kq(i10, i11);
        }
        com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
        if (kqVar != null) {
            kqVar.kq(i10, i11);
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            rhiVar.kq(i10, i11);
        }
    }

    public void kq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "clickable":
                this.jvy = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, true);
                break;
            case "onRenderSuccess":
            case "onDelay":
            case "onShake":
            case "onSlide":
            case "onTimer":
            case "onTwist":
            case "onDown":
            case "onTap":
            case "onLoadMore":
            case "onExposure":
            case "onAnimation":
            case "onPullToRefresh":
            case "onScroll":
            case "onLongTap":
                oq(str, str2);
                break;
            case "translateX":
                this.kq = true;
                this.aq = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "translateY":
                this.et = true;
                this.fm = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "paddingLeft":
                this.ibd = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.ktb = true;
                break;
            case "minWidth":
                this.fax = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "background":
            case "backgroundColor":
                if (com.bytedance.adsdk.ugeno.rjo.kq.bob(str2)) {
                    this.aqe = true;
                    this.ul = com.bytedance.adsdk.ugeno.rjo.kq.oq(str2);
                    break;
                } else {
                    this.yyl = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2, 0);
                    this.aqe = false;
                    break;
                }
                break;
            case "events":
                this.ldy = dgq.kq(this, str2);
                break;
            case "opacity":
                this.ymy = true;
                this.rul = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f);
                break;
            case "borderTopLeftRadius":
                this.ls = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.ye = true;
                break;
            case "height":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.suf = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.suf = -2.0f;
                } else {
                    this.suf = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                }
                this.gg = true;
                break;
            case "margin":
                this.nze = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                break;
            case "marginTop":
                this.wcx = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.nb = true;
                break;
            case "backgroundDrawable":
            case "backgroundImage":
                this.wol = str2;
                break;
            case "rotate":
                this.iaf = true;
                this.wxb = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scaleX":
                this.jwr = true;
                this.noa = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scaleY":
                this.rxz = true;
                this.rao = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "padding":
                this.ebt = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.zfx = true;
                break;
            case "triggerFunc":
                this.ayo = str2;
                break;
            case "marginBottom":
                this.gm = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.ou = true;
                break;
            case "minHeight":
                this.mq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "id":
                this.ubx = str2;
                break;
            case "i18n":
                this.lqo = com.bytedance.adsdk.ugeno.rjo.oq.kq(str2, (JSONObject) null);
                break;
            case "name":
                this.vvw = str2;
                break;
            case "backgroundImageBlur":
                float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.wee = fKq;
                if (fKq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.tvh = true;
                    break;
                }
                break;
            case "paddingTop":
                this.ha = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.xn = true;
                break;
            case "click":
                this.aed = str2;
                break;
            case "ratio":
                this.ui = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "scale":
                this.jwr = true;
                this.rxz = true;
                float[] fArrBob = com.bytedance.adsdk.ugeno.kq.fou.bob(str2);
                this.noa = fArrBob[0];
                this.rao = fArrBob[1];
                break;
            case "width":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.wki = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.wki = -2.0f;
                } else {
                    this.wki = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                }
                this.tn = true;
                break;
            case "paddingBottom":
                this.fgm = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.nz = true;
                break;
            case "animations":
                List<com.bytedance.adsdk.ugeno.kq.bob> listKq = com.bytedance.adsdk.ugeno.kq.fou.kq(str2, this.fou);
                if (listKq != null && !listKq.isEmpty()) {
                    this.wj = new com.bytedance.adsdk.ugeno.kq.rhi(this.oq, this, listKq);
                    break;
                }
                break;
            case "borderTopRightRadius":
                this.pfu = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.jq = true;
                break;
            case "overflow":
                this.kfr = nze(str2);
                break;
            case "borderBottomLeftRadius":
                this.rz = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.pms = true;
                break;
            case "borderBottomRightRadius":
                this.oxe = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.xp = true;
                break;
            case "paddingRight":
                this.rs = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.wf = true;
                break;
            case "borderColor":
                this.qip = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "borderStyle":
                this.ysx = str2;
                break;
            case "borderWidth":
                this.ea = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                break;
            case "marginRight":
                this.sns = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.uml = true;
                break;
            case "translate":
                this.kq = true;
                this.et = true;
                float[] fArrBob2 = com.bytedance.adsdk.ugeno.kq.fou.bob(str2);
                this.aq = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, fArrBob2[0]);
                this.fm = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, fArrBob2[1]);
                break;
            case "animation":
                try {
                    this.qdf = new com.bytedance.adsdk.ugeno.kq.kq(this.oq, this, com.bytedance.adsdk.ugeno.kq.fou.kq(new JSONObject(str2), this.fou));
                    break;
                } catch (JSONException unused) {
                    return;
                }
                break;
            case "animatorSet":
                this.ju = com.bytedance.adsdk.ugeno.core.kq.kq(str2, this);
                break;
            case "backgroundScale":
                this.wbn = true;
                this.bss = suf(str2);
                break;
            case "borderRadius":
                this.syw = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                break;
            case "rotateX":
                this.oz = true;
                this.rrl = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "rotateY":
                this.zp = true;
                this.mz = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "rotateZ":
                this.jhy = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "disable":
                this.vt = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, false);
                break;
            case "visibility":
                if (TextUtils.equals("visible", str2)) {
                    this.xk = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.xk = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.xk = 8;
                }
                this.csi.setVisibility(this.xk);
                break;
            case "marginLeft":
                this.mxq = com.bytedance.adsdk.ugeno.rjo.syt.kq(this.oq, str2);
                this.jhe = true;
                break;
            case "availability":
                this.uaj = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public bob oq(bob bobVar) {
        return (bobVar.ktb() == null && (bobVar instanceof kq)) ? bobVar : oq(bobVar.ktb());
    }

    public void oq(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.fou.fou.bob bobVarVvw = vvw(str);
        if (bobVarVvw == null) {
            return;
        }
        bobVarVvw.kq(this.ldy);
        bobVarVvw.kq(objArr);
    }

    @Deprecated
    protected void kq(int i10, JSONObject jSONObject, wki wkiVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            wki wkiVar2 = new wki();
            wkiVar2.kq(jSONObjectOptJSONObject);
            wkiVar2.kq(this);
            wkiVar.kq(wkiVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            wki wkiVar3 = new wki();
            wkiVar3.kq(jSONObjectOptJSONObject2);
            wkiVar3.kq(this);
            wkiVar.oq(wkiVar3);
        }
        wkiVar.kq(jSONObject);
        this.clh.put(Integer.valueOf(i10), wkiVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public int[] kq(int i10, int i11) {
        if (this.ui > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.tn) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.ui;
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.gg) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.ui;
                if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.qvq != null && !this.ze) {
            this.ze = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void kq(int i10, int i11, int i12, int i13) {
        if (this.qvq == null || this.ax) {
            return;
        }
        this.ax = true;
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void kq(Canvas canvas, IAnimation iAnimation) {
        nn nnVar = this.xb;
        if (nnVar != null) {
            nnVar.kq(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fou
    public void kq(Canvas canvas) {
        if (this instanceof kq) {
            return;
        }
        com.bytedance.adsdk.ugeno.kq.kq kqVar = this.qdf;
        if (kqVar != null) {
            kqVar.kq(canvas);
        }
        com.bytedance.adsdk.ugeno.kq.rhi rhiVar = this.wj;
        if (rhiVar != null) {
            rhiVar.kq(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.nze.oq
    public void kq(wki wkiVar) {
        kq<ViewGroup> kqVar;
        bob<T> bobVarCsi;
        if (wkiVar == null || wkiVar.bob() == null || !TextUtils.equals(wkiVar.bob().optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "onDismiss")) {
            return;
        }
        String strOptString = wkiVar.bob().optString("nodeId");
        bob(8);
        this.rjo = (kq) oq(this);
        if (TextUtils.isEmpty(strOptString) || (kqVar = this.rjo) == null || (bobVarCsi = kqVar.csi(strOptString)) == null) {
            return;
        }
        bobVarCsi.bob(8);
    }

    public void kq(com.bytedance.adsdk.ugeno.fou.kq.kq kqVar) {
        this.be = kqVar;
    }

    public void kq(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.fou.fou.bob> listUbx = ubx(str);
        if (listUbx == null || listUbx.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fou.fou.bob bobVar : listUbx) {
            bobVar.kq(this.ldy);
            bobVar.kq(objArr);
        }
    }

    public void kq(com.bytedance.adsdk.ugeno.core.csi csiVar) {
        dgq dgqVar = this.ldy;
        if (dgqVar != null) {
            dgqVar.kq(csiVar);
        }
    }

    public void kq(rhi rhiVar) {
        this.evn = rhiVar;
    }

    public void kq(com.bytedance.adsdk.ugeno.fou.wki wkiVar) {
        dgq dgqVar = this.ldy;
        if (dgqVar != null) {
            dgqVar.kq(wkiVar);
        }
    }
}
