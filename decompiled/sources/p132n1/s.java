package p132n1;

import kotlin.jvm.internal.Intrinsics;
import p012b1.n;
import p022c1.EnumC1204j;
import p082i1.d;

/* JADX INFO: loaded from: classes.dex */
public final class s implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f46660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1204j f46662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d.b f46663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f46665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46666g;

    public s(n nVar, f fVar, EnumC1204j enumC1204j, d.b bVar, String str, boolean z9, boolean z10) {
        this.f46660a = nVar;
        this.f46661b = fVar;
        this.f46662c = enumC1204j;
        this.f46663d = bVar;
        this.f46664e = str;
        this.f46665f = z9;
        this.f46666g = z10;
    }

    public final EnumC1204j a() {
        return this.f46662c;
    }

    @Override // p132n1.j
    public f b() {
        return this.f46661b;
    }

    public n c() {
        return this.f46660a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.b(this.f46660a, sVar.f46660a) && Intrinsics.b(this.f46661b, sVar.f46661b) && this.f46662c == sVar.f46662c && Intrinsics.b(this.f46663d, sVar.f46663d) && Intrinsics.b(this.f46664e, sVar.f46664e) && this.f46665f == sVar.f46665f && this.f46666g == sVar.f46666g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f46660a.hashCode() * 31) + this.f46661b.hashCode()) * 31) + this.f46662c.hashCode()) * 31;
        d.b bVar = this.f46663d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f46664e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f46665f)) * 31) + Boolean.hashCode(this.f46666g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f46660a + ", request=" + this.f46661b + ", dataSource=" + this.f46662c + ", memoryCacheKey=" + this.f46663d + ", diskCacheKey=" + this.f46664e + ", isSampled=" + this.f46665f + ", isPlaceholderCached=" + this.f46666g + ')';
    }
}
