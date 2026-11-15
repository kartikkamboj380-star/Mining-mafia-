package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadDataProviders {

    static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f47710a;

        a(File file) {
            this.f47710a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() {
            return new FileInputStream(this.f47710a).getChannel();
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f47711a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f47711a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() throws IOException {
            if (this.f47711a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f47711a).getChannel();
            }
            this.f47711a.close();
            throw new IllegalArgumentException("Not a file: " + this.f47711a);
        }
    }

    private static final class c extends UploadDataProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f47712a;

        /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f47712a.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f47712a.remaining()) {
                byteBuffer.put(this.f47712a);
            } else {
                int iLimit = this.f47712a.limit();
                ByteBuffer byteBuffer2 = this.f47712a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f47712a);
                this.f47712a.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f47712a.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private c(ByteBuffer byteBuffer) {
            this.f47712a = byteBuffer;
        }
    }

    private interface d {
        FileChannel a();
    }

    private static final class e extends UploadDataProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile FileChannel f47713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f47714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f47715c;

        /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        private FileChannel a() {
            if (this.f47713a == null) {
                synchronized (this.f47715c) {
                    try {
                        if (this.f47713a == null) {
                            this.f47713a = this.f47714b.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f47713a;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f47713a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelA = a();
            int i10 = 0;
            while (i10 == 0) {
                int i11 = fileChannelA.read(byteBuffer);
                if (i11 == -1) {
                    break;
                } else {
                    i10 += i11;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private e(d dVar) {
            this.f47715c = new Object();
            this.f47714b = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
