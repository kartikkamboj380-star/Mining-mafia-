package u9;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ExecutorService f50039m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f50044e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f50046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f50047h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List f50049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f50050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f50051l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f50040a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f50041b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50042c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f50043d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f50045f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ExecutorService f50048i = f50039m;

    d() {
    }

    public c a() {
        return new c(this);
    }

    g b() {
        g gVar = this.f50050k;
        return gVar != null ? gVar : g.a.a();
    }

    h c() {
        h hVar = this.f50051l;
        if (hVar != null) {
            return hVar;
        }
        if (v9.a.a()) {
            return v9.a.b().f50226b;
        }
        return null;
    }
}
