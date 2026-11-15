package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class UD0 extends AbstractC2368Rt0 implements InterfaceC2962bI0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AH0 f23963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AH0 f23964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4454nA0 f23965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HttpURLConnection f23966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f23967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f23970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f23971q;

    /* synthetic */ UD0(String str, int i10, int i11, boolean z9, boolean z10, AH0 ah0, InterfaceC2470Ts0 interfaceC2470Ts0, boolean z11, byte[] bArr) {
        super(true);
        this.f23962h = str;
        this.f23960f = i10;
        this.f23961g = i11;
        this.f23959e = z9;
        this.f23963i = ah0;
        this.f23964j = new AH0();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final HttpURLConnection i(URL url, int i10, byte[] bArr, long j10, long j11, boolean z9, boolean z10, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f23960f);
        httpURLConnection.setReadTimeout(this.f23961g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f23963i.a());
        map2.putAll(this.f23964j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0) {
            sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j10);
            sb.append("-");
            if (j11 != -1) {
                sb.append((j10 + j11) - 1);
            }
            string = sb.toString();
        } else if (j11 == -1) {
            string = null;
        } else {
            j10 = 0;
            sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j10);
            sb.append("-");
            if (j11 != -1) {
                sb.append((j10 + j11) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.f23962h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z9 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(false);
        int i11 = C4454nA0.f31729h;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL j(URL url, String str, C4454nA0 c4454nA0) throws YF0 {
        if (str == null) {
            throw new YF0("Null location redirect", c4454nA0, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new YF0("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), c4454nA0, 2001, 1);
            }
            if (this.f23959e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new YF0(sb.toString(), c4454nA0, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new YF0(e10, c4454nA0, 2001, 1);
        }
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.f23966l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                YU.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws YF0 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f23970p;
            if (j10 != -1) {
                long j11 = j10 - this.f23971q;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f23967m;
            String str = AbstractC4634ob0.f32117a;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f23971q += (long) i12;
            g(i12);
            return i12;
        } catch (IOException e10) {
            C4454nA0 c4454nA0 = this.f23965k;
            String str2 = AbstractC4634ob0.f32117a;
            throw YF0.a(e10, c4454nA0, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws YF0 {
        UD0 ud0;
        long j10;
        int i10;
        HttpURLConnection httpURLConnectionI;
        byte[] bArrA;
        long j11;
        UD0 ud1 = this;
        ud1.f23965k = c4454nA0;
        long j12 = 0;
        ud1.f23971q = 0L;
        ud1.f23970p = 0L;
        c(c4454nA0);
        try {
            URL url = new URL(c4454nA0.f31730a.toString());
            long j13 = c4454nA0.f31734e;
            long j14 = c4454nA0.f31735f;
            boolean zA = c4454nA0.a(1);
            int i11 = 0;
            try {
                if (ud1.f23959e) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i11 + 1;
                        if (i11 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i13);
                            throw new YF0(new NoRouteToHostException(sb.toString()), c4454nA0, 2001, 1);
                        }
                        j10 = j12;
                        i10 = i12;
                        ud1 = this;
                        HttpURLConnection httpURLConnectionI2 = ud1.i(url, 1, null, j13, j14, zA, false, c4454nA0.f31733d);
                        URL url2 = url;
                        long j15 = j14;
                        ud0 = ud1;
                        try {
                            int responseCode = httpURLConnectionI2.getResponseCode();
                            String headerField = httpURLConnectionI2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionI = httpURLConnectionI2;
                                break;
                            }
                            httpURLConnectionI2.disconnect();
                            URL urlJ = ud0.j(url2, headerField, c4454nA0);
                            j14 = j15;
                            url = urlJ;
                            i12 = i10;
                            i11 = i13;
                            j12 = j10;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        ud0.k();
                        throw YF0.a(e, c4454nA0, 1);
                    }
                }
                httpURLConnectionI = ud1.i(url, 1, null, j13, j14, zA, true, c4454nA0.f31733d);
                ud0 = this;
                j10 = 0;
                i10 = 0;
                ud0.f23966l = httpURLConnectionI;
                ud0.f23969o = httpURLConnectionI.getResponseCode();
                String responseMessage = httpURLConnectionI.getResponseMessage();
                int i14 = ud0.f23969o;
                if (i14 < 200 || i14 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionI.getHeaderFields();
                    if (ud0.f23969o == 416) {
                        if (c4454nA0.f31734e == CI0.a(httpURLConnectionI.getHeaderField("Content-Range"))) {
                            ud0.f23968n = true;
                            f(c4454nA0);
                            long j16 = c4454nA0.f31735f;
                            return j16 != -1 ? j16 : j10;
                        }
                    }
                    InputStream errorStream = httpURLConnectionI.getErrorStream();
                    try {
                        bArrA = errorStream != null ? AbstractC2788Zv0.a(errorStream) : AbstractC4634ob0.f32118b;
                    } catch (IOException unused) {
                        bArrA = AbstractC4634ob0.f32118b;
                    }
                    ud0.k();
                    throw new ZG0(ud0.f23969o, responseMessage, ud0.f23969o == 416 ? new C2066Ly0(2008) : null, headerFields, c4454nA0, bArrA);
                }
                httpURLConnectionI.getContentType();
                if (ud0.f23969o == 200) {
                    j11 = c4454nA0.f31734e;
                    if (j11 == j10) {
                        j11 = j10;
                    }
                } else {
                    j11 = j10;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionI.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    ud0.f23970p = c4454nA0.f31735f;
                } else {
                    long j17 = c4454nA0.f31735f;
                    if (j17 != -1) {
                        ud0.f23970p = j17;
                    } else {
                        long jB = CI0.b(httpURLConnectionI.getHeaderField("Content-Length"), httpURLConnectionI.getHeaderField("Content-Range"));
                        ud0.f23970p = jB != -1 ? jB - j11 : -1L;
                    }
                }
                try {
                    ud0.f23967m = httpURLConnectionI.getInputStream();
                    if (zEqualsIgnoreCase) {
                        ud0.f23967m = new GZIPInputStream(ud0.f23967m);
                    }
                    ud0.f23968n = true;
                    f(c4454nA0);
                    if (j11 != j10) {
                        try {
                            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                            while (j11 > j10) {
                                int iMin = (int) Math.min(j11, 4096L);
                                InputStream inputStream = ud0.f23967m;
                                String str = AbstractC4634ob0.f32117a;
                                int i15 = inputStream.read(bArr, i10, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new YF0(new InterruptedIOException(), c4454nA0, 2000, 1);
                                }
                                if (i15 == -1) {
                                    throw new YF0(c4454nA0, 2008, 1);
                                }
                                j11 -= (long) i15;
                                ud0.g(i15);
                            }
                        } catch (IOException e11) {
                            ud0.k();
                            if (e11 instanceof YF0) {
                                throw ((YF0) e11);
                            }
                            throw new YF0(e11, c4454nA0, 2000, 1);
                        }
                    }
                    return ud0.f23970p;
                } catch (IOException e12) {
                    ud0.k();
                    throw new YF0(e12, c4454nA0, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                ud0 = this;
            }
        } catch (IOException e14) {
            e = e14;
            ud0 = ud1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f23966l;
        return httpURLConnection == null ? AbstractC1539Bu0.a() : new C5215tD0(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f23966l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C4454nA0 c4454nA0 = this.f23965k;
        if (c4454nA0 != null) {
            return c4454nA0.f31730a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        try {
            InputStream inputStream = this.f23967m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    C4454nA0 c4454nA0 = this.f23965k;
                    String str = AbstractC4634ob0.f32117a;
                    throw new YF0(e10, c4454nA0, 2000, 3);
                }
            }
            this.f23967m = null;
            k();
            if (this.f23968n) {
                this.f23968n = false;
                h();
            }
            this.f23966l = null;
            this.f23965k = null;
        } catch (Throwable th) {
            this.f23967m = null;
            k();
            if (this.f23968n) {
                this.f23968n = false;
                h();
            }
            this.f23966l = null;
            this.f23965k = null;
            throw th;
        }
    }
}
