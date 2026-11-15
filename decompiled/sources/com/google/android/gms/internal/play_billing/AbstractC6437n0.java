package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6437n0 extends AbstractC6479y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6445p0 f37310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AbstractC6445p0 f37311b;

    protected AbstractC6437n0(AbstractC6445p0 abstractC6445p0) {
        this.f37310a = abstractC6445p0;
        if (abstractC6445p0.v()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f37311b = abstractC6445p0.k();
    }

    private static void l(Object obj, Object obj2) {
        C6398d1.a().b(obj.getClass()).zzg(obj, obj2);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC6437n0 clone() {
        AbstractC6437n0 abstractC6437n0 = (AbstractC6437n0) this.f37310a.w(5, null, null);
        abstractC6437n0.f37311b = zzg();
        return abstractC6437n0;
    }

    public final AbstractC6437n0 f(AbstractC6445p0 abstractC6445p0) {
        if (!this.f37310a.equals(abstractC6445p0)) {
            if (!this.f37311b.v()) {
                k();
            }
            l(this.f37311b, abstractC6445p0);
        }
        return this;
    }

    public final AbstractC6445p0 g() {
        AbstractC6445p0 abstractC6445p0Zzg = zzg();
        if (abstractC6445p0Zzg.j()) {
            return abstractC6445p0Zzg;
        }
        throw new C6473w1(abstractC6445p0Zzg);
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC6445p0 zzg() {
        if (!this.f37311b.v()) {
            return this.f37311b;
        }
        this.f37311b.q();
        return this.f37311b;
    }

    protected final void i() {
        if (this.f37311b.v()) {
            return;
        }
        k();
    }

    protected void k() {
        AbstractC6445p0 abstractC6445p0K = this.f37310a.k();
        l(abstractC6445p0K, this.f37311b);
        this.f37311b = abstractC6445p0K;
    }
}
