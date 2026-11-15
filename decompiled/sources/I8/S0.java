package I8;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
final class S0 extends G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p169q8.b f1743e;

    public S0(p169q8.b bVar) {
        this.f1743e = bVar;
    }

    @Override // I8.G0
    public boolean v() {
        return false;
    }

    @Override // I8.G0
    public void w(Throwable th) {
        p169q8.b bVar = this.f1743e;
        m8.m.a aVar = p129m8.m.f46450b;
        bVar.resumeWith(p129m8.m.b(Unit.f45918a));
    }
}
