package com.google.android.gms.internal.auth;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes2.dex */
final class S0 implements InterfaceC6103l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X0 f35967b = new Q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0 f35968a;

    public S0() {
        X0 x10;
        A0 a0A = A0.a();
        try {
            x10 = (X0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            x10 = f35967b;
        }
        R0 r10 = new R0(a0A, x10);
        byte[] bArr = G0.f35914d;
        this.f35968a = r10;
    }

    private static boolean a(W0 w10) {
        return w10.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6103l1
    public final InterfaceC6100k1 zza(Class cls) {
        AbstractC6106m1.d(cls);
        W0 w0Zzb = this.f35968a.zzb(cls);
        if (w0Zzb.zzb()) {
            return C0.class.isAssignableFrom(cls) ? C6082e1.f(AbstractC6106m1.b(), AbstractC6140y0.b(), w0Zzb.zza()) : C6082e1.f(AbstractC6106m1.a(), AbstractC6140y0.a(), w0Zzb.zza());
        }
        if (C0.class.isAssignableFrom(cls)) {
            return a(w0Zzb) ? C6079d1.q(cls, w0Zzb, AbstractC6088g1.b(), P0.d(), AbstractC6106m1.b(), AbstractC6140y0.b(), V0.b()) : C6079d1.q(cls, w0Zzb, AbstractC6088g1.b(), P0.d(), AbstractC6106m1.b(), null, V0.b());
        }
        return a(w0Zzb) ? C6079d1.q(cls, w0Zzb, AbstractC6088g1.a(), P0.c(), AbstractC6106m1.a(), AbstractC6140y0.a(), V0.a()) : C6079d1.q(cls, w0Zzb, AbstractC6088g1.a(), P0.c(), AbstractC6106m1.a(), null, V0.a());
    }
}
