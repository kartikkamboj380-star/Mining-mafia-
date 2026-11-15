package com.bytedance.adsdk.ugeno.kq;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private Context bob;
    private com.bytedance.adsdk.ugeno.oq.bob fou;
    private List<bob> kq;
    private List<kq> oq;

    public rhi(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, List<bob> list) {
        this.fou = bobVar;
        this.bob = context;
        this.kq = list;
        fou();
    }

    private void fou() {
        this.oq = new ArrayList();
        List<bob> list = this.kq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.kq.size(); i10++) {
            bob bobVar = this.kq.get(i10);
            if (bobVar != null) {
                this.oq.add(new kq(this.bob, this.fou, bobVar));
            }
        }
    }

    public void bob() {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.bob();
            }
        }
    }

    public void kq() {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.fou();
            }
        }
    }

    public void oq() {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.kq();
            }
        }
    }

    public void kq(Canvas canvas) {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.kq(canvas);
            }
        }
    }

    public void oq(Canvas canvas) {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.oq(canvas);
            }
        }
    }

    public void kq(int i10, int i11) {
        List<kq> list = this.oq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kq kqVar : this.oq) {
            if (kqVar != null) {
                kqVar.kq(i10, i11);
            }
        }
    }

    public kq kq(String str) {
        List<kq> list = this.oq;
        if (list != null && !list.isEmpty()) {
            for (kq kqVar : this.oq) {
                if (kqVar != null && TextUtils.equals(kqVar.csi(), str)) {
                    return kqVar;
                }
            }
        }
        return null;
    }
}
