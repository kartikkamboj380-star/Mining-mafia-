package Q4;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T4.a f4955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4959e = new AtomicBoolean(false);

    public m0(T4.a aVar, String str, long j10, int i10) {
        this.f4955a = aVar;
        this.f4956b = str;
        this.f4957c = j10;
        this.f4958d = i10;
    }

    public final T4.a a() {
        return this.f4955a;
    }

    public final String b() {
        return this.f4956b;
    }

    public final boolean c() {
        return this.f4957c <= G4.t.o().currentTimeMillis();
    }

    public final int d() {
        return this.f4958d;
    }

    public final boolean e() {
        return this.f4959e.get();
    }

    public final void f() {
        this.f4959e.set(true);
    }
}
