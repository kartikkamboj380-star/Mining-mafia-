package com.bytedance.sdk.component.dgq;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.ha;
import com.bytedance.sdk.component.utils.ou;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends FrameLayout {
    private static fou wee;
    public int bob;
    private csi bss;
    private String csi;
    private float dgq;
    private bob ebt;
    private boolean fax;
    private int fgm;
    private com.bytedance.sdk.component.dgq.oq.kq fou;
    private com.bytedance.sdk.component.dgq.fou gm;
    private float ha;
    private float ibd;
    private boolean jhe;
    public int kq;
    private ou ktb;
    private boolean mq;
    private com.bytedance.sdk.component.dgq.kq.InterfaceC0247kq mxq;
    private boolean nb;
    private long nn;
    private AtomicBoolean nz;
    private View nze;
    public int oq;
    private WebViewClient ou;
    private JSONObject rhi;
    private boolean rjo;
    private float rs;
    private com.bytedance.sdk.component.dgq.kq sns;
    private volatile WebView suf;
    private float syt;
    private long tvh;
    private long ubx;
    private boolean uml;
    private long vvw;
    private long wbn;
    private List<String> wcx;
    private AttributeSet wf;
    private boolean wki;
    private AtomicBoolean wol;
    private Context xn;
    private AtomicBoolean yyl;
    private oq zfx;

    public enum bob {
        ADS("ads"),
        ADS_V3("ads_v3"),
        ENDCARD("endcard"),
        USER_AGENT("ua"),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String wki;

        bob(String str) {
            this.wki = str;
        }
    }

    public interface csi {
    }

    public interface fou {
        WebView kq(Context context, AttributeSet attributeSet, int i10, bob bobVar);
    }

    public static class kq extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.dgq.rhi.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public interface oq {
    }

    public rhi(Context context, bob bobVar) {
        this(kq(context), false, bobVar);
    }

    private static void bob(Context context) {
    }

    private void fax() {
        try {
            WebSettings settings = this.suf.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void gm() {
        if (this.suf == null) {
            return;
        }
        try {
            this.suf.removeJavascriptInterface("searchBoxJavaBridge_");
            this.suf.removeJavascriptInterface("accessibility");
            this.suf.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private static Context kq(Context context) {
        return context;
    }

    private void mq() {
        if (this.ktb == null) {
            this.wol.set(false);
            this.ktb = new ou(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.dgq.rhi.1
        };
        this.wol.set(true);
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(fou fouVar) {
        wee = fouVar;
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.suf.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.suf.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.suf == null) {
            return;
        }
        try {
            this.suf.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void csi() {
        try {
            if (this.suf == null) {
                this.suf = kq(this.wf, 0);
            }
            rhi();
            oq(kq(this.xn));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean dgq() {
        if (this.suf == null) {
            return false;
        }
        try {
            return this.suf.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean fou() {
        return this.uml;
    }

    public View getArbitrageLoadingView() {
        return this.nze;
    }

    public int getContentHeight() {
        if (this.suf == null) {
            return 0;
        }
        try {
            return this.suf.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.tvh;
    }

    public long getLandingPageClickEnd() {
        return this.wbn;
    }

    public com.bytedance.sdk.component.dgq.oq.kq getMaterialMeta() {
        return this.fou;
    }

    public String getOriginalUrl() {
        String url;
        if (this.suf == null) {
            return null;
        }
        try {
            String originalUrl = this.suf.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.suf.getUrl()) == null || !url.startsWith("file://")) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.suf == null) {
            return 0;
        }
        try {
            return this.suf.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public bob getScene() {
        return this.ebt;
    }

    public String getUrl() {
        if (this.suf == null) {
            return null;
        }
        try {
            return this.suf.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.suf == null) {
            return "";
        }
        try {
            return this.suf.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.suf;
    }

    public WebViewClient getWebViewClient() {
        return this.ou;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean k_() {
        return this.fax;
    }

    public void mxq() {
        if (this.suf == null) {
            return;
        }
        bob bobVar = this.ebt;
        if (bobVar != bob.ADS && bobVar != bob.ADS_V3) {
            ha.kq(this);
        } else {
            try {
                this.suf.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public void nn() {
        try {
            this.suf.goBack();
        } catch (Throwable unused) {
        }
    }

    public void nze() {
        if (this.suf == null) {
            return;
        }
        try {
            this.suf.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.nz.set(true);
        if (!this.yyl.get() || this.wol.get()) {
            return;
        }
        mq();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nz.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentKq;
        try {
            kq(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.wki && (viewParentKq = kq(this)) != null) {
                viewParentKq.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
    }

    public boolean oq() {
        return this.mq;
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.suf.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void rhi() {
        if (this.suf != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.suf.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.suf, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void rjo() {
        try {
            this.suf.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z9) {
        try {
            this.suf.getSettings().setAllowFileAccess(z9);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.suf.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.suf.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z9) {
        try {
            this.suf.getSettings().setBuiltInZoomControls(z9);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.suf.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.fgm = i10;
    }

    public void setDatabaseEnabled(boolean z9) {
        try {
            this.suf.getSettings().setDatabaseEnabled(z9);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.rs = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.suf.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.suf.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z9) {
        try {
            this.suf.getSettings().setDisplayZoomControls(z9);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z9) {
        try {
            this.suf.getSettings().setDomStorageEnabled(z9);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.suf.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z9) {
        this.wki = z9;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z9) {
        try {
            this.suf.getSettings().setJavaScriptCanOpenWindowsAutomatically(z9);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z9) {
        try {
            this.suf.getSettings().setJavaScriptEnabled(z9);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z9) {
        this.rjo = z9;
    }

    public void setLandingPageClickBegin(long j10) {
        this.tvh = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.wbn = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.suf.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.suf.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z9) {
        try {
            this.suf.getSettings().setLoadWithOverviewMode(z9);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z9) {
        this.fax = z9;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.dgq.oq.kq kqVar) {
        this.fou = kqVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.suf.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z9) {
        try {
            this.suf.setNetworkAvailable(z9);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(oq oqVar) {
        this.zfx = oqVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.suf.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z9) {
        this.nb = z9;
    }

    public void setPreFinish(boolean z9) {
        this.jhe = z9;
    }

    public void setPreProgressHundred(boolean z9) {
        this.uml = z9;
    }

    public void setPreStart(boolean z9) {
        this.mq = z9;
    }

    public void setRecycler(boolean z9) {
        if (this.suf == null || !(this.suf instanceof com.bytedance.sdk.component.dgq.csi)) {
            return;
        }
        ((com.bytedance.sdk.component.dgq.csi) this.suf).setRecycler(z9);
    }

    public void setShakeValue(float f10) {
        this.ibd = f10;
    }

    public void setSupportZoom(boolean z9) {
        try {
            this.suf.getSettings().setSupportZoom(z9);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.csi = str;
        com.bytedance.sdk.component.dgq.kq kqVar = this.sns;
        if (kqVar != null) {
            kqVar.kq(str);
        }
        com.bytedance.sdk.component.dgq.fou fouVar = this.gm;
        if (fouVar != null) {
            fouVar.kq(str);
        }
    }

    public void setTouchStateListener(csi csiVar) {
        this.bss = csiVar;
    }

    public void setUseWideViewPort(boolean z9) {
        try {
            this.suf.getSettings().setUseWideViewPort(z9);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.suf.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.suf.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.suf.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.suf = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof csi) {
                setTouchStateListener((csi) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new kq();
            }
            this.ou = webViewClient;
            this.suf.setWebViewClient(new rjo(this.mxq, webViewClient, this.wcx));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.ha = f10;
    }

    public void sns() {
        try {
            this.suf.clearView();
        } catch (Throwable unused) {
        }
    }

    public void suf() {
        try {
            this.suf.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void syt() {
        try {
            this.suf.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean ubx() {
        if (this.suf == null) {
            return false;
        }
        try {
            return this.suf.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void vvw() {
        try {
            this.suf.goForward();
        } catch (Throwable unused) {
        }
    }

    public void wcx() {
        try {
            this.suf.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void wki() {
        if (this.suf != null) {
            this.suf.onResume();
        }
    }

    public rhi(Context context, boolean z9, bob bobVar) {
        super(kq(context));
        this.syt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dgq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.nn = 0L;
        this.ubx = 0L;
        this.vvw = 0L;
        this.wki = false;
        this.ibd = 20.0f;
        this.ha = 50.0f;
        this.nz = new AtomicBoolean();
        this.yyl = new AtomicBoolean();
        this.wol = new AtomicBoolean();
        this.xn = context;
        this.ebt = bobVar;
        if (z9) {
            return;
        }
        try {
            this.suf = kq((AttributeSet) null, 0);
            rhi();
        } catch (Throwable unused) {
        }
        oq(kq(context));
    }

    private void oq(Context context) {
        bob(context);
        fax();
        gm();
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.suf.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean bob() {
        return this.jhe;
    }

    @Override // android.view.View
    public String getTag() {
        return this.csi;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void kq(boolean z9, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z9 && this.suf != null && (this.suf instanceof com.bytedance.sdk.component.dgq.csi)) {
            this.sns = new com.bytedance.sdk.component.dgq.kq(this.xn, i10, i11, list, i12);
            this.wcx = list2;
            if (!TextUtils.isEmpty(this.csi)) {
                this.sns.kq(this.csi);
            }
            ((com.bytedance.sdk.component.dgq.csi) this.suf).setTouchListenerProxy(this.sns);
            this.mxq = this.sns.kq();
        }
    }

    private static boolean bob(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean oq(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void kq(int i10, long j10) {
        if (this.suf == null || !(this.suf instanceof com.bytedance.sdk.component.dgq.csi)) {
            return;
        }
        this.gm = new com.bytedance.sdk.component.dgq.fou(this.xn, this.sns, i10, j10, this);
        if (!TextUtils.isEmpty(this.csi)) {
            this.gm.kq(this.csi);
        }
        ((com.bytedance.sdk.component.dgq.csi) this.suf).setTouchListenerProxy(this.gm);
    }

    public void kq(boolean z9, View view) {
        if (z9) {
            this.nze = view;
            view.setVisibility(8);
            View view2 = this.nze;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.nze, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView kq(AttributeSet attributeSet, int i10) {
        fou fouVar = wee;
        if (fouVar != null) {
            return fouVar.kq(getContext(), attributeSet, i10, this.ebt);
        }
        if (attributeSet == null) {
            return new WebView(kq(this.xn));
        }
        return new WebView(kq(this.xn), attributeSet);
    }

    @TargetApi(19)
    public void kq(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.suf.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void kq(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.suf.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void kq(boolean z9) {
        try {
            this.suf.clearCache(z9);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent kq(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (oq(view2) || bob(view2)) ? parent : kq(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void kq(Object obj, String str) {
        try {
            this.suf.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void kq(MotionEvent motionEvent) {
        if (!this.rjo || this.fou == null) {
            return;
        }
        if ((this.csi == null && this.rhi == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.syt = motionEvent.getRawX();
                this.dgq = motionEvent.getRawY();
                this.nn = System.currentTimeMillis();
                this.rhi = new JSONObject();
                if (this.suf != null) {
                    this.tvh = this.nn;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.rhi.put("start_x", String.valueOf(this.syt));
                this.rhi.put("start_y", String.valueOf(this.dgq));
                this.rhi.put("offset_x", String.valueOf(motionEvent.getRawX() - this.syt));
                this.rhi.put("offset_y", String.valueOf(motionEvent.getRawY() - this.dgq));
                this.rhi.put("url", String.valueOf(getUrl()));
                this.rhi.put("tag", "");
                this.ubx = System.currentTimeMillis();
                if (this.suf != null) {
                    this.wbn = this.ubx;
                }
                this.rhi.put("down_time", this.nn);
                this.rhi.put("up_time", this.ubx);
                if (com.bytedance.sdk.component.dgq.kq.kq.kq().oq() != null) {
                    long j10 = this.vvw;
                    long j11 = this.nn;
                    if (j10 != j11) {
                        this.vvw = j11;
                        com.bytedance.sdk.component.dgq.kq.kq.kq().oq().kq(this.fou, this.csi, "in_web_click", this.rhi, this.ubx - this.nn);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
