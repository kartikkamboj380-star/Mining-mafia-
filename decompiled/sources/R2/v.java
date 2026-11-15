package R2;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f5165a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f5166b = new k();

    private Object b(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f5165a.remove(obj);
        }
        return obj;
    }

    @Override // R2.B
    public Object get(int i10) {
        return b(this.f5166b.a(i10));
    }

    @Override // R2.B
    public Object pop() {
        return b(this.f5166b.f());
    }

    @Override // R2.B
    public void put(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f5165a.add(obj);
        }
        if (zAdd) {
            this.f5166b.e(a(obj), obj);
        }
    }
}
