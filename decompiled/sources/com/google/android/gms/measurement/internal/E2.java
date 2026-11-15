package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class E2 extends B3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final Pair f37476A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f37477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferences f37478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2 f37479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f37480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B2 f37481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D2 f37482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B2 f37486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C6674z2 f37487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D2 f37488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A2 f37489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C6674z2 f37490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B2 f37491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B2 f37492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f37493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C6674z2 f37494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C6674z2 f37495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B2 f37496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D2 f37497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D2 f37498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B2 f37499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final A2 f37500z;

    E2(X2 x10) {
        super(x10);
        this.f37486l = new B2(this, "session_timeout", 1800000L);
        this.f37487m = new C6674z2(this, "start_new_session", true);
        this.f37491q = new B2(this, "last_pause_time", 0L);
        this.f37492r = new B2(this, "session_id", 0L);
        this.f37488n = new D2(this, "non_personalized_ads", null);
        this.f37489o = new A2(this, "last_received_uri_timestamps_by_source", null);
        this.f37490p = new C6674z2(this, "allow_remote_dynamite", false);
        this.f37480f = new B2(this, "first_open_time", 0L);
        this.f37481g = new B2(this, "app_install_time", 0L);
        this.f37482h = new D2(this, "app_instance_id", null);
        this.f37494t = new C6674z2(this, "app_backgrounded", false);
        this.f37495u = new C6674z2(this, "deep_link_retrieval_complete", false);
        this.f37496v = new B2(this, "deep_link_retrieval_attempts", 0L);
        this.f37497w = new D2(this, "firebase_feature_rollouts", null);
        this.f37498x = new D2(this, "deferred_attribution_cache", null);
        this.f37499y = new B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f37500z = new A2(this, "default_event_parameters", null);
    }

    final boolean A(long j10) {
        return j10 - this.f37486l.a() > this.f37491q.a();
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void j() {
        X2 x10 = this.f37374a;
        SharedPreferences sharedPreferences = x10.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f37477c = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f37493s = z9;
        if (!z9) {
            SharedPreferences.Editor editorEdit = this.f37477c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        x10.w();
        this.f37479e = new C2(this, "health_monitor", Math.max(0L, ((Long) AbstractC6514d2.f37965d.b(null)).longValue()), null);
    }

    final Pair o(String str) {
        h();
        if (!w().o(p136n5.v.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        X2 x10 = this.f37374a;
        long jElapsedRealtime = x10.e().elapsedRealtime();
        String str2 = this.f37483i;
        if (str2 != null && jElapsedRealtime < this.f37485k) {
            return new Pair(str2, Boolean.valueOf(this.f37484j));
        }
        this.f37485k = jElapsedRealtime + x10.w().D(str, AbstractC6514d2.f37959b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(x10.d());
            this.f37483i = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f37483i = id;
            }
            this.f37484j = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f37374a.a().v().b("Unable to get advertising id", e10);
            this.f37483i = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f37483i, Boolean.valueOf(this.f37484j));
    }

    protected final SharedPreferences p() {
        h();
        l();
        Preconditions.checkNotNull(this.f37477c);
        return this.f37477c;
    }

    protected final SharedPreferences q() {
        h();
        l();
        if (this.f37478d == null) {
            X2 x10 = this.f37374a;
            String strValueOf = String.valueOf(x10.d().getPackageName());
            C6598o2 c6598o2W = x10.a().w();
            String strConcat = strValueOf.concat("_preferences");
            c6598o2W.b("Default prefs file", strConcat);
            this.f37478d = x10.d().getSharedPreferences(strConcat, 0);
        }
        return this.f37478d;
    }

    final SparseArray r() {
        Bundle bundleA = this.f37489o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f37374a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final C6664y u() {
        h();
        return C6664y.g(p().getString("dma_consent_settings", null));
    }

    final boolean v(int i10) {
        return E3.u(i10, p().getInt("consent_source", 100));
    }

    final E3 w() {
        h();
        return E3.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    protected final boolean x(O5 o10) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = o10.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    final void y(boolean z9) {
        h();
        this.f37374a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z9));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z9);
        editorEdit.apply();
    }

    final boolean z() {
        SharedPreferences sharedPreferences = this.f37477c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
