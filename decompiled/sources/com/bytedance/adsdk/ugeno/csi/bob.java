package com.bytedance.adsdk.ugeno.csi;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    int csi;
    int dgq;
    int mxq;
    float nn;
    int nze;
    int rhi;
    int rjo;
    boolean sns;
    int syt;
    float ubx;
    int vvw;
    boolean wcx;
    int wki;
    int kq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    int oq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    int bob = LinearLayoutManager.INVALID_OFFSET;
    int fou = LinearLayoutManager.INVALID_OFFSET;
    List<Integer> suf = new ArrayList();

    bob() {
    }

    public int kq() {
        return this.rjo;
    }

    public int oq() {
        return this.syt - this.dgq;
    }

    void kq(View view, int i10, int i11, int i12, int i13) {
        oq oqVar = (oq) view.getLayoutParams();
        this.kq = Math.min(this.kq, (view.getLeft() - oqVar.wki()) - i10);
        this.oq = Math.min(this.oq, (view.getTop() - oqVar.suf()) - i11);
        this.bob = Math.max(this.bob, view.getRight() + oqVar.nze() + i12);
        this.fou = Math.max(this.fou, view.getBottom() + oqVar.mxq() + i13);
    }
}
