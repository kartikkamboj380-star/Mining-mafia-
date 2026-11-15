package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class D extends AbstractC1250d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f13989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f13990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p053f2.b f13991e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f13993b;

        a(c cVar, X.a aVar) {
            this.f13992a = cVar;
            this.f13993b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            D.this.j(this.f13992a, this.f13993b);
        }
    }

    class b extends AbstractC1252f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f13995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f13996b;

        b(Future future, X.a aVar) {
            this.f13995a = future;
            this.f13996b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (this.f13995a.cancel(false)) {
                this.f13996b.a();
            }
        }
    }

    public static class c extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f13998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f13999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f14000h;

        public c(InterfaceC1260n interfaceC1260n, e0 e0Var) {
            super(interfaceC1260n, e0Var);
        }
    }

    public D(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f13987a = i10;
    }

    private HttpURLConnection g(Uri uri, int i10) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        String str = this.f13988b;
        if (str != null) {
            httpURLConnectionO.setRequestProperty("User-Agent", str);
        }
        Map map = this.f13989c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionO.setConnectTimeout(this.f13987a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i10 <= 0 || uri2 == null || Y1.i.a(uri2.getScheme(), scheme)) {
            throw new IOException(i10 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(uri2, i10 - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(p063g2.f.p(uri).openConnection()));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c e(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        return new c(interfaceC1260n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, X.a aVar) {
        cVar.f13998f = this.f13991e.now();
        cVar.b().c(new b(this.f13990d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    void j(c cVar, X.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionG;
        InputStream inputStream = null;
        try {
            httpURLConnectionG = g(cVar.g(), 5);
            try {
                try {
                    cVar.f13999g = this.f13991e.now();
                    if (httpURLConnectionG != null) {
                        inputStream = httpURLConnectionG.getInputStream();
                        aVar.b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionG != null) {
                    throw th;
                }
                httpURLConnectionG.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnectionG = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionG = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionG != null) {
                throw th;
            }
            httpURLConnectionG.disconnect();
            throw th;
        }
        httpURLConnectionG.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map d(c cVar, int i10) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f13999g - cVar.f13998f));
        map.put("fetch_time", Long.toString(cVar.f14000h - cVar.f13999g));
        map.put("total_time", Long.toString(cVar.f14000h - cVar.f13998f));
        map.put("image_size", Integer.toString(i10));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(c cVar, int i10) {
        cVar.f14000h = this.f13991e.now();
    }

    D(String str, Map map, p053f2.b bVar) {
        this.f13990d = Executors.newFixedThreadPool(3);
        this.f13991e = bVar;
        this.f13989c = map;
        this.f13988b = str;
    }
}
