package G4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends BaseGmsClient {
    protected c(Context context, Looper looper, int i10, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        super(context, looper, i10, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }
}
