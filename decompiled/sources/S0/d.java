package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f5360b;

    public d(String key, Long l10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f5359a = key;
        this.f5360b = l10;
    }

    public final String a() {
        return this.f5359a;
    }

    public final Long b() {
        return this.f5360b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f5359a, dVar.f5359a) && Intrinsics.b(this.f5360b, dVar.f5360b);
    }

    public int hashCode() {
        int iHashCode = this.f5359a.hashCode() * 31;
        Long l10 = this.f5360b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f5359a + ", value=" + this.f5360b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String key, boolean z9) {
        this(key, Long.valueOf(z9 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
