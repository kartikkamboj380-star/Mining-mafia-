package E6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f587b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f586a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f587b = list;
    }

    @Override // E6.w
    public List b() {
        return this.f587b;
    }

    @Override // E6.w
    public String c() {
        return this.f586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f586a.equals(wVar.c()) && this.f587b.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f586a.hashCode() ^ 1000003) * 1000003) ^ this.f587b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f586a + ", usedDates=" + this.f587b + "}";
    }
}
