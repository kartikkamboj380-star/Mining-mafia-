package com.bytedance.adsdk.oq.fou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class kq implements fou {
    private final HttpURLConnection kq;

    public kq(HttpURLConnection httpURLConnection) {
        this.kq = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.oq.fou.fou
    public String bob() {
        return this.kq.getContentType();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.kq.disconnect();
    }

    @Override // com.bytedance.adsdk.oq.fou.fou
    public String fou() {
        try {
            if (kq()) {
                return null;
            }
            return "Unable to fetch " + this.kq.getURL() + ". Failed with " + this.kq.getResponseCode() + "\n" + kq(this.kq);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.oq.fou.fou
    public boolean kq() {
        try {
            return this.kq.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.oq.fou.fou
    public InputStream oq() {
        return this.kq.getInputStream();
    }

    private String kq(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
