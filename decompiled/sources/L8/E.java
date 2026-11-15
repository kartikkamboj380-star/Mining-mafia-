package L8;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends M8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3185a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p169q8.b f3186b;

    @Override // M8.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C c10) {
        if (this.f3185a >= 0) {
            return false;
        }
        this.f3185a = c10.X();
        return true;
    }

    @Override // M8.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p169q8.b[] b(C c10) {
        long j10 = this.f3185a;
        this.f3185a = -1L;
        this.f3186b = null;
        return c10.W(j10);
    }
}
