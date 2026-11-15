package p137n6;

import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f46925c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    public final Map a() {
        return this.f46925c;
    }

    public final String b() {
        return this.f46923a;
    }

    public final long c() {
        return this.f46924b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f46923a, cVar.f46923a) && this.f46924b == cVar.f46924b && Intrinsics.b(this.f46925c, cVar.f46925c);
    }

    public int hashCode() {
        return (((this.f46923a.hashCode() * 31) + Long.hashCode(this.f46924b)) * 31) + this.f46925c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f46923a + ", timestamp=" + this.f46924b + ", additionalCustomKeys=" + this.f46925c + ')';
    }

    public c(String sessionId, long j10, Map additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f46923a = sessionId;
        this.f46924b = j10;
        this.f46925c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? E.g() : map);
    }
}
