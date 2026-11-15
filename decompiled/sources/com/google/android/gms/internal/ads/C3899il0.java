package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3899il0 implements InterfaceC3145cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f30058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30060c;

    public C3899il0(ExecutorService executorService, String str, long j10) {
        this.f30058a = executorService;
        this.f30059b = str;
        this.f30060c = j10;
    }

    private final com.google.common.util.concurrent.p d(final String str, final boolean z9, final byte[] bArr, final String str2) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0140c() { // from class: com.google.android.gms.internal.ads.fl0
            @Override // androidx.concurrent.futures.c.InterfaceC0140c
            public final /* synthetic */ Object a(androidx.concurrent.futures.c.a aVar) {
                return this.f28470a.b(str, z9, str2, bArr, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void c(String str, androidx.concurrent.futures.c.a aVar, boolean z9, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e10;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection);
                    aVar.a(new Runnable() { // from class: com.google.android.gms.internal.ads.gl0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            httpURLConnection.disconnect();
                        }
                    }, this.f30058a);
                    httpURLConnection.setRequestProperty("User-Agent", this.f30059b);
                    int i10 = (int) this.f30060c;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    if (z9) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            if (inputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                                while (true) {
                                    int i11 = inputStream.read(bArr2);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i11);
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                inputStream.close();
                            }
                            aVar.c(new C3774hl0(responseCode, byteArray));
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (SocketTimeoutException e11) {
                    e10 = e11;
                    httpURLConnection2 = httpURLConnection;
                    String message = e10.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    aVar.f(new TimeoutException(sb.toString()));
                    httpURLConnection = httpURLConnection2;
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection2 = httpURLConnection;
                    aVar.f(th);
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th9) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th9;
            }
        } catch (SocketTimeoutException e12) {
            e10 = e12;
        } catch (Throwable th10) {
            th = th10;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3145cl0
    public final com.google.common.util.concurrent.p a(String str, byte[] bArr, String str2) {
        return d(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    final /* synthetic */ Object b(final String str, final boolean z9, final String str2, final byte[] bArr, final androidx.concurrent.futures.c.a aVar) {
        this.f30058a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.el0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f28059a.c(str, aVar, z9, str2, bArr);
            }
        });
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3145cl0
    public final com.google.common.util.concurrent.p k(String str) {
        return d(str, false, new byte[0], null);
    }
}
