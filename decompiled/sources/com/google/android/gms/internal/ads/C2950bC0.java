package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2950bC0 extends C2824aC0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f26755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2950bC0(C3326eC0 c3326eC0) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.f26755d = jArr;
        long[] jArr2 = this.f26449a;
        C3201dC0 c3201dC0 = c3326eC0.f27714a;
        AbstractC4332mC0.a(jArr2, c3201dC0.f27371b, c3201dC0.f27370a);
        long[] jArr3 = this.f26450b;
        C3201dC0 c3201dC1 = c3326eC0.f27714a;
        AbstractC4332mC0.b(jArr3, c3201dC1.f27371b, c3201dC1.f27370a);
        System.arraycopy(c3326eC0.f27714a.f27372c, 0, jArr, 0, 10);
        AbstractC4332mC0.e(this.f26451c, c3326eC0.f27715b, AbstractC3704hC0.f28877b);
    }

    @Override // com.google.android.gms.internal.ads.C2824aC0
    public final void a(long[] jArr, long[] jArr2) {
        AbstractC4332mC0.e(jArr, jArr2, this.f26755d);
    }
}
