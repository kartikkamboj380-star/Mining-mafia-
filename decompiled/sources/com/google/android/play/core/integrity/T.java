package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class T extends InterfaceC6689c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39828a;

    /* synthetic */ T(long j10, int i10, T5.f fVar) {
        this.f39828a = j10;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.a
    final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.a
    public final long b() {
        return this.f39828a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6689c.a) {
            InterfaceC6689c.a aVar = (InterfaceC6689c.a) obj;
            if (this.f39828a == aVar.b()) {
                aVar.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f39828a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f39828a + ", webViewRequestMode=0}";
    }
}
