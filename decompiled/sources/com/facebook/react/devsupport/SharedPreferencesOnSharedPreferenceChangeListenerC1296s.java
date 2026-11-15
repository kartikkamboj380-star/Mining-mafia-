package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1296s implements E3.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14758e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f14760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K3.e f14761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14762d;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.s$b */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1296s(Context applicationContext, b bVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f14759a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f14760b = defaultSharedPreferences;
        this.f14761c = new K3.e(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f14762d = p084i3.a.f45066b;
    }

    @Override // E3.a
    public void b(boolean z9) {
        this.f14760b.edit().putBoolean("hot_module_replacement", z9).apply();
    }

    @Override // E3.a
    public void i(boolean z9) {
        this.f14760b.edit().putBoolean("fps_debug", z9).apply();
    }

    @Override // E3.a
    public boolean j() {
        return this.f14760b.getBoolean("inspector_debug", false);
    }

    @Override // E3.a
    public void k(boolean z9) {
        this.f14760b.edit().putBoolean("inspector_debug", z9).apply();
    }

    @Override // E3.a
    public boolean l() {
        return this.f14760b.getBoolean("fps_debug", false);
    }

    @Override // E3.a
    public boolean m() {
        return this.f14760b.getBoolean("hot_module_replacement", true);
    }

    @Override // E3.a
    public boolean n() {
        return this.f14762d;
    }

    @Override // E3.a
    public boolean o() {
        return this.f14760b.getBoolean("js_minify_debug", false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (this.f14759a != null) {
            if (Intrinsics.b("fps_debug", str) || Intrinsics.b("js_dev_mode_debug", str) || Intrinsics.b("js_minify_debug", str)) {
                this.f14759a.a();
            }
        }
    }

    @Override // E3.a
    public boolean p() {
        return this.f14760b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // E3.a
    public K3.e q() {
        return this.f14761c;
    }

    @Override // E3.a
    public void r(boolean z9) {
        this.f14760b.edit().putBoolean("js_dev_mode_debug", z9).apply();
    }
}
