package p048e7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6955a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f43422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f43423f;

    public C6955a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, E currentProcessDetails, List appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f43418a = packageName;
        this.f43419b = versionName;
        this.f43420c = appBuildVersion;
        this.f43421d = deviceManufacturer;
        this.f43422e = currentProcessDetails;
        this.f43423f = appProcessDetails;
    }

    public final String a() {
        return this.f43420c;
    }

    public final List b() {
        return this.f43423f;
    }

    public final E c() {
        return this.f43422e;
    }

    public final String d() {
        return this.f43421d;
    }

    public final String e() {
        return this.f43418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6955a)) {
            return false;
        }
        C6955a c6955a = (C6955a) obj;
        return Intrinsics.b(this.f43418a, c6955a.f43418a) && Intrinsics.b(this.f43419b, c6955a.f43419b) && Intrinsics.b(this.f43420c, c6955a.f43420c) && Intrinsics.b(this.f43421d, c6955a.f43421d) && Intrinsics.b(this.f43422e, c6955a.f43422e) && Intrinsics.b(this.f43423f, c6955a.f43423f);
    }

    public final String f() {
        return this.f43419b;
    }

    public int hashCode() {
        return (((((((((this.f43418a.hashCode() * 31) + this.f43419b.hashCode()) * 31) + this.f43420c.hashCode()) * 31) + this.f43421d.hashCode()) * 31) + this.f43422e.hashCode()) * 31) + this.f43423f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f43418a + ", versionName=" + this.f43419b + ", appBuildVersion=" + this.f43420c + ", deviceManufacturer=" + this.f43421d + ", currentProcessDetails=" + this.f43422e + ", appProcessDetails=" + this.f43423f + ')';
    }
}
