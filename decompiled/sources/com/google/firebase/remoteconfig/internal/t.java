package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Date f40666f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Date f40667g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f40668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40669b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f40670c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f40671d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f40672e = new Object();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f40674b;

        a(int i10, Date date) {
            this.f40673a = i10;
            this.f40674b = date;
        }

        Date a() {
            return this.f40674b;
        }

        int b() {
            return this.f40673a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f40676b;

        public b(int i10, Date date) {
            this.f40675a = i10;
            this.f40676b = date;
        }

        Date a() {
            return this.f40676b;
        }

        int b() {
            return this.f40675a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f40668a = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f40670c) {
            aVar = new a(this.f40668a.getInt("num_failed_fetches", 0), new Date(this.f40668a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f40668a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f40668a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public p008a7.k d() {
        v vVarA;
        synchronized (this.f40669b) {
            long j10 = this.f40668a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f40668a.getInt("last_fetch_status", 0);
            vVarA = v.b().c(i10).d(j10).b(new a7.m.b().d(this.f40668a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f40668a.getLong("minimum_fetch_interval_in_seconds", m.f40599j)).c()).a();
        }
        return vVarA;
    }

    String e() {
        return this.f40668a.getString("last_fetch_etag", null);
    }

    Date f() {
        return new Date(this.f40668a.getLong("last_fetch_time_in_millis", -1L));
    }

    long g() {
        return this.f40668a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f40668a.getLong("minimum_fetch_interval_in_seconds", m.f40599j);
    }

    public b i() {
        b bVar;
        synchronized (this.f40671d) {
            bVar = new b(this.f40668a.getInt("num_failed_realtime_streams", 0), new Date(this.f40668a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void j() {
        l(0, f40667g);
    }

    void k() {
        p(0, f40667g);
    }

    void l(int i10, Date date) {
        synchronized (this.f40670c) {
            this.f40668a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void m(String str) {
        synchronized (this.f40669b) {
            this.f40668a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j10) {
        synchronized (this.f40669b) {
            this.f40668a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void o(Date date) {
        synchronized (this.f40671d) {
            this.f40668a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p(int i10, Date date) {
        synchronized (this.f40671d) {
            this.f40668a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f40669b) {
            this.f40668a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void r(Date date) {
        synchronized (this.f40669b) {
            this.f40668a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f40669b) {
            this.f40668a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
