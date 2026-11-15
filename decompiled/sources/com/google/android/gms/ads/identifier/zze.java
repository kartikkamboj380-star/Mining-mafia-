package com.google.android.gms.ads.identifier;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p066g5.g;
import p066g5.j;

/* JADX INFO: loaded from: classes2.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                j.b(263);
                URL url = new URL(str);
                int i10 = g.f44400a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    httpURLConnection.disconnect();
                    j.a();
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th2) {
                j.a();
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            j.a();
        } catch (IndexOutOfBoundsException e11) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e11.getMessage(), e11);
            j.a();
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            j.a();
        }
    }
}
