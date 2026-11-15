package Y4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.C6077d;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
final class h extends Api.AbstractClientBuilder {
    h() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        w.a(obj);
        return new C6077d(context, looper, clientSettings, null, connectionCallbacks, onConnectionFailedListener);
    }
}
