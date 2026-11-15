package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import p176r5.C7094k;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6071b extends GoogleApi implements InterfaceC6076c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Api.ClientKey f35992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f35993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Api f35994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f35995e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35996a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f35992b = clientKey;
        V1 v10 = new V1();
        f35993c = v10;
        f35994d = new Api("GoogleAuthService.API", v10, clientKey);
        f35995e = X4.d.a("GoogleAuthServiceClient");
    }

    C6071b(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f35994d, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f35996a = context;
    }

    static /* bridge */ /* synthetic */ void d(Status status, Object obj, C7094k c7094k) {
        if (TaskUtil.trySetResultOrApiException(status, obj, c7094k)) {
            return;
        }
        f35995e.w("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6076c1
    public final Task a(final C6086g c6086g) {
        return doWrite(TaskApiCall.builder().setFeatures(X4.e.f6692l).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.U1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C6071b c6071b = this.f35976a;
                ((S1) ((P1) obj).getService()).t1(new X1(c6071b, (C7094k) obj2), c6086g);
            }
        }).setMethodKey(1513).build());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6076c1
    public final Task c(final Account account, final String str, final Bundle bundle) {
        Preconditions.checkNotNull(account, "Account name cannot be null!");
        Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(X4.e.f6692l).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.T1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C6071b c6071b = this.f35972a;
                ((S1) ((P1) obj).getService()).H1(new W1(c6071b, (C7094k) obj2), account, str, bundle);
            }
        }).setMethodKey(1512).build());
    }
}
