package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3448fA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3700hA0 f28200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3574gA0 f28202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2482Ty0 f28203d;

    /* synthetic */ C3448fA0(byte[] bArr) {
    }

    public final C3448fA0 a(C3700hA0 c3700hA0) {
        this.f28200a = c3700hA0;
        return this;
    }

    public final C3448fA0 b(String str) {
        this.f28201b = str;
        return this;
    }

    public final C3448fA0 c(C3574gA0 c3574gA0) {
        this.f28202c = c3574gA0;
        return this;
    }

    public final C3448fA0 d(AbstractC2482Ty0 abstractC2482Ty0) {
        this.f28203d = abstractC2482Ty0;
        return this;
    }

    public final C3826iA0 e() throws GeneralSecurityException {
        if (this.f28200a == null) {
            this.f28200a = C3700hA0.f28857c;
        }
        if (this.f28201b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        C3574gA0 c3574gA0 = this.f28202c;
        if (c3574gA0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC2482Ty0 abstractC2482Ty0 = this.f28203d;
        if (abstractC2482Ty0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC2482Ty0.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c3574gA0.equals(C3574gA0.f28587b) && (abstractC2482Ty0 instanceof C6067zz0)) || ((c3574gA0.equals(C3574gA0.f28589d) && (abstractC2482Ty0 instanceof C2276Pz0)) || ((c3574gA0.equals(C3574gA0.f28588c) && (abstractC2482Ty0 instanceof LA0)) || ((c3574gA0.equals(C3574gA0.f28590e) && (abstractC2482Ty0 instanceof C3802hz0)) || ((c3574gA0.equals(C3574gA0.f28591f) && (abstractC2482Ty0 instanceof C4934qz0)) || (c3574gA0.equals(C3574gA0.f28592g) && (abstractC2482Ty0 instanceof C1913Iz0))))))) {
            return new C3826iA0(this.f28200a, this.f28201b, this.f28202c, this.f28203d, null);
        }
        String string = this.f28202c.toString();
        String strValueOf = String.valueOf(this.f28203d);
        StringBuilder sb = new StringBuilder(string.length() + 67 + strValueOf.length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(string);
        sb.append(" when new keys are picked according to ");
        sb.append(strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
