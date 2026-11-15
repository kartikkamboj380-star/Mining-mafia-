package com.google.android.gms.ads;

import H4.C0654z;
import L4.p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.InterfaceC4915qq;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4915qq f16808a;

    private final void a() {
        InterfaceC4915qq interfaceC4915qq = this.f16808a;
        if (interfaceC4915qq != null) {
            try {
                interfaceC4915qq.f();
            } catch (RemoteException e10) {
                p.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.C1(i10, i11, intent);
            }
        } catch (Exception e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null && !interfaceC4915qq.zzg()) {
                return;
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            InterfaceC4915qq interfaceC4915qq2 = this.f16808a;
            if (interfaceC4915qq2 != null) {
                interfaceC4915qq2.zze();
            }
        } catch (RemoteException e11) {
            p.i("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.R(com.google.android.gms.dynamic.b.N0(configuration));
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a("AdActivity onCreate");
        InterfaceC4915qq interfaceC4915qqG = C0654z.b().g(this);
        this.f16808a = interfaceC4915qqG;
        if (interfaceC4915qqG == null) {
            p.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC4915qqG.C3(bundle);
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        p.a("AdActivity onDestroy");
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.a();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        p.a("AdActivity onPause");
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.zzl();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.s4(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        p.a("AdActivity onRestart");
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.zzi();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        p.a("AdActivity onResume");
        super.onResume();
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.zzk();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.P(bundle);
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        p.a("AdActivity onStart");
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.d();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        p.a("AdActivity onStop");
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.h();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC4915qq interfaceC4915qq = this.f16808a;
            if (interfaceC4915qq != null) {
                interfaceC4915qq.b();
            }
        } catch (RemoteException e10) {
            p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
