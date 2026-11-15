package b9;

import app.notifee.core.interfaces.MethodCallResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n implements com.google.common.util.concurrent.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodCallResult f11660a;

    public n(MethodCallResult methodCallResult) {
        this.f11660a = methodCallResult;
    }

    @Override // com.google.common.util.concurrent.i
    public void onFailure(Throwable th) {
        this.f11660a.onComplete(new Exception(th), null);
    }

    @Override // com.google.common.util.concurrent.i
    public void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).f11670a);
        }
        this.f11660a.onComplete(null, arrayList);
    }
}
