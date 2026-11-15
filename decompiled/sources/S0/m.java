package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5375b;

    public m(String workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f5374a = workSpecId;
        this.f5375b = i10;
    }

    public final int a() {
        return this.f5375b;
    }

    public final String b() {
        return this.f5374a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(this.f5374a, mVar.f5374a) && this.f5375b == mVar.f5375b;
    }

    public int hashCode() {
        return (this.f5374a.hashCode() * 31) + Integer.hashCode(this.f5375b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f5374a + ", generation=" + this.f5375b + ')';
    }
}
