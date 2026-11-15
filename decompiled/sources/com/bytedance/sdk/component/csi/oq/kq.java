package com.bytedance.sdk.component.csi.oq;

import android.util.Log;
import com.bytedance.sdk.component.csi.csi;
import com.bytedance.sdk.component.utils.nn;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.sdk.component.csi.fou<bob> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.csi.fou
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public bob<byte[]> kq(csi csiVar) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r10;
        InputStream inputStream2 = null;
        Map<String, String> mapKq = null;
        int i10 = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(csiVar.kq()).openConnection()));
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i11 = inputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                            } catch (MalformedURLException e10) {
                                e = e10;
                                byteArray = null;
                            } catch (IOException e11) {
                                e = e11;
                                byteArray = null;
                            }
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r10 = byteArrayOutputStream;
                            nn.kq(inputStream);
                            nn.kq(r10);
                            return new bob<>(i10, byteArray, message, mapKq);
                        }
                        mapKq = csiVar.oq() ? kq(httpURLConnection) : null;
                        nn.kq(inputStream);
                        nn.kq(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e12) {
                        e = e12;
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        nn.kq(inputStream);
                        nn.kq(r10);
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        nn.kq(inputStream);
                        nn.kq(r10);
                    }
                    i10 = TTAdConstant.MATE_VALID;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e14) {
                    e = e14;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e15) {
                    e = e15;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r10 = byteArrayOutputStream;
                    nn.kq(inputStream);
                    nn.kq(r10);
                    return new bob<>(i10, byteArray, message, mapKq);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    nn.kq(inputStream2);
                    nn.kq(0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException e16) {
            e = e16;
            inputStream = null;
            byteArray = null;
        } catch (IOException e17) {
            e = e17;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th3) {
            th = th3;
            nn.kq(inputStream2);
            nn.kq(0);
            throw th;
        }
        return new bob<>(i10, byteArray, message, mapKq);
    }

    private Map<String, String> kq(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
