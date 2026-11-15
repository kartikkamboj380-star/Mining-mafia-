package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class F implements InterfaceC7090g, InterfaceC7089f, InterfaceC7088e, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7093j f48282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f48283c;

    public F(Executor executor, InterfaceC7093j interfaceC7093j, L l10) {
        this.f48281a = executor;
        this.f48282b = interfaceC7093j;
        this.f48283c = l10;
    }

    @Override // p176r5.InterfaceC7088e
    public final void a() {
        this.f48283c.u();
    }

    @Override // p176r5.G
    public final void b(Task task) {
        this.f48281a.execute(new E(this, task));
    }

    final /* synthetic */ InterfaceC7093j c() {
        return this.f48282b;
    }

    @Override // p176r5.InterfaceC7089f
    public final void onFailure(Exception exc) {
        this.f48283c.s(exc);
    }

    @Override // p176r5.InterfaceC7090g
    public final void onSuccess(Object obj) {
        this.f48283c.q(obj);
    }
}
