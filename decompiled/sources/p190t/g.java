package p190t;

import A8.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49455c;

    public g(int i10) {
        this.f49453a = i10;
    }

    protected abstract Object a(int i10);

    protected abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49454b < this.f49453a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f49454b);
        this.f49454b++;
        this.f49455c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f49455c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f49454b - 1;
        this.f49454b = i10;
        b(i10);
        this.f49453a--;
        this.f49455c = false;
    }
}
