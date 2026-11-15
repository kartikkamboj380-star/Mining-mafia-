package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1421b implements zaca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zabe f17032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Looper f17033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zabi f17034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zabi f17035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f17036f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Api.Client f17038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f17039i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lock f17043m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f17037g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConnectionResult f17040j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ConnectionResult f17041k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17042l = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17044v = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private C1421b(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f17031a = context;
        this.f17032b = zabeVar;
        this.f17043m = lock;
        this.f17033c = looper;
        this.f17038h = client;
        this.f17034d = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new b0(this, null));
        this.f17035e = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new c0(this, 0 == true ? 1 : 0));
        p190t.a aVar = new p190t.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((Api.AnyClientKey) it.next(), this.f17034d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((Api.AnyClientKey) it2.next(), this.f17035e);
        }
        this.f17036f = Collections.unmodifiableMap(aVar);
    }

    private final void a(ConnectionResult connectionResult) {
        int i10 = this.f17044v;
        if (i10 == 1) {
            b();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f17032b.zaa(connectionResult);
            b();
        }
        this.f17044v = 0;
    }

    private final void b() {
        Iterator it = this.f17037g.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        this.f17037g.clear();
    }

    private final boolean c() {
        ConnectionResult connectionResult = this.f17041k;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.f17036f.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f17035e);
    }

    private static boolean e(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static C1421b g(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        p190t.a aVar = new p190t.a();
        p190t.a aVar2 = new p190t.a();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                aVar.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                aVar2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        p190t.a aVar3 = new p190t.a();
        p190t.a aVar4 = new p190t.a();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZab = api.zab();
            if (aVar.containsKey(anyClientKeyZab)) {
                aVar3.put(api, (Boolean) map2.get(api));
            } else {
                if (!aVar2.containsKey(anyClientKeyZab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zat zatVar = (zat) arrayList.get(i10);
            if (aVar3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!aVar4.containsKey(zatVar.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new C1421b(context, zabeVar, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    static /* bridge */ /* synthetic */ void n(C1421b c1421b, int i10, boolean z9) {
        c1421b.f17032b.zac(i10, z9);
        c1421b.f17041k = null;
        c1421b.f17040j = null;
    }

    static /* bridge */ /* synthetic */ void o(C1421b c1421b, Bundle bundle) {
        Bundle bundle2 = c1421b.f17039i;
        if (bundle2 == null) {
            c1421b.f17039i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void p(C1421b c1421b) {
        ConnectionResult connectionResult;
        if (!e(c1421b.f17040j)) {
            if (c1421b.f17040j != null && e(c1421b.f17041k)) {
                c1421b.f17035e.zar();
                c1421b.a((ConnectionResult) Preconditions.checkNotNull(c1421b.f17040j));
                return;
            }
            ConnectionResult connectionResult2 = c1421b.f17040j;
            if (connectionResult2 == null || (connectionResult = c1421b.f17041k) == null) {
                return;
            }
            if (c1421b.f17035e.zaf < c1421b.f17034d.zaf) {
                connectionResult2 = connectionResult;
            }
            c1421b.a(connectionResult2);
            return;
        }
        if (e(c1421b.f17041k) || c1421b.c()) {
            int i10 = c1421b.f17044v;
            if (i10 == 1) {
                c1421b.b();
            } else if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(c1421b.f17032b)).zab(c1421b.f17039i);
                c1421b.b();
            }
            c1421b.f17044v = 0;
            return;
        }
        ConnectionResult connectionResult3 = c1421b.f17041k;
        if (connectionResult3 != null) {
            if (c1421b.f17044v == 1) {
                c1421b.b();
            } else {
                c1421b.a(connectionResult3);
                c1421b.f17034d.zar();
            }
        }
    }

    private final PendingIntent r() {
        Api.Client client = this.f17038h;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f17031a, System.identityHashCode(this.f17032b), client.getSignInIntent(), com.google.android.gms.internal.base.o.f36194a | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api) {
        if (Objects.equal(this.f17036f.get(api.zab()), this.f17035e)) {
            return c() ? new ConnectionResult(4, r()) : this.f17035e.zad(api);
        }
        return this.f17034d.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            this.f17034d.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (c()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
            return apiMethodImpl;
        }
        this.f17035e.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            return this.f17034d.zaf(apiMethodImpl);
        }
        if (!c()) {
            return this.f17035e.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.f17044v = 2;
        this.f17042l = false;
        this.f17041k = null;
        this.f17040j = null;
        this.f17034d.zaq();
        this.f17035e.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.f17041k = null;
        this.f17040j = null;
        this.f17044v = 0;
        this.f17034d.zar();
        this.f17035e.zar();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f17035e.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f17034d.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.f17034d.zat();
        this.f17035e.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.f17043m.lock();
        try {
            boolean zZax = zax();
            this.f17035e.zar();
            this.f17041k = new ConnectionResult(4);
            if (zZax) {
                new com.google.android.gms.internal.base.t(this.f17033c).post(new a0(this));
            } else {
                b();
            }
        } finally {
            this.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        this.f17043m.lock();
        try {
            boolean z9 = false;
            if (this.f17034d.zaw() && (this.f17035e.zaw() || c() || this.f17044v == 1)) {
                z9 = true;
            }
            return z9;
        } finally {
            this.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.f17043m.lock();
        try {
            return this.f17044v == 2;
        } finally {
            this.f17043m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.f17043m.lock();
        try {
            boolean z9 = false;
            if (zax() || zaw()) {
                if (!this.f17035e.zaw()) {
                    this.f17037g.add(signInConnectionListener);
                    z9 = true;
                    if (this.f17044v == 0) {
                        this.f17044v = 1;
                    }
                    this.f17041k = null;
                    this.f17035e.zaq();
                }
            }
            return z9;
        } finally {
            this.f17043m.unlock();
        }
    }
}
