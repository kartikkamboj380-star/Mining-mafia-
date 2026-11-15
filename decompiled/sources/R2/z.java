package R2;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z implements p013b2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.e f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p013b2.l f5171b;

    public z(com.facebook.imagepipeline.memory.e pool, p013b2.l pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f5170a = pool;
        this.f5171b = pooledByteStreams;
    }

    public final y f(InputStream inputStream, com.facebook.imagepipeline.memory.f outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f5171b.a(inputStream, outputStream);
        return outputStream.a();
    }

    @Override // p013b2.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y a(InputStream inputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f5170a, 0, 2, null);
        try {
            return f(inputStream, fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // p013b2.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public y b(InputStream inputStream, int i10) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f5170a, i10);
        try {
            return f(inputStream, fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // p013b2.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y d(byte[] bytes) throws Throwable {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f5170a, bytes.length);
        try {
            try {
                fVar.write(bytes, 0, bytes.length);
                y yVarA = fVar.a();
                fVar.close();
                return yVarA;
            } catch (IOException e10) {
                throw Y1.p.a(e10);
            }
        } catch (Throwable th) {
            fVar.close();
            throw th;
        }
    }

    @Override // p013b2.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.f c() {
        return new com.facebook.imagepipeline.memory.f(this.f5170a, 0, 2, null);
    }

    @Override // p013b2.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.f e(int i10) {
        return new com.facebook.imagepipeline.memory.f(this.f5170a, i10);
    }
}
