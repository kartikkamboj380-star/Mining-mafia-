package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class I20 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f19468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6019zb0 f19470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f19471d;

    public I20(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context, C6019zb0 c6019zb0, ViewGroup viewGroup) {
        this.f19468a = interfaceExecutorServiceC1805Gx0;
        this.f19469b = context;
        this.f19470c = c6019zb0;
        this.f19471d = viewGroup;
    }

    final /* synthetic */ K20 a() {
        ArrayList arrayList = new ArrayList();
        View view = this.f19471d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString(HandleInvocationsFromAdViewer.KEY_AD_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new K20(this.f19469b, this.f19470c.f35797f, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        AbstractC3892ii.a(this.f19469b);
        return this.f19468a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.H20
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f19186a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 3;
    }
}
