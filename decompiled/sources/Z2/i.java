package Z2;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7150a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f7151b = i.class;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7154c;

        public final int a() {
            return this.f7153b;
        }

        public final int b() {
            return this.f7154c;
        }

        public final boolean c() {
            return this.f7152a;
        }

        public final void d(int i10) {
            this.f7153b = i10;
        }

        public final void e(int i10) {
            this.f7154c = i10;
        }

        public final void f(boolean z9) {
            this.f7152a = z9;
        }
    }

    private i() {
    }

    public static final int a(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 3) {
            return 180;
        }
        if (i10 != 6) {
            return i10 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int b(InputStream inputStream, int i10, boolean z9) {
        if (i10 >= 10 && h.a(inputStream, 2, z9) == 3 && h.a(inputStream, 4, z9) == 1) {
            return h.a(inputStream, 2, z9);
        }
        return 0;
    }

    private final int c(InputStream inputStream, int i10, boolean z9, int i11) throws IOException {
        if (i10 < 14) {
            return 0;
        }
        int iA = h.a(inputStream, 2, z9);
        int i12 = i10 - 2;
        while (true) {
            int i13 = iA - 1;
            if (iA <= 0 || i12 < 12) {
                break;
            }
            int i14 = i12 - 2;
            if (h.a(inputStream, 2, z9) == i11) {
                return i14;
            }
            inputStream.skip(10L);
            i12 -= 12;
            iA = i13;
        }
        return 0;
    }

    public static final int d(InputStream stream, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        a aVar = new a();
        i iVar = f7150a;
        int iE = iVar.e(stream, i10, aVar);
        int iB = aVar.b() - 8;
        if (iE == 0 || iB > iE) {
            return 0;
        }
        stream.skip(iB);
        return iVar.b(stream, iVar.c(stream, iE - iB, aVar.c(), 274), aVar.c());
    }

    private final int e(InputStream inputStream, int i10, a aVar) {
        if (i10 <= 8) {
            return 0;
        }
        aVar.d(h.a(inputStream, 4, false));
        if (aVar.a() != 1229531648 && aVar.a() != 1296891946) {
            Z1.a.i(f7151b, "Invalid TIFF header");
            return 0;
        }
        aVar.f(aVar.a() == 1229531648);
        aVar.e(h.a(inputStream, 4, aVar.c()));
        int i11 = i10 - 8;
        if (aVar.b() >= 8 && aVar.b() - 8 <= i11) {
            return i11;
        }
        Z1.a.i(f7151b, "Invalid offset");
        return 0;
    }
}
