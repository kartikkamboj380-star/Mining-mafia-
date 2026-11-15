package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6422j1 extends AbstractC6465u1 {
    C6422j1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6465u1
    public final void a() {
        if (!k()) {
            if (b() > 0) {
                p070h.w.a(h(0).getKey());
                throw null;
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                p070h.w.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
