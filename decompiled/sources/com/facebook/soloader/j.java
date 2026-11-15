package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f16553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZipEntry f16554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZipFile f16555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16557e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16558f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f16555c = zipFile;
        this.f16554b = zipEntry;
        this.f16556d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f16553a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.h
    public int C(ByteBuffer byteBuffer, long j10) throws IOException {
        if (this.f16553a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j11 = this.f16556d - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (iRemaining > i10) {
            iRemaining = i10;
        }
        a(j10);
        if (byteBuffer.hasArray()) {
            this.f16553a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f16553a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f16558f += (long) iRemaining;
        return iRemaining;
    }

    public h a(long j10) throws IOException {
        InputStream inputStream = this.f16553a;
        if (inputStream == null) {
            throw new IOException(this.f16554b.getName() + "'s InputStream is null");
        }
        long j11 = this.f16558f;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f16556d;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f16555c.getInputStream(this.f16554b);
            this.f16553a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f16554b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f16558f = j10;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f16553a;
        if (inputStream != null) {
            inputStream.close();
            this.f16557e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f16557e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return C(byteBuffer, this.f16558f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
