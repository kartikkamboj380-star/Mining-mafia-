package K4;

import com.google.android.gms.common.internal.Objects;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f2595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f2596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2597e;

    public F(String str, double d10, double d11, double d12, int i10) {
        this.f2593a = str;
        this.f2595c = d10;
        this.f2594b = d11;
        this.f2596d = d12;
        this.f2597e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Objects.equal(this.f2593a, f10.f2593a) && this.f2594b == f10.f2594b && this.f2595c == f10.f2595c && this.f2597e == f10.f2597e && Double.compare(this.f2596d, f10.f2596d) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2593a, Double.valueOf(this.f2594b), Double.valueOf(this.f2595c), Double.valueOf(this.f2596d), Integer.valueOf(this.f2597e));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(MediationMetaData.KEY_NAME, this.f2593a).add("minBound", Double.valueOf(this.f2595c)).add("maxBound", Double.valueOf(this.f2594b)).add("percent", Double.valueOf(this.f2596d)).add("count", Integer.valueOf(this.f2597e)).toString();
    }
}
