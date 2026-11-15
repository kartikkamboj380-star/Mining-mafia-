package T6;

import Y6.g;

/* JADX INFO: loaded from: classes3.dex */
final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f5780b;

    b(g gVar) {
        this.f5780b = gVar;
    }

    @Override // T6.e
    public boolean c() {
        if (!this.f5780b.hasSessionId()) {
            return false;
        }
        if (this.f5780b.q() > 0 || this.f5780b.p() > 0) {
            return true;
        }
        return this.f5780b.t() && this.f5780b.s().l();
    }
}
