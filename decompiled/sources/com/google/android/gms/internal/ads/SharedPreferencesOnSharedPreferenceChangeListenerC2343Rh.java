package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22885a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f22886b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f22887c = new JSONObject();

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.f22887c = new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.Qh
                    @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.f22885a) {
            try {
                if (this.f22886b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                H4.B.a();
                SharedPreferences sharedPreferencesA = C3013bi.a(context);
                this.f22886b = sharedPreferencesA;
                g(sharedPreferencesA);
                if (!((Boolean) AbstractC4145kj.f30861b.e()).booleanValue() && (sharedPreferences = this.f22886b) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.f22887c.optString(str, str2);
    }

    public final long c(String str, long j10) {
        return !str.startsWith("adapter:") ? j10 : this.f22887c.optLong(str, j10);
    }

    public final int d(String str, int i10) {
        return !str.startsWith("adapter:") ? i10 : this.f22887c.optInt(str, i10);
    }

    public final float e(String str, float f10) {
        return !str.startsWith("adapter:") ? f10 : (float) this.f22887c.optDouble(str, f10);
    }

    public final boolean f(String str, boolean z9) {
        return !str.startsWith("adapter:") ? z9 : this.f22887c.optBoolean(str, z9);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
