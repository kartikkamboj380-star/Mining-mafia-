package Q6;

import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5069a;

    public g(a aVar) {
        this.f5069a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) p079h8.b.c(aVar.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f5069a);
    }
}
