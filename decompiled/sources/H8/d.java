package H8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f1570b;

    public /* synthetic */ d(Object obj, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j10);
    }

    public final Object a() {
        return this.f1569a;
    }

    public final long b() {
        return this.f1570b;
    }

    public final Object c() {
        return this.f1569a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f1569a, dVar.f1569a) && kotlin.time.b.m(this.f1570b, dVar.f1570b);
    }

    public int hashCode() {
        Object obj = this.f1569a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + kotlin.time.b.z(this.f1570b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f1569a + ", duration=" + ((Object) kotlin.time.b.K(this.f1570b)) + ')';
    }

    private d(Object obj, long j10) {
        this.f1569a = obj;
        this.f1570b = j10;
    }
}
