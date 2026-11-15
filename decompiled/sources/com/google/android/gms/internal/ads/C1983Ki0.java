package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ki0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1983Ki0 extends AbstractC2294Qi0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20263d;

    /* synthetic */ C1983Ki0(String str, boolean z9, int i10, InterfaceC1879Ii0 interfaceC1879Ii0, int i11, byte[] bArr) {
        this.f20261b = str;
        this.f20262c = i10;
        this.f20263d = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2294Qi0
    public final String a() {
        return this.f20261b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2294Qi0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2294Qi0
    public final InterfaceC1879Ii0 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2294Qi0
    public final int d() {
        return this.f20262c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2294Qi0
    public final int e() {
        return this.f20263d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2294Qi0) {
            AbstractC2294Qi0 abstractC2294Qi0 = (AbstractC2294Qi0) obj;
            if (this.f20261b.equals(abstractC2294Qi0.a())) {
                abstractC2294Qi0.b();
                int i10 = this.f20262c;
                int iD = abstractC2294Qi0.d();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iD) {
                    abstractC2294Qi0.c();
                    int i11 = this.f20263d;
                    int iE = abstractC2294Qi0.e();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iE == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20261b.hashCode() ^ 1000003;
        int i10 = this.f20262c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f20263d != 0) {
            return (i11 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f20262c;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f20263d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f20261b;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
