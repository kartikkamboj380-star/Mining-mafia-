package p042e1;

import kotlin.jvm.internal.Intrinsics;
import p012b1.n;
import p022c1.EnumC1204j;

/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f43252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1204j f43254c;

    public l(n nVar, boolean z9, EnumC1204j enumC1204j) {
        this.f43252a = nVar;
        this.f43253b = z9;
        this.f43254c = enumC1204j;
    }

    public final EnumC1204j a() {
        return this.f43254c;
    }

    public final n b() {
        return this.f43252a;
    }

    public final boolean c() {
        return this.f43253b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.b(this.f43252a, lVar.f43252a) && this.f43253b == lVar.f43253b && this.f43254c == lVar.f43254c;
    }

    public int hashCode() {
        return (((this.f43252a.hashCode() * 31) + Boolean.hashCode(this.f43253b)) * 31) + this.f43254c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f43252a + ", isSampled=" + this.f43253b + ", dataSource=" + this.f43254c + ')';
    }
}
