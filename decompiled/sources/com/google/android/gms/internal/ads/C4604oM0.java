package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4604oM0 implements QM0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5611wM0 f32039b = new C4352mM0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5611wM0 f32040a;

    public C4604oM0() {
        PL0 pl0A = PL0.a();
        int i10 = AbstractC3722hL0.f28900a;
        C4478nM0 c4478nM0 = new C4478nM0(pl0A, f32039b);
        byte[] bArr = AbstractC3346eM0.f27766b;
        this.f32040a = c4478nM0;
    }

    @Override // com.google.android.gms.internal.ads.QM0
    public final PM0 zza(Class cls) {
        int i10 = RM0.f22792b;
        if (!UL0.class.isAssignableFrom(cls)) {
            int i11 = AbstractC3722hL0.f28900a;
        }
        InterfaceC5359uM0 interfaceC5359uM0Zzc = this.f32040a.zzc(cls);
        if (interfaceC5359uM0Zzc.zza()) {
            int i12 = AbstractC3722hL0.f28900a;
            return CM0.j(RM0.f(), KL0.a(), interfaceC5359uM0Zzc.zzb());
        }
        int i13 = AbstractC3722hL0.f28900a;
        return BM0.G(cls, interfaceC5359uM0Zzc, EM0.a(), AbstractC4100kM0.a(), RM0.f(), interfaceC5359uM0Zzc.zzc() + (-1) != 1 ? KL0.a() : null, AbstractC5233tM0.a());
    }
}
