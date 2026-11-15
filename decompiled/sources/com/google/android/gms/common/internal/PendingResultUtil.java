package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class PendingResultUtil {
    private static final zas zaa = new g();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(@NonNull R r10);
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@NonNull PendingResult<R> pendingResult, @NonNull T t10) {
        return toTask(pendingResult, new i(t10));
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@NonNull PendingResult<R> pendingResult, @NonNull ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        C7094k c7094k = new C7094k();
        pendingResult.addStatusListener(new h(pendingResult, c7094k, resultConverter, zasVar));
        return c7094k.a();
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@NonNull PendingResult<R> pendingResult) {
        return toTask(pendingResult, new j());
    }
}
