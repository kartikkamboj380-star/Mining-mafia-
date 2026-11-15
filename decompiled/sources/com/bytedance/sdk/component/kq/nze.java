package com.bytedance.sdk.component.kq;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class nze {
    private final dgq bob;
    private volatile boolean csi;
    private final List<vvw> fou;
    private final kq kq;
    private final WebView oq;

    nze(dgq dgqVar) {
        ArrayList arrayList = new ArrayList();
        this.fou = arrayList;
        this.csi = false;
        this.bob = dgqVar;
        if (dgqVar.kq != null) {
            kq kqVar = dgqVar.oq;
            if (kqVar == null) {
                this.kq = new fax();
            } else {
                this.kq = kqVar;
            }
        } else {
            this.kq = dgqVar.oq;
        }
        this.kq.bob(dgqVar);
        this.oq = dgqVar.kq;
        arrayList.add(dgqVar.dgq);
        gm.kq(dgqVar.rjo);
    }

    public static dgq kq(WebView webView) {
        return new dgq(webView);
    }

    private void oq() {
        if (this.csi) {
            syt.kq(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public nze kq(String str, fou<?, ?> fouVar) {
        return kq(str, (String) null, fouVar);
    }

    public nze kq(Set<String> set, wcx<?, ?> wcxVar) {
        return kq(set, (String) null, wcxVar);
    }

    public nze kq(String str, String str2, fou<?, ?> fouVar) {
        oq();
        this.kq.rjo.kq(str, fouVar);
        return this;
    }

    public nze kq(Set<String> set, String str, wcx<?, ?> wcxVar) {
        oq();
        this.kq.rjo.kq(set, wcxVar);
        return this;
    }

    public nze kq(String str, bob.oq oqVar) {
        return kq(str, (String) null, oqVar);
    }

    public nze kq(String str, String str2, bob.oq oqVar) {
        oq();
        this.kq.rjo.kq(str, oqVar);
        return this;
    }

    public void kq() {
        if (this.csi) {
            return;
        }
        this.kq.oq();
        this.csi = true;
        Iterator<vvw> it = this.fou.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
