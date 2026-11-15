package com.bytedance.sdk.component.oq.kq.kq.kq;

import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.vvw;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob implements com.bytedance.sdk.component.oq.kq.syt.kq {
    int bob = 0;
    List<com.bytedance.sdk.component.oq.kq.syt> kq;
    vvw oq;

    bob(List<com.bytedance.sdk.component.oq.kq.syt> list, vvw vvwVar) {
        this.kq = list;
        this.oq = vvwVar;
    }

    @Override // com.bytedance.sdk.component.oq.kq.syt.kq
    public vvw kq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.oq.kq.syt.kq
    public suf kq(vvw vvwVar) {
        this.oq = vvwVar;
        int i10 = this.bob + 1;
        this.bob = i10;
        if (i10 >= this.kq.size()) {
            return null;
        }
        return this.kq.get(this.bob).kq(this);
    }
}
