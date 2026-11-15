package com.bytedance.sdk.component.rhi.kq;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static volatile com.bytedance.sdk.component.rhi.kq.csi.kq nn;
    private static syt wki;
    private volatile com.bytedance.sdk.component.rhi.kq.fou.oq.kq bob;
    private volatile com.bytedance.sdk.component.rhi.kq.fou.oq.kq csi;
    private volatile csi dgq;
    private volatile com.bytedance.sdk.component.rhi.kq.fou.oq.kq fou;
    private volatile Context kq;
    private long nze;
    private volatile com.bytedance.sdk.component.rhi.kq.fou.oq.kq oq;
    private volatile com.bytedance.sdk.component.rhi.kq.fou.oq.kq rhi;
    private volatile com.bytedance.sdk.component.rhi.kq.kq.csi rjo;
    private final AtomicBoolean suf = new AtomicBoolean(false);
    private volatile boolean syt;
    private volatile com.bytedance.sdk.component.rhi.kq.oq.bob ubx;
    private volatile Map<Integer, com.bytedance.sdk.component.rhi.kq.oq.bob> vvw;

    private syt() {
    }

    public static com.bytedance.sdk.component.rhi.kq.csi.kq csi() {
        if (nn == null) {
            synchronized (syt.class) {
                try {
                    if (nn == null) {
                        nn = new com.bytedance.sdk.component.rhi.kq.csi.oq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nn;
    }

    public static synchronized syt rjo() {
        try {
            if (wki == null) {
                wki = new syt();
            }
        } catch (Throwable th) {
            throw th;
        }
        return wki;
    }

    public Map<Integer, com.bytedance.sdk.component.rhi.kq.oq.bob> bob() {
        return this.vvw;
    }

    public void dgq() {
        com.bytedance.sdk.component.rhi.kq.oq.fou.kq.oq();
    }

    public com.bytedance.sdk.component.rhi.kq.kq.csi fou() {
        return this.rjo;
    }

    public boolean kq() {
        return this.suf.get();
    }

    public csi mxq() {
        return this.dgq;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq nn() {
        return this.rhi;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq nze() {
        return this.csi;
    }

    public boolean oq() {
        return this.syt;
    }

    public Context rhi() {
        return this.kq;
    }

    public long sns() {
        return this.nze * 86400000;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq suf() {
        return this.fou;
    }

    public com.bytedance.sdk.component.rhi.kq.oq.bob syt() {
        return this.ubx;
    }

    public void ubx() {
        com.bytedance.sdk.component.rhi.kq.oq.fou.kq.bob();
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq vvw() {
        return this.oq;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq wki() {
        return this.bob;
    }

    public void bob(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        this.bob = kqVar;
    }

    public void fou(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        this.fou = kqVar;
    }

    public void kq(boolean z9) {
        this.suf.set(z9);
    }

    public void oq(boolean z9) {
        this.syt = z9;
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.kq.csi csiVar) {
        this.rjo = csiVar;
    }

    public void oq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        this.oq = kqVar;
    }

    public void kq(Context context) {
        this.kq = context;
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.oq.bob bobVar) {
        this.ubx = bobVar;
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        this.rhi = kqVar;
    }

    public void csi(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        this.csi = kqVar;
    }

    public void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        if (kqVar == null) {
            return;
        }
        kqVar.kq(System.currentTimeMillis());
        com.bytedance.sdk.component.rhi.kq.oq.fou.kq.kq(kqVar, kqVar.fou());
    }

    public void kq(String str, boolean z9) {
        com.bytedance.sdk.component.rhi.kq.rhi.kq.kq().kq(str, z9);
    }

    public void kq(String str, List<String> list, boolean z9, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.rhi.kq.rhi.kq.kq().kq(str, list, z9, map, i10, str2);
    }

    public void kq(csi csiVar) {
        this.dgq = csiVar;
    }

    public void kq(long j10) {
        this.nze = j10;
    }
}
