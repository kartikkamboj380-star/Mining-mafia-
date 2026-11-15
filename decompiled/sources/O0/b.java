package O0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3910d;

    public b(boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f3907a = z9;
        this.f3908b = z10;
        this.f3909c = z11;
        this.f3910d = z12;
    }

    public final boolean a() {
        return this.f3907a;
    }

    public final boolean b() {
        return this.f3909c;
    }

    public final boolean c() {
        return this.f3910d;
    }

    public final boolean d() {
        return this.f3908b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3907a == bVar.f3907a && this.f3908b == bVar.f3908b && this.f3909c == bVar.f3909c && this.f3910d == bVar.f3910d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z9 = this.f3907a;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z10 = this.f3908b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z11 = this.f3909c;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z12 = this.f3910d;
        return i12 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f3907a + ", isValidated=" + this.f3908b + ", isMetered=" + this.f3909c + ", isNotRoaming=" + this.f3910d + ')';
    }
}
