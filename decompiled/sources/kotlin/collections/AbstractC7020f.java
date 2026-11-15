package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7020f extends AbstractList implements List, A8.b {
    protected AbstractC7020f() {
    }

    public abstract int a();

    public abstract Object b(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return b(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
