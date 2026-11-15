package H4;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class k2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ k2 f1357a = new k2();

    private /* synthetic */ k2() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = B4.t.f256f;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
