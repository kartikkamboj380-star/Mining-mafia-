package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1602Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3994jW0 f18253a = new C3994jW0();

    public final C1602Da a(int i10) {
        this.f18253a.a(i10);
        return this;
    }

    public final C1602Da b(int i10, boolean z9) {
        if (z9) {
            this.f18253a.a(i10);
        }
        return this;
    }

    public final C1602Da c(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.f18253a.a(iArr[i10]);
        }
        return this;
    }

    public final C1602Da d(C3375eb c3375eb) {
        KW0 kw0A = c3375eb.a();
        for (int i10 = 0; i10 < kw0A.b(); i10++) {
            this.f18253a.a(kw0A.c(i10));
        }
        return this;
    }

    public final C3375eb e() {
        return new C3375eb(this.f18253a.b(), null);
    }
}
