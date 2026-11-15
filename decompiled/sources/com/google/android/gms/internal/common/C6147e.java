package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6147e extends AbstractC6144b {
    public C6147e() {
        super(4);
    }

    public final C6147e b(Object obj) {
        super.a(obj);
        return this;
    }

    public final C6147e c(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }

    public final AbstractC6151i d() {
        this.f36215c = true;
        return AbstractC6151i.t(this.f36213a, this.f36214b);
    }

    C6147e(int i10) {
        super(4);
    }
}
