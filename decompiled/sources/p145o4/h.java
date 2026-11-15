package p145o4;

import java.util.Arrays;
import p125m4.c;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f47252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f47253b;

    public h(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f47252a = cVar;
        this.f47253b = bArr;
    }

    public byte[] a() {
        return this.f47253b;
    }

    public c b() {
        return this.f47252a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f47252a.equals(hVar.f47252a)) {
            return Arrays.equals(this.f47253b, hVar.f47253b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47252a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47253b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f47252a + ", bytes=[...]}";
    }
}
