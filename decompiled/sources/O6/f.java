package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.google.firebase.perf.application.a.InterfaceC0372a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final R6.a f4570a = R6.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC0372a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f4570a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
