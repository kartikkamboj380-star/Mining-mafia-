package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class SM0 extends XM0 {
    SM0() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                p070h.w.a(((TM0) e(0)).c());
                throw null;
            }
            Iterator it = f().iterator();
            if (it.hasNext()) {
                p070h.w.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
