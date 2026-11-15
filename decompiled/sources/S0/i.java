package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5366c;

    public i(String workSpecId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f5364a = workSpecId;
        this.f5365b = i10;
        this.f5366c = i11;
    }

    public final int a() {
        return this.f5365b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.b(this.f5364a, iVar.f5364a) && this.f5365b == iVar.f5365b && this.f5366c == iVar.f5366c;
    }

    public int hashCode() {
        return (((this.f5364a.hashCode() * 31) + Integer.hashCode(this.f5365b)) * 31) + Integer.hashCode(this.f5366c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f5364a + ", generation=" + this.f5365b + ", systemId=" + this.f5366c + ')';
    }
}
