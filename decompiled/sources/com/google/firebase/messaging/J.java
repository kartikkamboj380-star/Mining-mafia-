package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes3.dex */
public class J implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f40158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Future f40159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f40160c;

    private J(URL url) {
        this.f40158a = url;
    }

    public static /* synthetic */ void a(J j10, C7094k c7094k) {
        j10.getClass();
        try {
            c7094k.c(j10.c());
        } catch (Exception e10) {
            c7094k.b(e10);
        }
    }

    private byte[] h() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f40158a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC6713b.d(AbstractC6713b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f40158a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static J j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new J(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap c() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f40158a);
        }
        byte[] bArrH = h();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f40158a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f40158a);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40159b.cancel(true);
    }

    public Task n() {
        return (Task) Preconditions.checkNotNull(this.f40160c);
    }

    public void v(ExecutorService executorService) {
        final C7094k c7094k = new C7094k();
        this.f40159b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.I
            @Override // java.lang.Runnable
            public final void run() {
                J.a(this.f40156a, c7094k);
            }
        });
        this.f40160c = c7094k.a();
    }
}
