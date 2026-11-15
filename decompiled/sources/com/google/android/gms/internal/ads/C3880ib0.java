package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ib0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3880ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f29460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f29462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3754hb0 f29463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f29464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f29465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f29466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f29467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final JSONObject f29468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f29469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f29470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f29471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f29472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f29473t;

    C3880ib0(JsonReader jsonReader) throws IOException {
        List listB = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        C3754hb0 c3754hb0 = null;
        long jA = -1;
        long jA2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listB = K4.S.b(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str = strNextString3;
                if (((Boolean) H4.B.c().d(AbstractC3892ii.E9)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c3754hb0 = new C3754hb0(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.Sb)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29587I7)).booleanValue()) {
                            try {
                                try {
                                    Bundle bundleL = K4.S.l(K4.S.d(jsonReader));
                                    if (bundleL != null) {
                                        bundle = bundleL;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ka)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ka)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.La;
                        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = K4.S.d(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ta)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = K4.S.d(jsonReader);
                            } else {
                                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29612L2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleL2 = K4.S.l(K4.S.d(jsonReader));
                                        if (bundleL2 != null) {
                                            jA2 = a(bundleL2.getDouble("start_time"));
                                            jA = a(bundleL2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                strNextString3 = str;
            }
        }
        String str2 = strNextString3;
        jsonReader.endObject();
        this.f29454a = listB;
        this.f29456c = iNextInt;
        if (((Boolean) AbstractC4901qj.f32715d.e()).booleanValue()) {
            this.f29457d = -1;
        } else {
            C2449Ti c2449Ti = AbstractC2657Xi.f25364a;
            if (((Long) c2449Ti.e()).longValue() > -1) {
                this.f29457d = ((Long) c2449Ti.e()).intValue();
            } else {
                this.f29457d = iNextInt3;
            }
        }
        this.f29455b = strNextString;
        this.f29458e = strNextString6;
        this.f29459f = iNextInt2;
        this.f29460g = jNextLong;
        this.f29463j = c3754hb0;
        this.f29461h = zNextBoolean;
        this.f29462i = strNextString7;
        this.f29464k = bundle;
        this.f29465l = strNextString4;
        this.f29466m = strNextString5;
        this.f29467n = strNextString2;
        this.f29468o = jSONObject;
        this.f29469p = jSONObject2;
        this.f29470q = str2;
        C2449Ti c2449Ti2 = AbstractC4649oj.f32189a;
        this.f29471r = ((Long) c2449Ti2.e()).longValue() > 0 ? ((Long) c2449Ti2.e()).intValue() : iMax;
        this.f29472s = jA2;
        this.f29473t = jA;
    }

    private static final long a(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}
