package R8;

import N8.A;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class m extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f5329e;

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        this.f5329e = new AtomicReferenceArray(l.f5328f);
    }

    @Override // N8.A
    public int r() {
        return l.f5328f;
    }

    @Override // N8.A
    public void s(int i10, Throwable th, CoroutineContext coroutineContext) {
        v().set(i10, l.f5327e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f3676c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f5329e;
    }
}
