package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p176r5.InterfaceC7086c;
import p176r5.InterfaceC7088e;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;
import p176r5.InterfaceC7093j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task<TResult> {
    public Task a(Executor executor, InterfaceC7088e interfaceC7088e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task b(InterfaceC7088e interfaceC7088e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task c(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task d(Executor executor, InterfaceC7089f interfaceC7089f);

    public abstract Task e(InterfaceC7089f interfaceC7089f);

    public abstract Task f(Executor executor, InterfaceC7090g interfaceC7090g);

    public abstract Task g(InterfaceC7090g interfaceC7090g);

    public abstract Exception getException();

    public abstract TResult getResult();

    public Task h(Executor executor, InterfaceC7086c interfaceC7086c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task i(InterfaceC7086c interfaceC7086c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean isSuccessful();

    public Task j(Executor executor, InterfaceC7086c interfaceC7086c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public Task k(InterfaceC7086c interfaceC7086c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Object l(Class cls);

    public abstract boolean m();

    public abstract boolean n();

    public Task o(Executor executor, InterfaceC7093j interfaceC7093j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task p(InterfaceC7093j interfaceC7093j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
