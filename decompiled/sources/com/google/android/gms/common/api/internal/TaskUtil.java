package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull C7094k c7094k) {
        setResultOrApiException(status, null, c7094k);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@NonNull Task<Boolean> task) {
        return task.i(new O());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, ResultT resultt, @NonNull C7094k c7094k) {
        return status.isSuccess() ? c7094k.e(resultt) : c7094k.d(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, ResultT resultt, @NonNull C7094k c7094k) {
        if (status.isSuccess()) {
            c7094k.c(resultt);
        } else {
            c7094k.b(ApiExceptionUtil.fromStatus(status));
        }
    }
}
