package p042e1;

import kotlin.jvm.internal.Intrinsics;
import p022c1.EnumC1204j;
import p022c1.w;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f43259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1204j f43261c;

    public o(w wVar, String str, EnumC1204j enumC1204j) {
        this.f43259a = wVar;
        this.f43260b = str;
        this.f43261c = enumC1204j;
    }

    public final EnumC1204j a() {
        return this.f43261c;
    }

    public final String b() {
        return this.f43260b;
    }

    public final w c() {
        return this.f43259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f43259a, oVar.f43259a) && Intrinsics.b(this.f43260b, oVar.f43260b) && this.f43261c == oVar.f43261c;
    }

    public int hashCode() {
        int iHashCode = this.f43259a.hashCode() * 31;
        String str = this.f43260b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f43261c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f43259a + ", mimeType=" + this.f43260b + ", dataSource=" + this.f43261c + ')';
    }
}
