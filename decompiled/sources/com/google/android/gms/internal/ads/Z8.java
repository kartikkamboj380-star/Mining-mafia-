package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Z8 extends M8 {
    public Z8(Y8 y9, SSLSocketFactory sSLSocketFactory) {
    }

    static List b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4952r8((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final W8 a(AbstractC5960z8 abstractC5960z8, Map map) throws Throwable {
        String strI = abstractC5960z8.i();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(abstractC5960z8.n());
        URL url = new URL(strI);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iP = abstractC5960z8.p();
        httpURLConnection.setConnectTimeout(iP);
        httpURLConnection.setReadTimeout(iP);
        boolean z9 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (abstractC5960z8.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrO = abstractC5960z8.o();
                if (bArrO != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey(CommonGatewayClient.HEADER_CONTENT_TYPE)) {
                        httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrO);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            abstractC5960z8.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                W8 w10 = new W8(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return w10;
            }
            try {
                return new W8(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new X8(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z9 = true;
                if (!z9) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
