package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QL0 extends AbstractC2968bL0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UL0 f22352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected UL0 f22353b;

    protected QL0(UL0 ul0) {
        this.f22352a = ul0;
        if (ul0.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22353b = p();
    }

    private UL0 p() {
        return this.f22352a.L();
    }

    private static void q(Object obj, Object obj2) {
        HM0.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5989zM0
    public final boolean b() {
        return UL0.Z(this.f22353b, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2968bL0
    public /* bridge */ /* synthetic */ AbstractC2968bL0 k(byte[] bArr, int i10, int i11, HL0 hl0) throws C3598gM0 {
        y(bArr, i10, i11, hl0);
        return this;
    }

    protected final void r() {
        if (this.f22353b.p()) {
            return;
        }
        s();
    }

    protected void s() {
        UL0 ul0P = p();
        q(ul0P, this.f22353b);
        this.f22353b = ul0P;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public QL0 clone() {
        QL0 ql0G = z().g();
        ql0G.f22353b = N();
        return ql0G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5737xM0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UL0 N() {
        if (!this.f22353b.p()) {
            return this.f22353b;
        }
        this.f22353b.O();
        return this.f22353b;
    }

    public final UL0 w() {
        UL0 ul0N = N();
        if (ul0N.b()) {
            return ul0N;
        }
        throw AbstractC2968bL0.l(ul0N);
    }

    public QL0 x(UL0 ul0) {
        if (z().equals(ul0)) {
            return this;
        }
        r();
        q(this.f22353b, ul0);
        return this;
    }

    public QL0 y(byte[] bArr, int i10, int i11, HL0 hl0) throws C3598gM0 {
        r();
        try {
            HM0.a().b(this.f22353b.getClass()).i(this.f22353b, bArr, i10, i10 + i11, new C3848iL0(hl0));
            return this;
        } catch (C3598gM0 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public UL0 z() {
        return this.f22352a;
    }
}
