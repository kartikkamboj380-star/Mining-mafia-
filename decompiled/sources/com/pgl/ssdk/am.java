package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f41938a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f41940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f41943f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f41939b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41944g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f41945h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41946i = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41947j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41948k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41949l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f41950m = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f41947j >= am.this.f41948k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f41940c = context;
    }

    static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f41947j;
        amVar.f41947j = i10 + 1;
        return i10;
    }

    abstract String a();

    abstract void a(int i10, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f41938a)) {
            f41938a = str;
        }
    }

    private void b() {
        Object obj;
        if (this.f41939b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f41938a)) {
                jSONObject.put("ipv6", f41938a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put("gaid", com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f41939b.addRequestProperty("cypher", String.valueOf(obj));
            this.f41939b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2 A[Catch: all -> 0x00d6, PHI: r0
      0x00c2: PHI (r0v16 java.io.InputStream) = (r0v15 java.io.InputStream), (r0v22 java.io.InputStream) binds: [B:30:0x00bf, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00d6, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x006c, B:21:0x0089, B:23:0x008c, B:24:0x00a2, B:33:0x00c5, B:32:0x00c2, B:18:0x005e), top: B:44:0x0004 }] */
    public boolean c() {
        InputStream inputStream;
        try {
            String strA = an.a(this.f41940c);
            if (TextUtils.isEmpty(strA)) {
                an.b(this.f41940c);
                HttpURLConnection httpURLConnection = this.f41939b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.f41939b = null;
                }
                return false;
            }
            String strConcat = strA + a();
            if (!strConcat.startsWith("https://") && !strConcat.startsWith("http://")) {
                strConcat = "https://".concat(strConcat);
            }
            URL url = new URL(strConcat);
            if (this.f41949l) {
                this.f41939b = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(Proxy.NO_PROXY)));
            } else {
                this.f41939b = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            }
            this.f41939b.setConnectTimeout(this.f41946i);
            this.f41939b.setReadTimeout(this.f41946i);
            a(this.f41941d);
            b(this.f41942e);
            byte[] bArr = this.f41943f;
            if (bArr != null && bArr.length > 0) {
                this.f41939b.setDoOutput(true);
                OutputStream outputStream = this.f41939b.getOutputStream();
                outputStream.write(this.f41943f);
                outputStream.flush();
                outputStream.close();
            }
            this.f41939b.connect();
            try {
                this.f41944g = this.f41939b.getResponseCode();
                inputStream = this.f41939b.getInputStream();
                try {
                    this.f41945h = a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            a(this.f41944g, this.f41945h);
            HttpURLConnection httpURLConnection2 = this.f41939b;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f41939b = null;
            }
            return true;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection3 = this.f41939b;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.f41939b = null;
            }
            an.b(this.f41940c);
            return false;
        }
    }

    private void a(int i10) throws ProtocolException {
        String str;
        if (i10 == 1) {
            str = "POST";
        } else if (i10 == 3) {
            str = "PUT";
        } else if (i10 == 4) {
            str = "DELETE";
        } else if (i10 != 5) {
            str = i10 != 6 ? "GET" : "TRACE";
        } else {
            str = "HEAD";
        }
        this.f41939b.setRequestMethod(str);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        while (true) {
            int i10 = inputStream.read(bArr, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f41950m);
    }

    private void b(int i10) {
        String str;
        if (i10 != 1) {
            str = i10 != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (!str.isEmpty()) {
            this.f41939b.addRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f41939b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f41939b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f41939b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f41941d = i10;
        this.f41942e = i11;
        this.f41943f = bArr;
    }
}
