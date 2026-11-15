package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f16550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileInputStream f16551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f16552c;

    public i(File file) {
        this.f16550a = file;
        a();
    }

    @Override // com.facebook.soloader.h
    public int C(ByteBuffer byteBuffer, long j10) {
        return this.f16552c.read(byteBuffer, j10);
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f16550a);
        this.f16551b = fileInputStream;
        this.f16552c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16551b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f16552c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f16552c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f16552c.write(byteBuffer);
    }
}
