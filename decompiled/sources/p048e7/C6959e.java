package p048e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6959e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC6958d f43477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC6958d f43478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f43479c;

    public C6959e(EnumC6958d performance, EnumC6958d crashlytics, double d10) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f43477a = performance;
        this.f43478b = crashlytics;
        this.f43479c = d10;
    }

    public final EnumC6958d a() {
        return this.f43478b;
    }

    public final EnumC6958d b() {
        return this.f43477a;
    }

    public final double c() {
        return this.f43479c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6959e)) {
            return false;
        }
        C6959e c6959e = (C6959e) obj;
        return this.f43477a == c6959e.f43477a && this.f43478b == c6959e.f43478b && Double.compare(this.f43479c, c6959e.f43479c) == 0;
    }

    public int hashCode() {
        return (((this.f43477a.hashCode() * 31) + this.f43478b.hashCode()) * 31) + Double.hashCode(this.f43479c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f43477a + ", crashlytics=" + this.f43478b + ", sessionSamplingRate=" + this.f43479c + ')';
    }
}
