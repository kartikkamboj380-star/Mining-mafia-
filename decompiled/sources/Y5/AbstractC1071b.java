package Y5;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Y5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1071b extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f6895a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f6896b;

    /* JADX INFO: renamed from: Y5.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC1071b() {
    }

    private boolean c() {
        this.f6895a = a.FAILED;
        this.f6896b = a();
        if (this.f6895a == a.DONE) {
            return false;
        }
        this.f6895a = a.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f6895a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        X5.j.n(this.f6895a != a.FAILED);
        int iOrdinal = this.f6895a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6895a = a.NOT_READY;
        Object objA = q.a(this.f6896b);
        this.f6896b = null;
        return objA;
    }
}
