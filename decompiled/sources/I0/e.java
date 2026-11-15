package I0;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f1571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f1573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1574d;

    public e(String str, f[] fVarArr) {
        this.f1572b = str;
        this.f1573c = null;
        this.f1571a = fVarArr;
        this.f1574d = 0;
    }

    private void a(int i10) {
        if (i10 == this.f1574d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f1574d) + " expected, but got " + c(i10));
    }

    private String c(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public String b() {
        a(0);
        return this.f1572b;
    }

    public e(byte[] bArr, f[] fVarArr) {
        Objects.requireNonNull(bArr);
        this.f1573c = bArr;
        this.f1572b = null;
        this.f1571a = fVarArr;
        this.f1574d = 1;
    }
}
