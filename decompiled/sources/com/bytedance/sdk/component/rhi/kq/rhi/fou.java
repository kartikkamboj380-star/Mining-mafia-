package com.bytedance.sdk.component.rhi.kq.rhi;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private final boolean bob;
    private final int csi;
    private final String kq;
    private final String oq;
    private final String rhi;
    private String rjo;
    private String syt;
    private boolean ubx;
    private int fou = -1;
    private int dgq = 0;
    private String nn = null;

    fou(String str, String str2, boolean z9, int i10, String str3) {
        this.kq = str;
        this.oq = str2;
        this.bob = z9;
        this.csi = i10;
        this.rhi = str3;
    }

    public boolean bob() {
        return this.bob;
    }

    public int csi() {
        return this.csi;
    }

    public String dgq() {
        return this.syt;
    }

    public int fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public boolean nn() {
        return this.ubx;
    }

    public String oq() {
        return this.oq;
    }

    public String rhi() {
        return this.rhi;
    }

    public String rjo() {
        return this.rjo;
    }

    public int syt() {
        return this.dgq;
    }

    public boolean ubx() {
        return this.fou == -1;
    }

    public void bob(String str) {
        this.nn = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.syt)) {
            this.syt = String.valueOf(this.nn);
            return;
        }
        this.syt += "," + this.nn;
    }

    public void kq(int i10) {
        this.fou = i10;
    }

    public void oq(int i10) {
        this.dgq = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.rjo)) {
            this.rjo = String.valueOf(this.dgq);
            return;
        }
        this.rjo += "," + this.dgq;
    }

    public void kq(String str) {
        this.rjo = str;
    }

    public void kq(boolean z9) {
        this.ubx = z9;
    }

    public Runnable kq(String str, Map<String, String> map) {
        return kq.kq().kq(this, str, map);
    }

    public void oq(String str) {
        this.syt = str;
    }
}
