package p137n6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p087i6.g;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46961a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46962b;

    public k(int i10) {
        this.f46962b = i10;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(((j) listB.get(i10)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f46961a));
    }

    public synchronized boolean c(List list) {
        this.f46961a.clear();
        if (list.size() <= this.f46962b) {
            return this.f46961a.addAll(list);
        }
        g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f46962b);
        return this.f46961a.addAll(list.subList(0, this.f46962b));
    }
}
