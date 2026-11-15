package p041e0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f43230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f43231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f43234e = d.a();

    protected int a(int i10) {
        return i10 + this.f43231b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f43233d) {
            return this.f43231b.getShort(this.f43232c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f43231b = byteBuffer;
        if (byteBuffer == null) {
            this.f43230a = 0;
            this.f43232c = 0;
            this.f43233d = 0;
        } else {
            this.f43230a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f43232c = i11;
            this.f43233d = this.f43231b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f43230a;
        return i11 + this.f43231b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f43230a;
        return this.f43231b.getInt(i11 + this.f43231b.getInt(i11));
    }
}
