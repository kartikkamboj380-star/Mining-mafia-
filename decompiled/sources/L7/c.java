package L7;

/* JADX INFO: loaded from: classes3.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3159a = 3;

    private final boolean b(int i10) {
        return i10 % 10 == 1;
    }

    private final void c() {
        int i10 = this.f3159a + 2;
        this.f3159a = i10;
        if (b(i10)) {
            this.f3159a += 2;
        }
    }

    @Override // L7.f
    public int a() {
        int i10 = this.f3159a;
        c();
        return i10;
    }
}
