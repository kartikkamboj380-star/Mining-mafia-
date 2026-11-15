package O5;

/* JADX INFO: loaded from: classes2.dex */
final class A extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4497b;

    /* synthetic */ A(int i10, boolean z9, z zVar) {
        this.f4496a = i10;
        this.f4497b = z9;
    }

    @Override // O5.d
    public final boolean a() {
        return this.f4497b;
    }

    @Override // O5.d
    public final int b() {
        return this.f4496a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4496a == dVar.b() && this.f4497b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4496a ^ 1000003) * 1000003) ^ (true != this.f4497b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f4496a + ", allowAssetPackDeletion=" + this.f4497b + "}";
    }
}
