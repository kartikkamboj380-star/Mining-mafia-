package V7;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f6140a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6141b = null;

    public void a(String str, String str2) {
        this.f6140a.put(str, str2);
    }

    public String b() {
        return this.f6141b;
    }

    public Map c() {
        return this.f6140a;
    }

    public void d(String str) {
        this.f6141b = str;
    }
}
