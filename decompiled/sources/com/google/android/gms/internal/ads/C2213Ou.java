package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2213Ou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f21713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f21714n;

    public C2213Ou(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f21701a = a(jSONObject, "aggressive_media_codec_release", AbstractC3892ii.f29958s0);
        this.f21702b = b(jSONObject, "byte_buffer_precache_limit", AbstractC3892ii.f29891m);
        this.f21703c = b(jSONObject, "exo_cache_buffer_size", AbstractC3892ii.f30001w);
        this.f21704d = b(jSONObject, "exo_connect_timeout_millis", AbstractC3892ii.f29847i);
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29836h;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f21705e = b(jSONObject, "exo_read_timeout_millis", AbstractC3892ii.f29858j);
        this.f21706f = b(jSONObject, "load_check_interval_bytes", AbstractC3892ii.f29869k);
        this.f21707g = b(jSONObject, "player_precache_limit", AbstractC3892ii.f29880l);
        this.f21708h = b(jSONObject, "socket_receive_buffer_size", AbstractC3892ii.f29902n);
        this.f21709i = a(jSONObject, "use_cache_data_source", AbstractC3892ii.f29853i5);
        b(jSONObject, "min_retry_count", AbstractC3892ii.f29913o);
        this.f21710j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3892ii.f29935q);
        this.f21711k = a(jSONObject, "enable_multiple_video_playback", AbstractC3892ii.f30015x2);
        this.f21712l = a(jSONObject, "use_range_http_data_source", AbstractC3892ii.f30036z2);
        this.f21713m = c(jSONObject, "range_http_data_source_high_water_mark", AbstractC3892ii.f29502A2);
        this.f21714n = c(jSONObject, "range_http_data_source_low_water_mark", AbstractC3892ii.f29512B2);
    }

    private static final boolean a(JSONObject jSONObject, String str, AbstractC2759Zh abstractC2759Zh) {
        boolean zBooleanValue = ((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    private static final int b(JSONObject jSONObject, String str, AbstractC2759Zh abstractC2759Zh) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) H4.B.c().d(abstractC2759Zh)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, AbstractC2759Zh abstractC2759Zh) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) H4.B.c().d(abstractC2759Zh)).longValue();
    }
}
