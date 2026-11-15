package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4801pw extends AbstractC2368Rt0 implements InterfaceC2962bI0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f32503v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AH0 f32507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4454nA0 f32508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HttpURLConnection f32509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Queue f32510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InputStream f32511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f32514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f32515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f32516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f32517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f32518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f32519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f32520u;

    C4801pw(String str, GK0 gk0, int i10, int i11, long j10, long j11) {
        super(true);
        AbstractC5854yI.a(str);
        this.f32506g = str;
        this.f32507h = new AH0();
        this.f32504e = i10;
        this.f32505f = i11;
        this.f32510k = new ArrayDeque();
        this.f32519t = j10;
        this.f32520u = j11;
        if (gk0 != null) {
            b(gk0);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.f32510k;
            if (queue.isEmpty()) {
                this.f32509j = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws YF0 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f32514o;
            long j11 = this.f32515p;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f32516q + j11;
            long j13 = i11;
            long j14 = this.f32520u;
            long j15 = j12 + j13 + j14;
            long j16 = this.f32518s;
            long j17 = j16 + 1;
            if (j15 > j17) {
                long j18 = this.f32517r;
                if (j16 < j18) {
                    long jMin = Math.min(j18, Math.max(((this.f32519t + j17) - j14) - 1, (j17 + j13) - 1));
                    i(j17, jMin, 2);
                    this.f32518s = jMin;
                    j16 = jMin;
                }
            }
            int i12 = this.f32511l.read(bArr, i10, (int) Math.min(j13, ((j16 + 1) - this.f32516q) - this.f32515p));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f32515p += (long) i12;
            g(i12);
            return i12;
        } catch (IOException e10) {
            throw new YF0(e10, this.f32508i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws YF0 {
        this.f32508i = c4454nA0;
        this.f32515p = 0L;
        long j10 = c4454nA0.f31734e;
        long j11 = c4454nA0.f31735f;
        long jMin = j11 == -1 ? this.f32519t : Math.min(this.f32519t, j11);
        this.f32516q = j10;
        HttpURLConnection httpURLConnectionI = i(j10, (jMin + j10) - 1, 1);
        this.f32509j = httpURLConnectionI;
        String headerField = httpURLConnectionI.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f32503v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = c4454nA0.f31735f;
                    if (j14 != -1) {
                        this.f32514o = j14;
                        this.f32517r = Math.max(j12, (this.f32516q + j14) - 1);
                    } else {
                        this.f32514o = j13 - this.f32516q;
                        this.f32517r = j13 - 1;
                    }
                    this.f32518s = j12;
                    this.f32512m = true;
                    f(c4454nA0);
                    return this.f32514o;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    String string = sb.toString();
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.c(string);
                }
            }
        }
        throw new C4549nw(headerField, c4454nA0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f32509j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection i(long j10, long j11, int i10) throws YF0 {
        IOException iOException;
        String string = this.f32508i.f31730a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f32504e);
            httpURLConnection.setReadTimeout(this.f32505f);
            for (Map.Entry entry : this.f32507h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e10) {
                    iOException = e10;
                    String strValueOf = String.valueOf(string);
                    throw new YF0("Unable to connect to ".concat(strValueOf), iOException, this.f32508i, 2000, i10);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb.append("bytes=");
            sb.append(j10);
            sb.append("-");
            sb.append(j11);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f32506g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f32510k.add(httpURLConnection);
            String string2 = this.f32508i.f31730a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f32513n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new C4675ow(this.f32513n, headerFields, this.f32508i, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f32511l != null) {
                        inputStream = new SequenceInputStream(this.f32511l, inputStream);
                    }
                    this.f32511l = inputStream;
                    return httpURLConnection;
                } catch (IOException e11) {
                    zzl();
                    throw new YF0(e11, this.f32508i, 2000, i10);
                }
            } catch (IOException e12) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new YF0("Unable to connect to ".concat(strValueOf2), e12, this.f32508i, 2000, i10);
            }
        } catch (IOException e13) {
            iOException = e13;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f32509j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        try {
            InputStream inputStream = this.f32511l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new YF0(e10, this.f32508i, 2000, 3);
                }
            }
            this.f32511l = null;
            zzl();
            if (this.f32512m) {
                this.f32512m = false;
                h();
            }
        } catch (Throwable th) {
            this.f32511l = null;
            zzl();
            if (this.f32512m) {
                this.f32512m = false;
                h();
            }
            throw th;
        }
    }
}
