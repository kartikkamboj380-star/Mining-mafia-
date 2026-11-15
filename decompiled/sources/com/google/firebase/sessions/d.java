package com.google.firebase.sessions;

import W.InterfaceC0984i;
import android.content.Context;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p068g7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f40724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f40725b;

    public d(Provider provider, Provider provider2) {
        this.f40724a = provider;
        this.f40725b = provider2;
    }

    public static d a(Provider provider, Provider provider2) {
        return new d(provider, provider2);
    }

    public static InterfaceC0984i c(Context context, CoroutineContext coroutineContext) {
        return (InterfaceC0984i) p068g7.d.d(b.InterfaceC0375b.f40721a.j(context, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0984i get() {
        return c((Context) this.f40724a.get(), (CoroutineContext) this.f40725b.get());
    }
}
