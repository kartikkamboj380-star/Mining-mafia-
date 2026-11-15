package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4742pS0 implements HZ0, GX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4993rS0 f32395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5497vS0 f32396b;

    public C4742pS0(C5497vS0 c5497vS0, C4993rS0 c4993rS0) {
        Objects.requireNonNull(c5497vS0);
        this.f32396b = c5497vS0;
        this.f32395a = c4993rS0;
    }

    private final Pair a(int i10, C5637wZ0 c5637wZ0) {
        C5637wZ0 c5637wZ0A;
        C5637wZ0 c5637wZ1 = null;
        if (c5637wZ0 != null) {
            C4993rS0 c4993rS0 = this.f32395a;
            int i11 = 0;
            while (true) {
                List list = c4993rS0.f32905c;
                if (i11 >= list.size()) {
                    c5637wZ0A = null;
                    break;
                }
                if (((C5637wZ0) list.get(i11)).f34597d == c5637wZ0.f34597d) {
                    Object obj = c5637wZ0.f34594a;
                    Object obj2 = c4993rS0.f32904b;
                    int i12 = CS0.f17877k;
                    c5637wZ0A = c5637wZ0.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (c5637wZ0A == null) {
                return null;
            }
            c5637wZ1 = c5637wZ0A;
        }
        return Pair.create(Integer.valueOf(this.f32395a.f32906d), c5637wZ1);
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void H(int i10, C5637wZ0 c5637wZ0, final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0) {
        final Pair pairA = a(0, c5637wZ0);
        if (pairA != null) {
            C5497vS0 c5497vS0 = this.f32396b;
            c5497vS0.k().g(new Runnable() { // from class: com.google.android.gms.internal.ads.lS0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    this.f31272a.f32396b.j().H(((Integer) pair.first).intValue(), (C5637wZ0) pair.second, c4504nZ0, c5133sZ0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void J(int i10, C5637wZ0 c5637wZ0, final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0) {
        final Pair pairA = a(0, c5637wZ0);
        if (pairA != null) {
            C5497vS0 c5497vS0 = this.f32396b;
            c5497vS0.k().g(new Runnable() { // from class: com.google.android.gms.internal.ads.kS0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    this.f30796a.f32396b.j().J(((Integer) pair.first).intValue(), (C5637wZ0) pair.second, c4504nZ0, c5133sZ0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void L(int i10, C5637wZ0 c5637wZ0, final C5133sZ0 c5133sZ0) {
        final Pair pairA = a(0, c5637wZ0);
        if (pairA != null) {
            C5497vS0 c5497vS0 = this.f32396b;
            c5497vS0.k().g(new Runnable() { // from class: com.google.android.gms.internal.ads.nS0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    this.f31813a.f32396b.j().L(((Integer) pair.first).intValue(), (C5637wZ0) pair.second, c5133sZ0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void j(int i10, C5637wZ0 c5637wZ0, final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0, final IOException iOException, final boolean z9) {
        final Pair pairA = a(0, c5637wZ0);
        if (pairA != null) {
            C5497vS0 c5497vS0 = this.f32396b;
            c5497vS0.k().g(new Runnable() { // from class: com.google.android.gms.internal.ads.mS0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    this.f31505a.f32396b.j().j(((Integer) pair.first).intValue(), (C5637wZ0) pair.second, c4504nZ0, c5133sZ0, iOException, z9);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.HZ0
    public final void x(int i10, C5637wZ0 c5637wZ0, final C4504nZ0 c4504nZ0, final C5133sZ0 c5133sZ0, final int i11) {
        final Pair pairA = a(0, c5637wZ0);
        if (pairA != null) {
            C5497vS0 c5497vS0 = this.f32396b;
            c5497vS0.k().g(new Runnable() { // from class: com.google.android.gms.internal.ads.oS0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    this.f32073a.f32396b.j().x(((Integer) pair.first).intValue(), (C5637wZ0) pair.second, c4504nZ0, c5133sZ0, i11);
                }
            });
        }
    }
}
