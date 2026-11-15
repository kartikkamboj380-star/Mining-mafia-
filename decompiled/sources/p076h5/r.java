package p076h5;

import W4.b;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7086c;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f44786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f44787b;

    public r(Context context) {
        this.f44786a = new p(context, GoogleApiAvailabilityLight.getInstance());
        this.f44787b = l.d(context);
    }

    public static /* synthetic */ Task a(r rVar, Task task) {
        if (!task.isSuccessful() && !task.m()) {
            Exception exception = task.getException();
            if (exception instanceof ApiException) {
                int statusCode = ((ApiException) exception).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return rVar.f44787b.b();
                }
                if (statusCode == 43000) {
                    return AbstractC7096m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return AbstractC7096m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // W4.b
    public final Task b() {
        return this.f44786a.b().k(new InterfaceC7086c() { // from class: h5.q
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task) {
                return r.a(this.f44785a, task);
            }
        });
    }
}
