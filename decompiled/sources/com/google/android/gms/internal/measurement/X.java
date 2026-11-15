package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class X extends AbstractC6191e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36539e;

    /* synthetic */ X(String str, boolean z9, int i10, U u10, V v10, int i11, byte[] bArr) {
        this.f36537c = str;
        this.f36538d = i10;
        this.f36539e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final String a() {
        return this.f36537c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final U c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final V d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final int e() {
        return this.f36538d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6191e0) {
            AbstractC6191e0 abstractC6191e0 = (AbstractC6191e0) obj;
            if (this.f36537c.equals(abstractC6191e0.a())) {
                abstractC6191e0.b();
                int i10 = this.f36538d;
                int iE = abstractC6191e0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC6191e0.c();
                    abstractC6191e0.d();
                    int i11 = this.f36539e;
                    int iF = abstractC6191e0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6191e0
    public final int f() {
        return this.f36539e;
    }

    public final int hashCode() {
        int iHashCode = this.f36537c.hashCode() ^ 1000003;
        int i10 = this.f36538d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f36539e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f36538d;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f36539e == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f36537c;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
