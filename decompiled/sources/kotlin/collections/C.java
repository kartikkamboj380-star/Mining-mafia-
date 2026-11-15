package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C implements Iterator, A8.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
