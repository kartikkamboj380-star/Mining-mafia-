package S1;

import Y1.k;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f5472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f5473b;

    public i(String str) {
        this(str, false);
    }

    @Override // S1.d
    public String a() {
        return this.f5472a;
    }

    @Override // S1.d
    public boolean b(Uri uri) {
        return this.f5472a.contains(uri.toString());
    }

    @Override // S1.d
    public boolean c() {
        return this.f5473b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f5472a.equals(((i) obj).f5472a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5472a.hashCode();
    }

    public String toString() {
        return this.f5472a;
    }

    public i(String str, boolean z9) {
        this.f5472a = (String) k.g(str);
        this.f5473b = z9;
    }
}
