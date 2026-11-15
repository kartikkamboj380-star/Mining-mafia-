package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3430f10 implements G4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2575Vt f28125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5011rb0 f28126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3502fb0 f28127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4310m10 f28128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3682h10 f28129e;

    C3430f10(C3682h10 c3682h10, C2575Vt c2575Vt, C5011rb0 c5011rb0, C3502fb0 c3502fb0, C4310m10 c4310m10) {
        this.f28125a = c2575Vt;
        this.f28126b = c5011rb0;
        this.f28127c = c3502fb0;
        this.f28128d = c4310m10;
        Objects.requireNonNull(c3682h10);
        this.f28129e = c3682h10;
    }

    @Override // G4.g
    public final void a(View view) {
        C4310m10 c4310m10 = this.f28128d;
        this.f28125a.b(this.f28129e.d().a(this.f28126b, this.f28127c, view, c4310m10));
    }

    @Override // G4.g
    public final void zzb() {
    }

    @Override // G4.g
    public final void zzc() {
    }
}
