package p030d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f42856a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f42857b;

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f42857b;
        if (context != null) {
            listener.a(context);
        }
        this.f42856a.add(listener);
    }

    public final void b() {
        this.f42857b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42857b = context;
        Iterator it = this.f42856a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f42857b;
    }

    public final void e(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42856a.remove(listener);
    }
}
