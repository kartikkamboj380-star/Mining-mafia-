package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3826iA0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3700hA0 f29290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3574gA0 f29292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC2482Ty0 f29293d;

    /* synthetic */ C3826iA0(C3700hA0 c3700hA0, String str, C3574gA0 c3574gA0, AbstractC2482Ty0 abstractC2482Ty0, byte[] bArr) {
        this.f29290a = c3700hA0;
        this.f29291b = str;
        this.f29292c = c3574gA0;
        this.f29293d = abstractC2482Ty0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f29290a != C3700hA0.f28857c;
    }

    public final String b() {
        return this.f29291b;
    }

    public final C3700hA0 c() {
        return this.f29290a;
    }

    public final AbstractC2482Ty0 d() {
        return this.f29293d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3826iA0)) {
            return false;
        }
        C3826iA0 c3826iA0 = (C3826iA0) obj;
        return c3826iA0.f29292c.equals(this.f29292c) && c3826iA0.f29293d.equals(this.f29293d) && c3826iA0.f29291b.equals(this.f29291b) && c3826iA0.f29290a.equals(this.f29290a);
    }

    public final int hashCode() {
        return Objects.hash(C3826iA0.class, this.f29291b, this.f29292c, this.f29293d, this.f29290a);
    }

    public final String toString() {
        C3700hA0 c3700hA0 = this.f29290a;
        AbstractC2482Ty0 abstractC2482Ty0 = this.f29293d;
        String strValueOf = String.valueOf(this.f29292c);
        String strValueOf2 = String.valueOf(abstractC2482Ty0);
        String strValueOf3 = String.valueOf(c3700hA0);
        String str = this.f29291b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(strValueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(strValueOf2);
        sb.append(", variant: ");
        sb.append(strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
