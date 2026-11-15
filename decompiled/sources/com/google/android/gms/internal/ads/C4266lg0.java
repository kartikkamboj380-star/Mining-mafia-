package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4266lg0 extends AbstractC3764hg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4014jg0 f31328a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5527vh0 f31330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2550Vg0 f31331d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31334g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1927Jg0 f31329b = new C1927Jg0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31332e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31333f = false;

    C4266lg0(C3889ig0 c3889ig0, C4014jg0 c4014jg0, String str) {
        this.f31328a = c4014jg0;
        this.f31334g = str;
        k(null);
        if (c4014jg0.i() == EnumC4140kg0.HTML || c4014jg0.i() == EnumC4140kg0.JAVASCRIPT) {
            this.f31331d = new C2602Wg0(str, c4014jg0.f());
        } else {
            this.f31331d = new C2886ah0(str, c4014jg0.e(), null);
        }
        this.f31331d.a();
        C1719Fg0.a().b(this);
        this.f31331d.j(c3889ig0);
    }

    private final void k(View view) {
        this.f31330c = new C5527vh0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3764hg0
    public final void a() {
        if (this.f31332e || this.f31331d == null) {
            return;
        }
        this.f31332e = true;
        C1719Fg0.a().c(this);
        this.f31331d.o(C2134Ng0.a().f());
        this.f31331d.n(C1615Dg0.a().b());
        this.f31331d.k(this, this.f31328a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3764hg0
    public final void b(View view) {
        if (this.f31333f || i() == view) {
            return;
        }
        k(view);
        this.f31331d.p();
        Collection<C4266lg0> collectionE = C1719Fg0.a().e();
        if (collectionE == null || collectionE.isEmpty()) {
            return;
        }
        for (C4266lg0 c4266lg0 : collectionE) {
            if (c4266lg0 != this && c4266lg0.i() == view) {
                c4266lg0.f31330c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3764hg0
    public final void c() {
        if (this.f31333f) {
            return;
        }
        this.f31330c.clear();
        if (!this.f31333f) {
            this.f31329b.c();
        }
        this.f31333f = true;
        this.f31331d.m();
        C1719Fg0.a().d(this);
        this.f31331d.b();
        this.f31331d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3764hg0
    public final void d(View view, EnumC4644og0 enumC4644og0, String str) {
        if (this.f31333f) {
            return;
        }
        this.f31329b.b(view, enumC4644og0, "Ad overlay");
    }

    public final List f() {
        return this.f31329b.a();
    }

    public final AbstractC2550Vg0 g() {
        return this.f31331d;
    }

    public final String h() {
        return this.f31334g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View i() {
        return (View) this.f31330c.get();
    }

    public final boolean j() {
        return this.f31332e && !this.f31333f;
    }
}
