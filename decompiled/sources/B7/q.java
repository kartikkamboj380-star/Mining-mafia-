package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4.k f345a;

    public q(B4.k adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f345a = adError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.b(this.f345a, ((q) obj).f345a);
    }

    public final int hashCode() {
        return this.f345a.hashCode();
    }

    public final String toString() {
        return "OnAdFailedToLoad(adError=" + this.f345a + ")";
    }
}
