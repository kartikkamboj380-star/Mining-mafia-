package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getMediationNetwork;

    public AFd1jSDK(int i10) {
        this.getMediationNetwork = i10;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @NonNull
    private static String AFAdRevenueData(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e10) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e10.getMessage() != null ? e10.getMessage() : "", e10, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z9 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z9) {
                            sb.append('\n');
                        }
                        sb.append(line);
                        z9 = false;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th;
        }
        bufferedReader.close();
        throw th;
    }

    public final AFe1ySDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] mediationNetwork = aFd1cSDK.getMediationNetwork();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getMediationNetwork);
            sb.append(":");
            sb.append(aFd1cSDK.AFAdRevenueData);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] mediationNetwork2 = aFd1cSDK.getMediationNetwork();
            if (aFd1cSDK.getRevenue() && mediationNetwork2 != null) {
                try {
                    String str = aFd1cSDK.getMonetizationNetwork() ? "<encrypted>" : new String(mediationNetwork2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1dSDK aFd1dSDK = new AFd1dSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(th);
                        sb3.append("\n took ");
                        sb3.append(aFd1dSDK.AFAdRevenueData);
                        sb3.append("ms");
                        String string = sb3.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb4 = new StringBuilder("[");
                        sb4.append(aFd1cSDK.hashCode());
                        sb4.append("] ");
                        sb4.append(string);
                        aFLogger.e(aFg1cSDK, sb4.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1dSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.getRevenue.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(aFd1cSDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb5.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFd1cSDK.AFAdRevenueData).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getMediationNetwork);
                if (aFd1cSDK.AFAdRevenueData()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i10 = this.getMediationNetwork;
                    int i11 = aFd1cSDK.areAllFieldsValid;
                    if (i11 != -1) {
                        i10 = i11;
                    }
                    httpURLConnection2.setConnectTimeout(i10);
                    httpURLConnection2.setReadTimeout(i10);
                    httpURLConnection2.addRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, aFd1cSDK.getMonetizationNetwork() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1cSDK.getRevenue.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (mediationNetwork != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(mediationNetwork.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(mediationNetwork);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z9 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String strAFAdRevenueData = aFd1cSDK.getCurrencyIso4217Code() ? AFAdRevenueData(httpURLConnection2) : "";
                    AFd1dSDK aFd1dSDK2 = new AFd1dSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(httpURLConnection2.getResponseCode());
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(strAFAdRevenueData);
                    sb7.append("\n took ");
                    sb7.append(aFd1dSDK2.AFAdRevenueData);
                    sb7.append("ms");
                    String string2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(aFd1cSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(string2);
                    aFLogger2.d(aFg1cSDK2, sb8.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFe1ySDK<String> aFe1ySDK = new AFe1ySDK<>(strAFAdRevenueData, httpURLConnection2.getResponseCode(), z9, map, aFd1dSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1ySDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1dSDK aFd1dSDK3 = new AFd1dSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb9 = new StringBuilder("error: ");
                    sb9.append(th);
                    sb9.append("\n took ");
                    sb9.append(aFd1dSDK3.AFAdRevenueData);
                    sb9.append("ms");
                    String string3 = sb9.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb10 = new StringBuilder("[");
                    sb10.append(aFd1cSDK.hashCode());
                    sb10.append("] ");
                    sb10.append(string3);
                    aFLogger3.e(aFg1cSDK3, sb10.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1dSDK3);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
