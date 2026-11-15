package L4;

/* JADX INFO: loaded from: classes2.dex */
final class n extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3135c;

    n(int i10, int i11, boolean z9) {
        this.f3133a = i10;
        this.f3134b = i11;
        this.f3135c = z9;
    }

    @Override // L4.x
    public final int a() {
        return this.f3133a;
    }

    @Override // L4.x
    public final int b() {
        return this.f3134b;
    }

    @Override // L4.x
    public final boolean c() {
        return this.f3135c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f3133a == xVar.a() && this.f3134b == xVar.b() && this.f3135c == xVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f3135c ? 1237 : 1231) ^ ((((this.f3133a ^ 1000003) * 1000003) ^ this.f3134b) * 1000003);
    }

    public final String toString() {
        int i10 = this.f3133a;
        int length = String.valueOf(i10).length();
        int i11 = this.f3134b;
        int length2 = String.valueOf(i11).length();
        boolean z9 = this.f3135c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z9).length() + 1);
        sb.append("OfflineAdConfig{impressionPrerequisite=");
        sb.append(i10);
        sb.append(", clickPrerequisite=");
        sb.append(i11);
        sb.append(", notificationFlowEnabled=");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }
}
