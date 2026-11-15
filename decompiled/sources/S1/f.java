package S1;

import Y1.k;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f5469a;

    public f(List list) {
        this.f5469a = (List) k.g(list);
    }

    @Override // S1.d
    public String a() {
        return ((d) this.f5469a.get(0)).a();
    }

    @Override // S1.d
    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f5469a.size(); i10++) {
            if (((d) this.f5469a.get(i10)).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // S1.d
    public boolean c() {
        return false;
    }

    public List d() {
        return this.f5469a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f5469a.equals(((f) obj).f5469a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5469a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f5469a.toString();
    }
}
