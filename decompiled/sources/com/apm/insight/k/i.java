package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f13035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f13038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f13039f;

    public i(String str, String str2, boolean z9) throws ProtocolException {
        this.f13036c = str2;
        this.f13037d = z9;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f13034a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        this.f13035b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f13035b.setDoOutput(true);
        this.f13035b.setDoInput(true);
        this.f13035b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f13035b);
        }
        this.f13035b.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "multipart/form-data; boundary=" + str3);
        if (!z9) {
            this.f13038e = new f(this.f13035b.getOutputStream());
        } else {
            this.f13035b.setRequestProperty("Content-Encoding", "gzip");
            this.f13039f = new k(this.f13035b.getOutputStream());
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f13034a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f13036c);
        sb.append("\r\n\r\n");
        try {
            if (this.f13037d) {
                this.f13039f.write(sb.toString().getBytes());
            } else {
                this.f13038e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f13037d) {
                this.f13039f.write(bytes);
                this.f13039f.write("\r\n".getBytes());
            } else {
                this.f13038e.write(bytes);
                this.f13038e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f13034a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f13037d) {
            this.f13039f.write(sb.toString().getBytes());
        } else {
            this.f13038e.write(sb.toString().getBytes());
        }
        if (this.f13037d) {
            com.apm.insight.l.f.a(this.f13039f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f13038e, fileArr);
        }
        if (this.f13037d) {
            this.f13039f.write("\r\n".getBytes());
        } else {
            this.f13038e.write("\r\n".getBytes());
            this.f13038e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f13034a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f13037d) {
            this.f13039f.write(sb.toString().getBytes());
        } else {
            this.f13038e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f13037d) {
                this.f13039f.write(bArr, 0, i10);
            } else {
                this.f13038e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f13037d) {
            this.f13039f.write("\r\n".getBytes());
        } else {
            this.f13038e.write("\r\n".getBytes());
            this.f13038e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f13034a + "--\r\n").getBytes();
        if (this.f13037d) {
            this.f13039f.write(bytes);
            this.f13039f.b();
            this.f13039f.a();
        } else {
            this.f13038e.write(bytes);
            this.f13038e.flush();
            this.f13038e.a();
        }
        int responseCode = this.f13035b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f13035b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f13035b.disconnect();
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sb.append((String) obj);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
