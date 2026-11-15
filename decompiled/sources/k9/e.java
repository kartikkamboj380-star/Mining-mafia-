package k9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r9.C7108k;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f45763a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C7108k f45764b = C7108k.f48467d.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f45765c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f45766d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f45767e;

    static {
        String[] strArr = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i10] = StringsKt.E(d9.e.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f45767e = strArr;
        String[] strArr2 = f45766d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f45766d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f45766d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f45766d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f45767e[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f45767e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f45766d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    Intrinsics.c(str);
                } else {
                    str = f45767e[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : StringsKt.F(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return StringsKt.F(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f45767e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f45765c;
        return i10 < strArr.length ? strArr[i10] : d9.e.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z9, int i10, int i11, int i12, int i13) {
        return d9.e.t("%s 0x%08x %5d %-13s %s", z9 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
