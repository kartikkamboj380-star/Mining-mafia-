package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6436n extends AbstractC6408g implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC6420j f37309b;

    AbstractC6436n() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    public AbstractC6420j e() {
        AbstractC6420j abstractC6420j = this.f37309b;
        if (abstractC6420j != null) {
            return abstractC6420j;
        }
        AbstractC6420j abstractC6420jJ = j();
        this.f37309b = abstractC6420jJ;
        return abstractC6420jJ;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC6467v.a(this);
    }

    AbstractC6420j j() {
        Object[] array = toArray();
        int i10 = AbstractC6420j.f37235c;
        return AbstractC6420j.k(array, array.length);
    }
}
