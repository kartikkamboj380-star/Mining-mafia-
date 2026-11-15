package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6701o extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f39882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f39883c = null;

    /* synthetic */ C6701o(String str, Long l10, Object obj, T5.c cVar) {
        this.f39881a = str;
        this.f39882b = l10;
    }

    private static boolean c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f39882b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f39881a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z9;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f39881a.equals(integrityTokenRequest.b()) || ((l10 = this.f39882b) != null ? !l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() != null)) {
                z9 = false;
            } else {
                z9 = true;
            }
        } else {
            z9 = false;
        }
        if (!(obj instanceof C6701o) || !c()) {
            return z9;
        }
        C6701o c6701o = (C6701o) obj;
        if (!z9) {
            return false;
        }
        Object obj2 = c6701o.f39883c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f39881a.hashCode() ^ 1000003;
        Long l10 = this.f39882b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return c() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f39881a + ", cloudProjectNumber=" + this.f39882b;
        if (c()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
