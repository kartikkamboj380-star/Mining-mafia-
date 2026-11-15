package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4756pZ0 extends AbstractC4000jZ0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f32425e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f32427d;

    private C4756pZ0(AbstractC5270tf abstractC5270tf, Object obj, Object obj2) {
        super(abstractC5270tf);
        this.f32426c = obj;
        this.f32427d = obj2;
    }

    public static C4756pZ0 p(C4819q4 c4819q4) {
        return new C4756pZ0(new C4882qZ0(c4819q4), C2337Re.f22865o, f32425e);
    }

    public static C4756pZ0 q(AbstractC5270tf abstractC5270tf, Object obj, Object obj2) {
        return new C4756pZ0(abstractC5270tf, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final C2337Re b(int i10, C2337Re c2337Re, long j10) {
        this.f30485b.b(i10, c2337Re, j10);
        if (Objects.equals(c2337Re.f22867a, this.f32426c)) {
            c2337Re.f22867a = C2337Re.f22865o;
        }
        return c2337Re;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        this.f30485b.d(i10, c4891qe, z9);
        if (Objects.equals(c4891qe.f32696b, this.f32427d) && z9) {
            c4891qe.f32696b = f32425e;
        }
        return c4891qe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final int e(Object obj) {
        Object obj2;
        if (f32425e.equals(obj) && (obj2 = this.f32427d) != null) {
            obj = obj2;
        }
        return this.f30485b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final Object f(int i10) {
        Object objF = this.f30485b.f(i10);
        return Objects.equals(objF, this.f32427d) ? f32425e : objF;
    }

    public final C4756pZ0 r(AbstractC5270tf abstractC5270tf) {
        return new C4756pZ0(abstractC5270tf, this.f32426c, this.f32427d);
    }

    final /* synthetic */ Object s() {
        return this.f32427d;
    }
}
