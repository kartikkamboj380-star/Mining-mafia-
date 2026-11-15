package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5426uu extends TextureView implements InterfaceC2421Su {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1902Iu f33937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C2473Tu f33938b;

    public AbstractC5426uu(Context context) {
        super(context);
        this.f33937a = new C1902Iu();
        this.f33938b = new C2473Tu(context, this);
    }

    public void B(int i10) {
    }

    public void C(int i10) {
    }

    public abstract void a();

    public void f(int i10) {
    }

    public void g(int i10) {
    }

    public void h(int i10) {
    }

    public abstract String i();

    public abstract void j(InterfaceC5300tu interfaceC5300tu);

    public abstract void k(String str);

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract int o();

    public abstract int p();

    public abstract void q(int i10);

    public abstract void r(float f10, float f11);

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract int x();

    public Integer y() {
        return null;
    }

    public void z(String str, String[] strArr, Integer num) {
        k(str);
    }
}
