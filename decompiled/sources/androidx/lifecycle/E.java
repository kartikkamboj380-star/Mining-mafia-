package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class E implements InterfaceC1168n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1156b.a f10151b;

    E(Object obj) {
        this.f10150a = obj;
        this.f10151b = C1156b.f10202c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r rVar, AbstractC1164j.a aVar) {
        this.f10151b.a(rVar, aVar, this.f10150a);
    }
}
