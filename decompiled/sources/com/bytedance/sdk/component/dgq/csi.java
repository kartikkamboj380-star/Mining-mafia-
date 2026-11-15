package com.bytedance.sdk.component.dgq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class csi extends WebView {
    private boolean bob;
    private boolean csi;
    private boolean fou;
    public long kq;
    private final HashSet<String> oq;
    private bob rhi;

    public csi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.oq = new HashSet<>();
        this.kq = System.currentTimeMillis();
        oq();
    }

    private void oq() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new rhi.kq());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.bob || this.csi) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.oq.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z9) {
        if (this.bob || this.csi) {
            return;
        }
        super.clearCache(z9);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.bob) {
            return;
        }
        this.bob = true;
        kq();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.bob && !this.csi) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.bob || this.csi) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (this.bob || this.csi) {
            return;
        }
        super.goBackOrForward(i10);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.bob || this.csi) {
            return;
        }
        super.goForward();
    }

    public void kq() {
        if (this.bob) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.oq.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.oq.clear();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.bob || this.csi) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.bob || this.csi) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.fou) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.bob || this.csi) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.bob || this.csi) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.bob || this.csi) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.bob || this.csi) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.bob || this.csi) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.bob || this.csi) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.bob || this.csi) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.oq.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.bob || this.csi) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z9) {
        this.fou = z9;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        bob bobVar = this.rhi;
        if (bobVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            bobVar.kq(onTouchListener);
            super.setOnTouchListener(this.rhi);
        }
    }

    public void setRecycler(boolean z9) {
        this.csi = z9;
    }

    public void setTouchListenerProxy(bob bobVar) {
        this.rhi = bobVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.bob || this.csi) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.bob || this.csi) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public csi(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.oq = new HashSet<>();
        this.kq = System.currentTimeMillis();
        oq();
    }
}
