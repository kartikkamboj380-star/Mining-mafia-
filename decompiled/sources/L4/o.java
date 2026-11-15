package L4;

/* JADX INFO: loaded from: classes2.dex */
final class o extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f3138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3139d;

    o(int i10, int i11, double d10, boolean z9) {
        this.f3136a = i10;
        this.f3137b = i11;
        this.f3138c = d10;
        this.f3139d = z9;
    }

    @Override // L4.y
    public final int a() {
        return this.f3136a;
    }

    @Override // L4.y
    public final int b() {
        return this.f3137b;
    }

    @Override // L4.y
    public final double c() {
        return this.f3138c;
    }

    @Override // L4.y
    public final boolean d() {
        return this.f3139d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f3136a == yVar.a() && this.f3137b == yVar.b() && Double.doubleToLongBits(this.f3138c) == Double.doubleToLongBits(yVar.c()) && this.f3139d == yVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.f3138c;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.f3136a ^ 1000003) * 1000003) ^ this.f3137b) * 1000003)) * 1000003) ^ (true != this.f3139d ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f3136a;
        int length = String.valueOf(i10).length();
        int i11 = this.f3137b;
        int length2 = String.valueOf(i11).length();
        double d10 = this.f3138c;
        int length3 = String.valueOf(d10).length();
        boolean z9 = this.f3139d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z9).length() + 1);
        sb.append("PingStrategy{maxAttempts=");
        sb.append(i10);
        sb.append(", initialBackoffMs=");
        sb.append(i11);
        sb.append(", backoffMultiplier=");
        sb.append(d10);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }
}
