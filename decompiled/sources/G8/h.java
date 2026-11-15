package G8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class h extends i implements Iterator, p169q8.b, A8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f1079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f1080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p169q8.b f1081d;

    private final Throwable g() {
        int i10 = this.f1078a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1078a);
    }

    private final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // G8.i
    public Object c(Object obj, p169q8.b bVar) {
        this.f1079b = obj;
        this.f1078a = 3;
        this.f1081d = bVar;
        Object objE = p179r8.b.e();
        if (objE == p179r8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objE == p179r8.b.e() ? objE : Unit.f45918a;
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f45956a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f1078a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f1080c;
                Intrinsics.c(it);
                if (it.hasNext()) {
                    this.f1078a = 2;
                    return true;
                }
                this.f1080c = null;
            }
            this.f1078a = 5;
            p169q8.b bVar = this.f1081d;
            Intrinsics.c(bVar);
            this.f1081d = null;
            m8.m.a aVar = p129m8.m.f46450b;
            bVar.resumeWith(p129m8.m.b(Unit.f45918a));
        }
    }

    public final void k(p169q8.b bVar) {
        this.f1081d = bVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f1078a;
        if (i10 == 0 || i10 == 1) {
            return h();
        }
        if (i10 == 2) {
            this.f1078a = 1;
            Iterator it = this.f1080c;
            Intrinsics.c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f1078a = 0;
        Object obj = this.f1079b;
        this.f1079b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p169q8.b
    public void resumeWith(Object obj) {
        p129m8.n.b(obj);
        this.f1078a = 4;
    }
}
