package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class OD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f21495a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f21496b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PD0 f21497c = PD0.f22068e;

    /* synthetic */ OD0(byte[] bArr) {
    }

    public final OD0 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f21495a = Integer.valueOf(i10);
        return this;
    }

    public final OD0 b(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.f21496b = Integer.valueOf(i10);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i10);
        throw new GeneralSecurityException(sb.toString());
    }

    public final OD0 c(PD0 pd0) {
        this.f21497c = pd0;
        return this;
    }

    public final QD0 d() throws GeneralSecurityException {
        Integer num = this.f21495a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f21496b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f21497c != null) {
            return new QD0(num.intValue(), this.f21496b.intValue(), this.f21497c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
