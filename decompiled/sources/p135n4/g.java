package p135n4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f46760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f46761b;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f46762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f46763b;

        b() {
        }

        @Override // n4.q.a
        public q a() {
            return new g(this.f46762a, this.f46763b);
        }

        @Override // n4.q.a
        public q.a b(byte[] bArr) {
            this.f46762a = bArr;
            return this;
        }

        @Override // n4.q.a
        public q.a c(byte[] bArr) {
            this.f46763b = bArr;
            return this;
        }
    }

    @Override // p135n4.q
    public byte[] b() {
        return this.f46760a;
    }

    @Override // p135n4.q
    public byte[] c() {
        return this.f46761b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z9 = qVar instanceof g;
            if (Arrays.equals(this.f46760a, z9 ? ((g) qVar).f46760a : qVar.b())) {
                if (Arrays.equals(this.f46761b, z9 ? ((g) qVar).f46761b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f46760a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46761b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f46760a) + ", encryptedBlob=" + Arrays.toString(this.f46761b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f46760a = bArr;
        this.f46761b = bArr2;
    }
}
