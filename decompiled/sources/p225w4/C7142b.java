package p225w4;

import p145o4.i;
import p145o4.p;

/* JADX INFO: renamed from: w4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C7142b extends AbstractC7151k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f50325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f50326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f50327c;

    C7142b(long j10, p pVar, i iVar) {
        this.f50325a = j10;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f50326b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f50327c = iVar;
    }

    @Override // p225w4.AbstractC7151k
    public i b() {
        return this.f50327c;
    }

    @Override // p225w4.AbstractC7151k
    public long c() {
        return this.f50325a;
    }

    @Override // p225w4.AbstractC7151k
    public p d() {
        return this.f50326b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7151k) {
            AbstractC7151k abstractC7151k = (AbstractC7151k) obj;
            if (this.f50325a == abstractC7151k.c() && this.f50326b.equals(abstractC7151k.d()) && this.f50327c.equals(abstractC7151k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f50325a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f50326b.hashCode()) * 1000003) ^ this.f50327c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f50325a + ", transportContext=" + this.f50326b + ", event=" + this.f50327c + "}";
    }
}
