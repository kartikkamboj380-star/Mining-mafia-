package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class US {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3994jW0 f24013b = new C3994jW0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24015d;

    public US(Object obj) {
        this.f24012a = obj;
    }

    public final void a(int i10, RR rr) {
        if (this.f24015d) {
            return;
        }
        if (i10 != -1) {
            this.f24013b.a(i10);
        }
        this.f24014c = true;
        rr.zza(this.f24012a);
    }

    public final void b(InterfaceC5118sS interfaceC5118sS) {
        if (this.f24015d || !this.f24014c) {
            return;
        }
        KW0 kw0B = this.f24013b.b();
        this.f24013b = new C3994jW0();
        this.f24014c = false;
        interfaceC5118sS.a(this.f24012a, kw0B);
    }

    final /* synthetic */ void c(InterfaceC5118sS interfaceC5118sS) {
        this.f24015d = true;
        if (interfaceC5118sS == null || !this.f24014c) {
            return;
        }
        this.f24014c = false;
        interfaceC5118sS.a(this.f24012a, this.f24013b.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || US.class != obj.getClass()) {
            return false;
        }
        return this.f24012a.equals(((US) obj).f24012a);
    }

    public final int hashCode() {
        return this.f24012a.hashCode();
    }
}
