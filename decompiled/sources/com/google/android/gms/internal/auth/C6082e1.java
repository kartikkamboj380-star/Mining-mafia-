package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6082e1 implements InterfaceC6100k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f36020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6115p1 f36021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6134w0 f36022c;

    private C6082e1(AbstractC6115p1 abstractC6115p1, AbstractC6134w0 abstractC6134w0, Z0 z9) {
        this.f36021b = abstractC6115p1;
        this.f36022c = abstractC6134w0;
        this.f36020a = z9;
    }

    static C6082e1 f(AbstractC6115p1 abstractC6115p1, AbstractC6134w0 abstractC6134w0, Z0 z9) {
        return new C6082e1(abstractC6115p1, abstractC6134w0, z9);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final void a(Object obj) {
        this.f36021b.c(obj);
        this.f36022c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final boolean b(Object obj, Object obj2) {
        return this.f36021b.a(obj).equals(this.f36021b.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final void c(Object obj, byte[] bArr, int i10, int i11, C6081e0 c6081e0) {
        C0 c10 = (C0) obj;
        if (c10.zzc == C6120r1.a()) {
            c10.zzc = C6120r1.d();
        }
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final void d(Object obj, Object obj2) {
        AbstractC6106m1.c(this.f36021b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final boolean e(Object obj) {
        this.f36022c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final int zza(Object obj) {
        return this.f36021b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6100k1
    public final Object zzd() {
        Z0 z9 = this.f36020a;
        return z9 instanceof C0 ? ((C0) z9).c() : ((B0) ((C0) z9).m(5, null, null)).zzd();
    }
}
