package p145o4;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p125m4.c;
import p125m4.j;
import p125m4.k;
import p205u4.e;
import p215v4.r;
import p215v4.v;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v f47266e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f47267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f47268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f47269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f47270d;

    u(a aVar, a aVar2, e eVar, r rVar, v vVar) {
        this.f47267a = aVar;
        this.f47268b = aVar2;
        this.f47269c = eVar;
        this.f47270d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f47267a.a()).o(this.f47268b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f47266e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(c.b("proto"));
    }

    public static void f(Context context) {
        if (f47266e == null) {
            synchronized (u.class) {
                try {
                    if (f47266e == null) {
                        f47266e = e.a().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p145o4.t
    public void a(o oVar, k kVar) {
        this.f47269c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public r e() {
        return this.f47270d;
    }

    public j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
