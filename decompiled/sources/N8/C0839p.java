package N8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: N8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0839p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3718a = AtomicReferenceFieldUpdater.newUpdater(C0839p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C0839p(boolean z9) {
        this._cur$volatile = new q(8, z9);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3718a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int iA = qVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f3718a, this, qVar, qVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3718a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f3718a, this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) f3718a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3718a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            Object objM = qVar.m();
            if (objM != q.f3722h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f3718a, this, qVar, qVar.l());
        }
    }
}
