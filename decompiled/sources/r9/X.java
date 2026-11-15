package r9;

import java.util.Arrays;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class X {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f48408h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f48409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X f48414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X f48415g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public X() {
        this.f48409a = new byte[8192];
        this.f48413e = true;
        this.f48412d = false;
    }

    public final void a() {
        int i10;
        X x10 = this.f48415g;
        if (x10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.c(x10);
        if (x10.f48413e) {
            int i11 = this.f48411c - this.f48410b;
            X x11 = this.f48415g;
            Intrinsics.c(x11);
            int i12 = 8192 - x11.f48411c;
            X x12 = this.f48415g;
            Intrinsics.c(x12);
            if (x12.f48412d) {
                i10 = 0;
            } else {
                X x13 = this.f48415g;
                Intrinsics.c(x13);
                i10 = x13.f48410b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            X x14 = this.f48415g;
            Intrinsics.c(x14);
            g(x14, i11);
            b();
            Y.b(this);
        }
    }

    public final X b() {
        X x10 = this.f48414f;
        if (x10 == this) {
            x10 = null;
        }
        X x11 = this.f48415g;
        Intrinsics.c(x11);
        x11.f48414f = this.f48414f;
        X x12 = this.f48414f;
        Intrinsics.c(x12);
        x12.f48415g = this.f48415g;
        this.f48414f = null;
        this.f48415g = null;
        return x10;
    }

    public final X c(X segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f48415g = this;
        segment.f48414f = this.f48414f;
        X x10 = this.f48414f;
        Intrinsics.c(x10);
        x10.f48415g = segment;
        this.f48414f = segment;
        return segment;
    }

    public final X d() {
        this.f48412d = true;
        return new X(this.f48409a, this.f48410b, this.f48411c, true, false);
    }

    public final X e(int i10) {
        X xC;
        if (i10 <= 0 || i10 > this.f48411c - this.f48410b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            xC = d();
        } else {
            xC = Y.c();
            byte[] bArr = this.f48409a;
            byte[] bArr2 = xC.f48409a;
            int i11 = this.f48410b;
            AbstractC7024j.i(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        xC.f48411c = xC.f48410b + i10;
        this.f48410b += i10;
        X x10 = this.f48415g;
        Intrinsics.c(x10);
        x10.c(xC);
        return xC;
    }

    public final X f() {
        byte[] bArr = this.f48409a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new X(bArrCopyOf, this.f48410b, this.f48411c, false, true);
    }

    public final void g(X sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f48413e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f48411c;
        if (i11 + i10 > 8192) {
            if (sink.f48412d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f48410b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f48409a;
            AbstractC7024j.i(bArr, bArr, 0, i12, i11, 2, null);
            sink.f48411c -= sink.f48410b;
            sink.f48410b = 0;
        }
        byte[] bArr2 = this.f48409a;
        byte[] bArr3 = sink.f48409a;
        int i13 = sink.f48411c;
        int i14 = this.f48410b;
        AbstractC7024j.e(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f48411c += i10;
        this.f48410b += i10;
    }

    public X(byte[] data, int i10, int i11, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f48409a = data;
        this.f48410b = i10;
        this.f48411c = i11;
        this.f48412d = z9;
        this.f48413e = z10;
    }
}
