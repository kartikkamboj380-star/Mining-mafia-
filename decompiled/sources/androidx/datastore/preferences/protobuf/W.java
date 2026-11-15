package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class W implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f9437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f9439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9440d;

    W(J j10, String str, Object[] objArr) {
        this.f9437a = j10;
        this.f9438b = str;
        this.f9439c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9440d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f9440d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean a() {
        return (this.f9440d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public J b() {
        return this.f9437a;
    }

    Object[] c() {
        return this.f9439c;
    }

    String d() {
        return this.f9438b;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public T getSyntax() {
        int i10 = this.f9440d;
        if ((i10 & 1) != 0) {
            return T.PROTO2;
        }
        return (i10 & 4) == 4 ? T.EDITIONS : T.PROTO3;
    }
}
