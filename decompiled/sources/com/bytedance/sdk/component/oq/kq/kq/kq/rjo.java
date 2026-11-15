package com.bytedance.sdk.component.oq.kq.kq.kq;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends InputStream {
    InputStream kq;
    HttpURLConnection oq;

    public rjo(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.kq = inputStream;
        this.oq = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            inputStream.close();
            this.kq = null;
        }
        HttpURLConnection httpURLConnection = this.oq;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.oq = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        InputStream inputStream = this.kq;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
