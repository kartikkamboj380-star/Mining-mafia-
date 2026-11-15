package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class I50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f19479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f19480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f19481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f19482d;

    public I50(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, ViewGroup viewGroup, Context context, Set set) {
        this.f19479a = interfaceExecutorServiceC1805Gx0;
        this.f19482d = set;
        this.f19480b = viewGroup;
        this.f19481c = context;
    }

    final /* synthetic */ J50 a() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29666Q6)).booleanValue() && this.f19480b != null && this.f19482d.contains("banner")) {
            return new J50(Boolean.valueOf(this.f19480b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29676R6)).booleanValue() && this.f19482d.contains("native")) {
            Context context = this.f19481c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new J50(boolValueOf);
            }
        }
        return new J50(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f19479a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.H50
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f19205a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 22;
    }
}
