package com.zoontek.rnbootsplash;

import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Vector {
    public /* bridge */ int b() {
        return super.size();
    }

    public /* bridge */ Object d(int i10) {
        return super.remove(i10);
    }

    public final synchronized Object e() {
        if (size() == 0) {
            return null;
        }
        Object objElementAt = elementAt(0);
        removeElementAt(0);
        return objElementAt;
    }

    public final void push(Object obj) {
        addElement(obj);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return d(i10);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
