package p131n0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f46533a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f46534b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f46535c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f46536d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                c.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f46536d) {
            f(closeable);
            return;
        }
        synchronized (this.f46533a) {
            autoCloseable = (AutoCloseable) this.f46534b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f46536d) {
            return;
        }
        this.f46536d = true;
        synchronized (this.f46533a) {
            try {
                Iterator it = this.f46534b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f46535c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f46535c.clear();
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f46533a) {
            autoCloseable = (AutoCloseable) this.f46534b.get(key);
        }
        return autoCloseable;
    }
}
