package p048e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC6964j f43321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f43322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6956b f43323c;

    public K(EnumC6964j eventType, S sessionData, C6956b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f43321a = eventType;
        this.f43322b = sessionData;
        this.f43323c = applicationInfo;
    }

    public final C6956b a() {
        return this.f43323c;
    }

    public final EnumC6964j b() {
        return this.f43321a;
    }

    public final S c() {
        return this.f43322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return this.f43321a == k10.f43321a && Intrinsics.b(this.f43322b, k10.f43322b) && Intrinsics.b(this.f43323c, k10.f43323c);
    }

    public int hashCode() {
        return (((this.f43321a.hashCode() * 31) + this.f43322b.hashCode()) * 31) + this.f43323c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f43321a + ", sessionData=" + this.f43322b + ", applicationInfo=" + this.f43323c + ')';
    }
}
