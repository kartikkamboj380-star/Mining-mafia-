package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class t implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7086c f48316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f48317c;

    public t(Executor executor, InterfaceC7086c interfaceC7086c, L l10) {
        this.f48315a = executor;
        this.f48316b = interfaceC7086c;
        this.f48317c = l10;
    }

    final /* synthetic */ InterfaceC7086c a() {
        return this.f48316b;
    }

    @Override // p176r5.G
    public final void b(Task task) {
        this.f48315a.execute(new s(this, task));
    }

    final /* synthetic */ L c() {
        return this.f48317c;
    }
}
