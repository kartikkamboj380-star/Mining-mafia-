package b9;

import android.os.Bundle;
import app.notifee.core.interfaces.MethodCallResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m implements com.google.common.util.concurrent.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodCallResult f11659b;

    public m(List list, MethodCallResult methodCallResult) {
        this.f11658a = list;
        this.f11659b = methodCallResult;
    }

    @Override // com.google.common.util.concurrent.i
    public void onFailure(Throwable th) {
        this.f11659b.onComplete(new Exception(th), this.f11658a);
    }

    @Override // com.google.common.util.concurrent.i
    public void onSuccess(Object obj) {
        for (v vVar : (List) obj) {
            Bundle bundle = new Bundle();
            bundle.putBundle("notification", q.b(vVar.f11671b));
            bundle.putBundle("trigger", q.b(vVar.f11672c));
            this.f11658a.add(bundle);
        }
        this.f11659b.onComplete(null, this.f11658a);
    }
}
