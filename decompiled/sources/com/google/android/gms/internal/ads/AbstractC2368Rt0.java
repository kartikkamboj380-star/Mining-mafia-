package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2368Rt0 implements InterfaceC4176ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f22942b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4454nA0 f22944d;

    protected AbstractC2368Rt0(boolean z9) {
        this.f22941a = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void b(GK0 gk0) {
        gk0.getClass();
        ArrayList arrayList = this.f22942b;
        if (arrayList.contains(gk0)) {
            return;
        }
        arrayList.add(gk0);
        this.f22943c++;
    }

    protected final void c(C4454nA0 c4454nA0) {
        for (int i10 = 0; i10 < this.f22943c; i10++) {
            ((GK0) this.f22942b.get(i10)).q(this, c4454nA0, this.f22941a);
        }
    }

    protected final void f(C4454nA0 c4454nA0) {
        this.f22944d = c4454nA0;
        for (int i10 = 0; i10 < this.f22943c; i10++) {
            ((GK0) this.f22942b.get(i10)).o(this, c4454nA0, this.f22941a);
        }
    }

    protected final void g(int i10) {
        C4454nA0 c4454nA0 = this.f22944d;
        String str = AbstractC4634ob0.f32117a;
        for (int i11 = 0; i11 < this.f22943c; i11++) {
            ((GK0) this.f22942b.get(i11)).h(this, c4454nA0, this.f22941a, i10);
        }
    }

    protected final void h() {
        C4454nA0 c4454nA0 = this.f22944d;
        String str = AbstractC4634ob0.f32117a;
        for (int i10 = 0; i10 < this.f22943c; i10++) {
            ((GK0) this.f22942b.get(i10)).n(this, c4454nA0, this.f22941a);
        }
        this.f22944d = null;
    }
}
