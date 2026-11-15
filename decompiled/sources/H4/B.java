package H4;

import com.google.android.gms.internal.ads.C2887ai;
import com.google.android.gms.internal.ads.C3013bi;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3641gi;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final B f1216e = new B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2887ai f1217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3013bi f1218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC3641gi f1219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh f1220d;

    protected B() {
        C2887ai c2887ai = new C2887ai();
        C3013bi c3013bi = new C3013bi();
        SharedPreferencesOnSharedPreferenceChangeListenerC3641gi sharedPreferencesOnSharedPreferenceChangeListenerC3641gi = new SharedPreferencesOnSharedPreferenceChangeListenerC3641gi();
        SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh sharedPreferencesOnSharedPreferenceChangeListenerC2343Rh = new SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh();
        this.f1217a = c2887ai;
        this.f1218b = c3013bi;
        this.f1219c = sharedPreferencesOnSharedPreferenceChangeListenerC3641gi;
        this.f1220d = sharedPreferencesOnSharedPreferenceChangeListenerC2343Rh;
    }

    public static C3013bi a() {
        return f1216e.f1218b;
    }

    public static C2887ai b() {
        return f1216e.f1217a;
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC3641gi c() {
        return f1216e.f1219c;
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh d() {
        return f1216e.f1220d;
    }
}
