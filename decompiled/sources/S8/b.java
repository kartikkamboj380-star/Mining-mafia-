package S8;

import I8.C0687p;
import I8.InterfaceC0683n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import p129m8.m;
import p129m8.n;
import p176r5.C7085b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    static final class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0683n f5537a;

        a(InterfaceC0683n interfaceC0683n) {
            this.f5537a = interfaceC0683n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC0683n interfaceC0683n = this.f5537a;
                m.a aVar = m.f46450b;
                interfaceC0683n.resumeWith(m.b(n.a(exception)));
            } else {
                if (task.m()) {
                    InterfaceC0683n.a.a(this.f5537a, null, 1, null);
                    return;
                }
                InterfaceC0683n interfaceC0683n2 = this.f5537a;
                m.a aVar2 = m.f46450b;
                interfaceC0683n2.resumeWith(m.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: S8.b$b, reason: collision with other inner class name */
    static final class C0080b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7085b f5538a;

        C0080b(C7085b c7085b) {
            this.f5538a = c7085b;
        }

        public final void a(Throwable th) {
            this.f5538a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f45918a;
        }
    }

    public static final Object a(Task task, p169q8.b bVar) {
        return b(task, null, bVar);
    }

    private static final Object b(Task task, C7085b c7085b, p169q8.b bVar) throws Exception {
        if (!task.n()) {
            C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
            c0687p.G();
            task.c(S8.a.f5536a, new a(c0687p));
            if (c7085b != null) {
                c0687p.f(new C0080b(c7085b));
            }
            Object objA = c0687p.A();
            if (objA == p179r8.b.e()) {
                h.c(bVar);
            }
            return objA;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.m()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
