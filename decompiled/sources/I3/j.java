package I3;

import c9.m;
import c9.n;
import c9.t;
import c9.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f1643c;

    @Override // c9.n
    public void a(u url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        n nVar = this.f1643c;
        if (nVar != null) {
            nVar.a(url, cookies);
        }
    }

    @Override // c9.n
    public List b(u url) {
        Intrinsics.checkNotNullParameter(url, "url");
        n nVar = this.f1643c;
        if (nVar == null) {
            return CollectionsKt.i();
        }
        List<m> listB = nVar.b(url);
        ArrayList arrayList = new ArrayList();
        for (m mVar : listB) {
            try {
                new t.a().a(mVar.a(), mVar.b());
                arrayList.add(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // I3.a
    public void c() {
        this.f1643c = null;
    }

    @Override // I3.a
    public void d(n cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f1643c = cookieJar;
    }
}
