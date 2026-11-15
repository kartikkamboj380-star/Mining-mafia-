package r9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7115s extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f48497f;

    public C7115s(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48497f = delegate;
    }

    @Override // r9.d0
    public d0 a() {
        return this.f48497f.a();
    }

    @Override // r9.d0
    public d0 b() {
        return this.f48497f.b();
    }

    @Override // r9.d0
    public long c() {
        return this.f48497f.c();
    }

    @Override // r9.d0
    public d0 d(long j10) {
        return this.f48497f.d(j10);
    }

    @Override // r9.d0
    public boolean e() {
        return this.f48497f.e();
    }

    @Override // r9.d0
    public void f() throws InterruptedIOException {
        this.f48497f.f();
    }

    @Override // r9.d0
    public d0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f48497f.g(j10, unit);
    }

    @Override // r9.d0
    public long h() {
        return this.f48497f.h();
    }

    public final d0 i() {
        return this.f48497f;
    }

    public final C7115s j(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48497f = delegate;
        return this;
    }
}
