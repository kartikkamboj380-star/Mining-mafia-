package p055f4;

import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f43643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43644b;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f43643a = new String[i10];
        this.f43644b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f43643a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        b(sb);
        p.g("SoLoader", sb.toString());
        String[] strArr = this.f43643a;
        int i10 = this.f43644b;
        strArr[i10 % strArr.length] = str;
        this.f43644b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f43644b);
            sb.append(" base apk paths.");
            if (this.f43644b > 0) {
                sb.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f43643a;
                if (i10 < strArr.length) {
                    int i11 = (this.f43644b - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f43644b;
    }
}
