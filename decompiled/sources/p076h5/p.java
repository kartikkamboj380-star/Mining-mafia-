package p076h5;

import W4.b;
import W4.d;
import W4.h;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import p176r5.AbstractC7096m;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends GoogleApi implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Api.ClientKey f44780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f44781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Api f44782e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f44784b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44780c = clientKey;
        n nVar = new n();
        f44781d = nVar;
        f44782e = new Api("AppSet.API", nVar, clientKey);
    }

    p(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f44782e, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f44783a = context;
        this.f44784b = googleApiAvailabilityLight;
    }

    @Override // W4.b
    public final Task b() {
        return this.f44784b.isGooglePlayServicesAvailable(this.f44783a, 212800000) == 0 ? doRead(TaskApiCall.builder().setFeatures(h.f6573a).run(new RemoteCall() { // from class: h5.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).N0(new d(null, null), new o(this.f44778a, (C7094k) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : AbstractC7096m.e(new ApiException(new Status(17)));
    }
}
