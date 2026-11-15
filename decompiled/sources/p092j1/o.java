package p092j1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f45472c;

    public o(String str, String str2, n nVar, p pVar) {
        this.f45470a = str;
        this.f45471b = str2;
        this.f45472c = nVar;
    }

    public final p a() {
        return null;
    }

    public final n b() {
        return this.f45472c;
    }

    public final String c() {
        return this.f45471b;
    }

    public final String d() {
        return this.f45470a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f45470a, oVar.f45470a) && Intrinsics.b(this.f45471b, oVar.f45471b) && Intrinsics.b(this.f45472c, oVar.f45472c) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        return ((((this.f45470a.hashCode() * 31) + this.f45471b.hashCode()) * 31) + this.f45472c.hashCode()) * 31;
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f45470a + ", method=" + this.f45471b + ", headers=" + this.f45472c + ", body=" + ((Object) null) + ')';
    }
}
