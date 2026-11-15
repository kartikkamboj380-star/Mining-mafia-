package com.bytedance.sdk.component.adexpress.oq;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class vvw implements nn.kq {
    private dgq bob;
    private AtomicBoolean fou = new AtomicBoolean(false);
    nze kq;

    @NonNull
    private List<nn> oq;

    public vvw(List<nn> list, dgq dgqVar) {
        this.oq = list;
        this.bob = dgqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public boolean bob() {
        return this.fou.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public void kq() {
        this.bob.fou();
        Iterator<nn> it = this.oq.iterator();
        while (it.hasNext() && !it.next().kq(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public boolean oq(nn nnVar) {
        int iIndexOf = this.oq.indexOf(nnVar);
        return iIndexOf < this.oq.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public nze oq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public void kq(nn nnVar) {
        int iIndexOf = this.oq.indexOf(nnVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.oq.size()) {
                return;
            }
        } while (!this.oq.get(iIndexOf).kq(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public void kq(nze nzeVar) {
        this.kq = nzeVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oq.nn.kq
    public void kq(boolean z9) {
        this.fou.getAndSet(z9);
    }
}
