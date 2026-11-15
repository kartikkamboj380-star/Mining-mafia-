package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f24204a;

    public V7(Bundle bundle) {
        this.f24204a = bundle;
    }

    public final String a() {
        return this.f24204a.getString("install_referrer");
    }

    public final long b() {
        return this.f24204a.getLong("referrer_click_timestamp_seconds");
    }

    public final long c() {
        return this.f24204a.getLong("install_begin_timestamp_seconds");
    }

    public final boolean d() {
        return this.f24204a.getBoolean("google_play_instant");
    }

    public final long e() {
        return this.f24204a.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long f() {
        return this.f24204a.getLong("install_begin_timestamp_server_seconds");
    }

    public final String g() {
        return this.f24204a.getString("install_version");
    }
}
