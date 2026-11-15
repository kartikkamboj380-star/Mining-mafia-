package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq implements xn {
    List<fou> kq = new ArrayList();

    public oq(View view, List<com.bytedance.sdk.component.adexpress.dynamic.fou.kq> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.kq> it = list.iterator();
        while (it.hasNext()) {
            fou fouVarKq = bob.kq().kq(view, it.next());
            if (fouVarKq != null) {
                this.kq.add(fouVarKq);
            }
        }
    }

    public void kq() {
        Iterator<fou> it = this.kq.iterator();
        while (it.hasNext()) {
            try {
                it.next().bob();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xn
    public void oq() {
        Iterator<fou> it = this.kq.iterator();
        while (it.hasNext()) {
            try {
                it.next().oq();
            } catch (Exception unused) {
            }
        }
    }
}
