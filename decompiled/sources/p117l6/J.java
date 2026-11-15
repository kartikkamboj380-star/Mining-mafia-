package p117l6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46116b;

    public J(String str, String str2) {
        this.f46115a = str;
        this.f46116b = str2;
    }

    public final String a() {
        return this.f46116b;
    }

    public final String b() {
        return this.f46115a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Intrinsics.b(this.f46115a, j10.f46115a) && Intrinsics.b(this.f46116b, j10.f46116b);
    }

    public int hashCode() {
        String str = this.f46115a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46116b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f46115a + ", authToken=" + this.f46116b + ')';
    }
}
