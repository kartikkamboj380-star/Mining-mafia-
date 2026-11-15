package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class IC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f19496a = new HashMap();

    public final JC0 a() {
        if (this.f19496a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        JC0 jc0 = new JC0(Collections.unmodifiableMap(this.f19496a), null);
        this.f19496a = null;
        return jc0;
    }
}
