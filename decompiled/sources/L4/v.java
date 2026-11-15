package L4;

import H4.B;
import H4.C0654z;
import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.AbstractC2346Ri0;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.C2205Oq;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3148c;

    public v(Context context, String str) {
        this.f3146a = context;
        this.f3147b = str;
    }

    private final URL c(String str) {
        URL urlD = null;
        try {
            urlD = new URI(str).toURL();
        } catch (IllegalArgumentException e10) {
            e = e10;
            e(str, e);
        } catch (MalformedURLException e11) {
            e = e11;
            e(str, e);
        } catch (URISyntaxException e12) {
            e(str, e12);
            if (((Boolean) B.c().d(AbstractC3892ii.f29814f)).booleanValue()) {
                urlD = d(str);
            }
        }
        if (urlD != null) {
            return urlD;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        p.a(sb.toString());
        return new URL(str);
    }

    private final URL d(String str) {
        URL url;
        try {
            p.a("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(string);
                p.a(sb.toString());
                return url;
            } catch (IllegalArgumentException e10) {
                e = e10;
                e(str, e);
                return url;
            } catch (MalformedURLException e11) {
                e = e11;
                e(str, e);
                return url;
            } catch (URISyntaxException e12) {
                e = e12;
                e(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e13) {
            e = e13;
            url = null;
        }
    }

    private final void e(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        p.f(sb.toString());
        C2205Oq.c(this.f3146a).a(th, "HttpUrlPinger.pingUrl", ((Integer) B.c().d(AbstractC3892ii.je)).intValue() / 100.0f);
    }

    public final String a() {
        return this.f3148c;
    }

    public final u b(String str, Map map) {
        u uVar = u.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) B.c().d(AbstractC3892ii.f29825g)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) B.c().d(AbstractC3892ii.f29752Z2)).booleanValue() || !C0654z.e()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            p.a(sb.toString());
                            URL urlC = c(str);
                            int i10 = AbstractC2346Ri0.f22892a;
                            HttpURLConnection httpURLConnection = (HttpURLConnection) urlC.openConnection();
                            try {
                                C0654z.a();
                                String str2 = this.f3147b;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("User-Agent", str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                m mVar = new m(null);
                                mVar.a(httpURLConnection, null);
                                int responseCode = httpURLConnection.getResponseCode();
                                mVar.c(httpURLConnection, responseCode);
                                if (responseCode < 200 || responseCode >= 300) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                    sb2.append("Received non-success response code ");
                                    sb2.append(responseCode);
                                    sb2.append(" from pinging URL: ");
                                    sb2.append(str);
                                    p.f(sb2.toString());
                                    if (responseCode == 502) {
                                        uVar = u.RETRIABLE_FAILURE;
                                    }
                                } else {
                                    if (((Boolean) B.c().d(AbstractC3892ii.f29791c9)).booleanValue()) {
                                        this.f3148c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    uVar = u.SUCCESS;
                                }
                                httpURLConnection.disconnect();
                                if (!ClientLibraryUtils.isPackageSide()) {
                                    return uVar;
                                }
                            } catch (Throwable th) {
                                httpURLConnection.disconnect();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                            throw th2;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        p.f(sb3.toString());
                        uVar = u.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return uVar;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        e(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return uVar;
                    } catch (RuntimeException e12) {
                        e = e12;
                        String message2 = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message2);
                        p.f(sb4.toString());
                        uVar = u.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return uVar;
                    } catch (MalformedURLException e13) {
                        e = e13;
                        e(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return uVar;
                    }
                    TrafficStats.clearThreadStatsTag();
                    return uVar;
                }
            }
        }
        return uVar;
    }

    @Override // L4.f
    public final u k(String str) {
        return b(str, null);
    }
}
