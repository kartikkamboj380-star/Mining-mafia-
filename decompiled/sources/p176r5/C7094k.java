package p176r5;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: r5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C7094k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f48299a = new L();

    public C7094k() {
    }

    public Task a() {
        return this.f48299a;
    }

    public void b(Exception exc) {
        this.f48299a.s(exc);
    }

    public void c(Object obj) {
        this.f48299a.q(obj);
    }

    public boolean d(Exception exc) {
        return this.f48299a.t(exc);
    }

    public boolean e(Object obj) {
        return this.f48299a.r(obj);
    }

    final /* synthetic */ L f() {
        return this.f48299a;
    }

    public C7094k(AbstractC7084a abstractC7084a) {
        abstractC7084a.a(new I(this));
    }
}
