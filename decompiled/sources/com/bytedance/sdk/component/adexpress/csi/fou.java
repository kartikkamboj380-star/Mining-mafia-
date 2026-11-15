package com.bytedance.sdk.component.adexpress.csi;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.kq.fax;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private WeakReference<fax> kq;

    public fou(fax faxVar) {
        this.kq = new WeakReference<>(faxVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<fax> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().invokeMethod(str);
    }

    public void kq(fax faxVar) {
        this.kq = new WeakReference<>(faxVar);
    }
}
