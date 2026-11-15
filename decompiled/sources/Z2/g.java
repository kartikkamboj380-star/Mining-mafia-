package Z2;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f7148a = new g();

    private g() {
    }

    public static final int a(int i10) {
        return i.a(i10);
    }

    public static final int b(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            int iD = f7148a.d(inputStream);
            if (iD == 0) {
                return 0;
            }
            return i.d(inputStream, iD);
        } catch (IOException unused) {
            return 0;
        }
    }

    private final boolean c(int i10) {
        switch (i10) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case TTAdConstant.MATE_VALID /* 200 */:
            case 204:
            default:
                return false;
        }
    }

    private final int d(InputStream inputStream) throws IOException {
        if (e(inputStream, 225)) {
            int iA = h.a(inputStream, 2, false);
            if (iA - 2 > 6) {
                int iA2 = h.a(inputStream, 4, false);
                int iA3 = h.a(inputStream, 2, false);
                int i10 = iA - 8;
                if (iA2 == 1165519206 && iA3 == 0) {
                    return i10;
                }
            }
        }
        return 0;
    }

    public static final boolean e(InputStream inputStream, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (h.a(inputStream, 1, false) == 255) {
            int iA = 255;
            while (iA == 255) {
                iA = h.a(inputStream, 1, false);
            }
            if ((i10 == 192 && f7148a.c(iA)) || iA == i10) {
                return true;
            }
            if (iA != 1 && iA != 216) {
                if (iA == 217 || iA == 218) {
                    break;
                }
                inputStream.skip(h.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}
