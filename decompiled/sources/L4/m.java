package L4;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f3127c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f3128d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3131g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3126b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Clock f3129e = DefaultClock.getInstance();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f3130f = new HashSet(Arrays.asList(new String[0]));

    public m(String str) {
        this.f3132a = !j() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static void g() {
        synchronized (f3126b) {
            f3127c = false;
            f3128d = false;
            p.f("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z9) {
        synchronized (f3126b) {
            f3127c = true;
            f3128d = z9;
        }
    }

    public static boolean i() {
        boolean z9;
        synchronized (f3126b) {
            z9 = f3127c;
        }
        return z9;
    }

    public static boolean j() {
        boolean z9;
        synchronized (f3126b) {
            try {
                z9 = false;
                if (f3127c && f3128d) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    static /* synthetic */ void k(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        p(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void l(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        p(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void m(final String str, final String str2, final Map map, final byte[] bArr) {
        q("onNetworkRequest", new l() { // from class: L4.k
            @Override // L4.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                m.k(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void n(final Map map, final int i10) {
        q("onNetworkResponse", new l() { // from class: L4.h
            @Override // L4.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                m.l(i10, map, jsonWriter);
            }
        });
    }

    private final void o(final String str) {
        q("onNetworkRequestError", new l() { // from class: L4.j
            @Override // L4.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                int i10 = m.f3131g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void p(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f3130f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        p.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void q(String str, l lVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f3129e.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f3132a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            p.d("unable to log", e10);
        }
        r(stringWriter.toString());
    }

    private static synchronized void r(String str) {
        try {
            p.e("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                p.e("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            p.e("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map map, byte[] bArr) {
        if (j()) {
            m(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i10) {
        if (j()) {
            String responseMessage = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    p.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void d(Map map, int i10) {
        if (j()) {
            n(map, i10);
            if (i10 < 200 || i10 >= 300) {
                o(null);
            }
        }
    }

    public final void e(String str) {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(final byte[] bArr) {
        q("onNetworkResponseBody", new l() { // from class: L4.i
            @Override // L4.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                int i10 = m.f3131g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    String strO = g.o(strEncode);
                    if (strO != null) {
                        jsonWriter.name("bodydigest").value(strO);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
