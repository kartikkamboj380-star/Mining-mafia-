package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2579Vv extends AbstractC2368Rt0 implements InterfaceC2962bI0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f24585u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicReference f24586v = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f24587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AH0 f24591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C4454nA0 f24592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpURLConnection f24593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InputStream f24594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f24596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f24597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f24598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f24599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f24600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f24602t;

    C2579Vv(String str, GK0 gk0, int i10, int i11, int i12) {
        super(true);
        this.f24587e = new C2527Uv(this);
        this.f24602t = new HashSet();
        AbstractC5854yI.a(str);
        this.f24590h = str;
        this.f24591i = new AH0();
        this.f24588f = i10;
        this.f24589g = i11;
        this.f24601s = i12;
        if (gk0 != null) {
            b(gk0);
        }
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.f24593k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Unexpected error while disconnecting", e10);
            }
            this.f24593k = null;
        }
    }

    final void E(int i10) {
        this.f24601s = i10;
        for (Socket socket : this.f24602t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f24601s);
                } catch (SocketException e10) {
                    int i11 = AbstractC0786o0.f2696b;
                    L4.p.g("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws YF0 {
        try {
            if (this.f24599q != this.f24597o) {
                AtomicReference atomicReference = f24586v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                }
                while (true) {
                    long j10 = this.f24599q;
                    long j11 = this.f24597o;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i12 = this.f24594l.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.f24599q += (long) i12;
                    g(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f24598p;
            if (j12 != -1) {
                long j13 = j12 - this.f24600r;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int i13 = this.f24594l.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.f24598p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f24600r += (long) i13;
            g(i13);
            return i13;
        } catch (IOException e10) {
            throw new YF0(e10, this.f24592j, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00df A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0282, B:96:0x028f, B:98:0x02a0, B:101:0x02a9, B:102:0x02b6, B:104:0x02c0, B:105:0x02c7, B:106:0x02c8, B:107:0x02e5), top: B:114:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x028f A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0282, B:96:0x028f, B:98:0x02a0, B:101:0x02a9, B:102:0x02b6, B:104:0x02c0, B:105:0x02c7, B:106:0x02c8, B:107:0x02e5), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws YF0 {
        long j10;
        int responseCode;
        String headerField;
        String protocol;
        long j11;
        long jMax;
        this.f24592j = c4454nA0;
        long j12 = 0;
        this.f24600r = 0L;
        this.f24599q = 0L;
        try {
            URL url = new URL(c4454nA0.f31730a.toString());
            long j13 = c4454nA0.f31734e;
            long j14 = c4454nA0.f31735f;
            boolean zA = c4454nA0.a(1);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                long j15 = j12;
                if (i10 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i11);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f24587e);
                }
                httpURLConnection.setConnectTimeout(this.f24588f);
                httpURLConnection.setReadTimeout(this.f24589g);
                for (Map.Entry entry : this.f24591i.a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j13 = j13;
                }
                long j16 = j13;
                if (j16 == j15) {
                    if (j14 != -1) {
                        j10 = j15;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f24590h);
                    if (!zA) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f24593k = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.f24596n = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f24593k.getHeaderFields();
                                k();
                                ZG0 zg0 = new ZG0(this.f24596n, null, null, headerFields, c4454nA0, AbstractC4634ob0.f32118b);
                                if (this.f24596n != 416) {
                                    throw zg0;
                                }
                                zg0.initCause(new C2066Ly0(2008));
                                throw zg0;
                            }
                            if (responseCode2 == 200) {
                                j11 = c4454nA0.f31734e;
                                if (j11 == j15) {
                                    j11 = j15;
                                }
                            } else {
                                j11 = j15;
                            }
                            this.f24597o = j11;
                            if (c4454nA0.a(1)) {
                                this.f24598p = c4454nA0.f31735f;
                            } else {
                                long j17 = c4454nA0.f31735f;
                                if (j17 != -1) {
                                    this.f24598p = j17;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.f24593k;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField2);
                                            sb2.append("]");
                                            String string = sb2.toString();
                                            int i12 = AbstractC0786o0.f2696b;
                                            L4.p.c(string);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = f24585u.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j18 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j15) {
                                                    jMax = j18;
                                                } else if (jMax != j18) {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                    sb3.append("Inconsistent headers [");
                                                    sb3.append(headerField2);
                                                    sb3.append("] [");
                                                    sb3.append(headerField3);
                                                    sb3.append("]");
                                                    String string2 = sb3.toString();
                                                    int i13 = AbstractC0786o0.f2696b;
                                                    L4.p.f(string2);
                                                    jMax = Math.max(jMax, j18);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 27);
                                                sb4.append("Unexpected Content-Range [");
                                                sb4.append(headerField3);
                                                sb4.append("]");
                                                String string3 = sb4.toString();
                                                int i14 = AbstractC0786o0.f2696b;
                                                L4.p.c(string3);
                                            }
                                        }
                                    }
                                    this.f24598p = jMax != -1 ? jMax - this.f24597o : -1L;
                                }
                            }
                            try {
                                this.f24594l = this.f24593k.getInputStream();
                                this.f24595m = true;
                                f(c4454nA0);
                                return this.f24598p;
                            } catch (IOException e10) {
                                k();
                                throw new YF0(e10, c4454nA0, 2000, 1);
                            }
                        } catch (IOException e11) {
                            k();
                            throw new YF0("Unable to connect to ".concat(String.valueOf(c4454nA0.f31730a.toString())), e11, c4454nA0, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i10 = i11;
                    j12 = j15;
                    j13 = j16;
                } else {
                    j10 = j16;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 7);
                sb5.append("bytes=");
                sb5.append(j10);
                sb5.append("-");
                String string4 = sb5.toString();
                if (j14 != -1) {
                    long j19 = (j10 + j14) - 1;
                    StringBuilder sb6 = new StringBuilder(string4.length() + String.valueOf(j19).length());
                    sb6.append(string4);
                    sb6.append(j19);
                    string4 = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", string4);
                httpURLConnection.setRequestProperty("User-Agent", this.f24590h);
                if (!zA) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i10 = i11;
                j12 = j15;
                j13 = j16;
            }
        } catch (IOException e12) {
            throw new YF0("Unable to connect to ".concat(String.valueOf(c4454nA0.f31730a.toString())), e12, c4454nA0, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f24593k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final /* synthetic */ void i(Socket socket) {
        this.f24602t.add(socket);
    }

    final /* synthetic */ int j() {
        return this.f24601s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f24593k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        try {
            InputStream inputStream = this.f24594l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new YF0(e10, this.f24592j, 2000, 3);
                }
            }
            this.f24594l = null;
            k();
            if (this.f24595m) {
                this.f24595m = false;
                h();
            }
            this.f24602t.clear();
        } catch (Throwable th) {
            this.f24594l = null;
            k();
            if (this.f24595m) {
                this.f24595m = false;
                h();
            }
            this.f24602t.clear();
            throw th;
        }
    }
}
