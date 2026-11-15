package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4179l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4053k f31145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5312u f31146b;

    public void b() {
        this.f31145a = null;
        this.f31146b = null;
    }

    public abstract boolean c();

    public abstract void d(C4966rF c4966rF);

    public abstract FS0 e();

    public abstract void f(Object obj);

    public abstract C4305m g(GS0[] gs0Arr, A01 a01, C5637wZ0 c5637wZ0, AbstractC5270tf abstractC5270tf);

    public final void h(InterfaceC4053k interfaceC4053k, InterfaceC5312u interfaceC5312u) {
        AbstractC2418Ss0.i(this.f31145a == null);
        this.f31145a = interfaceC4053k;
        this.f31146b = interfaceC5312u;
    }

    protected final void i() {
        InterfaceC4053k interfaceC4053k = this.f31145a;
        if (interfaceC4053k != null) {
            interfaceC4053k.a();
        }
    }

    protected final InterfaceC5312u j() {
        InterfaceC5312u interfaceC5312u = this.f31146b;
        interfaceC5312u.getClass();
        return interfaceC5312u;
    }
}
