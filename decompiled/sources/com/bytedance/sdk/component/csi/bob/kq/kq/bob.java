package com.bytedance.sdk.component.csi.bob.kq.kq;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class bob implements Closeable {
    private byte[] bob;
    private int csi;
    private int fou;
    private final InputStream kq;
    private final Charset oq;

    public bob(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void bob() throws IOException {
        InputStream inputStream = this.kq;
        byte[] bArr = this.bob;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.fou = 0;
        this.csi = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.kq) {
            try {
                if (this.bob != null) {
                    this.bob = null;
                    this.kq.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean oq() {
        return this.csi == -1;
    }

    public bob(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(fou.kq)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.kq = inputStream;
        this.oq = charset;
        this.bob = new byte[i10];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String kq() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.kq) {
            try {
                if (this.bob == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.fou >= this.csi) {
                    bob();
                }
                for (int i12 = this.fou; i12 != this.csi; i12++) {
                    byte[] bArr2 = this.bob;
                    if (bArr2[i12] == 10) {
                        int i13 = this.fou;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.oq.name());
                        this.fou = i12 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.csi - this.fou) + 80) { // from class: com.bytedance.sdk.component.csi.bob.kq.kq.bob.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i14 = ((ByteArrayOutputStream) this).count;
                        if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                            i14--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i14, bob.this.oq.name());
                        } catch (UnsupportedEncodingException e10) {
                            throw new AssertionError(e10);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.bob;
                    int i14 = this.fou;
                    byteArrayOutputStream.write(bArr3, i14, this.csi - i14);
                    this.csi = -1;
                    bob();
                    i10 = this.fou;
                    while (i10 != this.csi) {
                        bArr = this.bob;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.fou;
                if (i10 != i15) {
                    byteArrayOutputStream.write(bArr, i15, i10 - i15);
                }
                this.fou = i10 + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
