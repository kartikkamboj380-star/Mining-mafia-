package p022c1;

import kotlin.jvm.internal.Intrinsics;
import p012b1.n;

/* JADX INFO: renamed from: c1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1205k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f11773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11774b;

    public C1205k(n nVar, boolean z9) {
        this.f11773a = nVar;
        this.f11774b = z9;
    }

    public final n a() {
        return this.f11773a;
    }

    public final boolean b() {
        return this.f11774b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1205k)) {
            return false;
        }
        C1205k c1205k = (C1205k) obj;
        return Intrinsics.b(this.f11773a, c1205k.f11773a) && this.f11774b == c1205k.f11774b;
    }

    public int hashCode() {
        return (this.f11773a.hashCode() * 31) + Boolean.hashCode(this.f11774b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f11773a + ", isSampled=" + this.f11774b + ')';
    }
}
