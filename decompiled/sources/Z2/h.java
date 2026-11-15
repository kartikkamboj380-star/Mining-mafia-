package Z2;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7149a = new h();

    private h() {
    }

    public static final int a(InputStream stream, int i10, boolean z9) throws IOException {
        int i11;
        Intrinsics.checkNotNullParameter(stream, "stream");
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = stream.read();
            if (i14 == -1) {
                throw new IOException("no more bytes");
            }
            if (z9) {
                i11 = (i14 & 255) << (i13 * 8);
            } else {
                i12 <<= 8;
                i11 = i14 & 255;
            }
            i12 |= i11;
        }
        return i12;
    }
}
