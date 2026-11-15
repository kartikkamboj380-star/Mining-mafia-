package U3;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f5952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f5953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f5954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f5955d;

    public k(l topLeft, l topRight, l bottomLeft, l bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f5952a = topLeft;
        this.f5953b = topRight;
        this.f5954c = bottomLeft;
        this.f5955d = bottomRight;
    }

    public final l a() {
        return this.f5954c;
    }

    public final l b() {
        return this.f5955d;
    }

    public final l c() {
        return this.f5952a;
    }

    public final l d() {
        return this.f5953b;
    }

    public final boolean e() {
        return this.f5952a.a() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5952a.b() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5953b.a() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5953b.b() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5954c.a() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5954c.b() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f5955d.a() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.b(this.f5952a, kVar.f5952a) && Intrinsics.b(this.f5953b, kVar.f5953b) && Intrinsics.b(this.f5954c, kVar.f5954c) && Intrinsics.b(this.f5955d, kVar.f5955d);
    }

    public final boolean f() {
        return Intrinsics.b(this.f5952a, this.f5953b) && Intrinsics.b(this.f5952a, this.f5954c) && Intrinsics.b(this.f5952a, this.f5955d);
    }

    public int hashCode() {
        return (((((this.f5952a.hashCode() * 31) + this.f5953b.hashCode()) * 31) + this.f5954c.hashCode()) * 31) + this.f5955d.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f5952a + ", topRight=" + this.f5953b + ", bottomLeft=" + this.f5954c + ", bottomRight=" + this.f5955d + ")";
    }

    public k() {
        this(new l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
