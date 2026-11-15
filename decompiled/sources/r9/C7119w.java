package r9;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7119w extends AbstractC7110m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f48509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7119w(boolean z9, RandomAccessFile randomAccessFile) {
        super(z9);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f48509e = randomAccessFile;
    }

    @Override // r9.AbstractC7110m
    protected synchronized void v() {
        this.f48509e.close();
    }

    @Override // r9.AbstractC7110m
    protected synchronized int w(long j10, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f48509e.seek(j10);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f48509e.read(array, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // r9.AbstractC7110m
    protected synchronized long x() {
        return this.f48509e.length();
    }
}
