package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ApiKey f16989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f16990b;

    /* synthetic */ E(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.f16989a = apiKey;
        this.f16990b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof E)) {
            E e10 = (E) obj;
            if (Objects.equal(this.f16989a, e10.f16989a) && Objects.equal(this.f16990b, e10.f16990b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16989a, this.f16990b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.f16989a).add("feature", this.f16990b).toString();
    }
}
