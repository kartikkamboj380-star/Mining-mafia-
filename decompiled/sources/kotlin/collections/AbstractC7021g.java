package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7021g extends AbstractSet implements Set, A8.b {
    protected AbstractC7021g() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
