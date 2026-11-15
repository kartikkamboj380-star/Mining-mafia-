package com.bytedance.sdk.component.rhi.kq.kq.kq.kq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.syt;
import com.bytedance.sdk.component.utils.fax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob {
    private static int bob = 20;
    private boolean csi;
    private final Context kq;
    private boolean syt;
    protected final List<com.bytedance.sdk.component.rhi.kq.fou.kq> oq = new ArrayList();
    private final List<com.bytedance.sdk.component.rhi.kq.fou.kq> fou = new ArrayList();
    private boolean rhi = false;
    private volatile boolean rjo = false;
    private final Runnable dgq = new Runnable() { // from class: com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (bob.this) {
                try {
                    bob.this.rjo = false;
                    if (bob.this.oq.isEmpty()) {
                        bob.this.rhi = false;
                        return;
                    }
                    if (bob.this.csi) {
                        int size = bob.this.oq.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            bob.this.fou.add(bob.this.oq.get(i10));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(bob.this.oq);
                    }
                    bob.this.oq.clear();
                    bob.this.rhi = false;
                    if (arrayList != null) {
                        bob.this.fou(arrayList);
                        return;
                    }
                    bob bobVar = bob.this;
                    bobVar.fou(bobVar.fou);
                    bob.this.fou.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public bob(Context context) {
        this.syt = true;
        this.kq = context;
        try {
            com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
            if (csiVarMxq != null) {
                this.syt = csiVarMxq.nze();
                this.csi = csiVarMxq.mxq();
                bob = csiVarMxq.sns();
            }
            fax.kq("DBInsertMemRepo", "enableOpt:" + this.syt + ",BATCH_SIZE:" + bob, Boolean.valueOf(this.csi));
        } catch (Throwable unused) {
        }
    }

    protected synchronized void bob(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.rhi.kq.fou.kq> it = this.oq.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.rhi.kq.fou.kq next = it.next();
                        if (next != null) {
                            String strBob = next.bob();
                            if (!TextUtils.isEmpty(strBob) && list.contains(strBob)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    oq();
                    th.getMessage();
                }
            }
        }
    }

    public Context csi() {
        return this.kq;
    }

    public void fou(List<com.bytedance.sdk.component.rhi.kq.fou.kq> list) {
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), list);
    }

    public abstract String oq();

    protected long rhi() {
        return 10000L;
    }

    private void kq() {
        if (!this.rhi) {
            com.bytedance.sdk.component.rhi.kq.rjo.kq.kq().postDelayed(this.dgq, this.csi ? rhi() : com.bytedance.sdk.component.rhi.kq.rjo.kq.oq());
            this.rhi = true;
        }
        if (this.syt && this.oq.size() >= bob && !this.rjo) {
            com.bytedance.sdk.component.rhi.kq.rjo.kq.kq().removeCallbacks(this.dgq);
            com.bytedance.sdk.component.rhi.kq.rjo.kq.kq().post(this.dgq);
            this.rhi = true;
            this.rjo = true;
        }
    }

    public synchronized void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        if (kqVar.rjo() != null && !TextUtils.isEmpty(kqVar.bob())) {
            this.oq.add(kqVar);
            kq();
        }
    }
}
