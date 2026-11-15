package com.facebook.react.devsupport;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E3.a f14712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1297t f14713c;

    public static final class a implements SharedPreferencesOnSharedPreferenceChangeListenerC1296s.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC1296s.b
        public void a() {
        }
    }

    public k0(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f14712b = new SharedPreferencesOnSharedPreferenceChangeListenerC1296s(applicationContext, new a());
        this.f14713c = new C1297t(z(), applicationContext, z().q());
    }

    @Override // com.facebook.react.devsupport.t0, p124m3.e
    public void l() {
        this.f14713c.i();
    }

    @Override // com.facebook.react.devsupport.t0, p124m3.e
    public void t() {
        this.f14713c.x();
    }

    @Override // com.facebook.react.devsupport.t0, p124m3.e
    public E3.a z() {
        return this.f14712b;
    }
}
