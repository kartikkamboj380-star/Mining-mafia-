package com.bytedance.sdk.openadsdk.core.dgq;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private static volatile fou bob;
    private static int oq;
    private final List<csi> kq = new ArrayList();

    public static fou kq() {
        if (bob == null) {
            synchronized (fou.class) {
                try {
                    if (bob == null) {
                        bob = new fou();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bob;
    }

    public int bob() {
        return this.kq.size();
    }

    public csi oq() {
        csi csiVarRemove;
        if (bob() > 0 && (csiVarRemove = this.kq.remove(0)) != null) {
            return csiVarRemove;
        }
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void bob(csi csiVar) {
        if (csiVar == null || csiVar.getWebView() == null) {
            return;
        }
        if (csiVar.getParent() != null) {
            ((ViewGroup) csiVar.getParent()).removeView(csiVar);
        }
        try {
            csiVar.removeAllViews();
            csiVar.rjo();
            csiVar.setWebChromeClient(null);
            csiVar.setWebViewClient(null);
            csiVar.setDownloadListener(null);
            csiVar.setDefaultTextEncodingName("UTF-8");
            csiVar.setAllowFileAccess(false);
            csiVar.setJavaScriptEnabled(true);
            csiVar.setCacheMode(-1);
            csiVar.setDatabaseEnabled(true);
            csiVar.setSupportZoom(false);
            csiVar.getWebView().setLayerType(0, null);
            csiVar.setBackgroundColor(0);
            csiVar.getWebView().setHorizontalScrollBarEnabled(false);
            csiVar.getWebView().setHorizontalScrollbarOverlay(false);
            csiVar.getWebView().setVerticalScrollBarEnabled(false);
            csiVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.kq.bob.kq(csiVar);
            csiVar.suf();
            csiVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void oq(csi csiVar) {
        if (csiVar != null) {
            if (this.kq.size() >= oq) {
                csiVar.mxq();
            } else {
                if (this.kq.contains(csiVar)) {
                    return;
                }
                bob(csiVar);
                this.kq.add(csiVar);
            }
        }
    }

    public void kq(csi csiVar) {
        if (csiVar != null) {
            oq(csiVar);
        }
    }
}
