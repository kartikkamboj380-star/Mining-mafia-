package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class QB0 implements InterfaceC1961Jx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GK0 f22323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22324c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22327f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AH0 f22322a = new AH0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22325d = 8000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22326e = 8000;

    public final QB0 a(String str) {
        this.f22324c = str;
        return this;
    }

    public final QB0 b(int i10) {
        this.f22325d = i10;
        return this;
    }

    public final QB0 c(int i10) {
        this.f22326e = i10;
        return this;
    }

    public final QB0 d(boolean z9) {
        this.f22327f = true;
        return this;
    }

    public final QB0 e(GK0 gk0) {
        this.f22323b = gk0;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1961Jx0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final UD0 zza() {
        UD0 ud0 = new UD0(this.f22324c, this.f22325d, this.f22326e, this.f22327f, false, this.f22322a, null, false, null);
        GK0 gk0 = this.f22323b;
        if (gk0 != null) {
            ud0.b(gk0);
        }
        return ud0;
    }
}
