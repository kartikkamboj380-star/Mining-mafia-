package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6291p1 extends AbstractRunnableC6300q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f36813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f36814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f36815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f36816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f36817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f36818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ B1 f36819k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6291p1(B1 b10, Long l10, String str, String str2, Bundle bundle, boolean z9, boolean z10) {
        super(b10, true);
        this.f36813e = l10;
        this.f36814f = str;
        this.f36815g = str2;
        this.f36816h = bundle;
        this.f36817i = z9;
        this.f36818j = z10;
        Objects.requireNonNull(b10);
        this.f36819k = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6300q1
    final void a() {
        Long l10 = this.f36813e;
        ((InterfaceC6334u0) Preconditions.checkNotNull(this.f36819k.n())).logEvent(this.f36814f, this.f36815g, this.f36816h, this.f36817i, this.f36818j, l10 == null ? this.f36839a : l10.longValue());
    }
}
