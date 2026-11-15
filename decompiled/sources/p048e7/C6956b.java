package p048e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6956b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC6976w f43429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6955a f43430f;

    public C6956b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, EnumC6976w logEnvironment, C6955a androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f43425a = appId;
        this.f43426b = deviceModel;
        this.f43427c = sessionSdkVersion;
        this.f43428d = osVersion;
        this.f43429e = logEnvironment;
        this.f43430f = androidAppInfo;
    }

    public final C6955a a() {
        return this.f43430f;
    }

    public final String b() {
        return this.f43425a;
    }

    public final String c() {
        return this.f43426b;
    }

    public final EnumC6976w d() {
        return this.f43429e;
    }

    public final String e() {
        return this.f43428d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6956b)) {
            return false;
        }
        C6956b c6956b = (C6956b) obj;
        return Intrinsics.b(this.f43425a, c6956b.f43425a) && Intrinsics.b(this.f43426b, c6956b.f43426b) && Intrinsics.b(this.f43427c, c6956b.f43427c) && Intrinsics.b(this.f43428d, c6956b.f43428d) && this.f43429e == c6956b.f43429e && Intrinsics.b(this.f43430f, c6956b.f43430f);
    }

    public final String f() {
        return this.f43427c;
    }

    public int hashCode() {
        return (((((((((this.f43425a.hashCode() * 31) + this.f43426b.hashCode()) * 31) + this.f43427c.hashCode()) * 31) + this.f43428d.hashCode()) * 31) + this.f43429e.hashCode()) * 31) + this.f43430f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f43425a + ", deviceModel=" + this.f43426b + ", sessionSdkVersion=" + this.f43427c + ", osVersion=" + this.f43428d + ", logEnvironment=" + this.f43429e + ", androidAppInfo=" + this.f43430f + ')';
    }
}
