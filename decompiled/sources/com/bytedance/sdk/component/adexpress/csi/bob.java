package com.bytedance.sdk.component.adexpress.csi;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private WeakReference<oq> kq;

    public bob(oq oqVar) {
        this.kq = new WeakReference<>(oqVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<oq> weakReference = this.kq;
        return (weakReference == null || weakReference.get() == null) ? "" : this.kq.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<oq> weakReference = this.kq;
        return (weakReference == null || weakReference.get() == null) ? "" : this.kq.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<oq> weakReference = this.kq;
        return (weakReference == null || weakReference.get() == null) ? "" : this.kq.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<oq> weakReference = this.kq;
        return (weakReference == null || weakReference.get() == null) ? "" : this.kq.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<oq> weakReference = this.kq;
        return (weakReference == null || weakReference.get() == null) ? "" : this.kq.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().initRenderFinish();
    }

    public void kq(oq oqVar) {
        this.kq = new WeakReference<>(oqVar);
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().kq(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<oq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().videoFrameChanged(str);
    }
}
