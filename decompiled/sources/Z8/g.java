package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7196b;

    public g(l writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f7195a = writer;
        this.f7196b = true;
    }

    public final boolean a() {
        return this.f7196b;
    }

    public void b() {
        this.f7196b = true;
    }

    public void c() {
        this.f7196b = false;
    }

    public void d() {
        this.f7196b = false;
    }

    public final void e(char c10) {
        this.f7195a.a(c10);
    }

    public void f(double d10) {
        this.f7195a.c(String.valueOf(d10));
    }

    public void g(int i10) {
        this.f7195a.writeLong(i10);
    }

    public void h(long j10) {
        this.f7195a.writeLong(j10);
    }

    public final void i(String v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f7195a.c(v10);
    }

    public void j(boolean z9) {
        this.f7195a.c(String.valueOf(z9));
    }

    public void k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7195a.b(value);
    }

    protected final void l(boolean z9) {
        this.f7196b = z9;
    }

    public void m() {
    }

    public void n() {
    }
}
