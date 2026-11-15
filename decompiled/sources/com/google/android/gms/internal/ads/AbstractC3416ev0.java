package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ev0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3416ev0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f28100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f28101b;

    AbstractC3416ev0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f28100a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f28100a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f28101b;
        if (collection != null) {
            return collection;
        }
        C3290dv0 c3290dv0 = new C3290dv0(this);
        this.f28101b = c3290dv0;
        return c3290dv0;
    }
}
