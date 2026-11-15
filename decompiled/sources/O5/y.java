package O5;

/* JADX INFO: loaded from: classes2.dex */
final class y extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f4556c;

    y() {
    }

    @Override // O5.d.a
    public final d a() {
        if (this.f4556c == 3) {
            return new A(this.f4554a, this.f4555b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4556c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f4556c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // O5.d.a
    public final d.a b(boolean z9) {
        this.f4555b = z9;
        this.f4556c = (byte) (this.f4556c | 2);
        return this;
    }

    public final d.a c(int i10) {
        this.f4554a = i10;
        this.f4556c = (byte) (this.f4556c | 1);
        return this;
    }
}
