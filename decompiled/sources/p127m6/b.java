package p127m6;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p176r5.AbstractC7096m;
import p176r5.C7085b;
import p176r5.C7094k;
import p176r5.InterfaceC7086c;
import p191t0.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f46420a = new j();

    public static /* synthetic */ Task a(C7094k c7094k, AtomicBoolean atomicBoolean, C7085b c7085b, Task task) {
        if (task.isSuccessful()) {
            c7094k.e(task.getResult());
        } else if (task.getException() != null) {
            c7094k.d(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            c7085b.a();
        }
        return AbstractC7096m.f(null);
    }

    public static Task b(Task task, Task task2) {
        final C7085b c7085b = new C7085b();
        final C7094k c7094k = new C7094k(c7085b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC7086c interfaceC7086c = new InterfaceC7086c() { // from class: m6.a
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task3) {
                return b.a(c7094k, atomicBoolean, c7085b, task3);
            }
        };
        Executor executor = f46420a;
        task.j(executor, interfaceC7086c);
        task2.j(executor, interfaceC7086c);
        return c7094k.a();
    }
}
