package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class U5 extends Y5 {
    U5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                p070h.w.a(((V5) e(0)).c());
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
