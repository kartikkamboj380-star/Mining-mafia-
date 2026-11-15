package Z8;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f7210a = C1075d.f7189c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7211b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= C.a().length || (b10 = C.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f7210a[iF] = cCharAt;
                i11 = i12;
            } else if (b10 == 1) {
                String str2 = C.b()[cCharAt];
                Intrinsics.c(str2);
                int iF2 = f(iF, str2.length());
                str2.getChars(0, str2.length(), this.f7210a, iF2);
                i11 = iF2 + str2.length();
                this.f7211b = i11;
            } else {
                char[] cArr = this.f7210a;
                cArr[iF] = '\\';
                cArr[iF + 1] = (char) b10;
                i11 = iF + 2;
                this.f7211b = i11;
            }
            i10++;
        }
        int iF3 = f(i11, 1);
        this.f7210a[iF3] = '\"';
        this.f7211b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f7211b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f7210a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kotlin.ranges.b.c(i12, i10 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f7210a = cArrCopyOf;
        }
        return i10;
    }

    @Override // Z8.l
    public void a(char c10) {
        e(1);
        char[] cArr = this.f7210a;
        int i10 = this.f7211b;
        this.f7211b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // Z8.l
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f7210a;
        int i10 = this.f7211b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < C.a().length && C.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f7211b = i12 + 1;
    }

    @Override // Z8.l
    public void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f7210a, this.f7211b);
        this.f7211b += length;
    }

    public void g() {
        C1075d.f7189c.c(this.f7210a);
    }

    public String toString() {
        return new String(this.f7210a, 0, this.f7211b);
    }

    @Override // Z8.l
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
