package com.bytedance.sdk.component.adexpress.csi;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.oq.rjo;
import com.bytedance.sdk.component.adexpress.oq.syt;
import com.bytedance.sdk.component.adexpress.oq.ubx;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.dgq.rhi;
import com.bytedance.sdk.component.utils.suf;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements com.bytedance.sdk.component.adexpress.kq, com.bytedance.sdk.component.adexpress.oq.fou<rhi>, ubx, com.bytedance.sdk.component.adexpress.theme.kq {
    protected boolean bob;
    private String dgq;
    protected rhi fou;
    protected JSONObject kq;
    private volatile rjo nn;
    protected boolean oq;
    private Context rjo;
    private int suf;
    private String syt;
    private syt ubx;
    private wki vvw;
    private boolean wki;
    protected int csi = 8;
    protected AtomicBoolean rhi = new AtomicBoolean(false);

    public kq(Context context, wki wkiVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.oq = false;
        this.rjo = context;
        this.vvw = wkiVar;
        this.syt = wkiVar.fou();
        themeStatusBroadcastReceiver.kq(this);
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            vvw();
            return;
        }
        rhi rhiVarWki = wki();
        this.fou = rhiVarWki;
        if (rhiVarWki != null) {
            this.oq = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.fou.kq() != null) {
                this.fou = new rhi(com.bytedance.sdk.component.adexpress.fou.kq(), rhi.bob.ADS);
            }
        }
    }

    private void suf() {
        if (this.vvw.uml()) {
            csi.kq().oq(this.fou);
        } else {
            csi.kq().bob(this.fou);
        }
    }

    private void vvw() {
        if (this.rjo == null && com.bytedance.sdk.component.adexpress.fou.kq() != null) {
            this.rjo = com.bytedance.sdk.component.adexpress.fou.kq();
        }
        if (this.rjo != null) {
            rhi rhiVarWki = wki();
            this.fou = rhiVarWki;
            if (rhiVarWki == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.fou = new rhi(new MutableContextWrapper(this.rjo.getApplicationContext()), this.vvw.uml() ? rhi.bob.ADS_V3 : rhi.bob.ADS);
            } else {
                this.oq = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private rhi wki() {
        return this.vvw.uml() ? csi.kq().kq(this.rjo, this.syt) : csi.kq().oq(this.rjo, this.syt);
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    public int bob() {
        return 0;
    }

    protected void dgq() {
    }

    public void fou() {
        if (this.rhi.get()) {
            return;
        }
        this.rhi.set(true);
        rjo();
        if (this.fou.getParent() != null) {
            ((ViewGroup) this.fou.getParent()).removeView(this.fou);
        }
        if (this.bob) {
            suf();
        } else {
            csi.kq().fou(this.fou);
        }
    }

    public abstract void kq(int i10);

    protected void nn() {
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public rhi csi() {
        return kq();
    }

    public void rhi() {
        if (kq() == null) {
            return;
        }
        try {
            kq().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public abstract void rjo();

    public void syt() {
        dgq();
        Activity activityKq = com.bytedance.sdk.component.utils.oq.kq(this.fou);
        if (activityKq != null) {
            this.suf = oq(activityKq);
        }
    }

    public wki ubx() {
        return this.vvw;
    }

    private int oq(Activity activity) {
        return activity.hashCode();
    }

    public void kq(String str) {
        this.dgq = str;
    }

    public rhi kq() {
        return this.fou;
    }

    public void kq(syt sytVar) {
        this.ubx = sytVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.fou
    public void kq(rjo rjoVar) {
        String str;
        this.nn = rjoVar;
        if (kq() != null && kq().getWebView() != null) {
            if (TextUtils.isEmpty(this.dgq)) {
                this.nn.kq(102, "url is empty");
                return;
            }
            if (!this.vvw.uml()) {
                if (!com.bytedance.sdk.component.adexpress.kq.oq.oq.kq(this.kq)) {
                    rjo rjoVar2 = this.nn;
                    StringBuilder sb = new StringBuilder("data null is ");
                    sb.append(this.kq == null);
                    rjoVar2.kq(103, sb.toString());
                    return;
                }
            } else if (bob() == 9 && !com.bytedance.sdk.component.adexpress.kq.oq.oq.oq(this.kq)) {
                rjo rjoVar3 = this.nn;
                StringBuilder sb2 = new StringBuilder("data null is ");
                sb2.append(this.kq == null);
                rjoVar3.kq(103, sb2.toString());
                return;
            }
            this.vvw.csi().kq(this.oq);
            if (this.oq) {
                try {
                    int iOu = this.vvw.ou();
                    if (this.vvw.uml() && iOu == 1) {
                        this.vvw.bob();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.vvw.bob() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.fou.sns();
                    this.vvw.csi();
                    suf.kq(this.fou.getWebView(), str);
                    return;
                } catch (Exception e10) {
                    csi.kq().fou(this.fou);
                    this.nn.kq(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            rhi rhiVarKq = kq();
            rhiVarKq.sns();
            this.vvw.csi();
            rhiVarKq.a_(this.dgq);
            return;
        }
        rjo rjoVar4 = this.nn;
        StringBuilder sb3 = new StringBuilder("SSWebview null is ");
        sb3.append(kq() == null);
        sb3.append(" or Webview is null");
        rjoVar4.kq(102, sb3.toString());
    }

    public void kq(boolean z9) {
        this.wki = z9;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.ubx
    public void kq(final com.bytedance.sdk.component.adexpress.oq.suf sufVar) {
        if (sufVar == null) {
            if (this.nn != null) {
                this.nn.kq(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zOq = sufVar.oq();
        final float fBob = (float) sufVar.bob();
        final float fFou = (float) sufVar.fou();
        if (bob() == 0 && (fBob <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFou <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            if (this.nn != null) {
                this.nn.kq(105, "width is " + fBob + "height is " + fFou);
                return;
            }
            return;
        }
        this.bob = zOq;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            kq(sufVar, fBob, fFou);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.csi.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.kq(sufVar, fBob, fFou);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(com.bytedance.sdk.component.adexpress.oq.suf sufVar, float f10, float f11) {
        sufVar.nn();
        boolean z9 = this.bob;
        if (z9 && !this.wki) {
            kq(f10, f11);
            kq(this.csi);
            if (this.nn != null) {
                this.nn.kq(kq(), sufVar);
                return;
            }
            return;
        }
        if (!z9) {
            csi.kq().fou(this.fou);
        }
        kq(sufVar.nn(), sufVar.dgq());
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.ubx
    public void kq(View view, int i10, com.bytedance.sdk.component.adexpress.bob bobVar) {
        syt sytVar = this.ubx;
        if (sytVar != null) {
            sytVar.kq(view, i10, bobVar);
        }
    }

    private void kq(float f10, float f11) {
        this.vvw.csi().csi();
        if (bob() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kq().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            kq().setLayoutParams(layoutParams);
            return;
        }
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.rjo, f10);
        int iKq2 = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.rjo, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) kq().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iKq, iKq2);
        }
        layoutParams2.width = iKq;
        layoutParams2.height = iKq2;
        kq().setLayoutParams(layoutParams2);
    }

    private void kq(int i10, String str) {
        if (this.nn != null) {
            this.nn.kq(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.kq
    public void kq(Activity activity) {
        if (this.suf == 0 || activity == null || activity.hashCode() != this.suf) {
            return;
        }
        fou();
        nn();
    }

    public void kq(JSONObject jSONObject) {
        this.kq = jSONObject;
    }
}
