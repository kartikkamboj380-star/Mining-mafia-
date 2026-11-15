package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2860aU0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5637wZ0 f26536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2986bU0 f26539g;

    public C2860aU0(C2986bU0 c2986bU0, String str, int i10, C5637wZ0 c5637wZ0) {
        Objects.requireNonNull(c2986bU0);
        this.f26539g = c2986bU0;
        this.f26533a = str;
        this.f26534b = i10;
        this.f26535c = c5637wZ0 == null ? -1L : c5637wZ0.f34597d;
        if (c5637wZ0 == null || !c5637wZ0.b()) {
            return;
        }
        this.f26536d = c5637wZ0;
    }

    public final boolean a(AbstractC5270tf abstractC5270tf, AbstractC5270tf abstractC5270tf2) {
        int i10 = this.f26534b;
        if (i10 < abstractC5270tf.a()) {
            C2986bU0 c2986bU0 = this.f26539g;
            abstractC5270tf.b(i10, c2986bU0.j(), 0L);
            int i11 = c2986bU0.j().f22879m;
            while (true) {
                if (i11 > c2986bU0.j().f22880n) {
                    i10 = -1;
                    break;
                }
                int iE = abstractC5270tf2.e(abstractC5270tf.f(i11));
                if (iE != -1) {
                    i10 = abstractC5270tf2.d(iE, c2986bU0.k(), false).f32697c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= abstractC5270tf2.a()) {
            i10 = -1;
            break;
        }
        this.f26534b = i10;
        if (i10 == -1) {
            return false;
        }
        C5637wZ0 c5637wZ0 = this.f26536d;
        return c5637wZ0 == null || abstractC5270tf2.e(c5637wZ0.f34594a) != -1;
    }

    public final boolean b(int i10, C5637wZ0 c5637wZ0) {
        if (c5637wZ0 != null) {
            long j10 = c5637wZ0.f34597d;
            if (j10 != -1) {
                C5637wZ0 c5637wZ1 = this.f26536d;
                if (c5637wZ1 == null) {
                    return !c5637wZ0.b() && j10 == this.f26535c;
                }
                return j10 == c5637wZ1.f34597d && c5637wZ0.f34595b == c5637wZ1.f34595b && c5637wZ0.f34596c == c5637wZ1.f34596c;
            }
        }
        return i10 == this.f26534b;
    }

    public final void c(int i10, C5637wZ0 c5637wZ0) {
        if (this.f26535c == -1 && i10 == this.f26534b && c5637wZ0 != null) {
            C2986bU0 c2986bU0 = this.f26539g;
            long j10 = c5637wZ0.f34597d;
            if (j10 >= c2986bU0.i()) {
                this.f26535c = j10;
            }
        }
    }

    public final boolean d(RS0 rs0) {
        C5637wZ0 c5637wZ0 = rs0.f22812d;
        if (c5637wZ0 == null) {
            return this.f26534b != rs0.f22811c;
        }
        long j10 = this.f26535c;
        if (j10 == -1) {
            return false;
        }
        long j11 = c5637wZ0.f34597d;
        if (j11 > j10) {
            return true;
        }
        if (this.f26536d == null) {
            return false;
        }
        AbstractC5270tf abstractC5270tf = rs0.f22810b;
        int iE = abstractC5270tf.e(c5637wZ0.f34594a);
        int iE2 = abstractC5270tf.e(this.f26536d.f34594a);
        C5637wZ0 c5637wZ1 = this.f26536d;
        if (j11 < c5637wZ1.f34597d || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!c5637wZ0.b()) {
            int i10 = c5637wZ0.f34598e;
            return i10 == -1 || i10 > c5637wZ1.f34595b;
        }
        int i11 = c5637wZ0.f34595b;
        int i12 = c5637wZ0.f34596c;
        int i13 = c5637wZ1.f34595b;
        if (i11 <= i13) {
            return i11 == i13 && i12 > c5637wZ1.f34596c;
        }
        return true;
    }

    final /* synthetic */ String e() {
        return this.f26533a;
    }

    final /* synthetic */ int f() {
        return this.f26534b;
    }

    final /* synthetic */ long g() {
        return this.f26535c;
    }

    final /* synthetic */ C5637wZ0 h() {
        return this.f26536d;
    }

    final /* synthetic */ boolean i() {
        return this.f26537e;
    }

    final /* synthetic */ void j(boolean z9) {
        this.f26537e = true;
    }

    final /* synthetic */ boolean k() {
        return this.f26538f;
    }

    final /* synthetic */ void l(boolean z9) {
        this.f26538f = true;
    }
}
