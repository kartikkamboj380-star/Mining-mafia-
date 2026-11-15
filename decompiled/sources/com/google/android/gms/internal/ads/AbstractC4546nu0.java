package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4546nu0 extends AbstractC4672ou0 implements Map {
    protected AbstractC4546nu0() {
    }

    @Override // java.util.Map
    public final void clear() {
        i().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    protected abstract Map i();

    protected final boolean j(Object obj) {
        C2914av0 c2914av0 = new C2914av0(entrySet().iterator());
        if (obj == null) {
            while (c2914av0.hasNext()) {
                if (c2914av0.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c2914av0.hasNext()) {
            if (obj.equals(c2914av0.next())) {
                return true;
            }
        }
        return false;
    }

    protected final boolean k(Object obj) {
        return AbstractC3542fv0.b(this, obj);
    }

    protected final int l() {
        return AbstractC1905Iv0.c(entrySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return i().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        i().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return i().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return i().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return i().values();
    }
}
