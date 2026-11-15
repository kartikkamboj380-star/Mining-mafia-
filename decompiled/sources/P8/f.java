package P8;

import I8.AbstractC0691r0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends AbstractC0691r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f4765g = r1();

    public f(int i10, int i11, long j10, String str) {
        this.f4761c = i10;
        this.f4762d = i11;
        this.f4763e = j10;
        this.f4764f = str;
    }

    private final a r1() {
        return new a(this.f4761c, this.f4762d, this.f4763e, this.f4764f);
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        a.x(this.f4765g, runnable, false, false, 6, null);
    }

    @Override // I8.K
    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        a.x(this.f4765g, runnable, false, true, 2, null);
    }

    @Override // I8.AbstractC0691r0
    public Executor q1() {
        return this.f4765g;
    }

    public final void s1(Runnable runnable, boolean z9, boolean z10) {
        this.f4765g.w(runnable, z9, z10);
    }
}
