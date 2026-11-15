package p036d5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p096j5.e;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static D f43077e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f43079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f43080c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43081d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f43079b = scheduledExecutorService;
        this.f43078a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        try {
            if (f43077e == null) {
                e.a();
                f43077e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43077e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f43081d;
        this.f43081d = i10 + 1;
        return i10;
    }

    private final synchronized Task g(A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f43080c.g(a10)) {
                x xVar = new x(this, null);
                this.f43080c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a10.f43074b.a();
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}
