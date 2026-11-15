package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.B1;
import java.util.List;
import java.util.Map;
import p136n5.E;

/* JADX INFO: loaded from: classes.dex */
final class d implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B1 f39994a;

    d(B1 b10) {
        this.f39994a = b10;
    }

    @Override // p136n5.E
    public final void P(Bundle bundle) {
        this.f39994a.z(bundle);
    }

    @Override // p136n5.E
    public final void T(String str) {
        this.f39994a.I(str);
    }

    @Override // p136n5.E
    public final void a(String str, String str2, Bundle bundle) {
        this.f39994a.x(str, str2, bundle);
    }

    @Override // p136n5.E
    public final Map b(String str, String str2, boolean z9) {
        return this.f39994a.c(str, str2, z9);
    }

    @Override // p136n5.E
    public final String c() {
        return this.f39994a.a();
    }

    @Override // p136n5.E
    public final String d() {
        return this.f39994a.M();
    }

    @Override // p136n5.E
    public final void e(String str, String str2, Bundle bundle) {
        this.f39994a.A(str, str2, bundle);
    }

    @Override // p136n5.E
    public final List f(String str, String str2) {
        return this.f39994a.B(str, str2);
    }

    @Override // p136n5.E
    public final int j(String str) {
        return this.f39994a.e(str);
    }

    @Override // p136n5.E
    public final void o0(String str) {
        this.f39994a.J(str);
    }

    @Override // p136n5.E
    public final String zzi() {
        return this.f39994a.b();
    }

    @Override // p136n5.E
    public final String zzk() {
        return this.f39994a.L();
    }

    @Override // p136n5.E
    public final long zzl() {
        return this.f39994a.N();
    }
}
