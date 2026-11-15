package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class T7 extends N7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23442a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC4513ne f23445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ServiceConnection f23446e;

    public T7(Context context) {
        this.f23443b = context.getApplicationContext();
        String packageName = (K.a.b() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? R7.a(context.getSystemService(Q7.a())).getClientPackageName() : context.getPackageName();
        this.f23444c = packageName;
    }

    @Override // com.google.android.gms.internal.ads.N7
    public final boolean a() {
        return (this.f23442a != 2 || this.f23445d == null || this.f23446e == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.N7
    public final void b(U7 u10) {
        ServiceInfo serviceInfo;
        if (a()) {
            W7.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            u10.a(0);
            return;
        }
        int i10 = this.f23442a;
        if (i10 == 1) {
            W7.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            u10.a(3);
            return;
        }
        if (i10 == 3) {
            W7.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            u10.a(3);
            return;
        }
        W7.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f23443b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f23442a = 0;
            W7.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            u10.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    O7 o10 = new O7(this, u10, null);
                    this.f23446e = o10;
                    try {
                        if (this.f23443b.bindService(intent2, o10, 1)) {
                            W7.a("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        W7.b("InstallReferrerClient", "Connection to service is blocked.");
                        this.f23442a = 0;
                        u10.a(1);
                        return;
                    } catch (SecurityException unused) {
                        W7.b("InstallReferrerClient", "No permission to connect to service.");
                        this.f23442a = 0;
                        u10.a(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        W7.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f23442a = 0;
        u10.a(2);
    }

    @Override // com.google.android.gms.internal.ads.N7
    public final void c() {
        this.f23442a = 3;
        if (this.f23446e != null) {
            W7.a("InstallReferrerClient", "Unbinding from service.");
            this.f23443b.unbindService(this.f23446e);
            this.f23446e = null;
        }
        this.f23445d = null;
    }

    @Override // com.google.android.gms.internal.ads.N7
    public final V7 d() throws RemoteException {
        if (!a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f23444c);
        try {
            return new V7(this.f23445d.c0(bundle));
        } catch (RemoteException e10) {
            W7.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f23442a = 0;
            throw e10;
        }
    }

    final /* synthetic */ void e(int i10) {
        this.f23442a = i10;
    }

    final /* synthetic */ void f(InterfaceC4513ne interfaceC4513ne) {
        this.f23445d = interfaceC4513ne;
    }
}
