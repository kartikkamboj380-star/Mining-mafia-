package O5;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class l implements InterfaceC0917b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f4525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f4526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f4528d = new Handler(Looper.getMainLooper());

    l(u uVar, i iVar, Context context) {
        this.f4525a = uVar;
        this.f4526b = iVar;
        this.f4527c = context;
    }

    @Override // O5.InterfaceC0917b
    public final boolean a(C0916a c0916a, int i10, Activity activity, int i11) {
        d dVarC = d.c(i10);
        if (activity == null) {
            return false;
        }
        return c(c0916a, new k(this, activity), dVarC, i11);
    }

    @Override // O5.InterfaceC0917b
    public final Task b() {
        return this.f4525a.c(this.f4527c.getPackageName());
    }

    public final boolean c(C0916a c0916a, Q5.a aVar, d dVar, int i10) {
        if (c0916a == null || aVar == null || dVar == null || !c0916a.a(dVar) || c0916a.f()) {
            return false;
        }
        c0916a.e();
        aVar.a(c0916a.c(dVar).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
