package p123m2;

import H2.x;
import Y1.f;
import Y1.n;
import android.content.res.Resources;
import java.util.concurrent.Executor;
import p153p2.a;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f46393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f46394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N2.a f46395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N2.a f46396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f46397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f46398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f46399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f46400h;

    public void a(Resources resources, a aVar, N2.a aVar2, N2.a aVar3, Executor executor, x xVar, f fVar, n nVar) {
        this.f46393a = resources;
        this.f46394b = aVar;
        this.f46395c = aVar2;
        this.f46396d = aVar3;
        this.f46397e = executor;
        this.f46398f = xVar;
        this.f46399g = fVar;
        this.f46400h = nVar;
    }

    protected e b(Resources resources, a aVar, N2.a aVar2, N2.a aVar3, Executor executor, x xVar, f fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e eVarB = b(this.f46393a, this.f46394b, this.f46395c, this.f46396d, this.f46397e, this.f46398f, this.f46399g);
        n nVar = this.f46400h;
        if (nVar != null) {
            eVarB.A0(((Boolean) nVar.get()).booleanValue());
        }
        return eVarB;
    }
}
