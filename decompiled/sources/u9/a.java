package u9;

/* JADX INFO: loaded from: classes3.dex */
class a implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f50005a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50006b;

    a(c cVar) {
        this.f50006b = cVar;
    }

    @Override // u9.l
    public void a(q qVar, Object obj) {
        this.f50005a.a(j.a(qVar, obj));
        this.f50006b.e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarB = this.f50005a.b();
        if (jVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f50006b.h(jVarB);
    }
}
