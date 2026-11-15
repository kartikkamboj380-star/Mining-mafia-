package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6187d5 extends AbstractC6347v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6205f5 f36662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AbstractC6205f5 f36663b;

    protected AbstractC6187d5(AbstractC6205f5 abstractC6205f5) {
        this.f36662a = abstractC6205f5;
        if (abstractC6205f5.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f36663b = abstractC6205f5.l();
    }

    private static void k(Object obj, Object obj2) {
        N5.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6347v4
    public final /* bridge */ /* synthetic */ AbstractC6347v4 g(byte[] bArr, int i10, int i11) throws C6286o5 {
        T4 t10 = T4.f36495c;
        int i12 = N5.f36424d;
        r(bArr, 0, i11, T4.f36495c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6347v4
    public final /* bridge */ /* synthetic */ AbstractC6347v4 h(byte[] bArr, int i10, int i11, T4 t10) throws C6286o5 {
        r(bArr, 0, i11, t10);
        return this;
    }

    protected final void l() {
        if (this.f36663b.j()) {
            return;
        }
        m();
    }

    protected void m() {
        AbstractC6205f5 abstractC6205f5L = this.f36662a.l();
        k(abstractC6205f5L, this.f36663b);
        this.f36663b = abstractC6205f5L;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC6187d5 clone() {
        AbstractC6187d5 abstractC6187d5 = (AbstractC6187d5) this.f36662a.B(5, null, null);
        abstractC6187d5.f36663b = T();
        return abstractC6187d5;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC6205f5 T() {
        if (!this.f36663b.j()) {
            return this.f36663b;
        }
        this.f36663b.n();
        return this.f36663b;
    }

    public final AbstractC6205f5 p() {
        AbstractC6205f5 abstractC6205f5T = T();
        if (abstractC6205f5T.i()) {
            return abstractC6205f5T;
        }
        throw new C6161a6(abstractC6205f5T);
    }

    public final AbstractC6187d5 q(AbstractC6205f5 abstractC6205f5) {
        if (!this.f36662a.equals(abstractC6205f5)) {
            if (!this.f36663b.j()) {
                m();
            }
            k(this.f36663b, abstractC6205f5);
        }
        return this;
    }

    public final AbstractC6187d5 r(byte[] bArr, int i10, int i11, T4 t10) throws C6286o5 {
        if (!this.f36663b.j()) {
            m();
        }
        try {
            N5.a().b(this.f36663b.getClass()).g(this.f36663b, bArr, 0, i11, new C6381z4(t10));
            return this;
        } catch (C6286o5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C6286o5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
