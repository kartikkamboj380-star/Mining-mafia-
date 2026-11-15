package com.google.android.gms.ads.internal.client;

import H4.AbstractBinderC0646w0;
import H4.D1;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC5162so;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class LiteSdkInfo extends AbstractBinderC0646w0 {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // H4.InterfaceC0649x0
    public InterfaceC5666wo getAdapterCreator() {
        return new BinderC5162so();
    }

    @Override // H4.InterfaceC0649x0
    public D1 getLiteSdkVersion() {
        return new D1(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.9.0");
    }
}
