package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5102sK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636gf0 f33137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.w f33138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33139d;

    public C5102sK(C3502fb0 c3502fb0, C3636gf0 c3636gf0) {
        this.f33136a = c3502fb0.f28425p;
        this.f33137b = c3636gf0;
        this.f33138c = c3502fb0.f28442x0;
    }

    public final void a() {
        if (this.f33139d) {
            return;
        }
        this.f33137b.a(this.f33136a, this.f33138c);
        this.f33139d = true;
    }
}
