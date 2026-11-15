package p057f6;

import G6.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class x implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f43735b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f43734a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f43734a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f43734a.iterator();
            while (it.hasNext()) {
                this.f43735b.add(((b) it.next()).get());
            }
            this.f43734a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(b bVar) {
        try {
            if (this.f43735b == null) {
                this.f43734a.add(bVar);
            } else {
                this.f43735b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // G6.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f43735b == null) {
            synchronized (this) {
                try {
                    if (this.f43735b == null) {
                        this.f43735b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f43735b);
    }
}
