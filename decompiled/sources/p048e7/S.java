package p048e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6959e f43359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f43360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f43361g;

    public S(String sessionId, String firstSessionId, int i10, long j10, C6959e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f43355a = sessionId;
        this.f43356b = firstSessionId;
        this.f43357c = i10;
        this.f43358d = j10;
        this.f43359e = dataCollectionStatus;
        this.f43360f = firebaseInstallationId;
        this.f43361g = firebaseAuthenticationToken;
    }

    public final C6959e a() {
        return this.f43359e;
    }

    public final long b() {
        return this.f43358d;
    }

    public final String c() {
        return this.f43361g;
    }

    public final String d() {
        return this.f43360f;
    }

    public final String e() {
        return this.f43356b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return Intrinsics.b(this.f43355a, s10.f43355a) && Intrinsics.b(this.f43356b, s10.f43356b) && this.f43357c == s10.f43357c && this.f43358d == s10.f43358d && Intrinsics.b(this.f43359e, s10.f43359e) && Intrinsics.b(this.f43360f, s10.f43360f) && Intrinsics.b(this.f43361g, s10.f43361g);
    }

    public final String f() {
        return this.f43355a;
    }

    public final int g() {
        return this.f43357c;
    }

    public int hashCode() {
        return (((((((((((this.f43355a.hashCode() * 31) + this.f43356b.hashCode()) * 31) + Integer.hashCode(this.f43357c)) * 31) + Long.hashCode(this.f43358d)) * 31) + this.f43359e.hashCode()) * 31) + this.f43360f.hashCode()) * 31) + this.f43361g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f43355a + ", firstSessionId=" + this.f43356b + ", sessionIndex=" + this.f43357c + ", eventTimestampUs=" + this.f43358d + ", dataCollectionStatus=" + this.f43359e + ", firebaseInstallationId=" + this.f43360f + ", firebaseAuthenticationToken=" + this.f43361g + ')';
    }
}
