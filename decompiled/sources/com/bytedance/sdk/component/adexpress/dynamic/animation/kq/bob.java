package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static volatile bob kq;

    private bob() {
    }

    public static bob kq() {
        if (kq == null) {
            synchronized (bob.class) {
                try {
                    if (kq == null) {
                        kq = new bob();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public fou kq(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        if (kqVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(kqVar.dgq())) {
            return new ubx(view, kqVar);
        }
        if ("translate".equals(kqVar.dgq())) {
            return new nze(view, kqVar);
        }
        if ("ripple".equals(kqVar.dgq())) {
            return new syt(view, kqVar);
        }
        if ("marquee".equals(kqVar.dgq())) {
            return new rjo(view, kqVar);
        }
        if ("waggle".equals(kqVar.dgq())) {
            return new mxq(view, kqVar);
        }
        if ("shine".equals(kqVar.dgq())) {
            return new vvw(view, kqVar);
        }
        if ("swing".equals(kqVar.dgq())) {
            return new suf(view, kqVar);
        }
        if ("fade".equals(kqVar.dgq())) {
            return new kq(view, kqVar);
        }
        if ("rubIn".equals(kqVar.dgq())) {
            return new nn(view, kqVar);
        }
        if ("rotate".equals(kqVar.dgq())) {
            return new dgq(view, kqVar);
        }
        if ("cutIn".equals(kqVar.dgq())) {
            return new rhi(view, kqVar);
        }
        if ("stretch".equals(kqVar.dgq())) {
            return new wki(view, kqVar);
        }
        if ("bounce".equals(kqVar.dgq())) {
            return new csi(view, kqVar);
        }
        return null;
    }
}
