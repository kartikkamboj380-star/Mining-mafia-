package P8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4776b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4777c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4778d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4779e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f4780a = new AtomicReferenceArray(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f4767b) {
            f4779e.incrementAndGet(this);
        }
        int i10 = f4777c.get(this) & 127;
        while (this.f4780a.get(i10) != null) {
            Thread.yield();
        }
        this.f4780a.lazySet(i10, hVar);
        f4777c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f4767b) {
            return;
        }
        f4779e.decrementAndGet(this);
    }

    private final int e() {
        return f4777c.get(this) - f4778d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f4778d.get(this);
            if (i10 - f4777c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f4778d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f4780a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z9) {
        h hVar;
        do {
            hVar = (h) f4776b.get(this);
            if (hVar == null || hVar.f4767b != z9) {
                int i10 = f4778d.get(this);
                int i11 = f4777c.get(this);
                while (i10 != i11) {
                    if (z9 && f4779e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z9);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f4776b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f4778d.get(this);
        int i12 = f4777c.get(this);
        boolean z9 = i10 == 1;
        while (i11 != i12) {
            if (z9 && f4779e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z9);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z9) {
        int i11 = i10 & 127;
        h hVar = (h) this.f4780a.get(i11);
        if (hVar == null || hVar.f4767b != z9 || !K8.l.a(this.f4780a, i11, hVar, null)) {
            return null;
        }
        if (z9) {
            f4779e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, E e10) {
        h hVar;
        do {
            hVar = (h) f4776b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f4767b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f4774f.a() - hVar.f4766a;
            long j10 = j.f4770b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f4776b, this, hVar, null));
        e10.f45973a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z9) {
        if (z9) {
            return b(hVar);
        }
        h hVar2 = (h) f4776b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f4776b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f4776b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f4776b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, E e10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, e10);
        }
        e10.f45973a = hVarM;
        return -1L;
    }
}
