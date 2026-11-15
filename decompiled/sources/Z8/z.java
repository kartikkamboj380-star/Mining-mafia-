package Z8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class z extends AbstractC1072a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7233e;

    public z(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7233e = source;
    }

    @Override // Z8.AbstractC1072a
    public int E(int i10) {
        if (i10 < A().length()) {
            return i10;
        }
        return -1;
    }

    @Override // Z8.AbstractC1072a
    public int G() {
        char cCharAt;
        int i10 = this.f7184a;
        if (i10 == -1) {
            return i10;
        }
        String strA = A();
        while (i10 < strA.length() && ((cCharAt = strA.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f7184a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z8.AbstractC1072a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public String A() {
        return this.f7233e;
    }

    @Override // Z8.AbstractC1072a
    public boolean e() {
        int i10 = this.f7184a;
        if (i10 == -1) {
            return false;
        }
        String strA = A();
        while (i10 < strA.length()) {
            char cCharAt = strA.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f7184a = i10;
                return B(cCharAt);
            }
            i10++;
        }
        this.f7184a = i10;
        return false;
    }

    @Override // Z8.AbstractC1072a
    public String i() {
        k('\"');
        int i10 = this.f7184a;
        int iY = StringsKt.Y(A(), '\"', i10, false, 4, null);
        if (iY == -1) {
            p();
            w((byte) 1, false);
            throw new p129m8.d();
        }
        for (int i11 = i10; i11 < iY; i11++) {
            if (A().charAt(i11) == '\\') {
                return o(A(), this.f7184a, i11);
            }
        }
        this.f7184a = iY + 1;
        String strSubstring = A().substring(i10, iY);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // Z8.AbstractC1072a
    public byte j() {
        String strA = A();
        int i10 = this.f7184a;
        while (i10 != -1 && i10 < strA.length()) {
            int i11 = i10 + 1;
            char cCharAt = strA.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f7184a = i11;
                return AbstractC1073b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f7184a = strA.length();
        return (byte) 10;
    }

    @Override // Z8.AbstractC1072a
    public void k(char c10) {
        if (this.f7184a == -1) {
            M(c10);
        }
        String strA = A();
        int i10 = this.f7184a;
        while (i10 < strA.length()) {
            int i11 = i10 + 1;
            char cCharAt = strA.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f7184a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    M(c10);
                }
            }
            i10 = i11;
        }
        this.f7184a = -1;
        M(c10);
    }
}
