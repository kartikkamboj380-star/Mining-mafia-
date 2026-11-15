package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2264Pt0 implements InterfaceC3668gv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f22207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f22208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f22209c;

    AbstractC2264Pt0() {
    }

    abstract Set a();

    abstract Collection c();

    Iterator d() {
        throw null;
    }

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3668gv0) {
            return zzu().equals(((InterfaceC3668gv0) obj).zzu());
        }
        return false;
    }

    public boolean f(Object obj) {
        Iterator it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public Collection g() {
        Collection collection = this.f22208b;
        if (collection != null) {
            return collection;
        }
        Collection collectionC = c();
        this.f22208b = collectionC;
        return collectionC;
    }

    public final Set h() {
        Set set = this.f22207a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f22207a = setA;
        return setA;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public Map zzu() {
        Map map = this.f22209c;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f22209c = mapE;
        return mapE;
    }
}
