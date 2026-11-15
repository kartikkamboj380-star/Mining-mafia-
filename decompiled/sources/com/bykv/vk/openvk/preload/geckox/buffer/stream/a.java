package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f13512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13513b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f13512a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long jB = this.f13512a.b() - this.f13512a.c();
        return jB > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f13513b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f13512a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f13512a.b(this.f13513b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f13512a.a(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f13512a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f13512a.d();
    }
}
