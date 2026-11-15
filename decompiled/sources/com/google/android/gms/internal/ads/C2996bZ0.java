package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2996bZ0 implements HZ0, GX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GZ0 f26861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FX0 f26862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC3247dZ0 f26863d;

    public C2996bZ0(AbstractC3247dZ0 abstractC3247dZ0, Object obj) {
        Objects.requireNonNull(abstractC3247dZ0);
        this.f26863d = abstractC3247dZ0;
        this.f26861b = abstractC3247dZ0.s(null);
        this.f26862c = abstractC3247dZ0.u(null);
        this.f26860a = obj;
    }

    private final boolean a(int i10, C5637wZ0 c5637wZ0) {
        C5637wZ0 c5637wZ0C;
        if (c5637wZ0 != null) {
            c5637wZ0C = this.f26863d.C(this.f26860a, c5637wZ0);
            if (c5637wZ0C == null) {
                return false;
            }
        } else {
            c5637wZ0C = null;
        }
        AbstractC3247dZ0 abstractC3247dZ0 = this.f26863d;
        abstractC3247dZ0.B(this.f26860a, 0);
        GZ0 gz0 = this.f26861b;
        int i11 = gz0.f19074a;
        if (!Objects.equals(gz0.f19075b, c5637wZ0C)) {
            this.f26861b = abstractC3247dZ0.t(0, c5637wZ0C);
        }
        FX0 fx0 = this.f26862c;
        int i12 = fx0.f18781a;
        if (Objects.equals(fx0.f18782b, c5637wZ0C)) {
            return true;
        }
        this.f26862c = abstractC3247dZ0.v(0, c5637wZ0C);
        return true;
    }

    private final C5133sZ0 b(C5133sZ0 c5133sZ0, C5637wZ0 c5637wZ0) {
        AbstractC3247dZ0 abstractC3247dZ0 = this.f26863d;
        Object obj = this.f26860a;
        abstractC3247dZ0.E(obj, c5133sZ0.f33187c, c5637wZ0);
        abstractC3247dZ0.E(obj, c5133sZ0.f33188d, c5637wZ0);
        return c5133sZ0;
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void H(int i10, C5637wZ0 c5637wZ0, C4504nZ0 c4504nZ0, C5133sZ0 c5133sZ0) {
        if (a(0, c5637wZ0)) {
            GZ0 gz0 = this.f26861b;
            b(c5133sZ0, c5637wZ0);
            gz0.f(c4504nZ0, c5133sZ0);
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void J(int i10, C5637wZ0 c5637wZ0, C4504nZ0 c4504nZ0, C5133sZ0 c5133sZ0) {
        if (a(0, c5637wZ0)) {
            GZ0 gz0 = this.f26861b;
            b(c5133sZ0, c5637wZ0);
            gz0.e(c4504nZ0, c5133sZ0);
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void L(int i10, C5637wZ0 c5637wZ0, C5133sZ0 c5133sZ0) {
        if (a(0, c5637wZ0)) {
            GZ0 gz0 = this.f26861b;
            b(c5133sZ0, c5637wZ0);
            gz0.h(c5133sZ0);
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void j(int i10, C5637wZ0 c5637wZ0, C4504nZ0 c4504nZ0, C5133sZ0 c5133sZ0, IOException iOException, boolean z9) {
        if (a(0, c5637wZ0)) {
            GZ0 gz0 = this.f26861b;
            b(c5133sZ0, c5637wZ0);
            gz0.g(c4504nZ0, c5133sZ0, iOException, z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void x(int i10, C5637wZ0 c5637wZ0, C4504nZ0 c4504nZ0, C5133sZ0 c5133sZ0, int i11) {
        if (a(0, c5637wZ0)) {
            GZ0 gz0 = this.f26861b;
            b(c5133sZ0, c5637wZ0);
            gz0.d(c4504nZ0, c5133sZ0, i11);
        }
    }
}
