package L;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3002e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3003f;

    public e(String str, String str2, String str3, List list) {
        this.f2998a = (String) N.f.g(str);
        this.f2999b = (String) N.f.g(str2);
        this.f3000c = (String) N.f.g(str3);
        this.f3001d = (List) N.f.g(list);
        this.f3003f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f3001d;
    }

    public int c() {
        return this.f3002e;
    }

    String d() {
        return this.f3003f;
    }

    public String e() {
        return this.f2998a;
    }

    public String f() {
        return this.f2999b;
    }

    public String g() {
        return this.f3000c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2998a + ", mProviderPackage: " + this.f2999b + ", mQuery: " + this.f3000c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3001d.size(); i10++) {
            sb.append(" [");
            List list = (List) this.f3001d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3002e);
        return sb.toString();
    }
}
