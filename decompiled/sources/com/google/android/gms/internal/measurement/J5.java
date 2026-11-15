package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class J5 implements Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5 f36312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6170b6 f36313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36314c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U4 f36315d;

    private J5(AbstractC6170b6 abstractC6170b6, U4 u10, F5 f10) {
        this.f36313b = abstractC6170b6;
        this.f36315d = u10;
        this.f36312a = f10;
    }

    static J5 i(AbstractC6170b6 abstractC6170b6, U4 u10, F5 f10) {
        return new J5(abstractC6170b6, u10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final int a(Object obj) {
        int iG = ((AbstractC6205f5) obj).zzc.g();
        if (!this.f36314c) {
            return iG;
        }
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final boolean b(Object obj) {
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final int c(Object obj) {
        int iHashCode = ((AbstractC6205f5) obj).zzc.hashCode();
        if (!this.f36314c) {
            return iHashCode;
        }
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void d(Object obj, Object obj2) {
        S5.d(this.f36313b, obj, obj2);
        if (this.f36314c) {
            S5.c(this.f36315d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final boolean e(Object obj, Object obj2) {
        if (!((AbstractC6205f5) obj).zzc.equals(((AbstractC6205f5) obj2).zzc)) {
            return false;
        }
        if (!this.f36314c) {
            return true;
        }
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void f(Object obj) {
        this.f36313b.b(obj);
        this.f36315d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void g(Object obj, byte[] bArr, int i10, int i11, C6381z4 c6381z4) {
        AbstractC6205f5 abstractC6205f5 = (AbstractC6205f5) obj;
        if (abstractC6205f5.zzc == C6179c6.a()) {
            abstractC6205f5.zzc = C6179c6.b();
        }
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void h(Object obj, InterfaceC6287o6 interfaceC6287o6) {
        p070h.w.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final Object zza() {
        F5 f10 = this.f36312a;
        return f10 instanceof AbstractC6205f5 ? ((AbstractC6205f5) f10).l() : f10.d().T();
    }
}
