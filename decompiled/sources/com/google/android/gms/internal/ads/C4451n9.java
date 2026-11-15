package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4451n9 extends PP0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ZP0 f31717G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f31718H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f31719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f31720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f31721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f31722m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private double f31723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f31724w;

    public C4451n9() {
        super("mvhd");
        this.f31723v = 1.0d;
        this.f31724w = 1.0f;
        this.f31717G = ZP0.f26174j;
    }

    @Override // com.google.android.gms.internal.ads.NP0
    public final void c(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f31719j = UP0.a(AbstractC3947j9.d(byteBuffer));
            this.f31720k = UP0.a(AbstractC3947j9.d(byteBuffer));
            this.f31721l = AbstractC3947j9.a(byteBuffer);
            this.f31722m = AbstractC3947j9.d(byteBuffer);
        } else {
            this.f31719j = UP0.a(AbstractC3947j9.a(byteBuffer));
            this.f31720k = UP0.a(AbstractC3947j9.a(byteBuffer));
            this.f31721l = AbstractC3947j9.a(byteBuffer);
            this.f31722m = AbstractC3947j9.a(byteBuffer);
        }
        this.f31723v = AbstractC3947j9.e(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f31724w = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        AbstractC3947j9.b(byteBuffer);
        AbstractC3947j9.a(byteBuffer);
        AbstractC3947j9.a(byteBuffer);
        this.f31717G = new ZP0(AbstractC3947j9.e(byteBuffer), AbstractC3947j9.e(byteBuffer), AbstractC3947j9.e(byteBuffer), AbstractC3947j9.e(byteBuffer), AbstractC3947j9.f(byteBuffer), AbstractC3947j9.f(byteBuffer), AbstractC3947j9.f(byteBuffer), AbstractC3947j9.e(byteBuffer), AbstractC3947j9.e(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f31718H = AbstractC3947j9.a(byteBuffer);
    }

    public final long g() {
        return this.f31721l;
    }

    public final long h() {
        return this.f31722m;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f31719j + ";modificationTime=" + this.f31720k + ";timescale=" + this.f31721l + ";duration=" + this.f31722m + ";rate=" + this.f31723v + ";volume=" + this.f31724w + ";matrix=" + this.f31717G + ";nextTrackId=" + this.f31718H + "]";
    }
}
