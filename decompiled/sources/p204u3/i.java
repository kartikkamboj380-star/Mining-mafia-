package p204u3;

import p084i3.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49901a = new i();

    private i() {
    }

    public static final boolean a() {
        if (!a.f45070f) {
            return b.f();
        }
        p004a3.a.b(b.f(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean b() {
        if (!a.f45070f) {
            return b.j();
        }
        p004a3.a.b(b.j(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean c() {
        if (!a.f45070f) {
            return b.u();
        }
        p004a3.a.b(!b.u(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean d() {
        if (!a.f45070f) {
            return b.z();
        }
        p004a3.a.b(!b.z(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean e() {
        if (!a.f45070f) {
            return b.A();
        }
        p004a3.a.b(b.A(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}
