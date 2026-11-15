package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7017c implements Iterator, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45932b;

    private final boolean e() {
        this.f45931a = 3;
        a();
        return this.f45931a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f45931a = 2;
    }

    protected final void c(Object obj) {
        this.f45932b = obj;
        this.f45931a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f45931a;
        if (i10 == 0) {
            return e();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f45931a;
        if (i10 == 1) {
            this.f45931a = 0;
            return this.f45932b;
        }
        if (i10 == 2 || !e()) {
            throw new NoSuchElementException();
        }
        this.f45931a = 0;
        return this.f45932b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
