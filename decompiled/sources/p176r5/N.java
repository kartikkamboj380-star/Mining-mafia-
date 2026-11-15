package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
final class N implements InterfaceC7086c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f48297a;

    N(Collection collection) {
        this.f48297a = collection;
    }

    @Override // p176r5.InterfaceC7086c
    public final /* bridge */ /* synthetic */ Object a(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f48297a);
        return AbstractC7096m.f(arrayList);
    }
}
