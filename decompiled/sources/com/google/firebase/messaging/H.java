package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p036d5.C6949c;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7086c;

/* JADX INFO: loaded from: classes3.dex */
class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p007a6.f f40150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f40151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6949c f40152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G6.b f40153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G6.b f40154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H6.e f40155f;

    H(p007a6.f fVar, M m10, G6.b bVar, G6.b bVar2, H6.e eVar) {
        this(fVar, m10, new C6949c(fVar.m()), bVar, bVar2, eVar);
    }

    public static /* synthetic */ String a(H h10, Task task) {
        h10.getClass();
        return h10.h((Bundle) task.l(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task d(Task task) {
        return task.h(new p191t0.j(), new InterfaceC7086c() { // from class: com.google.firebase.messaging.G
            @Override // p176r5.InterfaceC7086c
            public final Object a(Task task2) {
                return H.a(this.f40149a, task2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.f40150a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(LogEvent.LEVEL_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        E6.j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f40150a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f40151b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f40151b.a());
        bundle.putString("app_ver_name", this.f40151b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) AbstractC7096m.a(this.f40155f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC7096m.a(this.f40155f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        E6.j jVar = (E6.j) this.f40154e.get();
        Z6.i iVar = (Z6.i) this.f40153d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == E6.j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.d()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f40152c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return AbstractC7096m.e(e10);
        }
    }

    Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return d(l(M.c(this.f40150a), "*", bundle));
    }

    Task f() {
        return this.f40152c.a();
    }

    Task g() {
        return d(l(M.c(this.f40150a), "*", new Bundle()));
    }

    Task k(boolean z9) {
        return this.f40152c.d(z9);
    }

    Task m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return d(l(str, "/topics/" + str2, bundle));
    }

    H(p007a6.f fVar, M m10, C6949c c6949c, G6.b bVar, G6.b bVar2, H6.e eVar) {
        this.f40150a = fVar;
        this.f40151b = m10;
        this.f40152c = c6949c;
        this.f40153d = bVar;
        this.f40154e = bVar2;
        this.f40155f = eVar;
    }
}
