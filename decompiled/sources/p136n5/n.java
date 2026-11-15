package p136n5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C6612q2;
import com.google.android.gms.measurement.internal.X2;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f46888a;

    public n(m mVar) {
        Preconditions.checkNotNull(mVar);
        this.f46888a = mVar;
    }

    public final void a(Context context, Intent intent) {
        X2 x2O = X2.O(context, null, null);
        C6612q2 c6612q2A = x2O.a();
        if (intent == null) {
            c6612q2A.r().a("Receiver called with null intent");
            return;
        }
        x2O.c();
        String action = intent.getAction();
        c6612q2A.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c6612q2A.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c6612q2A.w().a("Starting wakeful intent.");
            this.f46888a.a(context, className);
        }
    }
}
