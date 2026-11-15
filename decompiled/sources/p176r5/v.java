package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class v implements InterfaceC7090g, InterfaceC7089f, InterfaceC7088e, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7086c f48321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f48322c;

    public v(Executor executor, InterfaceC7086c interfaceC7086c, L l10) {
        this.f48320a = executor;
        this.f48321b = interfaceC7086c;
        this.f48322c = l10;
    }

    @Override // p176r5.InterfaceC7088e
    public final void a() {
        this.f48322c.u();
    }

    @Override // p176r5.G
    public final void b(Task task) {
        this.f48320a.execute(new u(this, task));
    }

    final /* synthetic */ InterfaceC7086c c() {
        return this.f48321b;
    }

    final /* synthetic */ L d() {
        return this.f48322c;
    }

    @Override // p176r5.InterfaceC7089f
    public final void onFailure(Exception exc) {
        this.f48322c.s(exc);
    }

    @Override // p176r5.InterfaceC7090g
    public final void onSuccess(Object obj) {
        this.f48322c.q(obj);
    }
}
