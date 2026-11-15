package com.bytedance.sdk.openadsdk.core.dgq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi extends com.bytedance.sdk.component.dgq.rhi implements com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob {
    protected boolean csi;
    private bob dgq;
    protected boolean fou;
    private long mxq;
    private com.bytedance.sdk.openadsdk.core.model.uml nn;
    private int nze;
    AtomicBoolean rhi;
    AtomicBoolean rjo;
    private oq suf;
    private uml syt;
    private String ubx;
    private int vvw;
    private List<String> wki;

    static class kq extends com.bytedance.sdk.component.dgq.rhi.kq {
        public static final Set<String> kq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.dgq.csi.kq.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob oq;

        public kq(com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob interfaceC0267bob) {
            this.oq = interfaceC0267bob;
        }

        private void kq(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob interfaceC0267bob;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!kq.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0267bob = this.oq) == null) {
                    return;
                }
                interfaceC0267bob.oq(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob interfaceC0267bob = this.oq;
            if (interfaceC0267bob != null) {
                interfaceC0267bob.kq();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                kq(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            kq(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.oq.kq(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            kq(webResourceRequest.getUrl().toString());
        }

        private void kq(String str, int i10, String str2) {
            com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob interfaceC0267bob = this.oq;
            if (interfaceC0267bob != null) {
                interfaceC0267bob.kq(106, i10);
            }
        }
    }

    public interface oq {
        View kq();

        void kq(int i10, int i11);

        void kq(View view, int i10);

        void oq();
    }

    public csi(Context context) {
        super(context, com.bytedance.sdk.component.dgq.rhi.bob.DSP);
        this.fou = false;
        this.csi = false;
        this.rhi = new AtomicBoolean(false);
        this.rjo = new AtomicBoolean(false);
        this.vvw = 0;
    }

    private void mq() {
        if (this.wki == null) {
            com.bytedance.sdk.openadsdk.fou.bob.oq(this.nn, this.ubx, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.fou.bob.kq(new com.bytedance.sdk.component.syt.syt("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.dgq.csi.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (csi.this.wki != null && csi.this.rjo.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = csi.this.wki.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.fou.bob.oq(csi.this.nn, csi.this.ubx, "dsp_html_error_url", jSONObject);
                            csi.this.wki = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void fax() {
        this.rhi.set(false);
        String strDt = this.nn.dt();
        if (TextUtils.isEmpty(strDt)) {
            return;
        }
        String strKq = com.bytedance.sdk.openadsdk.core.vvw.csi.kq(strDt);
        String str = TextUtils.isEmpty(strKq) ? strDt : strKq;
        this.vvw = 0;
        kq(null, str, "text/html", "UTF-8", null);
        this.mxq = SystemClock.elapsedRealtime();
    }

    public void gm() {
        oq oqVar = this.suf;
        if (oqVar != null) {
            oqVar.oq();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.mxq);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.nn, this.ubx, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.dgq.rhi
    public void mxq() {
        this.dgq.oq();
        super.mxq();
    }

    @Override // com.bytedance.sdk.component.dgq.rhi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.fou) {
            this.dgq.kq(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.dgq.rhi, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.dgq.kq();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.nze / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.nn, this.ubx, "load_rate", jSONObject);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z9 = i10 == 0;
        this.csi = z9;
        this.dgq.kq(z9);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob
    public void oq(String str) {
        if (this.wki == null) {
            this.wki = new ArrayList();
        }
        this.wki.add(str);
    }

    public void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, oq oqVar, String str) {
        this.suf = oqVar;
        this.nn = umlVar;
        this.ubx = str;
        this.dgq = new bob();
        this.syt = new uml(getContext());
        setWebViewClient(new kq(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.dgq.csi.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                csi.this.nze = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    csi.this.kq();
                }
            }
        });
        com.bytedance.sdk.component.utils.dgq.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dgq.csi.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = csi.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.dgq.csi.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            csi.this.syt.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class bob {
        protected int kq = 0;
        private com.bytedance.sdk.openadsdk.core.vvw.rhi oq = com.bytedance.sdk.openadsdk.core.vvw.rhi.kq();

        bob() {
        }

        public void kq(WebView webView) {
            if (webView != null && this.kq == 0) {
                if (this.oq == null) {
                    this.oq = com.bytedance.sdk.openadsdk.core.vvw.rhi.kq();
                }
                this.oq.kq(webView);
                this.oq.oq();
                this.kq = 1;
            }
        }

        public void oq() {
            kq();
        }

        public void kq(boolean z9) {
            com.bytedance.sdk.openadsdk.core.vvw.rhi rhiVar;
            if (this.kq == 1 && z9 && (rhiVar = this.oq) != null) {
                rhiVar.bob();
                this.kq = 3;
            }
        }

        public void kq(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.vvw.rhi rhiVar = this.oq;
            if (rhiVar != null) {
                rhiVar.kq(view, friendlyObstructionPurpose);
            }
        }

        public void kq() {
            com.bytedance.sdk.openadsdk.core.vvw.rhi rhiVar;
            int i10 = this.kq;
            if (i10 != 0 && i10 != 4 && (rhiVar = this.oq) != null) {
                rhiVar.fou();
            }
            this.kq = 4;
            this.oq = null;
        }
    }

    public void kq(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.dgq.kq(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob
    public void kq(String str) {
        boolean zKq;
        if (TextUtils.isEmpty(str) || this.nn == null || !this.syt.oq()) {
            return;
        }
        int iKq = wol.kq(this.ubx);
        View viewKq = null;
        if (!com.bytedance.sdk.component.utils.wcx.kq(str) && (this.nn.ne() == null || TextUtils.isEmpty(this.nn.ne().kq()))) {
            com.bytedance.sdk.openadsdk.core.model.wki wkiVar = new com.bytedance.sdk.openadsdk.core.model.wki();
            wkiVar.kq(str);
            this.nn.kq(wkiVar);
            str = null;
        }
        this.nn.bob(true);
        com.bytedance.sdk.openadsdk.core.model.uml umlVar = this.nn;
        if (umlVar == null || umlVar.ne() == null || TextUtils.isEmpty(this.nn.ne().kq())) {
            zKq = false;
        } else {
            zKq = nz.kq(getContext(), this.nn, iKq, this.ubx, true, (Map<String, Object>) null);
            if (!zKq && !TextUtils.isEmpty(this.nn.ne().oq())) {
                str = this.nn.ne().oq();
                com.bytedance.sdk.openadsdk.fou.bob.kq(this.nn, this.ubx, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zKq) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                nz.kq(getContext(), this.nn, iKq, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.fou.kq) null, this.ubx, true, str2);
            }
        }
        if (this.syt != null) {
            oq oqVar = this.suf;
            if (oqVar != null) {
                viewKq = oqVar.kq();
                this.suf.kq(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.vvw vvwVarKq = this.syt.kq(getContext(), viewKq);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.fou.bob.kq("click", this.nn, vvwVarKq, this.ubx, true, (Map<String, Object>) map, this.syt.oq() ? 1 : 2);
        }
        uml umlVar2 = this.syt;
        if (umlVar2 != null) {
            umlVar2.kq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob
    public void kq(int i10, int i11) {
        oq oqVar = this.suf;
        if (oqVar != null) {
            oqVar.kq(i10, i11);
        }
        this.vvw = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.mxq);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.nn, this.ubx, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dgq.bob.InterfaceC0267bob
    public void kq() {
        if (this.rhi.compareAndSet(false, true)) {
            this.fou = true;
            this.dgq.kq(getWebView());
            this.dgq.kq(this.csi);
            gm();
            mq();
        }
    }
}
