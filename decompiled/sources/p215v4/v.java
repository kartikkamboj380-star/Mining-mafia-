package p215v4;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p145o4.p;
import p225w4.InterfaceC7144d;
import p235x4.b;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f50184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7144d f50185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f50186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f50187d;

    v(Executor executor, InterfaceC7144d interfaceC7144d, x xVar, b bVar) {
        this.f50184a = executor;
        this.f50185b = interfaceC7144d;
        this.f50186c = xVar;
        this.f50187d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f50185b.u().iterator();
        while (it.hasNext()) {
            vVar.f50186c.b((p) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f50184a.execute(new Runnable() { // from class: v4.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f50182a;
                vVar.f50187d.c(new b.a() { // from class: v4.u
                    @Override // x4.b.a
                    public final Object a() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
