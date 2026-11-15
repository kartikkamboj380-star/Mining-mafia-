package Z8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // Z8.AbstractC1072a
    public byte C() {
        String strA = A();
        int iG = G();
        if (iG >= strA.length() || iG == -1) {
            return (byte) 10;
        }
        this.f7184a = iG;
        return AbstractC1073b.a(strA.charAt(iG));
    }

    @Override // Z8.z, Z8.AbstractC1072a
    public int G() {
        int i10;
        int iY = this.f7184a;
        if (iY == -1) {
            return iY;
        }
        String strA = A();
        while (iY < strA.length()) {
            char cCharAt = strA.charAt(iY);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iY + 1) >= strA.length()) {
                    break;
                }
                char cCharAt2 = strA.charAt(i10);
                if (cCharAt2 == '*') {
                    int iZ = StringsKt.Z(strA, "*/", iY + 2, false, 4, null);
                    if (iZ == -1) {
                        this.f7184a = strA.length();
                        AbstractC1072a.v(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new p129m8.d();
                    }
                    iY = iZ + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iY = StringsKt.Y(strA, '\n', iY + 2, false, 4, null);
                    iY = iY == -1 ? strA.length() : iY + 1;
                }
            }
        }
        this.f7184a = iY;
        return iY;
    }

    @Override // Z8.z, Z8.AbstractC1072a
    public boolean e() {
        int iG = G();
        if (iG >= A().length() || iG == -1) {
            return false;
        }
        return B(A().charAt(iG));
    }

    @Override // Z8.z, Z8.AbstractC1072a
    public byte j() {
        String strA = A();
        int iG = G();
        if (iG >= strA.length() || iG == -1) {
            return (byte) 10;
        }
        this.f7184a = iG + 1;
        return AbstractC1073b.a(strA.charAt(iG));
    }

    @Override // Z8.z, Z8.AbstractC1072a
    public void k(char c10) {
        String strA = A();
        int iG = G();
        if (iG >= strA.length() || iG == -1) {
            this.f7184a = -1;
            M(c10);
        }
        char cCharAt = strA.charAt(iG);
        this.f7184a = iG + 1;
        if (cCharAt == c10) {
            return;
        }
        M(c10);
    }
}
