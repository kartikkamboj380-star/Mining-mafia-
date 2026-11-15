package com.tenjin.android;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tenjin.android.network.TJNCertificatePinningHelper;
import com.tenjin.android.store.TenjinDatasource;
import com.tenjin.android.utils.TenjinUtils;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes3.dex */
class HttpConnection {
    private static final String TAG = "HttpConnection";

    HttpConnection() {
    }

    static String convertMapToString(Map<String, String> map, boolean z9) {
        String str = "";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (str.length() > 0) {
                    str = str + "&";
                }
                str = z9 ? str + Uri.encode(entry.getKey()) + "=" + Uri.encode(entry.getValue()) : str + entry.getKey() + "=" + entry.getValue();
            }
        }
        return str;
    }

    private HttpURLConnection getConnection(URL url, Context context) {
        return getConnection(url, "GET", null, null, context);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7 */
    boolean connect(String str, Map<String, String> map, Map<String, String> map2, Context context) {
        Throwable th;
        ?? r12;
        Exception exc;
        HttpURLConnection connection;
        Log.d(TAG, "--------------------");
        boolean z9 = false;
        InputStream errorStream = null;
        try {
            try {
                connection = getConnection(new URL(str), "POST", map, map2, context);
                if (connection == null) {
                    if (connection != null) {
                        connection.disconnect();
                    }
                    return false;
                }
                try {
                    int responseCode = connection.getResponseCode();
                    errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
                    if (errorStream == null) {
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        connection.disconnect();
                        return false;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line + "\n");
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    Log.d(TAG, "Tenjin::connect params: " + map);
                    Log.d(TAG, "Tenjin::connect response: " + string);
                    z9 = responseCode == 200;
                    try {
                        errorStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                } catch (Exception e13) {
                    exc = e13;
                    exc.printStackTrace();
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    if (connection != null) {
                    }
                    Log.d(TAG, "--------------------");
                    return z9;
                }
                connection.disconnect();
                Log.d(TAG, "--------------------");
                return z9;
            } catch (Throwable th2) {
                th = th2;
                r12 = str;
                if (0 != 0) {
                    try {
                        errorStream.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                if (r12 != 0) {
                    throw th;
                }
                r12.disconnect();
                throw th;
            }
        } catch (Exception e16) {
            exc = e16;
            connection = null;
        } catch (Throwable th3) {
            th = th3;
            r12 = 0;
            if (0 != 0) {
                errorStream.close();
            }
            if (r12 != 0) {
                throw th;
            }
            r12.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v9 */
    Pair<Boolean, Boolean> connectWithRetryCheck(String str, Map<String, String> map, Map<String, String> map2, Context context) {
        Throwable th;
        ?? r13;
        Exception exc;
        HttpURLConnection connection;
        UnknownHostException unknownHostException;
        Pair<Boolean, Boolean> pair;
        Log.d(TAG, "--------------------");
        Boolean bool = Boolean.FALSE;
        Pair<Boolean, Boolean> pair2 = new Pair<>(bool, bool);
        InputStream inputStream = null;
        try {
            try {
                connection = getConnection(new URL(str), "POST", map, map2, context);
                if (connection == null) {
                    if (connection != null) {
                        connection.disconnect();
                    }
                    return pair2;
                }
                try {
                    try {
                        int responseCode = connection.getResponseCode();
                        InputStream errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
                        if (errorStream == null) {
                            if (errorStream != null) {
                                try {
                                    errorStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            connection.disconnect();
                            return pair2;
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line + "\n");
                        }
                        String string = sb.toString();
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        Log.d(TAG, "Tenjin::connect params: " + map);
                        Log.d(TAG, "Tenjin::connect response: " + string);
                        try {
                            if (responseCode != 200) {
                                if (!connection.getHeaderFields().containsKey("no-retry") || Boolean.parseBoolean(connection.getHeaderField("no-retry"))) {
                                    errorStream.close();
                                } else {
                                    pair = new Pair<>(Boolean.FALSE, Boolean.TRUE);
                                }
                                connection.disconnect();
                                Log.d(TAG, "--------------------");
                                return pair2;
                            }
                            pair = new Pair<>(Boolean.TRUE, Boolean.FALSE);
                            errorStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        pair2 = pair;
                        connection.disconnect();
                        Log.d(TAG, "--------------------");
                        return pair2;
                    } catch (Exception e13) {
                        exc = e13;
                        exc.printStackTrace();
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (connection != null) {
                        }
                        Log.d(TAG, "--------------------");
                        return pair2;
                    }
                } catch (UnknownHostException e15) {
                    unknownHostException = e15;
                    unknownHostException.printStackTrace();
                    pair2 = new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (connection != null) {
                    }
                    Log.d(TAG, "--------------------");
                    return pair2;
                }
            } catch (Throwable th2) {
                th = th2;
                r13 = str;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                if (r13 != 0) {
                    throw th;
                }
                r13.disconnect();
                throw th;
            }
        } catch (UnknownHostException e18) {
            unknownHostException = e18;
            connection = null;
        } catch (Exception e19) {
            exc = e19;
            connection = null;
        } catch (Throwable th3) {
            th = th3;
            r13 = 0;
            if (0 != 0) {
                inputStream.close();
            }
            if (r13 != 0) {
                throw th;
            }
            r13.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.net.HttpURLConnection] */
    String getUser(String str, Map<String, String> map, Context context) {
        ?? r10;
        HttpURLConnection httpURLConnection;
        String str2;
        String string;
        Log.d(TAG, "--------------------");
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection connection = getConnection(new URL(str + "?" + convertMapToString(map, true)), context);
                if (connection == null) {
                    if (connection != null) {
                        connection.disconnect();
                    }
                    return null;
                }
                try {
                    int responseCode = connection.getResponseCode();
                    InputStream errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
                    if (errorStream == null) {
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        connection.disconnect();
                        return null;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line + "\n");
                        }
                        string = sb.toString();
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        Log.d(TAG, "Tenjin::getUser response: " + string);
                        try {
                            errorStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        connection.disconnect();
                    } catch (Exception e13) {
                        inputStream = errorStream;
                        e = e13;
                        str2 = null;
                        httpURLConnection = connection;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        string = str2;
                    } catch (Throwable th) {
                        inputStream = errorStream;
                        th = th;
                        r10 = connection;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (r10 == 0) {
                            throw th;
                        }
                        r10.disconnect();
                        throw th;
                    }
                    Log.d(TAG, "--------------------");
                    return string;
                } catch (Exception e16) {
                    e = e16;
                    str2 = null;
                    httpURLConnection = connection;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = str;
            }
        } catch (Exception e17) {
            e = e17;
            httpURLConnection = null;
            str2 = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
        }
    }

    private HttpURLConnection getConnection(URL url, String str, Map<String, String> map, Map<String, String> map2, Context context) throws InterruptedException, IOException {
        HttpURLConnection httpURLConnection;
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                long delayForRetry = TenjinUtils.getDelayForRetry(i10) * 1000;
                Log.d(TAG, "Retry attempt " + i10 + ", sleeping for " + delayForRetry + " ms");
                Thread.sleep(delayForRetry);
            }
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (str.equals("POST")) {
                String strConvertMapToString = convertMapToString(map, false);
                byte[] bytes = strConvertMapToString.getBytes();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(0);
                httpURLConnection.setReadTimeout(0);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("charset", "utf-8");
                if (bytes.length > 0) {
                    httpURLConnection.setRequestProperty("Content-Length", Integer.toString(strConvertMapToString.getBytes().length));
                }
                httpURLConnection.setUseCaches(false);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(strConvertMapToString.getBytes("UTF-8"));
                dataOutputStream.flush();
                dataOutputStream.close();
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 500 || responseCode > 599) {
                break;
            }
            httpURLConnection.disconnect();
            i10++;
            if (map != null) {
                map.put("retry_attempts", Integer.toString(i10));
            }
        }
        if (new TenjinDatasource(context).getEncryptRequestsSetting().booleanValue() && (httpURLConnection instanceof HttpsURLConnection)) {
            try {
                SSLContext pinningSSLContext = TJNCertificatePinningHelper.INSTANCE.getPinningSSLContext("certs", context);
                if (pinningSSLContext != null) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(pinningSSLContext.getSocketFactory());
                    return httpURLConnection;
                }
            } catch (Exception e10) {
                Log.e(TAG, "Unexpected error", e10);
            }
        }
        return httpURLConnection;
    }
}
