package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2909at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26658a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26659b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f26660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2157Ns f26661d;

    C2909at(Context context, C2157Ns c2157Ns) {
        this.f26660c = context;
        this.f26661d = c2157Ns;
    }

    final synchronized void a(InterfaceC2729Ys interfaceC2729Ys) {
        this.f26659b.add(interfaceC2729Ys);
    }

    final synchronized void b(String str) {
        try {
            Map map = this.f26658a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f26660c) : this.f26660c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2677Xs sharedPreferencesOnSharedPreferenceChangeListenerC2677Xs = new SharedPreferencesOnSharedPreferenceChangeListenerC2677Xs(this, str);
            map.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2677Xs);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2677Xs);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void c(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f26661d.b();
        }
    }

    final /* synthetic */ List d() {
        return this.f26659b;
    }
}
