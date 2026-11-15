package K;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f2395a;

    k(Object obj) {
        this.f2395a = (LocaleList) obj;
    }

    @Override // K.j
    public String a() {
        return this.f2395a.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.f2395a.equals(((j) obj).getLocaleList());
    }

    @Override // K.j
    public Locale get(int i10) {
        return this.f2395a.get(i10);
    }

    @Override // K.j
    public Object getLocaleList() {
        return this.f2395a;
    }

    public int hashCode() {
        return this.f2395a.hashCode();
    }

    @Override // K.j
    public boolean isEmpty() {
        return this.f2395a.isEmpty();
    }

    @Override // K.j
    public int size() {
        return this.f2395a.size();
    }

    public String toString() {
        return this.f2395a.toString();
    }
}
