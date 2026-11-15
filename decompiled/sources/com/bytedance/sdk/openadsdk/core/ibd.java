package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ibd {
    public static ConcurrentHashMap<Integer, ibd> kq = new ConcurrentHashMap<>();
    private int csi;
    private int fou;
    private String rhi;
    private String oq = "";
    private String bob = "";

    private void rhi() {
        this.oq = "";
        this.bob = "";
        this.fou = 0;
        this.csi = 0;
    }

    public String bob() {
        return this.bob;
    }

    public int csi() {
        return this.csi;
    }

    public int fou() {
        return this.fou;
    }

    public String kq() {
        return this.rhi;
    }

    public String oq() {
        return this.oq;
    }

    public static void bob(int i10) {
        ibd ibdVar;
        if (i10 == 0) {
            return;
        }
        if (kq == null) {
            kq = new ConcurrentHashMap<>();
        }
        if (!kq.containsKey(Integer.valueOf(i10)) || (ibdVar = kq.get(Integer.valueOf(i10))) == null) {
            return;
        }
        ibdVar.oq(1);
    }

    public void kq(int i10) {
        this.fou = i10;
    }

    public void oq(int i10) {
        this.csi = i10;
    }

    public static void oq(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (umlVar == null || TextUtils.isEmpty(umlVar.jnr())) {
            return;
        }
        int iTt = umlVar.tt();
        Integer numValueOf = Integer.valueOf(iTt);
        if (iTt == 0) {
            return;
        }
        if (kq == null) {
            kq = new ConcurrentHashMap<>();
        }
        ibd ibdVar = kq.containsKey(numValueOf) ? kq.get(numValueOf) : null;
        if (ibdVar == null) {
            ibdVar = new ibd();
        }
        String strJp = umlVar.jp();
        if (TextUtils.isEmpty(strJp) || !strJp.equals(ibdVar.kq())) {
            ibdVar.rhi();
            ibdVar.kq(umlVar);
            kq.put(numValueOf, ibdVar);
        }
    }

    public void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (umlVar != null) {
            String strJp = umlVar.jp();
            if (!TextUtils.isEmpty(strJp)) {
                this.rhi = strJp;
            }
            String strZe = umlVar.ze();
            if (TextUtils.isEmpty(strZe) && umlVar.bns()) {
                strZe = umlVar.hw().dgq();
            }
            if (!TextUtils.isEmpty(strZe)) {
                String[] strArrSplit = strZe.split("/");
                if (strArrSplit.length >= 3) {
                    this.oq = strArrSplit[2];
                }
            }
            if (umlVar.xo() == null || TextUtils.isEmpty(umlVar.xo().bob())) {
                return;
            }
            this.bob = umlVar.xo().bob();
        }
    }

    public static void bob(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        ibd ibdVar;
        if (umlVar == null) {
            return;
        }
        int iTt = umlVar.tt();
        Integer numValueOf = Integer.valueOf(iTt);
        if (iTt == 0) {
            return;
        }
        if (kq == null) {
            kq = new ConcurrentHashMap<>();
        }
        if (!kq.containsKey(numValueOf) || (ibdVar = kq.get(numValueOf)) == null) {
            return;
        }
        ibdVar.kq(1);
    }
}
