package com.google.android.gms.internal.play_billing;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes2.dex */
final class N0 implements InterfaceC6414h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final T0 f37098b = new L0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0 f37099a;

    public N0() {
        T0 t10;
        C6433m0 c6433m0A = C6433m0.a();
        try {
            t10 = (T0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            t10 = f37098b;
        }
        M0 m10 = new M0(c6433m0A, t10);
        byte[] bArr = AbstractC6480y0.f37349d;
        this.f37099a = m10;
    }

    private static boolean a(R0 r10) {
        return r10.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6414h1
    public final InterfaceC6410g1 zza(Class cls) {
        AbstractC6418i1.y(cls);
        R0 r0Zzb = this.f37099a.zzb(cls);
        if (r0Zzb.zzb()) {
            return AbstractC6445p0.class.isAssignableFrom(cls) ? Z0.f(AbstractC6418i1.u(), AbstractC6413h0.b(), r0Zzb.zza()) : Z0.f(AbstractC6418i1.t(), AbstractC6413h0.a(), r0Zzb.zza());
        }
        if (AbstractC6445p0.class.isAssignableFrom(cls)) {
            return a(r0Zzb) ? Y0.w(cls, r0Zzb, AbstractC6390b1.b(), K0.d(), AbstractC6418i1.u(), AbstractC6413h0.b(), Q0.b()) : Y0.w(cls, r0Zzb, AbstractC6390b1.b(), K0.d(), AbstractC6418i1.u(), null, Q0.b());
        }
        return a(r0Zzb) ? Y0.w(cls, r0Zzb, AbstractC6390b1.a(), K0.c(), AbstractC6418i1.t(), AbstractC6413h0.a(), Q0.a()) : Y0.w(cls, r0Zzb, AbstractC6390b1.a(), K0.c(), AbstractC6418i1.t(), null, Q0.a());
    }
}
