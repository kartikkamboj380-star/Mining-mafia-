package S4;

import B4.y;
import H4.InterfaceC0608j0;
import L4.p;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC0608j0 f5495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.b f5496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f5497c;

    protected c(Context context, B4.b bVar) {
        this.f5495a = y.a(context);
        this.f5497c = context.getApplicationContext();
        this.f5496b = bVar;
    }

    public final void a() {
        try {
            this.f5495a.N(this.f5496b.d());
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }
}
