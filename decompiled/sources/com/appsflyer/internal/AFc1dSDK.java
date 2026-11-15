package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class AFc1dSDK {
    private final boolean AFAdRevenueData;

    @NotNull
    public byte[] getCurrencyIso4217Code;
    public int getMediationNetwork;

    @Nullable
    public Map<String, String> getMonetizationNetwork;

    public AFc1dSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = bArr;
        this.getMonetizationNetwork = map;
        this.getMediationNetwork = i10;
        this.AFAdRevenueData = true;
    }

    @NotNull
    public abstract AFd1hSDK AFAdRevenueData();

    public boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    @NotNull
    public abstract String getMediationNetwork(@NotNull String str);

    public final boolean getMediationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String monetizationNetwork = getMonetizationNetwork();
            Intrinsics.checkNotNullParameter(monetizationNetwork, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(monetizationNetwork).openConnection());
            Intrinsics.d(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            try {
                boolean mediationNetwork = getMediationNetwork(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return mediationNetwork;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String mediationNetwork2 = getMediationNetwork("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getCurrencyIso4217Code()) {
                        AFLogger.afRDLog(mediationNetwork2);
                    } else {
                        AFLogger.afVerboseLog(mediationNetwork2);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @NotNull
    public abstract String getMonetizationNetwork();

    private final boolean getMediationNetwork(HttpURLConnection httpURLConnection, long j10) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.getCurrencyIso4217Code, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        String mediationNetwork = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getCurrencyIso4217Code()) {
            AFLogger.afRDLog(mediationNetwork);
        } else {
            AFLogger.afVerboseLog(mediationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getMediationNetwork);
        httpURLConnection.setConnectTimeout(this.getMediationNetwork);
        httpURLConnection.addRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, AFAdRevenueData().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getCurrencyIso4217Code.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getCurrencyIso4217Code);
        bufferedOutputStream.close();
        String mediationNetwork2 = getMediationNetwork(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + mediationNetwork2 + "\n\ttook " + jCurrentTimeMillis + "ms";
        String mediationNetwork3 = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getCurrencyIso4217Code()) {
            AFLogger.afRDLog(mediationNetwork3);
        } else {
            AFLogger.afVerboseLog(mediationNetwork3);
        }
        return AFd1sSDK.getMediationNetwork(httpURLConnection);
    }

    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strE0 = CollectionsKt.e0(p229w8.o.f(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strE0 == null ? "" : strE0;
    }
}
