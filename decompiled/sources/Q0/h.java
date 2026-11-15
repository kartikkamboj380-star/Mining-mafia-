package Q0;

import android.content.Context;
import androidx.work.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0.b f4788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f4791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f4792e;

    protected h(Context context, U0.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f4788a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f4789b = applicationContext;
        this.f4790c = new Object();
        this.f4791d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, h this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = listenersList.iterator();
        while (it.hasNext()) {
            ((O0.a) it.next()).a(this$0.f4792e);
        }
    }

    public final void c(O0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f4790c) {
            try {
                if (this.f4791d.add(listener)) {
                    if (this.f4791d.size() == 1) {
                        this.f4792e = e();
                        q.e().a(i.f4793a, getClass().getSimpleName() + ": initial state = " + this.f4792e);
                        h();
                    }
                    listener.a(this.f4792e);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Context d() {
        return this.f4789b;
    }

    public abstract Object e();

    public final void f(O0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f4790c) {
            try {
                if (this.f4791d.remove(listener) && this.f4791d.isEmpty()) {
                    i();
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f4790c) {
            Object obj2 = this.f4792e;
            if (obj2 == null || !Intrinsics.b(obj2, obj)) {
                this.f4792e = obj;
                final List listW0 = CollectionsKt.w0(this.f4791d);
                this.f4788a.a().execute(new Runnable() { // from class: Q0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listW0, this);
                    }
                });
                Unit unit = Unit.f45918a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
