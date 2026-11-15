package I8;

/* JADX INFO: renamed from: I8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0676j0 implements InterfaceC0701w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1789a;

    public C0676j0(boolean z9) {
        this.f1789a = z9;
    }

    @Override // I8.InterfaceC0701w0
    public M0 a() {
        return null;
    }

    @Override // I8.InterfaceC0701w0
    public boolean isActive() {
        return this.f1789a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
